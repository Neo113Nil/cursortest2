package com.my.tracker.obfuscated;

/* loaded from: classes13.dex */
public final class i {
    final u1 a = new v1(0, -2147483648L);
    final d2 b = new f2(0);
    int c = 0;

    public void a(int i) {
        if (i == 0) {
            x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
            this.c = 0;
            return;
        }
        x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
        this.c = 1;
    }

    public void b(long j) {
        if (this.c == 1) {
            this.a.b(j);
        }
    }

    public void c(long j) {
        this.a.b(j);
    }

    public void d(long j) {
        f(j);
    }

    public void e(long j) {
        if (this.c == 1) {
            f(j);
        }
    }

    void f(long j) {
        long e = j - this.a.e();
        if (x2.a()) {
            long b = this.c == 3 ? this.b.b() : this.b.c();
            x2.a("TimeSpentCore: AppTimeManager: " + a() + "slicing app TimeSpent, " + b + "(existed ms) + " + e + "(add ms) = " + (b + e) + "(total ms), timestamp = " + j);
        }
        int i = this.c;
        if (i == 1) {
            this.b.a(e);
        } else if (i != 3) {
            x2.a("TimeSpentCore: AppTimeManager: trying to slice app time, but now is useless background state - skip");
        } else {
            this.b.c(e);
        }
    }

    public void g(long j) {
        f(j);
        x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
        this.c = 0;
    }

    public void h(long j) {
        this.a.b(j);
        x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
        this.c = 1;
    }

    public boolean c() {
        return this.c == 3;
    }

    public void d() {
        x2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[FOREGROUND]"));
        this.c = 3;
    }

    public boolean b() {
        int i = this.c;
        return i == 1 || i == 0;
    }

    public e2 a(long j) {
        x2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: start collecting app TimeSpent");
        if (this.c != 0) {
            f(j);
            this.a.b(j);
        }
        d2 m6427clone = this.b.m6427clone();
        this.b.g();
        x2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: collected app TimeSpent (foregroundMs = " + m6427clone.b() + ", usefulBackgroundMs = " + m6427clone.c() + ")");
        if (m6427clone.b() == 0 && m6427clone.c() == 0) {
            return null;
        }
        return m6427clone;
    }

    private String a(String str, String str2) {
        return "app state changed " + str + "-> " + str2;
    }

    private String a() {
        int i = this.c;
        if (i == 0) {
            return "[BACKGROUND(useless)] ";
        }
        if (i == 1) {
            return "[BACKGROUND(useful)] ";
        }
        if (i != 3) {
            return "";
        }
        return "[FOREGROUND] ";
    }
}
