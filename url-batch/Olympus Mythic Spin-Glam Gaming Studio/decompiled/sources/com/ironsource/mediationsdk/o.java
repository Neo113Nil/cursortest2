package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ironsource.Ba;
import com.ironsource.C4963x2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes5.dex */
public class o extends FrameLayout {
    private ISBannerSize a;
    private String b;
    private boolean c;
    private a d;

    public interface a {
        void onWindowFocusChanged(boolean z);
    }

    public o(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.c = false;
        this.a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    protected void a() {
        this.c = true;
        this.a = null;
        this.b = null;
        this.d = null;
        C4963x2.a().a((Ba) null);
    }

    public boolean b() {
        return this.c;
    }

    protected o c() {
        o oVar = new o(getContext(), this.a);
        oVar.b = this.b;
        return oVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me);
        return super.dispatchTouchEvent(me);
    }

    public ISBannerSize getSize() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a aVar = this.d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z);
        }
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.a = iSBannerSize;
    }

    public o(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.c = false;
        this.a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public o(Context context) {
        super(context);
        this.c = false;
    }
}
