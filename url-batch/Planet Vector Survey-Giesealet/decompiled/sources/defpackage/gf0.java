package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gf0 extends hf0 implements fi, ci {
    public static final gf0 g = new gf0(kx0.e, 0);

    public final gf0 b(ii0 ii0Var, xy0 xy0Var) {
        a7 u = this.d.u(ii0Var.hashCode(), 0, ii0Var, xy0Var);
        return u == null ? this : new gf0((kx0) u.c, this.e + u.b);
    }

    @Override // defpackage.hf0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ii0) {
            return super.containsKey((ii0) obj);
        }
        return false;
    }

    @Override // defpackage.hf0, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof xy0) {
            return super.containsValue((xy0) obj);
        }
        return false;
    }

    @Override // defpackage.hf0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof ii0) {
            return (xy0) super.get((ii0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ii0) ? obj2 : (xy0) super.getOrDefault((ii0) obj, (xy0) obj2);
    }
}
