package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ff0 extends jf0 {
    public gf0 i;

    public ff0(gf0 gf0Var) {
        this.d = new y7(24);
        this.e = gf0Var.d;
        this.h = gf0Var.e;
        this.i = gf0Var;
    }

    public final gf0 b() {
        kx0 kx0Var = this.e;
        gf0 gf0Var = this.i;
        if (kx0Var != gf0Var.d) {
            this.d = new y7(24);
            gf0Var = new gf0(this.e, this.h);
        }
        this.i = gf0Var;
        return gf0Var;
    }

    @Override // defpackage.jf0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ii0) {
            return super.containsKey((ii0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof xy0) {
            return super.containsValue((xy0) obj);
        }
        return false;
    }

    @Override // defpackage.jf0, java.util.AbstractMap, java.util.Map
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

    @Override // defpackage.jf0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof ii0) {
            return (xy0) super.remove((ii0) obj);
        }
        return null;
    }
}
