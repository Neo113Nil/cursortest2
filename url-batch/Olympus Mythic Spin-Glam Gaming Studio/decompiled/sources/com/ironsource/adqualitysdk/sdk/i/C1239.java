package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹴ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1239 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f3241;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f3242;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f3243;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ List f3244;

    public C1239(List list, C1064 c1064, C0785 c0785, C0880 c0880) {
        this.f3244 = list;
        this.f3243 = c1064;
        this.f3242 = c0785;
        this.f3241 = c0880;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f3244.add(0, this);
        this.f3243.m4337(this.f3242, this.f3241, this.f3244);
        this.f3244.remove(0);
    }
}
