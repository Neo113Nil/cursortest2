package net.pubnative.lite.sdk;

/* loaded from: classes14.dex */
public interface CustomEndCardListener {
    void onCustomEndCardClick();

    void onCustomEndCardShow();

    void onDefaultEndCardClick();

    void onDefaultEndCardShow();

    void onEndCardLoadFailure(boolean z);

    void onEndCardLoadSuccess(boolean z);

    void onPlayableSkipButtonClicked();
}
