package com.jspxcms.ext.service;

import com.jspxcms.ext.domain.QuestionItem;
import com.jspxcms.ext.domain.QuestionOption;

import java.util.List;

public interface QuestionOptionService {
    public QuestionOption get(Integer id);

    public List<QuestionOption> save(String[] title, QuestionItem item);

    public List<QuestionOption> update(Integer[] id, String[] title, QuestionItem item);
}
