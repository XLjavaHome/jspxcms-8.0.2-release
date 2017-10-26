package com.jspxcms.ext.repository.plus;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.ext.domain.Friendlink;

import java.util.List;

/**
 * FriendlinkDaoPlus
 *
 * @author yangxing
 */
public interface FriendlinkDaoPlus {
    public List<Friendlink> findList(Integer[] siteId, String[] type, Integer[] typeId, Boolean isWithLogo, Boolean isRecommend, Integer[] status, Limitable limitable);
}
