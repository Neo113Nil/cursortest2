package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class kj0 {
    public final int a;
    public final yg b;
    public float c;

    public kj0(int i, yg ygVar) {
        this.a = i;
        this.b = ygVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(float f, lj ljVar) {
        jj0 jj0Var;
        int i;
        if (ljVar instanceof jj0) {
            jj0Var = (jj0) ljVar;
            int i2 = jj0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jj0Var.f = i2 - Integer.MIN_VALUE;
                Object obj = jj0Var.d;
                i = jj0Var.f;
                if (i != 0) {
                    rg0.u(obj);
                    Float f2 = new Float(f);
                    jj0Var.f = 1;
                    obj = this.b.invoke(f2, jj0Var);
                    ck ckVar = ck.d;
                    if (obj == ckVar) {
                        return ckVar;
                    }
                } else {
                    if (i != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                this.c += ((Number) obj).floatValue();
                return ky0.a;
            }
        }
        jj0Var = new jj0(this, ljVar);
        Object obj2 = jj0Var.d;
        i = jj0Var.f;
        if (i != 0) {
        }
        this.c += ((Number) obj2).floatValue();
        return ky0.a;
    }
}
