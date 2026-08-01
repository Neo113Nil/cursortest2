package o1;

/* loaded from: classes.dex */
public final class C extends D {

    /* renamed from: c, reason: collision with root package name */
    public final C0288e f3277c;
    public final /* synthetic */ F d;

    public C(F f2, long j2, C0288e c0288e) {
        this.d = f2;
        this.f3278a = j2;
        this.f3279b = -1;
        this.f3277c = c0288e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3277c.t(this.d);
    }

    @Override // o1.D
    public final String toString() {
        return super.toString() + this.f3277c;
    }
}
