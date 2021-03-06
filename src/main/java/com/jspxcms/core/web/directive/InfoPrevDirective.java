package com.jspxcms.core.web.directive;

import com.jspxcms.common.freemarker.Freemarkers;
import com.jspxcms.core.domain.Info;
import com.jspxcms.core.service.InfoQueryService;
import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Map;

/**
 * InfoPrevDirective
 *
 * @author liufang
 */
public class InfoPrevDirective implements TemplateDirectiveModel {
    public static final String ID = "id";

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
        if (loopVars.length < 1) {
            throw new TemplateModelException("Loop variable is required.");
        }
        if (body == null) {
            throw new RuntimeException("missing body");
        }
        Integer id = Freemarkers.getInteger(params, ID);
        Info info = query.findPrev(id, false);
        loopVars[0] = env.getObjectWrapper().wrap(info);
        body.render(env.getOut());
    }

    @Autowired
    private InfoQueryService query;
}
