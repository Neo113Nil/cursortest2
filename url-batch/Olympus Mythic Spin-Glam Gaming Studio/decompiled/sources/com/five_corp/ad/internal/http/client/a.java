package com.five_corp.ad.internal.http.client;

import android.os.Handler;
import android.os.HandlerThread;
import com.five_corp.ad.internal.ad.h;
import com.five_corp.ad.internal.http.auxcache.i;
import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.m;
import com.five_corp.ad.internal.storage.f;
import com.five_corp.ad.internal.storage.g;
import com.five_corp.ad.internal.util.c;
import com.ironsource.C4701ic;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class a {
    public final h a;
    public final i b;
    public HandlerThread c;
    public final Handler d;
    public final com.five_corp.ad.internal.http.connection.b e;
    public com.five_corp.ad.internal.http.connection.a f;

    public a(h hVar, i iVar, com.five_corp.ad.internal.http.connection.b bVar) {
        this.a = hVar;
        this.b = iVar;
        this.e = bVar;
        HandlerThread handlerThread = new HandlerThread("HttpDownloadClient for " + hVar.a);
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(this.c.getLooper());
    }

    public final void a() {
        this.d.postAtFrontOfQueue(new Runnable() { // from class: com.five_corp.ad.internal.http.client.a$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b();
            }
        });
    }

    public final void b() {
        com.five_corp.ad.internal.storage.i iVar;
        i iVar2 = this.b;
        synchronized (iVar2.f) {
            iVar2.g = null;
            iVar = iVar2.h;
            iVar2.h = null;
        }
        if (iVar != null) {
            iVar.d.post(new g(iVar));
        }
        iVar2.c();
        e();
    }

    public final void c() {
        this.d.post(new Runnable() { // from class: com.five_corp.ad.internal.http.client.a$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d();
            }
        });
    }

    public final void d() {
        com.five_corp.ad.internal.storage.i iVar;
        byte[] bArr = new byte[8192];
        com.five_corp.ad.internal.util.b a = this.f.a(bArr);
        if (!a.a) {
            a(a.b);
            return;
        }
        int intValue = ((Integer) a.c).intValue();
        if (intValue < 0) {
            this.b.a();
            e();
            return;
        }
        i iVar2 = this.b;
        synchronized (iVar2.f) {
            iVar = iVar2.h;
        }
        if (iVar == null) {
            iVar2.a(new l(m.L2, null, null));
        } else {
            iVar.d.post(new f(iVar, bArr, intValue));
        }
        c();
    }

    public final void e() {
        com.five_corp.ad.internal.http.connection.a aVar = this.f;
        if (aVar != null) {
            aVar.b();
            this.f = null;
        }
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.c = null;
        }
    }

    public final void f() {
        this.d.post(new Runnable() { // from class: com.five_corp.ad.internal.http.client.a$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                a.this.g();
            }
        });
    }

    public final void g() {
        String str;
        l lVar;
        com.five_corp.ad.internal.util.b c = this.f.c();
        if (!c.a) {
            a(c.b);
            return;
        }
        int intValue = ((Integer) c.c).intValue();
        if (intValue != 206) {
            if (intValue == 416) {
                i();
                return;
            }
            int i = intValue / 100;
            if (i == 2) {
                h();
                return;
            }
            if (i == 3) {
                a(new l(m.r2, null, null));
                return;
            }
            if (i == 4) {
                a(new l(m.s2, null, null));
                return;
            } else if (i == 5) {
                a(new l(m.t2, null, null));
                return;
            } else {
                a(new l(m.u2, null, null));
                return;
            }
        }
        com.five_corp.ad.internal.http.connection.a aVar = this.f;
        aVar.getClass();
        try {
            str = aVar.a.getHeaderField("Content-Range");
        } catch (Throwable unused) {
            str = null;
        }
        Pattern pattern = b.a;
        boolean z = true;
        int a = b.a(str, pattern, 1);
        if (a < 0) {
            a(new l(m.o2, null, null));
            return;
        }
        int a2 = b.a(str, pattern, 2);
        if (a2 < 0) {
            a(new l(m.p2, null, null));
            return;
        }
        int a3 = b.a(str, b.b, 1);
        if (a3 < 0) {
            a(new l(m.q2, null, null));
            return;
        }
        i iVar = this.b;
        synchronized (iVar.f) {
            try {
                lVar = iVar.i < a ? new l(m.K2, null, null) : null;
            } finally {
            }
        }
        if (lVar != null) {
            iVar.a(lVar);
        } else {
            com.five_corp.ad.internal.util.b a4 = iVar.b.a(a, iVar);
            if (a4.a) {
                synchronized (iVar.f) {
                    iVar.h = (com.five_corp.ad.internal.storage.i) a4.c;
                    if (a2 + 1 != a3) {
                        z = false;
                    }
                    iVar.j = z;
                }
            } else {
                iVar.b(a4.b);
            }
        }
        c();
    }

    public final void h() {
        i iVar = this.b;
        com.five_corp.ad.internal.util.b a = iVar.b.a(0, iVar);
        if (a.a) {
            synchronized (iVar.f) {
                iVar.h = (com.five_corp.ad.internal.storage.i) a.c;
                iVar.j = true;
            }
        } else {
            iVar.b(a.b);
        }
        c();
    }

    public final void i() {
        String str;
        com.five_corp.ad.internal.http.connection.a aVar = this.f;
        aVar.getClass();
        try {
            str = aVar.a.getHeaderField("Content-Range");
        } catch (Throwable unused) {
            str = null;
        }
        int a = b.a(str, b.b, 1);
        if (a < 0) {
            a(new l(m.n2, null, null));
            return;
        }
        i iVar = this.b;
        synchronized (iVar.f) {
            try {
                if (iVar.i == a) {
                    iVar.j = true;
                } else {
                    iVar.b(new l(m.M2, null, null));
                }
            } finally {
            }
        }
        this.b.a();
        e();
    }

    public final void a(int i, int i2) {
        Pattern pattern = b.a;
        com.five_corp.ad.internal.util.b a = this.e.a(this.a.a, C4701ic.a, null, (i <= 0 || i2 != 0) ? i2 > 0 ? String.format("bytes=%d-%d", Integer.valueOf(i), Integer.valueOf((i + i2) - 1)) : null : String.format("bytes=%d-", Integer.valueOf(i)), null, null, null, 60000, 60000);
        if (!a.a) {
            a(a.b);
            return;
        }
        com.five_corp.ad.internal.http.connection.a aVar = (com.five_corp.ad.internal.http.connection.a) a.c;
        this.f = aVar;
        c a2 = aVar.a();
        if (a2.a) {
            f();
        } else {
            a(a2.b);
        }
    }

    public final void a(final int i) {
        final int i2 = 0;
        this.d.post(new Runnable() { // from class: com.five_corp.ad.internal.http.client.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(i, i2);
            }
        });
    }

    public final void a(l lVar) {
        com.five_corp.ad.internal.storage.i iVar;
        i iVar2 = this.b;
        synchronized (iVar2.f) {
            iVar2.g = null;
            iVar = iVar2.h;
            iVar2.h = null;
        }
        if (iVar != null) {
            iVar.d.post(new g(iVar));
        }
        iVar2.b(lVar);
        e();
    }
}
