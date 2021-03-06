package com.minskim.boostcourse_with_jpa.service;

import com.minskim.boostcourse_with_jpa.domain.*;
import com.minskim.boostcourse_with_jpa.dto.CategoryWithProductCountDto;
import com.minskim.boostcourse_with_jpa.dto.ProductListWithDisplayInfos;
import com.minskim.boostcourse_with_jpa.dto.ProductListWithDisplayInfosDto;
import com.minskim.boostcourse_with_jpa.dto.PromotionWithProductDto;
import com.minskim.boostcourse_with_jpa.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final DisplayInfoRepository displayInfoRepository;
    private final ProductImageRepository productImageRepository;
    private final PromotionRepository promotionRepository;

    @Override
    public List<CategoryWithProductCountDto> getCategoryListWithProductCount() {
        List<CategoryWithProductCountDto> list = new ArrayList<>();
        List<Category> categories = categoryRepository.findAll();
        for (Category c : categories) {
            long count = productRepository.countByCategory_Id(c.getId());
            list.add(CategoryWithProductCountDto.builder()
                    .id(c.getId())
                    .name(c.getName())
                    .count(count)
                    .build());
        }
        return list;
    }

    @Override
    public ProductListWithDisplayInfosDto getProductListWithDisplayInfos() {
        Long categoryId = 3L;
        int start = 0;
        Page<Product> productPage = productRepository.findByCategory_Id(categoryId, PageRequest.of(start, 4));
        List<Product> content = productPage.getContent();
        List<ProductListWithDisplayInfos> products = new ArrayList<>();
        for (Product product : content) {
            DisplayInfo displayInfo = displayInfoRepository.findByProduct_Id(product.getId());
            products.add(ProductListWithDisplayInfos.builder()
                    .id(product.getId())
                    .categoryId(product.getCategory().getId())
                    .displayInfoId(displayInfo.getId())
                    .name(product.getCategory().getName())
                    .description(product.getDescription())
                    .content(product.getContent())
                    .event(product.getEvent())
                    .openingHours(displayInfo.getOpeningHours())
                    .placeName(displayInfo.getPlaceName())
                    .placeLot(displayInfo.getPlaceLot())
                    .placeStreet(displayInfo.getPlaceStreet())
                    .tel(displayInfo.getTel())
                    .homepage(displayInfo.getHomepage())
                    .email(displayInfo.getEmail())
                    .createDate(displayInfo.getCreateDate())
                    .modifyDate(displayInfo.getModifyDate())
                    .fileId(productImageRepository.findByProduct_IdAndTypeContains(product.getId(), "ma").getFile().getId())
                    .build());
        }
        return ProductListWithDisplayInfosDto.builder()
                .totalCount((int) productPage.getTotalElements())
                .productCount(productPage.getNumberOfElements())
                .products(products)
                .build();
    }

    @Override
    public List<PromotionWithProductDto> getPromotions() {
        List<Promotion> promotions = promotionRepository.findAll();
        List<PromotionWithProductDto> promotionWithProductList = new ArrayList<>();
        for (Promotion p : promotions) {
            Product product = p.getProduct();
            promotionWithProductList.add(PromotionWithProductDto.builder()
                    .id(p.getId())
                    .productId(product.getId())
                    .categoryId(product.getCategory().getId())
                    .categoryName(product.getCategory().getName())
                    .description(product.getDescription())
                    .fileId(productImageRepository.findByProduct_IdAndTypeContains(product.getId(), "ma").getFile().getId())
                    .build());
        }
        return promotionWithProductList;
    }
}
