package v;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f4224A;

    /* renamed from: B, reason: collision with root package name */
    public int f4225B;

    /* renamed from: C, reason: collision with root package name */
    public int f4226C;

    /* renamed from: D, reason: collision with root package name */
    public int f4227D;

    /* renamed from: E, reason: collision with root package name */
    public float f4228E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f4229G;

    /* renamed from: H, reason: collision with root package name */
    public float f4230H;

    /* renamed from: I, reason: collision with root package name */
    public float f4231I;

    /* renamed from: J, reason: collision with root package name */
    public int f4232J;

    /* renamed from: K, reason: collision with root package name */
    public int f4233K;

    /* renamed from: L, reason: collision with root package name */
    public int f4234L;

    /* renamed from: M, reason: collision with root package name */
    public int f4235M;

    /* renamed from: N, reason: collision with root package name */
    public int f4236N;

    /* renamed from: O, reason: collision with root package name */
    public int f4237O;

    /* renamed from: P, reason: collision with root package name */
    public int f4238P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4239Q;

    /* renamed from: R, reason: collision with root package name */
    public float f4240R;

    /* renamed from: S, reason: collision with root package name */
    public float f4241S;

    /* renamed from: T, reason: collision with root package name */
    public int f4242T;

    /* renamed from: U, reason: collision with root package name */
    public int f4243U;

    /* renamed from: V, reason: collision with root package name */
    public int f4244V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4245W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f4246X;

    /* renamed from: Y, reason: collision with root package name */
    public String f4247Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f4248Z;

    /* renamed from: a, reason: collision with root package name */
    public int f4249a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4250a0;

    /* renamed from: b, reason: collision with root package name */
    public int f4251b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4252b0;

    /* renamed from: c, reason: collision with root package name */
    public float f4253c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4254c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4255d0;

    /* renamed from: e, reason: collision with root package name */
    public int f4256e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4257e0;

    /* renamed from: f, reason: collision with root package name */
    public int f4258f;

    /* renamed from: f0, reason: collision with root package name */
    public int f4259f0;

    /* renamed from: g, reason: collision with root package name */
    public int f4260g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4261g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f4262h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f4263i0;

    /* renamed from: j, reason: collision with root package name */
    public int f4264j;

    /* renamed from: j0, reason: collision with root package name */
    public int f4265j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4266k;

    /* renamed from: k0, reason: collision with root package name */
    public int f4267k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4268l;

    /* renamed from: l0, reason: collision with root package name */
    public float f4269l0;

    /* renamed from: m, reason: collision with root package name */
    public int f4270m;

    /* renamed from: m0, reason: collision with root package name */
    public int f4271m0;

    /* renamed from: n, reason: collision with root package name */
    public int f4272n;
    public int n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4273o;

    /* renamed from: o0, reason: collision with root package name */
    public float f4274o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4275p;

    /* renamed from: p0, reason: collision with root package name */
    public s.d f4276p0;

    /* renamed from: q, reason: collision with root package name */
    public int f4277q;

    /* renamed from: r, reason: collision with root package name */
    public float f4278r;

    /* renamed from: s, reason: collision with root package name */
    public int f4279s;

    /* renamed from: t, reason: collision with root package name */
    public int f4280t;

    /* renamed from: u, reason: collision with root package name */
    public int f4281u;

    /* renamed from: v, reason: collision with root package name */
    public int f4282v;

    /* renamed from: w, reason: collision with root package name */
    public int f4283w;

    /* renamed from: x, reason: collision with root package name */
    public int f4284x;

    /* renamed from: y, reason: collision with root package name */
    public int f4285y;

    /* renamed from: z, reason: collision with root package name */
    public int f4286z;

    public final void a() {
        this.f4255d0 = false;
        this.f4250a0 = true;
        this.f4252b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f4245W) {
            this.f4250a0 = false;
            if (this.f4234L == 0) {
                this.f4234L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f4246X) {
            this.f4252b0 = false;
            if (this.f4235M == 0) {
                this.f4235M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f4250a0 = false;
            if (i == 0 && this.f4234L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f4245W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f4252b0 = false;
            if (i2 == 0 && this.f4235M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f4246X = true;
            }
        }
        if (this.f4253c == -1.0f && this.f4249a == -1 && this.f4251b == -1) {
            return;
        }
        this.f4255d0 = true;
        this.f4250a0 = true;
        this.f4252b0 = true;
        if (!(this.f4276p0 instanceof s.h)) {
            this.f4276p0 = new s.h();
        }
        ((s.h) this.f4276p0).S(this.f4244V);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z2 = false;
        boolean z3 = 1 == getLayoutDirection();
        this.f4262h0 = -1;
        this.f4263i0 = -1;
        this.f4259f0 = -1;
        this.f4261g0 = -1;
        this.f4265j0 = this.f4283w;
        this.f4267k0 = this.f4285y;
        float f2 = this.f4228E;
        this.f4269l0 = f2;
        int i8 = this.f4249a;
        this.f4271m0 = i8;
        int i9 = this.f4251b;
        this.n0 = i9;
        float f3 = this.f4253c;
        this.f4274o0 = f3;
        if (z3) {
            int i10 = this.f4279s;
            if (i10 != -1) {
                this.f4262h0 = i10;
            } else {
                int i11 = this.f4280t;
                if (i11 != -1) {
                    this.f4263i0 = i11;
                }
                i2 = this.f4281u;
                if (i2 != -1) {
                    this.f4261g0 = i2;
                    z2 = true;
                }
                i3 = this.f4282v;
                if (i3 != -1) {
                    this.f4259f0 = i3;
                    z2 = true;
                }
                i4 = this.f4224A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f4267k0 = i4;
                }
                i5 = this.f4225B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f4265j0 = i5;
                }
                if (z2) {
                    this.f4269l0 = 1.0f - f2;
                }
                if (this.f4255d0 && this.f4244V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f4274o0 = 1.0f - f3;
                        this.f4271m0 = -1;
                        this.n0 = -1;
                    } else if (i8 != -1) {
                        this.n0 = i8;
                        this.f4271m0 = -1;
                        this.f4274o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f4271m0 = i9;
                        this.n0 = -1;
                        this.f4274o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f4281u;
            if (i2 != -1) {
            }
            i3 = this.f4282v;
            if (i3 != -1) {
            }
            i4 = this.f4224A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f4225B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f4255d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f4279s;
            if (i12 != -1) {
                this.f4261g0 = i12;
            }
            int i13 = this.f4280t;
            if (i13 != -1) {
                this.f4259f0 = i13;
            }
            int i14 = this.f4281u;
            if (i14 != -1) {
                this.f4262h0 = i14;
            }
            int i15 = this.f4282v;
            if (i15 != -1) {
                this.f4263i0 = i15;
            }
            int i16 = this.f4224A;
            if (i16 != Integer.MIN_VALUE) {
                this.f4265j0 = i16;
            }
            int i17 = this.f4225B;
            if (i17 != Integer.MIN_VALUE) {
                this.f4267k0 = i17;
            }
        }
        if (this.f4281u == -1 && this.f4282v == -1 && this.f4280t == -1 && this.f4279s == -1) {
            int i18 = this.f4260g;
            if (i18 != -1) {
                this.f4262h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f4263i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f4256e;
            if (i20 != -1) {
                this.f4259f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f4258f;
            if (i21 != -1) {
                this.f4261g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
