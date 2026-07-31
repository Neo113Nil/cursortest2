package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes11.dex */
public final class Ih {
    public final C5326f6 a;
    public final boolean b;
    public final int c;
    public final HashMap d;
    public final Sh e;

    public Ih(C5326f6 c5326f6, boolean z, int i, HashMap hashMap, Sh sh) {
        this.a = c5326f6;
        this.b = z;
        this.c = i;
        this.d = hashMap;
        this.e = sh;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.a + ", serviceDataReporterType=" + this.c + ", environment=" + this.e + ", isCrashReport=" + this.b + ", trimmedFields=" + this.d + ')';
    }
}
