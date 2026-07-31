package com.inmobi.media;

import java.io.File;

/* loaded from: classes12.dex */
public final class M5 {
    public final String a;
    public final long[] b;
    public boolean c;
    public L5 d;
    public final /* synthetic */ P5 e;

    public M5(P5 p5, String str) {
        this.e = p5;
        this.a = str;
        this.b = new long[p5.h];
    }

    public final File a(int i) {
        return new File(this.e.b, this.a + "." + i);
    }

    public final File b(int i) {
        return new File(this.e.b, this.a + "." + i + ".tmp");
    }
}
