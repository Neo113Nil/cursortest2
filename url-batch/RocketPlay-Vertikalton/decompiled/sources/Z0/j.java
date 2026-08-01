package Z0;

import h1.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1558a = new j();

    @Override // Z0.i
    public final g f(h hVar) {
        i1.f.e(hVar, "key");
        return null;
    }

    @Override // Z0.i
    public final i h(i iVar) {
        i1.f.e(iVar, "context");
        return iVar;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // Z0.i
    public final i i(h hVar) {
        i1.f.e(hVar, "key");
        return this;
    }

    @Override // Z0.i
    public final Object q(Object obj, p pVar) {
        return obj;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
