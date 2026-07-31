package com.smaato.sdk.ng.interstitial;

import android.view.View;
import android.widget.FrameLayout;
import com.smaato.sdk.ng.views.CloseableContainer;

/* loaded from: classes3.dex */
public interface InterstitialActivityInteractor {
    void addAdView(View view, FrameLayout.LayoutParams layoutParams);

    void addContentInfoView(View view, FrameLayout.LayoutParams layoutParams);

    void addProgressBarView(FrameLayout.LayoutParams layoutParams);

    void addWatermarkView(View view);

    void finishActivity();

    void hideInterstitialCloseButton();

    void hideInterstitialSkipButton();

    void hideProgressBar();

    void removeContentInfoView(View view);

    void setCloseSize(int i);

    void setContentLayout();

    void setSkipSize(int i);

    void showInterstitialCloseButton(CloseableContainer.OnCloseListener onCloseListener);

    void showInterstitialSkipButton(CloseableContainer.OnSkipListener onSkipListener);

    void showProgressBar();
}
