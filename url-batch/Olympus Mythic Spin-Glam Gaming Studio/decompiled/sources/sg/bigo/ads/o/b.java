package sg.bigo.ads.o;

import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.d;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes4.dex */
public abstract class b {
    protected final int b;
    protected final int c;
    protected final int d;
    protected final int e;
    protected final int f;
    protected final int g;
    protected final int h;
    protected final int i;
    protected final int j;
    protected final a k = new a(this, 0);
    protected final int l;
    protected final int m;

    public static class a {
        public final boolean a;
        public int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;

        /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private a(@NonNull b bVar) {
            int e;
            int g;
            int i = d.b;
            int h = bVar.h();
            if (h == 2) {
                this.a = false;
                this.b = -16777216;
            } else {
                if (h != 3) {
                    this.a = false;
                    this.b = -1;
                    this.c = sg.bigo.ads.bv.b.a(i, 0.15f);
                    this.d = i;
                    this.f = i;
                    this.e = sg.bigo.ads.bv.b.a(this.f, 128);
                    e = bVar.e();
                    if (e != 2 || e == 4) {
                        this.g = 0;
                        this.h = 0;
                    } else {
                        this.g = this.b;
                        this.h = this.c;
                    }
                    this.i = -1;
                    this.j = sg.bigo.ads.bv.b.a(i, 0.15f);
                    g = bVar.g();
                    if (g != 2) {
                        this.k = -14972829;
                        this.l = 0;
                        return;
                    } else if (g != 3) {
                        this.k = -16736769;
                        this.l = 0;
                        return;
                    } else {
                        this.k = 872415231;
                        this.l = -1;
                        return;
                    }
                }
                this.a = true;
                this.b = sg.bigo.ads.bv.b.a(-16777216, 0.3f);
            }
            this.c = sg.bigo.ads.bv.b.a(-1, 0.15f);
            this.d = -1;
            this.f = -1;
            this.e = sg.bigo.ads.bv.b.a(this.f, 128);
            e = bVar.e();
            if (e != 2) {
            }
            this.g = 0;
            this.h = 0;
            this.i = -1;
            this.j = sg.bigo.ads.bv.b.a(i, 0.15f);
            g = bVar.g();
            if (g != 2) {
            }
        }

        /* synthetic */ a(b bVar, byte b) {
            this(bVar);
        }
    }

    public b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.l = i10;
        this.m = i11;
    }

    public static int a(b bVar) {
        if (bVar == null) {
            return 0;
        }
        if (bVar.a()) {
            return 1;
        }
        int e = bVar.e();
        int i = 3;
        if (e == 3 || e == 4) {
            return 2;
        }
        if (e != 5) {
            i = 6;
            if (e != 6) {
                return 4;
            }
        }
        return i;
    }

    public static boolean b(b bVar) {
        return bVar == null || bVar.d() == 0;
    }

    public boolean a() {
        return false;
    }

    public int b() {
        return 9;
    }

    @NonNull
    public final a c() {
        return this.k;
    }

    public final int d() {
        int i = this.b;
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 0;
    }

    public int e() {
        int i = this.c;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return i;
        }
        return 1;
    }

    public int f() {
        int i = this.c;
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            return i;
        }
        return 1;
    }

    public final int g() {
        int i = this.d;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 1;
    }

    public final int h() {
        int i = this.e;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 1;
    }

    public final int i() {
        return Math.max(1, this.f);
    }

    public final long j() {
        return s.a.a(Math.min(99, Math.max(0, this.g)));
    }

    public final long k() {
        int i = this.h;
        return i < 0 ? s.a.a(0) : s.a.a(i);
    }

    public final int l() {
        int i = this.i;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 3;
    }

    public final int m() {
        int i = this.l;
        if (i < 0 || i > 4) {
            return 0;
        }
        return i;
    }

    public final int n() {
        return Math.max(1, this.m);
    }

    public final int o() {
        int i = this.j;
        if (i < 0) {
            return -1;
        }
        return i;
    }
}
