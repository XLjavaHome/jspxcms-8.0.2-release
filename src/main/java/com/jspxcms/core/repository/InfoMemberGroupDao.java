package com.jspxcms.core.repository;

import com.jspxcms.core.domain.InfoMemberGroup;
import com.jspxcms.core.domain.InfoMemberGroup.InfoMemberGroupId;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.Collection;
import java.util.List;

public interface InfoMemberGroupDao extends Repository<InfoMemberGroup, InfoMemberGroupId> {
    public InfoMemberGroup findOne(InfoMemberGroupId id);
    // --------------------

    public List<InfoMemberGroup> findByInfoId(Integer infoId);

    @Modifying
    @Query("delete from InfoMemberGroup bean where bean.group.id in (?1)")
    public int deleteByGroupId(Collection<Integer> groupIds);
}
