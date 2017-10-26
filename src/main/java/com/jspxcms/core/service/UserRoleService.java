package com.jspxcms.core.service;

import com.jspxcms.core.domain.User;
import com.jspxcms.core.domain.UserRole;

import java.util.List;

public interface UserRoleService {
    public List<UserRole> update(User user, Integer[] roleIds, Integer siteId);
}
