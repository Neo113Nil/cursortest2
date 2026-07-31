package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class Db {
    public final String a;
    public final long b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;

    public Db(String fileName, long j, int i, long j2, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.a = fileName;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
        this.f = i2;
    }

    public /* synthetic */ Db(String str, long j, int i, long j2, boolean z, int i2, int i3) {
        this(str, j, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? 0 : i2);
    }
}
