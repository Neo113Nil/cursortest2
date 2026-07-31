package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5262cj {
    public final Revenue a;
    public final C5498ln b;
    public final C5706tn c;
    public final C5706tn d;
    public final PublicLogger e;

    public C5262cj(Revenue revenue, PublicLogger publicLogger) {
        this.e = publicLogger;
        this.a = revenue;
        this.b = new C5498ln(30720, "revenue payload", publicLogger);
        this.c = new C5706tn(new C5498ln(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.d = new C5706tn(new C5576on(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
