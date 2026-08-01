package Z;

import Y.AbstractComponentCallbacksC0049q;
import android.util.Log;
import g1.f;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1173a = c.f1172a;

    public static c a(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        while (abstractComponentCallbacksC0049q != null) {
            if (abstractComponentCallbacksC0049q.m()) {
                abstractComponentCallbacksC0049q.j();
            }
            abstractComponentCallbacksC0049q = abstractComponentCallbacksC0049q.f1135u;
        }
        return f1173a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f1168a.getClass().getName()), aVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q, String str) {
        f.e(abstractComponentCallbacksC0049q, "fragment");
        f.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0049q, "Attempting to reuse fragment " + abstractComponentCallbacksC0049q + " with previous ID " + str));
        a(abstractComponentCallbacksC0049q).getClass();
    }
}
