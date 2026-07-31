package com.smaato.sdk.ng.rewarded;

import android.view.View;
import android.widget.FrameLayout;
import com.smaato.sdk.ng.views.CloseableContainer;

/* loaded from: classes13.dex */
public interface RewardedActivityInteractor {
    void addAdView(View view, FrameLayout.LayoutParams layoutParams);

    void addContentInfoView(View view, FrameLayout.LayoutParams layoutParams);

    void addProgressBarView(FrameLayout.LayoutParams layoutParams);

    void addWatermarkView(View view);

    void finishActivity();

    void hideProgressBar();

    void hideRewardedCloseButton();

    void hideRewardedSkipButton();

    void removeContentInfoView(View view);

    void setCloseSize(int i);

    void setContentLayout();

    void setSkipSize(int i);

    void showProgressBar();

    void showRewardedCloseButton(CloseableContainer.OnCloseListener onCloseListener);

    void showRewardedSkipButton(CloseableContainer.OnSkipListener onSkipListener);
}
