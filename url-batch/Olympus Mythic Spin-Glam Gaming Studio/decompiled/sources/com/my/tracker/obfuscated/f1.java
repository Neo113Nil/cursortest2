package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.d1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class f1 {
    final d1 a;
    final int b;
    final int c;
    final int d;
    final int e;
    long f;
    long g;

    private f1(d1 d1Var, int i, int i2, int i3, int i4) {
        this.a = d1Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        Long b = d1Var.b("timestamp_base");
        if (b == null) {
            this.f = 0L;
        } else {
            this.f = b.longValue();
        }
        this.g = d1Var.l();
    }

    public static f1 a(d1 d1Var) {
        return a(d1Var, 1000, 500, 500, 100);
    }

    public x1 b() {
        return new y1(this.a);
    }

    public z1 c() {
        return new a2(this.a, "default_session");
    }

    public boolean d(byte[] bArr, long j) {
        try {
            if (this.a.f(6L) >= this.c) {
                long j2 = 0;
                if (this.a.a(6L, bArr) == 0) {
                    x2.a("MyTrackerRepository: maximum count of custom events is exceeded, event has been skipped");
                    Long b = this.a.b("custom_events_skipped_count");
                    if (b != null) {
                        j2 = b.longValue();
                    }
                    long j3 = j2 + 1;
                    x2.a("MyTrackerRepository: skipped custom events count: " + j3);
                    this.a.a("custom_events_skipped_count", Long.valueOf(j3));
                    return false;
                }
            }
            return a(6, bArr, false, true, j);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: event serialization failed, type: 6", th);
            return false;
        }
    }

    public List e() {
        ArrayList arrayList = new ArrayList();
        d1.b bVar = null;
        try {
            bVar = this.a.h();
            while (bVar.b()) {
                f a = f.a(bVar.m(), bVar.n(), bVar.o(), bVar.p(), bVar.e());
                if (a != null) {
                    arrayList.add(a.a(Long.valueOf(bVar.a())));
                }
            }
            bVar.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                x2.b("MyTrackerRepository error: error while reading purchases", th);
                return arrayList;
            } finally {
                if (bVar != null) {
                    bVar.close();
                }
            }
        }
    }

    public long f() {
        try {
            Long b = this.a.b("custom_events_skipped_count");
            if (b == null) {
                return 0L;
            }
            return b.longValue();
        } catch (Throwable th) {
            x2.b("Error: get custom events skipped count", th);
            return 0L;
        }
    }

    public List g() {
        ArrayList arrayList = new ArrayList();
        d1.e eVar = null;
        try {
            eVar = this.a.k();
            while (eVar.b()) {
                o0 a = o0.a(eVar.m(), eVar.n(), eVar.e());
                if (a != null) {
                    arrayList.add(a.a(Long.valueOf(eVar.a())));
                }
            }
            eVar.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                x2.b("MyTrackerRepository error: error while reading purchases", th);
                return arrayList;
            } finally {
                if (eVar != null) {
                    eVar.close();
                }
            }
        }
    }

    public long h() {
        return this.g;
    }

    public boolean i(byte[] bArr, long j) {
        return a(1, bArr, true, false, j);
    }

    public boolean j(byte[] bArr, long j) {
        return c(9, bArr, j);
    }

    public boolean k(byte[] bArr, long j) {
        return c(13, bArr, j);
    }

    public boolean l(byte[] bArr, long j) {
        return a(25, bArr, false, true, j);
    }

    public boolean m(byte[] bArr, long j) {
        return a(7, bArr, true, true, j);
    }

    public boolean n(byte[] bArr, long j) {
        return a(26, bArr, false, true, j);
    }

    public boolean o(byte[] bArr, long j) {
        return a(28, bArr, false, true, j);
    }

    public boolean p(byte[] bArr, long j) {
        return a(29, bArr, false, true, j);
    }

    public boolean q(byte[] bArr, long j) {
        return a(2, bArr, true, false, j);
    }

    public boolean r(byte[] bArr, long j) {
        return a(8, bArr, true, true, j);
    }

    public boolean s(byte[] bArr, long j) {
        return a(5, bArr, true, false, j);
    }

    static f1 a(d1 d1Var, int i, int i2, int i3, int i4) {
        try {
            return new f1(d1Var, i, i2, i3, i4);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th);
            return null;
        }
    }

    public boolean b(long j) {
        return c(3, new byte[0], j);
    }

    public boolean c(byte[] bArr, long j) {
        return a(32, bArr, true, false, j);
    }

    public boolean h(byte[] bArr, long j) {
        return a(31, bArr, true, false, j);
    }

    public long i() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public boolean j() {
        ?? r2;
        d1.c i;
        try {
            i = this.a.i();
        } catch (Exception unused) {
            r2 = 0;
        }
        try {
            r2 = i.b();
            try {
                i.close();
                d1.f a = this.a.a("default_session");
                try {
                    r2 = r2;
                    if (a.b()) {
                        r2++;
                    }
                    a.close();
                } finally {
                }
            } catch (Exception unused2) {
            }
            return r2 != 0;
        } finally {
        }
    }

    public boolean b(byte[] bArr, long j) {
        return a(33, bArr, true, false, j);
    }

    void c(long j) {
        try {
            this.a.a("timestamp_base", Long.valueOf(j));
            this.f = j;
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
        }
    }

    public boolean b(int i, byte[] bArr, long j) {
        boolean z = i == 20 || i == 21;
        if (i == 24) {
            try {
                long j2 = i;
                if (this.a.f(j2) >= this.c && this.a.a(j2, bArr) == 0) {
                    x2.a("MyTrackerRepository: maximum count of mini-app custom events is exceeded, event has been skipped");
                    return false;
                }
            } catch (Throwable th) {
                x2.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
                return false;
            }
        }
        return a(i, bArr, z, true, j);
    }

    public boolean a(byte[] bArr, long j) {
        return a(14, bArr, true, false, j);
    }

    public boolean f(byte[] bArr, long j) {
        return a(10, bArr, true, false, j);
    }

    public boolean a(int i, byte[] bArr, long j) {
        return a(i, bArr, true, true, j);
    }

    private boolean c(int i, byte[] bArr, long j) {
        try {
            return a(i, bArr, false, true, j);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }

    public boolean a(long j, long j2) {
        long j3;
        AutoCloseable autoCloseable = null;
        try {
            d1.f a = this.a.a("default_session");
            long j4 = 0;
            if (a.b()) {
                long a2 = a.a();
                long m = a.m();
                long c = a.c();
                if (this.f == 0) {
                    c(m);
                }
                x2.a("MyTrackerRepository: finish previous session");
                if (j2 == 0) {
                    j3 = a2;
                    this.a.a(a2, m - this.f, true, 0L);
                } else {
                    j3 = a2;
                    d1 d1Var = this.a;
                    long j5 = this.f;
                    d1Var.a(j3, m - j5, false, j2 - j5);
                }
                long j6 = j3;
                long g = this.a.g(j6);
                x2.a("MyTrackerRepository: session timestamps count: " + g);
                long j7 = (long) this.d;
                if (g > j7) {
                    j4 = this.a.b(j6, g - j7);
                    x2.a("MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: " + j4);
                }
                x2.a("MyTrackerRepository: start new session");
                this.a.a(j6, j, c + j4);
            } else {
                x2.a("MyTrackerRepository: insert session");
                if (this.a.a("default_session", j) == d1.y) {
                    x2.b("MyTrackerRepository error: session insertion failed ");
                    a.close();
                    return false;
                }
                if (this.f == 0) {
                    c(j);
                }
            }
            a.close();
            return true;
        } catch (Throwable th) {
            try {
                x2.b("MyTrackerRepository error: session insertion failed ", th);
                if (0 != 0) {
                    autoCloseable.close();
                }
                return false;
            } finally {
            }
        }
    }

    public void b(o0 o0Var) {
        Long b = o0Var.b();
        if (b != null) {
            try {
                this.a.b(b.longValue());
            } catch (Throwable th) {
                x2.b("MyTrackerRepository error: error while removing raw purchase with id " + b, th);
            }
        }
    }

    public void b(f fVar) {
        Long b = fVar.b();
        if (b != null) {
            try {
                this.a.a(b.longValue());
            } catch (Throwable th) {
                x2.b("MyTrackerRepository error: error while removing raw appgallery purchase with id " + b, th);
            }
        }
    }

    public b d() {
        try {
            return this.a.f();
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
            return null;
        }
    }

    public boolean g(byte[] bArr, long j) {
        return a(27, bArr, false, true, j);
    }

    public boolean e(byte[] bArr, long j) {
        return a(15, bArr, true, true, j);
    }

    public void a(o0 o0Var) {
        String jSONObject = o0Var.d().toString();
        String a = o0Var.a();
        try {
            if (this.a.j() >= this.e) {
                x2.a("MyTrackerRepository: max count of raw purchases is reached");
                x2.a("MyTrackerRepository: raw purchase with data: " + jSONObject + ", signature " + a + " isn't inserted");
                return;
            }
            long a2 = this.a.a(jSONObject, a, o0Var.f());
            if (a2 >= 0) {
                x2.a("MyTrackerRepository: raw purchase was inserted; id: " + a2 + ", data: " + jSONObject + ", signature: " + a);
                o0Var.a(Long.valueOf(a2));
            }
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: can't insert raw purchase with data: " + jSONObject + ", signature " + a, th);
        }
    }

    public void a(f fVar) {
        String jSONObject = fVar.e().toString();
        String a = fVar.a();
        String f = fVar.f();
        int g = fVar.g();
        try {
            if (this.a.g() >= this.e) {
                x2.a("MyTrackerRepository: max count of raw purchases is reached");
                x2.a("MyTrackerRepository: appgalleery raw purchase with data: " + jSONObject + ", signature " + a + " isn't inserted");
                return;
            }
            long a2 = this.a.a(jSONObject, a, f, g, fVar.h());
            if (a2 >= 0) {
                x2.a("MyTrackerRepository: appgallery raw purchase was inserted; id: " + a2 + ", data: " + jSONObject + ", signature: " + a);
                fVar.a(Long.valueOf(a2));
            }
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: can't insert appgallery raw purchase with data: " + jSONObject + ", signature " + a, th);
        }
    }

    public boolean a(int i, byte[] bArr, boolean z, boolean z2, long j) {
        long j2;
        try {
            long j3 = d1.y;
            if (z2) {
                d1.c cVar = null;
                try {
                    cVar = this.a.b(i, bArr);
                    if (cVar.b()) {
                        j3 = cVar.a();
                        j2 = cVar.c();
                    } else {
                        j2 = 0;
                    }
                    cVar.close();
                } catch (Throwable th) {
                    if (cVar != null) {
                        cVar.close();
                    }
                    throw th;
                }
            } else {
                j2 = 0;
            }
            if (j3 == d1.y) {
                x2.a("MyTrackerRepository: insert " + i + " event");
                j3 = this.a.a(i, bArr, z);
                if (j3 != d1.y && z) {
                    this.g++;
                }
            } else {
                x2.a("MyTrackerRepository: aggregate " + i + " event");
            }
            if (j3 == d1.y) {
                x2.b("MyTrackerRepository error: event insertion failed, type: " + i);
                return false;
            }
            if (this.f == 0) {
                c(j);
            }
            this.a.c(j3, j - this.f);
            long d = this.a.d(j3);
            x2.a("MyTrackerRepository: event timestamps count: " + d);
            long j4 = (long) this.b;
            if (d <= j4) {
                return true;
            }
            long a = this.a.a(j3, d - j4);
            this.a.d(j3, j2 + a);
            x2.a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + a);
            return true;
        } catch (Throwable th2) {
            x2.b("MyTrackerRepository error: event insertion failed, type: " + i, th2);
            return false;
        }
    }

    public boolean a() {
        try {
            this.a.c();
            this.a.b();
            this.a.e();
            this.a.d();
            this.a.a();
            this.a.a("custom_events_skipped_count", (Long) null);
            this.g = 0L;
            d1.f a = this.a.a("default_session");
            try {
                if (a.b()) {
                    c(a.m());
                } else {
                    c(0L);
                }
                a.close();
                return true;
            } finally {
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(byte[] bArr) {
        try {
            this.a.i(14L);
            this.a.a(bArr);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
        }
    }

    public void a(long j) {
        try {
            this.a.c(j);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
        }
    }
}
