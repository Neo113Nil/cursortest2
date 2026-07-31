package com.my.target;

import android.os.Handler;
import android.os.Looper;
import com.my.target.si;
import com.my.target.yh;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class ci {
    static AtomicBoolean k = new AtomicBoolean(false);
    static long l = 7200000;
    private final Executor a;
    private final yh b;
    private final si c;
    private final int d;
    private final hc e;
    private final jg f;
    private zf h;
    private final int i;
    Handler g = null;
    private final List j = new ArrayList();

    private ci(Executor executor, yh yhVar, si siVar, int i, int i2, hc hcVar, jg jgVar) {
        this.a = executor;
        this.b = yhVar;
        this.c = siVar;
        this.d = i;
        this.e = hcVar;
        this.f = jgVar;
        this.i = i2;
    }

    public static void a(long j) {
        if (k.compareAndSet(false, true)) {
            l = Math.max(300000L, Math.min(j, 432000000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Looper.prepare();
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        Handler handler = new Handler(myLooper);
        this.g = handler;
        zf a = zf.a(handler, POBCommonConstants.BANNER_BID_EXPIRE_TIME_IN_MILLIS);
        this.h = a;
        a.a(new Runnable() { // from class: com.my.target.ci$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ci.this.d();
            }
        });
        b(new Runnable() { // from class: com.my.target.ci$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ci.this.d();
            }
        });
        Looper.loop();
    }

    void c() {
        a(new Runnable() { // from class: com.my.target.ci$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ci.this.b();
            }
        });
    }

    void d() {
        a();
        a((sh) null);
    }

    public static ci a(Executor executor, yh yhVar, si siVar, int i, int i2, hc hcVar, jg jgVar) {
        return new ci(executor, yhVar, siVar, i, i2, hcVar, jgVar);
    }

    public void a(Runnable runnable, long j) {
        Handler handler = this.g;
        Objects.requireNonNull(handler);
        handler.postDelayed(runnable, j);
    }

    private void a(Runnable runnable) {
        this.a.execute(runnable);
    }

    public void a(final String str, long j, vh vhVar, final sh shVar) {
        xh xhVar;
        if (k.get()) {
            a(str, j, l, vhVar, shVar);
            return;
        }
        si.a b = this.c.b(str, this.d, this.e);
        if (b.a()) {
            return;
        }
        vhVar.a(9000, "responseCode=" + b.c + ", error=" + b.d + ", " + vhVar.d);
        if (shVar == null || (xhVar = shVar.a) == null) {
            return;
        }
        final long j2 = xhVar.a;
        a(new Runnable() { // from class: com.my.target.ci$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ci.this.a(str, j2, shVar);
            }
        }, j2);
    }

    public void b(Runnable runnable) {
        Handler handler = this.g;
        Objects.requireNonNull(handler);
        handler.post(runnable);
    }

    private void b(final String str, final int i, final hc hcVar, final long j, final int i2) {
        if (i2 >= 1 && !this.c.b(str, i, hcVar).a() && i2 - 1 >= 1) {
            a(new Runnable() { // from class: com.my.target.ci$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ci.this.a(str, i, hcVar, j, i2);
                }
            }, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(bi biVar, si.a aVar) {
        this.j.remove(Long.valueOf(biVar.a));
        if (aVar.a()) {
            this.b.b(biVar.a);
        } else if (aVar.a != 4) {
            this.b.b(biVar.a);
            biVar.d.a(9000, "resolve resultCode=" + aVar.a + ", responseCode=" + aVar.c + ", error=" + aVar.d + ", " + biVar.d.d);
        }
        a((sh) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j, sh shVar) {
        b(str, this.d, this.e, j, shVar.a.b);
    }

    private void a(String str, long j, long j2, vh vhVar, sh shVar) {
        this.b.a(str, j, j + j2, vhVar);
        a(shVar);
    }

    private void a(final sh shVar) {
        if (!this.f.b() || this.j.size() >= this.i) {
            return;
        }
        try {
            yh.a a = this.b.a();
            while (a.moveToNext() && this.j.size() < this.i) {
                try {
                    final bi a2 = a.a();
                    if (!this.j.contains(Long.valueOf(a2.a))) {
                        this.j.add(Long.valueOf(a2.a));
                        a(new Runnable() { // from class: com.my.target.ci$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                ci.this.a(a2, shVar);
                            }
                        });
                    }
                } finally {
                }
            }
            a.close();
        } catch (Throwable th) {
            mi.b("StatSender error: " + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final bi biVar, final sh shVar) {
        xh xhVar;
        final si.a b = this.c.b(biVar.b, this.d, this.e);
        if (!b.a() && shVar != null && (xhVar = shVar.a) != null) {
            final long j = xhVar.a;
            a(new Runnable() { // from class: com.my.target.ci$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    ci.this.a(biVar, j, shVar);
                }
            }, j);
        }
        b(new Runnable() { // from class: com.my.target.ci$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                ci.this.a(biVar, b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(bi biVar, long j, sh shVar) {
        b(biVar.b, this.d, this.e, j, shVar.a.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i, hc hcVar, long j, int i2) {
        b(str, i, hcVar, j, i2 - 1);
    }

    private void a() {
        this.b.a(System.currentTimeMillis());
    }
}
