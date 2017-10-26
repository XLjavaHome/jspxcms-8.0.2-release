package com.jspxcms.core.repository.plus;

import com.jspxcms.core.domain.Attribute;

import java.util.List;

/**
 * AttributeDaoPlus
 *
 * @author liufang
 */
public interface AttributeDaoPlus {
    public List<Attribute> findByNumbers(String[] numbers, Integer[] siteIds);
}
