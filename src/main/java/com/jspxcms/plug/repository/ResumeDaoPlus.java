package com.jspxcms.plug.repository;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.plug.domain.Resume;

import java.util.List;

public interface ResumeDaoPlus {
    public List<Resume> getList(Integer[] siteId, Limitable limitable);
}
