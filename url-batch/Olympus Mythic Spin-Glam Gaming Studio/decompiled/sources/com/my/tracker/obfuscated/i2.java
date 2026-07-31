package com.my.tracker.obfuscated;

import android.os.SystemClock;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class i2 {
    final z2 a;
    final w2 b;
    protected boolean h = false;
    protected b3 i = b3.j;
    final a c = b();
    final j0 d = new j0();
    final c e = new c();
    final x f = new x();
    final i g = new i();

    final class a {
        final int[] a = {0};
        final int[] b = {0};

        a() {
        }

        private boolean d(int i) {
            for (int i2 : this.b) {
                if (i == i2) {
                    x2.c("TimeSpentCore: you can't create timespent with id = " + i + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        private boolean e(int i) {
            for (int i2 : this.a) {
                if (i == i2) {
                    x2.c("TimeSpentCore: you can't create timespent with id = " + i + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        boolean a(int i) {
            if (e(i)) {
                return false;
            }
            if (i2.this.e.b(i)) {
                x2.c("TimeSpent: you can't create timespent with id = " + i + " (reason: already have same type timespent with this id)");
                return false;
            }
            if (!i2.this.d.b(i) && !i2.this.f.a(i)) {
                return true;
            }
            x2.c("TimeSpent: you can't create timespent with id = " + i + " (reason: already have another type timespent with this id)");
            return false;
        }

        boolean b(int i) {
            if (e(i)) {
                return false;
            }
            if (i2.this.d.b(i)) {
                x2.c("TimeSpent: you can't create timespent with id = " + i + " (reason: already have same type timespent with this id)");
                return false;
            }
            if (!i2.this.e.b(i) && !i2.this.f.a(i)) {
                return true;
            }
            x2.c("TimeSpent: you can't create timespent with id = " + i + " (reason: already have another type timespent with this id)");
            return false;
        }

        boolean c(int i) {
            if (d(i)) {
                return false;
            }
            if (!i2.this.d.b(i) && !i2.this.e.b(i)) {
                return true;
            }
            x2.c("TimeSpent: you can't create timespent with id = " + i + " (reason: already have another type timespent with this id)");
            return false;
        }
    }

    public i2(long j, z2 z2Var) {
        this.a = z2Var;
        this.b = w2.a(j, new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                i2.this.f();
            }
        });
        x2.a("TimeSpentCore: created");
    }

    public void a(Boolean bool) {
        this.h = bool.booleanValue();
    }

    public void b(b3 b3Var) {
        this.i = b3Var;
    }

    public void d() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i2.this.c(uptimeMillis);
            }
        });
    }

    public void e() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                i2.this.d(uptimeMillis);
            }
        });
    }

    public void a() {
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                i2.this.c();
            }
        });
    }

    public void b(final Boolean bool) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final long currentTimeMillis = System.currentTimeMillis();
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                i2.this.a(bool, uptimeMillis, currentTimeMillis);
            }
        });
    }

    public void f() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final long currentTimeMillis = System.currentTimeMillis();
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                i2.this.b(uptimeMillis, currentTimeMillis);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool, long j, long j2) {
        boolean booleanValue = bool.booleanValue();
        boolean z = this.h;
        if (booleanValue != z) {
            a(j, j2, z, this.i);
        }
        this.h = bool.booleanValue();
    }

    synchronized void c() {
        x2.a("TimeSpentCore: ***** start generating zero tick *****");
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        this.f.b(0);
        b(uptimeMillis, currentTimeMillis, this.h, this.i);
        x2.a("TimeSpentCore: ***** zero tick generated *****");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized void h(long j, int i) {
        try {
            this.d.b(i, j, this.g.c());
        } catch (Exception unused) {
        }
    }

    public void b(final int i, boolean z) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (z) {
            m.c(new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    i2.this.g(uptimeMillis, i);
                }
            });
        } else {
            m.c(new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    i2.this.h(uptimeMillis, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized void g(long j, int i) {
        try {
            this.e.b(i, j, this.g.c());
            if (this.g.b() && this.e.b() == 0) {
                this.g.g(j);
                x2.a("TimeSpentCore: there was last anytime TimeSpent during background state, stop tracking app useful background");
            }
        } catch (Exception unused) {
        }
    }

    public void a(final b3 b3Var) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final long currentTimeMillis = System.currentTimeMillis();
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                i2.this.a(b3Var, uptimeMillis, currentTimeMillis);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j, long j2) {
        b(j, j2, this.h, this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void d(long j) {
        x2.a("TimeSpentCore: ***** app is going to foreground *****");
        if (this.g.c()) {
            x2.a("TimeSpentCore: something went wrong, already in FOREGROUND state. Skip");
            return;
        }
        this.d.e(j);
        this.e.e(j);
        this.g.e(j);
        this.g.d();
        this.d.c(j);
        this.e.c(j);
        this.g.c(j);
        if (this.b.b()) {
            x2.a("TimeSpentCore: starting ticker... (reason: app going to foreground)");
            this.b.e();
        }
        x2.a("TimeSpentCore: ***** app is on foreground *****");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b3 b3Var, long j, long j2) {
        if (l.a(this.i.g, b3Var.g) != 0) {
            a(j, j2, this.h, this.i);
        }
        this.i = b3Var;
    }

    public void a(final int i, boolean z) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (z) {
            m.c(new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    i2.this.e(uptimeMillis, i);
                }
            });
        } else {
            m.c(new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    i2.this.f(uptimeMillis, i);
                }
            });
        }
    }

    public void a(final int i) {
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.i2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                i2.this.c(i);
            }
        });
    }

    synchronized void a(long j, long j2, boolean z, b3 b3Var) {
        this.b.d();
        b(j, j2, z, b3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void c(long j) {
        x2.a("TimeSpentCore: ***** app is going to background *****");
        if (this.g.b()) {
            x2.a("TimeSpentCore: something went wrong, already in BACKGROUND state. Skip");
            return;
        }
        this.d.d(j);
        this.e.d(j);
        this.g.d(j);
        this.g.a(this.e.b());
        this.d.b(j);
        this.e.b(j);
        this.g.b(j);
        x2.a("TimeSpentCore: ***** app is on background *****");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void f(long j, int i) {
        if (this.c.b(i)) {
            this.d.a(i, j, this.g.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void c(int i) {
        if (this.c.c(i)) {
            this.f.b(i);
            if (this.b.b()) {
                x2.a("TimeSpentCore: starting ticker... (reason: incremented count based TimeSpent)");
                this.b.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void e(long j, int i) {
        if (this.c.a(i)) {
            this.e.a(i, j, this.g.c());
            if (this.g.b() && this.e.b() == 1) {
                this.g.h(j);
                x2.a("TimeSpentCore: this is first anytime TimeSpent during background state, start tracking app useful background");
                this.b.e();
                x2.a("TimeSpentCore: starting ticker... (reason: first anytime timeSpent during background state)");
            }
        }
    }

    synchronized void b(long j, long j2, boolean z, b3 b3Var) {
        try {
            x2.a("TimeSpentCore: ***** onTick started ***** timestamp = " + j2);
            if (this.g.b() && this.e.b() == 0 && this.b.a()) {
                x2.a("TimeSpentCore: onTick: stopping ticker... (reason: no useful background)");
                this.b.f();
            }
            q2 a2 = a(j, j2);
            x2.a("TimeSpentCore: ***** onTick finished *****");
            this.a.a(a2, Boolean.valueOf(z), b3Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized q2 a(long j, long j2) {
        x2.a("TimeSpentCore: start collecting DTO data, tickTimestamp = " + j2);
        boolean c = this.g.c();
        ArrayList a2 = this.f.a();
        ArrayList a3 = this.e.a(j, c);
        ArrayList a4 = this.d.a(j, c);
        e2 a5 = this.g.a(j);
        ArrayList arrayList = new ArrayList(a3.size() + a4.size());
        arrayList.addAll(a3);
        arrayList.addAll(a4);
        q2 q2Var = new q2(j2, a5, (e2[]) arrayList.toArray(new e2[0]), (v[]) a2.toArray(new v[0]));
        if (!x2.a()) {
            return q2Var;
        }
        x2.a("TimeSpentCore: collected DTO data:\n" + q2Var);
        return q2Var;
    }

    a b() {
        return new a();
    }
}
