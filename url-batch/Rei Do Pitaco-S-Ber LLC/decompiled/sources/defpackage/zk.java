package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class zk {
    public static final yk a = yk.a;

    public static yk a(dk dkVar) {
        while (dkVar != null) {
            if (dkVar.x != null && dkVar.p) {
                dkVar.j();
            }
            dkVar = dkVar.z;
        }
        return a;
    }

    public static void b(wk wkVar) {
        if (sk.G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(wkVar.f.getClass().getName()), wkVar);
        }
    }

    public static final void c(dk dkVar, String str) {
        str.getClass();
        b(new wk(dkVar, "Attempting to reuse fragment " + dkVar + " with previous ID " + str));
        a(dkVar).getClass();
    }
}
