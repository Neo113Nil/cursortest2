package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Bk {
    public final Ak a;
    public volatile U9 b;
    public volatile U9 c;
    public volatile U9 d;
    public volatile U9 e;
    public volatile U9 f;
    public volatile U9 g;
    public volatile ExecutorC5859zk h;
    public volatile U9 i;

    public Bk() {
        this(new Ak());
    }

    public final IHandlerExecutor a() {
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        this.a.getClass();
                        HandlerThreadC5824yb a = U9.a("IAA-SDE");
                        this.g = new U9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.g;
    }

    public final IHandlerExecutor b() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.a.getClass();
                        HandlerThreadC5824yb a = U9.a("IAA-SC");
                        this.b = new U9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final IHandlerExecutor c() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.a.getClass();
                        HandlerThreadC5824yb a = U9.a("IAA-SMH-1");
                        this.d = new U9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final IHandlerExecutor d() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        this.a.getClass();
                        HandlerThreadC5824yb a = U9.a("IAA-SNTPE");
                        this.e = new U9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public final IHandlerExecutor e() {
        if (this.i == null) {
            synchronized (this) {
                try {
                    if (this.i == null) {
                        this.a.getClass();
                        HandlerThreadC5824yb a = U9.a("IAA-SPT");
                        this.i = new U9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.i;
    }

    public final IHandlerExecutor f() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.a.getClass();
                        HandlerThreadC5824yb a = U9.a("IAA-STE");
                        this.c = new U9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final IHandlerExecutor g() {
        if (this.f == null) {
            synchronized (this) {
                try {
                    if (this.f == null) {
                        this.a.getClass();
                        HandlerThreadC5824yb a = U9.a("IAA-SIO");
                        this.f = new U9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f;
    }

    public Bk(Ak ak) {
        new HashMap();
        this.a = ak;
    }
}
