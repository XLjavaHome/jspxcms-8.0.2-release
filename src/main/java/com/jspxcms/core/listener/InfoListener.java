package com.jspxcms.core.listener;

import com.jspxcms.core.domain.Info;

import java.util.List;

/**
 * InfoListener
 *
 * @author liufang
 */
public interface InfoListener {
    public void postInfoSave(Info bean);

    public void postInfoUpdate(Info bean);

    public void postInfoDelete(List<Info> beans);

    public void postInfoPass(List<Info> beans);

    public void postInfoReject(List<Info> beans);

    public void postInfoMove(List<Info> beans);

    public void postInfoLogicDelete(List<Info> beans);

    public void postInfoRecycle(List<Info> beans);

    public void postInfoArchive(List<Info> beans);

    public void postInfoRecall(List<Info> beans);
}
