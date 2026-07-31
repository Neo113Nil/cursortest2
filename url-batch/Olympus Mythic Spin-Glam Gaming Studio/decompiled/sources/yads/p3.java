package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p3 extends oo {
    public p3(@NotNull Context context) {
        super(context, null);
        setBackgroundColor(-1);
        setInitialScale(1);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        setDisplayZoomControls(false);
        setScrollbarFadingEnabled(true);
        setDrawingCacheEnabled(true);
        setWebChromeClient(new m3(context));
        setWebViewClient(new n3(context));
    }

    @Override // yads.oo, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // yads.oo, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
