package com.ironsource;

/* renamed from: com.ironsource.id, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4702id {
    private boolean a;
    private boolean b;
    private boolean c;
    private EnumC4773md d;
    private int e;
    private int f;

    /* renamed from: com.ironsource.id$a */
    public static class a {
        private boolean a = true;
        private boolean b = false;
        private boolean c = false;
        private EnumC4773md d = null;
        private int e = 0;
        private int f = 0;

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public a a(boolean z, EnumC4773md enumC4773md, int i) {
            this.b = z;
            if (enumC4773md == null) {
                enumC4773md = EnumC4773md.PER_DAY;
            }
            this.d = enumC4773md;
            this.e = i;
            return this;
        }

        public a a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public C4702id a() {
            return new C4702id(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    private C4702id(boolean z, boolean z2, boolean z3, EnumC4773md enumC4773md, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = enumC4773md;
        this.e = i;
        this.f = i2;
    }

    public EnumC4773md a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.a;
    }

    public boolean f() {
        return this.c;
    }
}
