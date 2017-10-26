package com.jspxcms.ext.service.impl;

import com.jspxcms.ext.service.QuestionOptRecService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class QuestionOptRecServiceImpl implements QuestionOptRecService {
    // private QuestionOptRecDao dao;
    //
    // @Autowired
    // public void setDao(QuestionOptRecDao dao) {
    // this.dao = dao;
    // }
}
