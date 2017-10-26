package com.jspxcms.ext.repository.plus;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.ext.domain.FriendlinkType;

import java.util.List;

/**
 * FriendlinkTypeDaoPlus
 *
 * @author yangxing
 */
public interface FriendlinkTypeDaoPlus {
    public List<FriendlinkType> getList(Integer[] siteId, Limitable limitable);
}
