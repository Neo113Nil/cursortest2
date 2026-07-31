package net.pubnative.lite.sdk.mraid;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import net.pubnative.lite.sdk.mraid.MRAIDView;

/* loaded from: classes11.dex */
public class MRAIDInterstitial extends MRAIDView {
    private Boolean isCreatedByFeedbackForm;

    public MRAIDInterstitial(Context context, String str, String str2, Boolean bool, Boolean bool2, String[] strArr, MRAIDViewListener mRAIDViewListener, MRAIDNativeFeatureListener mRAIDNativeFeatureListener, ViewGroup viewGroup) {
        super(context, str, str2, bool, strArr, mRAIDViewListener, mRAIDNativeFeatureListener, viewGroup, true, bool2.booleanValue());
        this.isCreatedByFeedbackForm = Boolean.FALSE;
        this.webView.setBackgroundColor(-16777216);
        addView(this.webView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$closeFromExpanded$0() {
        fireStateChangeEvent();
        MRAIDViewListener mRAIDViewListener = this.listener;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.mraidViewClose(this);
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView
    public void closeFromExpanded() {
        if (this.state == 1) {
            this.state = 4;
            clearView();
            this.handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.MRAIDInterstitial$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDInterstitial.this.lambda$closeFromExpanded$0();
                }
            });
        }
        super.closeFromExpanded();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.C, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView
    @Deprecated
    protected void expand(String str, Boolean bool, MRAIDView.OnExpandCreativeFailListener onExpandCreativeFailListener) {
        if (this.state != 0) {
            return;
        }
        super.expand(str, bool, onExpandCreativeFailListener);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView
    protected void expandHelper(WebView webView) {
        super.expandHelper(webView);
        this.isLaidOut = true;
        this.state = 1;
        fireStateChangeEvent();
    }

    public void hide() {
        close();
    }

    public void markCreativeAdComingFromFeedbackForm() {
        this.isCreatedByFeedbackForm = Boolean.TRUE;
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void show(Activity activity, MRAIDView.OnExpandCreativeFailListener onExpandCreativeFailListener) {
        showAsInterstitial(activity, this.isCreatedByFeedbackForm, onExpandCreativeFailListener);
    }

    public void showDefaultContentInfoURL(String str) {
        expandContentInfo(str);
    }

    public void show(Activity activity, MRAIDView.OnExpandCreativeFailListener onExpandCreativeFailListener, String str) {
        showAsInterstitial(activity, this.isCreatedByFeedbackForm, onExpandCreativeFailListener, str);
    }
}
