package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rp implements nx {
    public final boolean d;

    public rp(boolean z) {
        this.d = z;
    }

    @Override // defpackage.nx
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.nx
    public final ga0 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.d ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
