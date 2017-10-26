package com.jspxcms.common.freemarker;

import freemarker.template.SimpleHash;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * FreeMarker视图
 * <p>
 * 绑定Param、ParamValues参数
 *
 * @author liufang
 */
public class MyFreeMarkerView extends org.springframework.web.servlet.view.freemarker.FreeMarkerView {
    protected SimpleHash buildTemplateModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) {
        SimpleHash fmModel = super.buildTemplateModel(model, request, response);
        fmModel.put(Freemarkers.KEY_PARAMETERS, new HttpRequestParametersHashModel(request));
        fmModel.put(Freemarkers.KEY_PARAMETER_VALUES, new HttpRequestParameterValuesHashModel(request));
        return fmModel;
    }
}