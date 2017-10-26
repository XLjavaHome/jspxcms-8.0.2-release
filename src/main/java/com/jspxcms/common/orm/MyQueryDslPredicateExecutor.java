package com.jspxcms.common.orm;

import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import java.util.List;

/**
 * QueryDsl Predicate Executor
 *
 * @param <T>
 * @author liufang
 */
public interface MyQueryDslPredicateExecutor<T> extends QueryDslPredicateExecutor<T> {
    List<T> findAll(Predicate predicate, Sort sort);

    List<T> findAll(Predicate predicate, Limitable limitable);
}
