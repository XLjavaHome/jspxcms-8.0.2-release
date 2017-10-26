package com.jspxcms.core.support;

import com.jspxcms.core.domain.MemberGroup;
import com.jspxcms.core.domain.User;

import java.util.Collection;

/**
 * Commentable
 *
 * @author liufang
 */
public interface Commentable {
    /**
     * 增加评论数量
     *
     * @param comments
     */
    public void addComments(int comments);

    /**
     * 获取评论状态
     *
     * @param groups
     * @return
     */
    public int getCommentStatus(User user, Collection<MemberGroup> groups);
}
