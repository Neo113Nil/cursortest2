package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C4945w2;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes4.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {
    private View a;
    private ISBannerSize b;
    private String c;
    private Activity d;
    private boolean e;
    private C4945w2 f;

    class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ FrameLayout.LayoutParams b;

        a(View view, FrameLayout.LayoutParams layoutParams) {
            this.a = view;
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.a);
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            View view = this.a;
            iSDemandOnlyBannerLayout.a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.e = false;
        this.d = activity;
        this.b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f = new C4945w2();
    }

    protected void a() {
        this.e = true;
        this.d = null;
        this.b = null;
        this.c = null;
        this.a = null;
        removeBannerListener();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me);
        return super.dispatchTouchEvent(me);
    }

    public Activity getActivity() {
        return this.d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f.a();
    }

    public View getBannerView() {
        return this.a;
    }

    public C4945w2 getListener() {
        return this.f;
    }

    public String getPlacementName() {
        return this.c;
    }

    public ISBannerSize getSize() {
        return this.b;
    }

    public boolean isDestroyed() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f.b((C4945w2) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f.b((C4945w2) iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.c = str;
    }

    void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.e = false;
    }
}
