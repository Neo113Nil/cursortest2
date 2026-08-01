package X0;

import f1.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j f936a = new j();

    public final int hashCode() {
        return 0;
    }

    @Override // X0.i
    public final g j(h hVar) {
        g1.f.e(hVar, "key");
        return null;
    }

    @Override // X0.i
    public final i m(i iVar) {
        g1.f.e(iVar, "context");
        return iVar;
    }

    @Override // X0.i
    public final i n(h hVar) {
        g1.f.e(hVar, "key");
        return this;
    }

    @Override // X0.i
    public final Object t(Object obj, p pVar) {
        return obj;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
