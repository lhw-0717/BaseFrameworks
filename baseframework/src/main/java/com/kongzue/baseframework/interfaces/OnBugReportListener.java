package com.kongzue.baseframework.interfaces;

import java.io.File;

/**
 * Author: @Kongzue
 * Github: https://github.com/kongzue/
 * Homepage: http://kongzue.com/
 * Mail: myzcxhh@live.cn
 * CreateTime: 2018/9/30 15:47
 */
public abstract class OnBugReportListener {
    
    @Deprecated
    public void onReporter(File file) {
    
    }
    
    public abstract boolean onCrash(Exception e,File crashLogFile);
}