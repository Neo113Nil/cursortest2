package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.k;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes12.dex */
public final class c extends a {
    public double m;

    public c(String str, k kVar, String str2) {
        super(str, kVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar, String str) {
        return kVar.b(str, this.l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(k kVar, String str) {
        String str2 = this.l;
        kVar.getClass();
        String a = k.a(str, "min", "rat", "bidding", k.e(str2));
        String a2 = k.a(str, "min", "rat", "bidding", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer a3 = kVar.a(a2);
        int intValue = a3 != null ? a3.intValue() : 5000;
        Integer a4 = kVar.a(a);
        return a4 != null ? a4.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(k kVar, String str) {
        String str2 = this.l;
        kVar.getClass();
        String a = k.a(str, "rat", "bidding", "perc", k.e(str2));
        String a2 = k.a(str, "rat", "bidding", "perc", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer a3 = kVar.a(a2);
        int intValue = a3 != null ? a3.intValue() : 15;
        Integer a4 = kVar.a(a);
        return a4 != null ? a4.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final void d(k kVar, String str) {
        super.d(kVar, str);
        Boolean c = kVar.c("reverse_retries");
        this.g = c != null ? c.booleanValue() : true;
        String a = k.a("retry_interval", "rat", "bidding");
        Integer a2 = kVar.a(k.a("retry_interval", "all_mediators"));
        int intValue = a2 != null ? a2.intValue() : 100;
        Integer a3 = kVar.a(a);
        if (a3 != null) {
            intValue = a3.intValue();
        }
        this.e = intValue;
        this.c = (this.i + this.h) - (intValue + this.f);
        String a4 = k.a("bidding", "irat", k.e(this.l));
        Integer a5 = kVar.a(k.a("bidding", "irat", "all_mediators"));
        int intValue2 = a5 != null ? a5.intValue() : 10000;
        Integer a6 = kVar.a(a4);
        if (a6 != null) {
            intValue2 = a6.intValue();
        }
        this.d = intValue2;
        this.m = Math.min(this.k, this.j) / Math.max(this.k, this.j);
        b(this.d);
        this.a = Math.max(0, a());
        if (this.g) {
            IAlog.a("%s : RequestBiddingAdTimeout shouldReverseRetries - reversing timeouts", IAlog.a(this));
            a(0);
        }
        IAlog.a("%s : RequestBiddingAdTimeout init timeouts, total retries: %d", IAlog.a(this), Integer.valueOf(this.a));
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar) {
        String str = this.l;
        kVar.getClass();
        String a = k.a("timeout", "threshold", "rat", "bidding", k.e(str));
        Integer a2 = kVar.a(k.a("timeout", "threshold", "rat", "bidding", "all_mediators"));
        int intValue = a2 != null ? a2.intValue() : 300;
        Integer a3 = kVar.a(a);
        return a3 != null ? a3.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(int i) {
        if (this.g) {
            i = this.a - i;
        }
        int i2 = (this.b * i) + this.d;
        IAlog.a("%s : RequestBiddingAdTimeout resolveTimeoutForRetry, timeout: %d ms for retry: %d", IAlog.a(this), Integer.valueOf(i2), Integer.valueOf(i));
        b(i2);
        return i2;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b() {
        return this.a;
    }

    public final void b(int i) {
        double d = this.m;
        if (d == 1.0d || d == 0.0d) {
            IAlog.a("%s : RequestBiddingAdTimeout Ratio: %f, connection and read timeouts should be divided in equal proportions", IAlog.a(this), Double.valueOf(this.m));
            this.m = 0.5d;
        }
        int i2 = (int) (i * this.m);
        this.h = i2;
        this.i = i - i2;
        IAlog.a("%s : RequestBiddingAdTimeout Update timeouts connection: %d read: %d", IAlog.a(this), Integer.valueOf(this.i), Integer.valueOf(this.h));
    }
}
