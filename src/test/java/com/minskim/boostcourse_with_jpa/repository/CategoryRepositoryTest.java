package com.minskim.boostcourse_with_jpa.repository;

import com.minskim.boostcourse_with_jpa.domain.Category;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CategoryRepositoryTest {
    @Autowired
    CategoryRepository categoryRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    @Transactional
    //@Rollback(value = false)
    void getCategoryList() {
        /*Category category0 = new Category();
        category0.setId(5L);
        category0.setName("changed");
        entityManager.merge(category0);

        System.out.println("=======1=====");

        Category category = new Category();
        category.setId(6L);
        category.setName("tmptmp");
        entityManager.merge(category);

        System.out.println("======2======");

        Category category1 = new Category();
        category1.setId(7L);
        category1.setName("persist");

        categoryRepository.save(category1);
        System.out.println("======3======");
        Category category2 = new Category();
        category2.setId(7L);
        category2.setName("updated??");

        entityManager.merge(category2);
        System.out.println("======4======");*/
    }
}
/*
Hibernate:
    select
        category0_.id as id1_0_0_,
        category0_.name as name2_0_0_
    from
        category category0_
    where
        category0_.id=?
2021-06-27 11:13:47.307 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [5]
2021-06-27 11:13:47.314 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([name2_0_0_] : [VARCHAR]) - [연극]
=======1=====
Hibernate:
    select
        category0_.id as id1_0_0_,
        category0_.name as name2_0_0_
    from
        category category0_
    where
        category0_.id=?
2021-06-27 11:13:47.324 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [6]
======2======
Hibernate:
    select
        category0_.id as id1_0_0_,
        category0_.name as name2_0_0_
    from
        category category0_
    where
        category0_.id=?
2021-06-27 11:13:47.342 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [7]
======3======
======4======
Hibernate:
    insert
    into
        category
        (name, id)
    values
        (?, ?)
2021-06-27 11:13:47.360 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [tmptmp]
2021-06-27 11:13:47.360 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [BIGINT] - [6]
Hibernate:
    insert
    into
        category
        (name, id)
    values
        (?, ?)
2021-06-27 11:13:47.362 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [persist]
2021-06-27 11:13:47.362 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [BIGINT] - [7]
Hibernate:
    update
        category
    set
        name=?
    where
        id=?
2021-06-27 11:13:47.363 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [changed]
2021-06-27 11:13:47.363 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [BIGINT] - [5]
Hibernate:
    update
        category
    set
        name=?
    where
        id=?
2021-06-27 11:13:47.365 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [updated??]
2021-06-27 11:13:47.365 TRACE 10593 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [BIGINT] - [7]
 */