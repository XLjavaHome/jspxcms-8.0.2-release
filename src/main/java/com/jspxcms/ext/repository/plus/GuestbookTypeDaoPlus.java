package com.jspxcms.ext.repository.plus;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.ext.domain.GuestbookType;

import java.util.List;

/**
 * GuestbookTypeDaoPlus
 *
 * @author yangxing
 */
public interface GuestbookTypeDaoPlus {
    public List<GuestbookType> getList(Integer[] siteId, Limitable limitable);
}
