package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class oh0 implements sl {
    public final /* synthetic */ sl d;
    public boolean e;
    public boolean f;
    public final u70 g = new u70();

    public oh0(sl slVar) {
        this.d = slVar;
    }

    @Override // defpackage.sl
    public final long G(long j) {
        return this.d.G(j);
    }

    @Override // defpackage.sl
    public final float I(long j) {
        return this.d.I(j);
    }

    @Override // defpackage.sl
    public final long P(float f) {
        return this.d.P(f);
    }

    @Override // defpackage.sl
    public final float a() {
        return this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(lj ljVar) {
        mh0 mh0Var;
        int i;
        if (ljVar instanceof mh0) {
            mh0Var = (mh0) ljVar;
            int i2 = mh0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mh0Var.g = i2 - Integer.MIN_VALUE;
                Object obj = mh0Var.e;
                i = mh0Var.g;
                if (i != 0) {
                    rg0.u(obj);
                    mh0Var.d = this;
                    mh0Var.g = 1;
                    Object c = this.g.c(mh0Var);
                    ck ckVar = ck.d;
                    if (c == ckVar) {
                        return ckVar;
                    }
                } else {
                    if (i != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = mh0Var.d;
                    rg0.u(obj);
                }
                this.e = false;
                this.f = false;
                return ky0.a;
            }
        }
        mh0Var = new mh0(this, ljVar);
        Object obj2 = mh0Var.e;
        i = mh0Var.g;
        if (i != 0) {
        }
        this.e = false;
        this.f = false;
        return ky0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(lj ljVar) {
        nh0 nh0Var;
        int i;
        if (ljVar instanceof nh0) {
            nh0Var = (nh0) ljVar;
            int i2 = nh0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nh0Var.g = i2 - Integer.MIN_VALUE;
                Object obj = nh0Var.e;
                i = nh0Var.g;
                if (i != 0) {
                    rg0.u(obj);
                    if (!this.e && !this.f) {
                        nh0Var.d = this;
                        nh0Var.g = 1;
                        Object c = this.g.c(nh0Var);
                        ck ckVar = ck.d;
                        if (c == ckVar) {
                            return ckVar;
                        }
                    }
                    return Boolean.valueOf(this.e);
                }
                if (i != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = nh0Var.d;
                rg0.u(obj);
                this.g.d(null);
                return Boolean.valueOf(this.e);
            }
        }
        nh0Var = new nh0(this, ljVar);
        Object obj2 = nh0Var.e;
        i = nh0Var.g;
        if (i != 0) {
        }
        this.g.d(null);
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.sl
    public final float h() {
        return this.d.h();
    }

    @Override // defpackage.sl
    public final float o(float f) {
        return this.d.o(f);
    }

    @Override // defpackage.sl
    public final float t(long j) {
        return this.d.t(j);
    }

    @Override // defpackage.sl
    public final int y(float f) {
        return this.d.y(f);
    }
}
