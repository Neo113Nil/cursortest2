package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import java.util.LinkedHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒑ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0812 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0791 f1998;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f1999;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Context f2000;

    public C0812(C0791 c0791, Context context, LinkedHashMap linkedHashMap) {
        this.f1998 = c0791;
        this.f2000 = context;
        this.f1999 = linkedHashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f1998.f1868 = AbstractC0590.m4087().mo4096();
        this.f1998.m4204(this.f2000, this.f1999, new C0824(this));
        AbstractC0590 m4087 = AbstractC0590.m4087();
        C0823 c0823 = new C0823(this);
        C0600 c0600 = (C0600) m4087;
        Handler handler = c0600.f1018;
        if (handler != null) {
            handler.post(new C0630(c0600, c0823));
        }
    }
}
