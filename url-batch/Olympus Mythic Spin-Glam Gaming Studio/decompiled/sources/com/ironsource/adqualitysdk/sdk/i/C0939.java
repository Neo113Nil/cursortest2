package com.ironsource.adqualitysdk.sdk.i;

import java.util.Calendar;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘇ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0939 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0916 f2234;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2235;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2236;

    public C0939(C0916 c0916, String str, String str2) {
        this.f2234 = c0916;
        this.f2236 = str;
        this.f2235 = str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0916 c0916 = this.f2234;
        String str = this.f2236;
        c0916.m4243(str, this.f2235);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String m4543 = AbstractC1293.m4543("+tNYTIZ2XDW1y1w=\n", "1L85P/IDLFE=\n", sb);
        String str2 = AbstractC0530.f589;
        c0916.m4243(m4543, Long.toString(Calendar.getInstance().getTimeInMillis()));
        this.f2234.getClass();
    }
}
