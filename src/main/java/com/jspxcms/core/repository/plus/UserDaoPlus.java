package com.jspxcms.core.repository.plus;

import com.jspxcms.core.domain.User;

import java.util.List;

/**
 * UserDaoPlus
 *
 * @author liufang
 */
public interface UserDaoPlus {
    public List<User> findByUsername(String[] usernames);
}
