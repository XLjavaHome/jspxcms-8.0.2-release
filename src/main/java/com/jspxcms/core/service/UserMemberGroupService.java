package com.jspxcms.core.service;

import com.jspxcms.core.domain.User;
import com.jspxcms.core.domain.UserMemberGroup;

import java.util.List;

public interface UserMemberGroupService {
    public List<UserMemberGroup> update(User user, Integer[] groupIds, Integer groupId);
}
