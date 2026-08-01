package o1;

/* loaded from: classes.dex */
public final class B implements L {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3276a;

    public B(boolean z2) {
        this.f3276a = z2;
    }

    @Override // o1.L
    public final boolean a() {
        return this.f3276a;
    }

    @Override // o1.L
    public final X b() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f3276a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
