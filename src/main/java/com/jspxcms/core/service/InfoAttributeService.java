package com.jspxcms.core.service;

import com.jspxcms.core.domain.Info;

import java.util.Map;

/**
 * InfoAttributeService
 *
 * @author liufang
 */
public interface InfoAttributeService {
    public void update(Info info, Integer[] attrIds, Map<String, String> attrImages);

    public int deleteByAttributeId(Integer attributeId);
}
