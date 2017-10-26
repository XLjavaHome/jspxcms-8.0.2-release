package com.jspxcms.core.repository.plus;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.core.domain.SpecialCategory;

import java.util.List;

/**
 * SpecialCategoryDaoPlus
 *
 * @author liufang
 */
public interface SpecialCategoryDaoPlus {
    public List<SpecialCategory> getList(Integer[] siteId, Limitable limitable);
}
