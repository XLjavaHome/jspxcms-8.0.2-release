package com.jspxcms.ext.service.impl;

import com.jspxcms.ext.service.QuestionItemRecService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class QuestionItemRecServiceImpl implements QuestionItemRecService {
    // private QuestionItemRecDao dao;
    //
    // @Autowired
    // public void setDao(QuestionItemRecDao dao) {
    // this.dao = dao;
    // }
}
