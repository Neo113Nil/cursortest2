package com.five_corp.ad.internal.view;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes15.dex */
public final class m extends FrameLayout {
    public final com.five_corp.ad.internal.layouter.f a;

    static {
        m.class.toString();
    }

    public m(Activity activity, com.five_corp.ad.internal.y yVar, com.five_corp.ad.internal.hub.ad_instance.e eVar, u uVar, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.internal.layouter.e eVar2, com.five_corp.ad.internal.fullscreen.c cVar, com.five_corp.ad.internal.viewability.a aVar, com.five_corp.ad.internal.layouter.i iVar) {
        super(activity);
        this.a = new com.five_corp.ad.internal.layouter.f(this, activity, yVar, eVar, uVar, hVar, eVar2, cVar, aVar, iVar);
    }

    public final void a() {
        com.five_corp.ad.internal.layouter.f fVar = this.a;
        fVar.g.b.a();
        com.five_corp.ad.internal.ad.h hVar = fVar.a.getWidth() > fVar.a.getHeight() ? fVar.c.f : fVar.c.e;
        if (hVar != null) {
            com.five_corp.ad.internal.cache.b a = fVar.e.a(fVar.b, hVar);
            fVar.h = a;
            fVar.a.addView(a, new FrameLayout.LayoutParams(-1, -1, 17));
            fVar.h.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        fVar.a.addView(fVar.g, new FrameLayout.LayoutParams(0, 0, 17));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            com.five_corp.ad.internal.layouter.f fVar = this.a;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            fVar.getClass();
            try {
                com.five_corp.ad.internal.ad.custom_layout.c customLayoutConfig = fVar.g.getCustomLayoutConfig();
                com.five_corp.ad.internal.ad.custom_layout.c cVar = i5 > i6 ? fVar.c.d : fVar.c.c;
                if (customLayoutConfig != cVar) {
                    fVar.g.b.a(cVar);
                }
                fVar.g.setLayoutParams(fVar.a(i5, i6));
                fVar.a(i5);
            } catch (Throwable th) {
                fVar.j.a(com.five_corp.ad.internal.logger.b.a(th));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
