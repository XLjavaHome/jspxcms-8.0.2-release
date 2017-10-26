package com.jspxcms.common.file;

import org.apache.commons.net.ftp.FTPClient;

import java.io.IOException;

public interface FtpClientExtractor {
    public void doInFtp(FTPClient client) throws IOException;
}
