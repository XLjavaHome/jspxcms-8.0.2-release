package com.jspxcms.ext.repository;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.ext.domain.Friendlink;
import com.jspxcms.ext.repository.plus.FriendlinkDaoPlus;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.Collection;
import java.util.List;

/**
 * FriendlinkDao
 *
 * @author yangxing
 */
public interface FriendlinkDao extends Repository<Friendlink, Integer>, FriendlinkDaoPlus {
    public List<Friendlink> findAll(Specification<Friendlink> spec, Sort sort);

    public List<Friendlink> findAll(Specification<Friendlink> spec, Limitable limit);

    public Friendlink findOne(Integer id);

    public Friendlink save(Friendlink bean);

    public void delete(Friendlink bean);
    // --------------------

    public List<Friendlink> findBySiteId(Integer siteId, Sort sort);

    @Query("select count(*) from Friendlink bean where bean.site.id in ?1")
    public long countBySiteId(Collection<Integer> siteIds);

    @Query("select count(*) from Friendlink bean where bean.type.id in ?1")
    public long countByTypeId(Collection<Integer> typeIds);
}
