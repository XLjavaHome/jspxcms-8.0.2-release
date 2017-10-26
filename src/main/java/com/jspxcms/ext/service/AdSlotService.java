package com.jspxcms.ext.service;

import com.jspxcms.common.orm.RowSide;
import com.jspxcms.ext.domain.AdSlot;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Map;

public interface AdSlotService {
    public List<AdSlot> findList(Integer siteId, Map<String, String[]> params, Sort sort);

    public RowSide<AdSlot> findSide(Integer siteId, Map<String, String[]> params, AdSlot bean, Integer position, Sort sort);

    public List<AdSlot> findList(Integer siteId);

    public List<AdSlot> findList(String number, Integer siteId);

    public AdSlot get(Integer id);

    public AdSlot save(AdSlot bean, Integer siteId);

    public AdSlot update(AdSlot bean);

    public AdSlot delete(Integer id);

    public AdSlot[] delete(Integer[] ids);
}
