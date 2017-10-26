package com.jspxcms.core.repository.plus;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.core.domain.Special;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

/**
 * SpecialDaoPlus
 *
 * @author liufang
 */
public interface SpecialDaoPlus {
    public List<Special> findList(Integer[] siteId, Integer[] categoryId, Date beginDate, Date endDate, Boolean isWithImage, Boolean isRecommend, Limitable limitable);

    public Page<Special> findPage(Integer[] siteId, Integer[] categoryId, Date beginDate, Date endDate, Boolean isWithImage, Boolean isRecommend, Pageable pageable);
}
