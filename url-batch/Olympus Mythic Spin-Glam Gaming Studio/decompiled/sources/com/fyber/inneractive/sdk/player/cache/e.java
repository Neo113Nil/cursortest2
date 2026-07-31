package com.fyber.inneractive.sdk.player.cache;

import java.io.File;

/* loaded from: classes11.dex */
public final class e {
    public final String a;
    public final long[] b;
    public boolean c;
    public d d;
    public final /* synthetic */ g e;

    public e(g gVar, String str) {
        this.e = gVar;
        this.a = str;
        this.b = new long[gVar.g];
    }

    public final File a(int i) {
        return new File(this.e.a, this.a + "." + i);
    }

    public final File b(int i) {
        return new File(this.e.a, this.a + "." + i + ".tmp");
    }
}
