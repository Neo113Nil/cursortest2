package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zw0 implements yw0 {
    public final Object a;
    public final Object b;

    public zw0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.yw0
    public final boolean a(cq cqVar, cq cqVar2) {
        return cqVar.equals(b()) && cqVar2.equals(c());
    }

    @Override // defpackage.yw0
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.yw0
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yw0)) {
            return false;
        }
        yw0 yw0Var = (yw0) obj;
        return nz.l(this.a, yw0Var.b()) && nz.l(this.b, yw0Var.c());
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
