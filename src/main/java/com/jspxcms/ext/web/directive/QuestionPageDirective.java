package com.jspxcms.ext.web.directive;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

import java.io.IOException;
import java.util.Map;

/**
 * QuestionPageDirective
 *
 * @author liufang
 */
public class QuestionPageDirective extends AbstractQuestionListPageDirective {
    @SuppressWarnings("rawtypes")
    public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
        super.doExecute(env, params, loopVars, body, true);
    }
}
