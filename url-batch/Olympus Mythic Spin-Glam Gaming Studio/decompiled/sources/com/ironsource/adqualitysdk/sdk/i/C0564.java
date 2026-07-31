package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ј, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0564 implements InterfaceC0757 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f945;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f946;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f947;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1126 f948;

    public C0564(C1126 c1126, C0785 c0785, C0880 c0880, List list) {
        this.f948 = c1126;
        this.f947 = c0785;
        this.f946 = c0880;
        this.f945 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0757
    /* renamed from: ﾒ */
    public final boolean mo3952(InterfaceC0858 interfaceC0858) {
        C1288 c1288 = this.f948.f2875;
        C0785 c0785 = this.f947;
        C0880 c0880 = this.f946;
        List list = this.f945;
        AbstractC0416 abstractC0416 = c1288.f3449;
        if (abstractC0416 != null && !abstractC0416.mo3999(interfaceC0858)) {
            return false;
        }
        if (c1288.f3448 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, interfaceC0858);
        return c1288.f3448.m4337(c0785, c0880, arrayList).m4250();
    }
}
