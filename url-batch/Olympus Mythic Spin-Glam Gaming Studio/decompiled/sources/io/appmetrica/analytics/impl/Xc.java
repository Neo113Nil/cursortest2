package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes12.dex */
public final class Xc {
    public final C5576on a;
    public final C5576on b;
    public final D4 c;
    public final PublicLogger d;
    public final String e;

    public Xc(String str, PublicLogger publicLogger) {
        this(new D4(30), new C5576on(50, str.concat("map key"), publicLogger), new C5576on(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Xc(D4 d4, C5576on c5576on, C5576on c5576on2, String str, PublicLogger publicLogger) {
        this.c = d4;
        this.a = c5576on;
        this.b = c5576on2;
        this.e = str;
        this.d = publicLogger;
    }
}
