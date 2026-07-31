package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiNative;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.qd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4286qd implements Qo {
    public final C3868ah a;
    public final C4080ih b;
    public final Uc c;
    public final Tc d;
    public C4261pe e;

    public C4286qd(InMobiNative inMobiNative, Context context, long j) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        Intrinsics.checkNotNullParameter(context, "context");
        C3868ah c3868ah = new C3868ah();
        c3868ah.a = j;
        this.a = c3868ah;
        C4260pd c4260pd = new C4260pd(this);
        C4080ih c4080ih = new C4080ih();
        this.b = c4080ih;
        Uc uc = new Uc(inMobiNative, c4080ih, c4260pd);
        this.c = uc;
        this.d = new Tc(context, c3868ah, uc);
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        return this.d.a(d);
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        return this.d.a(i, d);
    }
}
