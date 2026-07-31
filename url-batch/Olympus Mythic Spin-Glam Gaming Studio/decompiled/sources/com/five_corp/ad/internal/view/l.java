package com.five_corp.ad.internal.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes15.dex */
public final class l extends FrameLayout {
    public final com.five_corp.ad.internal.viewability.a a;
    public final com.five_corp.ad.internal.layouter.d b;

    public l(Context context, com.five_corp.ad.internal.hub.ad_instance.e eVar, u uVar, com.five_corp.ad.internal.layouter.c cVar, com.five_corp.ad.internal.context.h hVar, String str, com.five_corp.ad.internal.viewability.a aVar, com.five_corp.ad.internal.ad.custom_layout.c cVar2, com.five_corp.ad.internal.layouter.i iVar) {
        super(context);
        this.a = aVar;
        this.b = new com.five_corp.ad.internal.layouter.d(this, context, eVar, uVar, cVar, hVar, str, aVar, cVar2, iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
        return super.dispatchTouchEvent(me);
    }

    public com.five_corp.ad.internal.ad.custom_layout.c getCustomLayoutConfig() {
        return this.b.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        com.five_corp.ad.internal.layouter.d dVar = this.b;
        dVar.getClass();
        try {
        } catch (Exception e) {
            dVar.c.a(com.five_corp.ad.internal.logger.b.a(e));
        }
        if (dVar.h == i) {
            if (dVar.i != i2) {
            }
            super.onMeasure(i, i2);
        }
        dVar.h = i;
        dVar.i = i2;
        dVar.a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.five_corp.ad.internal.viewability.a aVar = this.a;
        synchronized (aVar.g) {
            aVar.h = z;
        }
    }
}
