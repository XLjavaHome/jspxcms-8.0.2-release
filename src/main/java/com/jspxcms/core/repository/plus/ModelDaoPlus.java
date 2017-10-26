package com.jspxcms.core.repository.plus;

import com.jspxcms.core.domain.Model;

import java.util.List;

/**
 * ModelDaoPlus
 *
 * @author liufang
 */
public interface ModelDaoPlus {
    public List<Model> findList(Integer siteId, String type);

    public Model findDefault(Integer siteId, String type);

    public List<Model> findByNumbers(String[] numbers, Integer[] siteIds);
}
