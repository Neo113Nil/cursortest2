package com.smaato.sdk.ng.contentinfo.listeners;

/* loaded from: classes12.dex */
public interface AdFeedbackLoadListener {
    void onFormClosed();

    void onLoad(String str);

    void onLoadFailed(Throwable th);

    void onLoadFinished();
}
