package net.pubnative.lite.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.VerveNetworkBridge;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public class PNBeaconWebView extends WebView {
    public PNBeaconWebView(Context context) {
        super(context);
        init();
    }

    private void init() {
        getSettings().setJavaScriptEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.C, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void loadBeacon(String str) {
        VerveNetworkBridge.webviewLoadUrl(this, "javascript:" + str);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public PNBeaconWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public PNBeaconWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
