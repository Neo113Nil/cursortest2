package Z;

import Y.AbstractComponentCallbacksC0055q;
import android.util.Log;
import i1.f;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1551a = c.f1550a;

    public static c a(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        while (abstractComponentCallbacksC0055q != null) {
            if (abstractComponentCallbacksC0055q.m()) {
                abstractComponentCallbacksC0055q.j();
            }
            abstractComponentCallbacksC0055q = abstractComponentCallbacksC0055q.f1516u;
        }
        return f1551a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f1546a.getClass().getName()), aVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q, String str) {
        f.e(abstractComponentCallbacksC0055q, "fragment");
        f.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0055q, "Attempting to reuse fragment " + abstractComponentCallbacksC0055q + " with previous ID " + str));
        a(abstractComponentCallbacksC0055q).getClass();
    }
}
