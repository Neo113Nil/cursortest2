package com.inmobi.media;

import android.graphics.Bitmap;

/* loaded from: classes12.dex */
public final class L0 implements Vg {
    public final /* synthetic */ M0 a;
    public final /* synthetic */ AbstractC4486y2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ C4055hi d;

    public L0(M0 m0, AbstractC4486y2 abstractC4486y2, boolean z, C4055hi c4055hi) {
        this.a = m0;
        this.b = abstractC4486y2;
        this.c = z;
        this.d = c4055hi;
    }

    @Override // com.inmobi.media.Vg
    public final void a(Object obj) {
        this.a.a((Bitmap) obj, this.b, this.c, this.d);
    }

    @Override // com.inmobi.media.Vg
    public final void onError(Exception exc) {
        this.a.a(exc, this.b);
    }
}
