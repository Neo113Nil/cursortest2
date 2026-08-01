package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ii0 {
    public final x10 a;

    public ii0(bu buVar) {
        this.a = new x10(buVar);
    }

    public abstract ki0 a(Object obj);

    public xy0 b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xy0 c(ki0 ki0Var, xy0 xy0Var) {
        Object obj = ki0Var.e;
        boolean z = ki0Var.d;
        qo qoVar = null;
        if (xy0Var instanceof qo) {
            if (z) {
                qoVar = (qo) xy0Var;
                qoVar.a.setValue(ki0Var.a());
            }
        } else if ((xy0Var instanceof mt0) && ((ki0Var.b || obj != null) && !z)) {
            mt0 mt0Var = (mt0) xy0Var;
            if (nz.l(ki0Var.a(), mt0Var.a)) {
                qoVar = mt0Var;
            }
        }
        if (qoVar != null) {
            return qoVar;
        }
        if (!z) {
            return new mt0(ki0Var.a());
        }
        b2 b2Var = ki0Var.c;
        if (b2Var == null) {
            b2Var = b2.M;
        }
        return new qo(new ce0(obj, b2Var));
    }
}
