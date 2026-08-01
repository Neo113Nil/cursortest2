package k0;

import Y.V;

/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f2833a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f2834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, Throwable th) {
        super(th);
        V.h("callbackName", i);
        this.f2833a = i;
        this.f2834b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2834b;
    }
}
