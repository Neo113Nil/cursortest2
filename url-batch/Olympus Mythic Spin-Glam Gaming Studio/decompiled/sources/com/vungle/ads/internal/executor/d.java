package com.vungle.ads.internal.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class d implements a {
    public j a;
    public j b;
    public j c;
    public j d;
    public j e;
    public j f;
    public j g;
    public j h;

    public d() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = new j(availableProcessors, availableProcessors, 5L, timeUnit, new LinkedBlockingQueue(), new c("vng_jr"));
        this.a = new j(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new c("vng_io"));
        this.h = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_api"));
        this.d = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_logger"));
        this.b = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_background"));
        this.e = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_ua"));
        this.f = new j(4, 4, 1L, timeUnit, new PriorityBlockingQueue(), new c("vng_down"));
        this.g = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_ol"));
    }

    public final j a() {
        return this.h;
    }

    public final j b() {
        return this.b;
    }

    public final j c() {
        return this.a;
    }

    public final j d() {
        return this.c;
    }

    public final j e() {
        return this.d;
    }

    public final j f() {
        return this.g;
    }
}
