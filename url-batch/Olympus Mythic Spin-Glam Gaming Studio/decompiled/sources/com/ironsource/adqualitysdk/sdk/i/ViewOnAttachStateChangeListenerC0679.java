package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ە, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class ViewOnAttachStateChangeListenerC0679 implements View.OnAttachStateChangeListener {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C1284 f1486;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f1487;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f1488;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f1489;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ List f1490;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f1491;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f1492;

    public ViewOnAttachStateChangeListenerC0679(C1284 c1284, C1064 c1064, C1064 c10642, List list, boolean z, C0785 c0785, C0880 c0880) {
        this.f1486 = c1284;
        this.f1492 = c1064;
        this.f1491 = c10642;
        this.f1490 = list;
        this.f1489 = z;
        this.f1488 = c0785;
        this.f1487 = c0880;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        m4138(this.f1492, view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m4138(this.f1491, view);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4138(C1064 c1064, View view) {
        try {
            ArrayList m4531 = C1284.m4531(this.f1486, this.f1490, new Object[]{this, view});
            if (this.f1489) {
                c1064.m4337(this.f1488, this.f1487, m4531);
            } else {
                AbstractC1026.m4313(new C0683(this, c1064, m4531));
            }
        } catch (Throwable th) {
            AbstractC0844.m4219(this.f1487.m4231(), StringFog.decrypt("nxJg+1PCQqn6L3zVVZZKpLIzZvVVh2ivuw518W2LWLO/DnfmAYtFtLMEd7Q=\n", "2mASlCHiK8c=\n") + c1064.f2696, th, null);
        }
    }
}
