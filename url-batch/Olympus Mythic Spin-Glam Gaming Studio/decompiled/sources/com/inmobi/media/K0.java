package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class K0 implements Vg {
    public final /* synthetic */ M0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C3949dk c;
    public final /* synthetic */ String d;

    public K0(M0 m0, boolean z, C3949dk c3949dk, String str) {
        this.a = m0;
        this.b = z;
        this.c = c3949dk;
        this.d = str;
    }

    @Override // com.inmobi.media.Vg
    public final void onError(Exception exc) {
        this.a.a(exc, this.c);
    }

    @Override // com.inmobi.media.Vg
    public final void a(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.a.a("file saved - " + result + " , isReporting - " + this.b);
        this.a.a(result, this.c, this.d, this.b);
    }
}
