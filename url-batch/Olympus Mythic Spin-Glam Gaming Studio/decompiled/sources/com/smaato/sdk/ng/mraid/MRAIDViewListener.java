package com.smaato.sdk.ng.mraid;

/* loaded from: classes3.dex */
public interface MRAIDViewListener {
    void mraidHideCloseButton();

    void mraidHideSkipButton();

    void mraidShowCloseButton();

    void mraidShowSkipButton();

    void mraidViewClose(MRAIDView mRAIDView);

    void mraidViewError(MRAIDView mRAIDView);

    void mraidViewExpand(MRAIDView mRAIDView);

    void mraidViewLoaded(MRAIDView mRAIDView);

    boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4);

    void onCustomCTAClick();

    void onCustomCTALoadFail();

    void onCustomCTAShow();

    void onCustomEndCardClicked();

    void onCustomEndCardClosed();

    void onCustomEndCardLoadFail();

    void onCustomEndCardLoadSuccess();

    void onCustomEndCardShow(String str);

    void onExpandedAdClosed();

    void onReplayClicked();
}
