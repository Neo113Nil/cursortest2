package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʌ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0449 implements InterfaceC0887 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f331;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f332;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f333;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f334;

    public C0449(ArrayList arrayList, C1064 c1064, C0785 c0785, C0880 c0880) {
        this.f334 = arrayList;
        this.f333 = c1064;
        this.f332 = c0785;
        this.f331 = c0880;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0887
    /* renamed from: ﾒ */
    public final void mo4000() {
        this.f334.add(0, this);
        this.f333.m4337(this.f332, this.f331, this.f334);
        this.f334.remove(0);
    }
}
