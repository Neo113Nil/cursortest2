package com.mbridge.msdk.config.component.nori.monitor;

import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MonitorNetworkRequestLink.java */
/* loaded from: classes3.dex */
public class a {
    private static boolean H = MBridgeConstans.DEBUG;
    private static final AtomicInteger I = new AtomicInteger(0);
    private static final AtomicInteger J = new AtomicInteger(0);
    private Map<String, Object> F;
    private Map<String, Integer> G;
    private boolean a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m = 0;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    private long q = 0;
    private long r = 0;
    private long s = 0;
    private long t = 0;
    private long u = 0;
    private long v = 0;
    private long w = 0;
    private long x = 0;
    private long y = 0;
    private long z = 0;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;

    public void a(int i, int i2, int i3) {
        if (this.a) {
            return;
        }
        HashMap hashMap = new HashMap();
        this.G = hashMap;
        hashMap.put("threadPoolSize", Integer.valueOf(i));
        this.G.put("activeThreads", Integer.valueOf(i2));
        this.G.put("queuedTasks", Integer.valueOf(i3));
    }

    public void b() {
        if (this.a) {
            return;
        }
        l();
    }

    public void c() {
        if (this.a) {
            return;
        }
        this.g = (System.nanoTime() - this.q) / 1000000;
    }

    public void d() {
    }

    public void e() {
        if (this.a) {
            return;
        }
        this.q = System.nanoTime();
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
        if (this.a) {
            return;
        }
        this.f = (System.nanoTime() - this.o) / 1000000;
    }

    public void i() {
        if (this.a) {
            return;
        }
        this.o = System.nanoTime();
    }

    public Map<String, Object> j() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("isRetry", Boolean.valueOf(this.a));
        hashMap2.put("retryCount", Integer.valueOf(this.b));
        hashMap2.put("requestBodySize", Long.valueOf(this.c));
        hashMap2.put("responseBodySize", Long.valueOf(this.d));
        hashMap.put("basicInfo", hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("totalTime", Long.valueOf(this.e));
        hashMap3.put("dnsTime", Long.valueOf(this.f));
        hashMap3.put("connectionTime", Long.valueOf(this.g));
        hashMap3.put("requestTime", Long.valueOf(this.h));
        hashMap3.put("serverTime", Long.valueOf(this.i));
        hashMap3.put("responseTime", Long.valueOf(this.j));
        hashMap3.put("queueTime", Long.valueOf(this.k));
        hashMap3.put("parsingTime", Long.valueOf(this.l));
        hashMap.put("timingInfo", hashMap3);
        hashMap.put(X3.j.h0, this.F);
        hashMap.put("threadPoolInfo", this.G);
        return hashMap;
    }

    public void k() {
        if (this.a) {
            return;
        }
        this.e = (System.nanoTime() - this.m) / 1000000;
    }

    public void l() {
        if (this.a) {
            return;
        }
        this.k = (System.nanoTime() - this.m) / 1000000;
    }

    public void m() {
        if (this.a) {
            return;
        }
        this.m = System.nanoTime();
    }

    public void n() {
        if (this.a) {
            return;
        }
        this.w = System.nanoTime();
    }

    public void o() {
        if (this.a) {
            return;
        }
        this.v = System.nanoTime();
    }

    public void p() {
        if (this.a) {
            return;
        }
        this.u = System.nanoTime();
    }

    public void q() {
        if (this.a) {
            return;
        }
        this.A = System.nanoTime();
    }

    public void r() {
        if (this.a) {
            return;
        }
        this.z = System.nanoTime();
    }

    public void s() {
        if (this.a) {
            return;
        }
        long nanoTime = System.nanoTime();
        this.y = nanoTime;
        this.i = (nanoTime - this.x) / 1000000;
    }

    public void t() {
        if (this.a) {
            return;
        }
        this.s = System.nanoTime();
    }

    public void u() {
        if (this.a) {
            return;
        }
        this.r = System.nanoTime();
    }

    public void b(long j) {
        if (this.a) {
            return;
        }
        this.j = (System.nanoTime() - this.y) / 1000000;
        this.d = j;
    }

    public void a(boolean z) {
        this.a = z;
        if (z) {
            this.b++;
        }
    }

    public void a(long j) {
        if (this.a) {
            return;
        }
        this.h = (System.nanoTime() - this.u) / 1000000;
        this.c = j;
    }

    public void a() {
        if (this.a) {
            return;
        }
        k();
    }

    public void a(IOException iOException) {
        if (this.a) {
            return;
        }
        k();
    }

    public void a(String str) {
        if (H) {
            try {
                int h = m0.h();
                int x = m0.x();
                HashMap hashMap = new HashMap();
                hashMap.put("reason", str);
                hashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                hashMap.put("available_memory_mb", Integer.valueOf(h));
                hashMap.put("total_memory_mb", Integer.valueOf(x));
                j().put("task_rejection", hashMap);
            } catch (Exception e) {
                q0.b("NetworkRequestMonitor", "Failed to record task rejection: " + e.getMessage());
            }
        }
    }
}
