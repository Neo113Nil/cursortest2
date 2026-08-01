package i1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class g implements e, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f3048a;

    public g(int i) {
        this.f3048a = i;
    }

    @Override // i1.e
    public final int f() {
        return this.f3048a;
    }

    public final String toString() {
        j.f3052a.getClass();
        String a2 = k.a(this);
        f.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
