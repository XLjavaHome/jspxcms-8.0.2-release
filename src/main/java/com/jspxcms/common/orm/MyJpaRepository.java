package com.jspxcms.common.orm;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * JPA Repository 接口
 *
 * @param <T>
 * @param <ID>
 * @author liufang
 */
public interface MyJpaRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
    List<T> findAll(Limitable limitable);
}
