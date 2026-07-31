package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.х, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0555 implements InterfaceC0757 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f798;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f799;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f800;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1126 f801;

    public C0555(C1126 c1126, C0785 c0785, C0880 c0880, List list) {
        this.f801 = c1126;
        this.f800 = c0785;
        this.f799 = c0880;
        this.f798 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0757
    /* renamed from: ﾒ */
    public final boolean mo3952(InterfaceC0858 interfaceC0858) {
        C1288 c1288 = this.f801.f2875;
        C0785 c0785 = this.f800;
        C0880 c0880 = this.f799;
        List list = this.f798;
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
