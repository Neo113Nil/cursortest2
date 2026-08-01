package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class v60 extends v40 {
    public final mf0 g;
    public Object h;

    public v60(mf0 mf0Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.g = mf0Var;
        this.h = obj2;
    }

    @Override // defpackage.v40, java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // defpackage.v40, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.h;
        this.h = obj;
        kf0 kf0Var = (kf0) this.g.e;
        jf0 jf0Var = kf0Var.g;
        Object obj3 = this.e;
        if (!jf0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = kf0Var.f;
        if (!z) {
            jf0Var.put(obj3, obj);
        } else {
            if (!z) {
                g8.k();
                return null;
            }
            lx0 lx0Var = kf0Var.d[kf0Var.e];
            Object obj4 = lx0Var.d[lx0Var.f];
            jf0Var.put(obj3, obj);
            kf0Var.c(obj4 != null ? obj4.hashCode() : 0, jf0Var.e, obj4, 0);
        }
        kf0Var.j = jf0Var.g;
        return obj2;
    }
}
