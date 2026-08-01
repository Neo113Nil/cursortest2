package l1;

import X0.e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3168a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3169b;

    /* renamed from: c, reason: collision with root package name */
    public c f3170c;
    public long d;

    public a(String str, boolean z2) {
        e.e(str, "name");
        this.f3168a = str;
        this.f3169b = z2;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3168a;
    }
}
