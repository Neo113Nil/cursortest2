package com.vungle.ads.internal.downloader;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final int a;
    public final Throwable b;
    public final int c;

    public b(int i, Exception cause, int i2) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.a = i;
        this.b = cause;
        this.c = i2;
    }

    public final Throwable a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("DownloadError(serverCode=");
        a.append(this.a);
        a.append(", reason=");
        a.append(this.c);
        a.append(", cause=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
