package com.github.wally.contextprovider;

import android.content.Context;

/**
 * Package: com.github.wally.applicationprovider
 * FileName: ContextProvider
 * Date: on 2018/5/31  下午11:08
 * Auther: zihe
 * Descirbe:给外部调用的单例管理器
 * Email: hezihao@linghit.com
 */
public class ContextProvider {
    private static volatile ContextProvider instance;
    private Context mContext;

    public ContextProvider(Context context) {
        mContext = context;
    }

    /**
     * 获取实例
     */
    public static ContextProvider get() {
        if (instance == null) {
            synchronized (ContextProvider.class) {
                if (instance == null) {
                    if (ApplicationContextProvider.mContext == null) {
                        throw new IllegalStateException("context == null");
                    }
                    instance = new ContextProvider(ApplicationContextProvider.mContext);
                }
            }
        }
        return instance;
    }

    /**
     * 获取上下文
     */
    public Context getContext() {
        return mContext;
    }
}
