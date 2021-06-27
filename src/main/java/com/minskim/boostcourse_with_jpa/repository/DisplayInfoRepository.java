package com.minskim.boostcourse_with_jpa.repository;

import com.minskim.boostcourse_with_jpa.domain.DisplayInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisplayInfoRepository extends JpaRepository<DisplayInfo, Long> {
    DisplayInfo findByProduct_Id(Long productId);
}