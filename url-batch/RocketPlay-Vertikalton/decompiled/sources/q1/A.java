package q1;

/* loaded from: classes.dex */
public final class A implements I {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3860a;

    public A(boolean z2) {
        this.f3860a = z2;
    }

    @Override // q1.I
    public final boolean a() {
        return this.f3860a;
    }

    @Override // q1.I
    public final V b() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f3860a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
