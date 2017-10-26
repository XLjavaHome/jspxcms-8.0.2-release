package com.jspxcms.core.repository.plus;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.core.domain.Site;

import java.util.List;

/**
 * SiteDaoPlus
 *
 * @author liufang
 */
public interface SiteDaoPlus {
    public List<Site> findByStatus(Integer parentId, String parentNumber, Integer[] status, Limitable limitable);
}
