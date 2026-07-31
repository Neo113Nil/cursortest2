package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꮁ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0770 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0770 f1775;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0754 f1776;

    public C0770(C0754 c0754, C0770 c0770) {
        this.f1776 = c0754;
        this.f1775 = c0770;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ArrayList m4162() {
        ArrayList arrayList = new ArrayList(this.f1776.f1685);
        C0770 c0770 = this.f1775;
        if (c0770 != null) {
            arrayList.addAll(c0770.m4162());
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList m4164() {
        ArrayList arrayList = new ArrayList(this.f1776.f1684);
        C0770 c0770 = this.f1775;
        if (c0770 != null) {
            arrayList.addAll(c0770.m4164());
        }
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1064 m4161(String str) {
        C0770 c0770;
        C1064 c1064 = (C1064) this.f1776.f1682.get(str);
        return (c1064 != null || (c0770 = this.f1775) == null) ? c1064 : c0770.m4161(str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0575 m4163(String str) {
        C0770 c0770;
        C0575 c0575 = (C0575) this.f1776.f1683.get(str);
        return (c0575 != null || (c0770 = this.f1775) == null) ? c0575 : c0770.m4163(str);
    }
}
