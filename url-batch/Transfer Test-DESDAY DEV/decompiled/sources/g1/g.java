package g1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class g implements e, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2581a;

    public g(int i) {
        this.f2581a = i;
    }

    @Override // g1.e
    public final int f() {
        return this.f2581a;
    }

    public final String toString() {
        j.f2584a.getClass();
        String a2 = k.a(this);
        f.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
