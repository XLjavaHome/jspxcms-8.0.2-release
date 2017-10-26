package com.jspxcms.core.repository.plus;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.core.domain.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MessageDaoPlus {
    public List<Object[]> groupByUserId(Integer userId, boolean unread, Limitable limitable);

    public Page<Object[]> groupByUserId(Integer userId, boolean unread, Pageable pageable);

    public Page<Message> findByContactId(Integer userId, Integer contactId, Pageable pageable);

    public List<Message> findByContactId(Integer userId, Integer contactId, Limitable limitable);
}
