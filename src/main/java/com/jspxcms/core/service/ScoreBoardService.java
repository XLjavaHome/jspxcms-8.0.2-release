package com.jspxcms.core.service;

import com.jspxcms.core.domain.ScoreBoard;

import java.util.List;

public interface ScoreBoardService {
    public List<ScoreBoard> findList(String ftype, Integer fid);

    public ScoreBoard findOne(String ftype, Integer fid, Integer itemId);

    public ScoreBoard scoring(String ftype, Integer fid, Integer itemId);

    public ScoreBoard get(Integer id);

    public ScoreBoard save(ScoreBoard bean);

    public ScoreBoard update(ScoreBoard bean);

    public ScoreBoard delete(Integer id);

    public ScoreBoard[] delete(Integer[] ids);
}
