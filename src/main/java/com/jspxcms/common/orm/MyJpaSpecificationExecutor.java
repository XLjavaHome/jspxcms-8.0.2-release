package com.jspxcms.common.orm;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * JPA Specification Executor
 *
 * @param <T>
 * @author liufang
 */
public interface MyJpaSpecificationExecutor<T> extends JpaSpecificationExecutor<T> {
    List<T> findAll(Specification<T> spec, Limitable limitable);
}
