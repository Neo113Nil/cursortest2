package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5402i4 {
    public final C5376h4 a;
    public volatile U9 b;
    public volatile U9 c;
    public volatile U9 d;

    public C5402i4() {
        this(new C5376h4());
    }

    public final IHandlerExecutor a() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.a.getClass();
                        HandlerThreadC5824yb a = U9.a("IAA-CDE");
                        this.b = new U9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final IHandlerExecutor b() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.a.getClass();
                        HandlerThreadC5824yb a = U9.a("IAA-CPT");
                        this.d = new U9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final ICommonExecutor c() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.a.getClass();
                        HandlerThreadC5824yb a = U9.a("IAA-CRS");
                        this.c = new U9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public C5402i4(C5376h4 c5376h4) {
        this.a = c5376h4;
    }
}
