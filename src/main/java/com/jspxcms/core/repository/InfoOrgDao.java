package com.jspxcms.core.repository;

import com.jspxcms.core.domain.InfoOrg;
import com.jspxcms.core.domain.InfoOrg.InfoOrgId;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.Collection;
import java.util.List;

public interface InfoOrgDao extends Repository<InfoOrg, InfoOrgId> {
    public InfoOrg findOne(InfoOrgId id);
    // --------------------

    public List<InfoOrg> findByInfoId(Integer infoId);

    @Modifying
    @Query("delete from InfoOrg bean where bean.org.id in (?1)")
    public int deleteByOrgId(Collection<Integer> orgIds);
}
