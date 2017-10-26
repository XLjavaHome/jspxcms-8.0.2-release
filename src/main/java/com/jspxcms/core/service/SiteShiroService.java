package com.jspxcms.core.service;

import com.jspxcms.core.domain.Site;

import java.util.List;

/**
 * SiteService
 *
 * @author liufang
 */
public interface SiteShiroService {
    public List<Site> findByUserId(Integer userId);

    public Site findByDomain(String domain);

    public Site get(Integer id);
}
