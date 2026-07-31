package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ণ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class ViewOnLayoutChangeListenerC0707 implements View.OnLayoutChangeListener {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C1284 f1567;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f1568;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f1569;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f1570;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f1571;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ List f1572;

    public ViewOnLayoutChangeListenerC0707(C1284 c1284, C1064 c1064, C0880 c0880, C0785 c0785, List list, boolean z) {
        this.f1567 = c1284;
        this.f1572 = list;
        this.f1571 = z;
        this.f1570 = c1064;
        this.f1569 = c0785;
        this.f1568 = c0880;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            ArrayList m4531 = C1284.m4531(this.f1567, this.f1572, new Object[]{this, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)});
            if (this.f1571) {
                this.f1570.m4337(this.f1569, this.f1568, m4531);
            } else {
                AbstractC1026.m4313(new C0728(this, m4531));
            }
        } catch (Throwable th) {
            AbstractC0844.m4219(this.f1568.m4231(), StringFog.decrypt("4XZvSRBoS5mES3NqAzFNgtBHdUcML0e7zXdpQwwtUNfNam5PBi0C\n", "pAQdJmJIIvc=\n") + this.f1570.f2696, th, null);
        }
    }
}
