package com.five_corp.ad.internal.view;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.widget.TextViewCompat;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes15.dex */
public final class s extends u {
    public final com.five_corp.ad.internal.cache.f i;
    public r j;
    public ImageView k;
    public final com.five_corp.ad.internal.ad.f l;
    public final com.five_corp.ad.internal.ad.f m;

    public s(Context context, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.f fVar, com.five_corp.ad.internal.hub.ad_instance.e eVar) {
        super(context, hVar, fVar, eVar);
        this.i = hVar.g;
        com.five_corp.ad.internal.ad.c cVar = hVar.a.C;
        if (cVar == null || cVar.a != 2) {
            return;
        }
        com.five_corp.ad.internal.ad.f fVar2 = new com.five_corp.ad.internal.ad.f(getContext());
        this.l = fVar2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        fVar2.setLayoutParams(layoutParams);
        fVar2.setGravity(17);
        fVar2.setTextColor(-16777216);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(fVar2, 1);
        addView(fVar2);
        com.five_corp.ad.internal.ad.f fVar3 = new com.five_corp.ad.internal.ad.f(getContext());
        this.m = fVar3;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        fVar3.setLayoutParams(layoutParams2);
        fVar3.setGravity(17);
        fVar2.setTextColor(-16777216);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(fVar3, 1);
        addView(fVar3);
    }

    @Override // com.five_corp.ad.internal.view.u
    public final void a(boolean z) {
    }

    @Override // com.five_corp.ad.internal.view.u
    public final boolean b() {
        return false;
    }

    @Override // com.five_corp.ad.internal.view.u
    public final void c() {
        if (this.j == null) {
            r rVar = new r(this);
            this.j = rVar;
            this.i.a(this.b.a.h, rVar);
        }
    }

    @Override // com.five_corp.ad.internal.view.u
    public final void d() {
    }

    @Override // com.five_corp.ad.internal.view.u, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.five_corp.ad.internal.view.u
    public final void e() {
    }

    @Override // com.five_corp.ad.internal.view.u
    public final void f() {
    }

    @Override // com.five_corp.ad.internal.view.u
    public final int getCurrentPositionMs() {
        return 0;
    }

    @Override // com.five_corp.ad.internal.view.u
    public final void a(com.five_corp.ad.internal.viewability.c cVar) {
        com.five_corp.ad.internal.ad.f fVar = this.l;
        if (fVar != null) {
            fVar.setText(cVar.a());
        }
        com.five_corp.ad.internal.ad.f fVar2 = this.m;
        if (fVar2 != null) {
            fVar2.setText(cVar.a());
        }
    }
}
