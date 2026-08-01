package A1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f26a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27b;

    /* renamed from: c, reason: collision with root package name */
    public c f28c;
    public long d;

    public a(String str, boolean z2) {
        i1.f.e(str, "name");
        this.f26a = str;
        this.f27b = z2;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f26a;
    }
}
