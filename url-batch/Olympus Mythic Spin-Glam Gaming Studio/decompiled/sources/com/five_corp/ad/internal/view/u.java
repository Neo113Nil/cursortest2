package com.five_corp.ad.internal.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Iterator;

/* loaded from: classes15.dex */
public abstract class u extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final com.five_corp.ad.internal.context.h b;
    public final C3848h c;
    public final com.five_corp.ad.f d;
    public final com.five_corp.ad.internal.hub.ad_instance.e e;
    public int f;
    public int g;

    static {
        u.class.toString();
    }

    public u(Context context, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.f fVar, com.five_corp.ad.internal.hub.ad_instance.e eVar) {
        super(context);
        this.a = context;
        this.b = hVar;
        this.d = fVar;
        new Handler(Looper.getMainLooper());
        this.e = eVar;
        C3848h c3848h = new C3848h(context, new FrameLayout.LayoutParams(0, 0));
        this.c = c3848h;
        addView(c3848h, new FrameLayout.LayoutParams(-1, -1));
    }

    public abstract void a(com.five_corp.ad.internal.viewability.c cVar);

    public abstract void a(boolean z);

    public abstract boolean b();

    public abstract void c();

    public abstract void d();

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
        return super.dispatchTouchEvent(me);
    }

    public abstract void e();

    public abstract void f();

    public abstract int getCurrentPositionMs();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.e.l.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.h hVar = (com.five_corp.ad.internal.h) it.next();
            if (!hVar.b) {
                hVar.b = true;
                if (hVar.c) {
                    hVar.a.k();
                }
            }
        }
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator it = this.e.l.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.h hVar = (com.five_corp.ad.internal.h) it.next();
            boolean z = hVar.b;
            boolean z2 = z && hVar.c;
            if (z) {
                hVar.b = false;
                if (z2) {
                    hVar.a.l();
                }
            }
        }
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
        } catch (Throwable th) {
            this.e.a(com.five_corp.ad.internal.logger.b.a(th));
        }
        if (this.f == i) {
            if (this.g != i2) {
            }
            super.onMeasure(i, i2);
        }
        this.f = i;
        this.g = i2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        C3848h c3848h = this.c;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size, size2);
        c3848h.a = layoutParams;
        for (int i3 = 0; i3 < c3848h.getChildCount(); i3++) {
            c3848h.getChildAt(i3).setLayoutParams(layoutParams);
        }
        super.onMeasure(i, i2);
    }
}
