package com.jspxcms.core.web.directive;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

import java.io.IOException;
import java.util.Map;

/**
 * InboxPageDirective
 *
 * @author liufang
 */
public class InboxPageDirective extends AbstractInboxListPageDirective implements TemplateDirectiveModel {
    @SuppressWarnings("rawtypes")
    public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
        super.doExecute(env, params, loopVars, body, true);
    }
}
