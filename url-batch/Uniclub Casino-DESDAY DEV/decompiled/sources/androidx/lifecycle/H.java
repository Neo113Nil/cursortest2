package androidx.lifecycle;

import K.C0011l;
import a0.C0056a;
import android.view.View;
import b0.C0075a;
import com.fortuneodd.shadegrid.R;
import h0.C0146a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final J0.e f1339a = new J0.e(14);

    /* renamed from: b, reason: collision with root package name */
    public static final J0.e f1340b = new J0.e(15);

    /* renamed from: c, reason: collision with root package name */
    public static final J0.e f1341c = new J0.e(13);
    public static final J0.e d = new J0.e(16);

    public static final void c(M m2, h0.d dVar, t tVar) {
        AutoCloseable autoCloseable;
        X0.d.e(dVar, "registry");
        X0.d.e(tVar, "lifecycle");
        C0075a c0075a = m2.f1348a;
        if (c0075a != null) {
            synchronized (c0075a.f1502a) {
                autoCloseable = (AutoCloseable) c0075a.f1503b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(h0.f fVar) {
        h0.c cVar;
        EnumC0069m enumC0069m = fVar.e().f1372c;
        if (enumC0069m != EnumC0069m.f1363b && enumC0069m != EnumC0069m.f1364c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((n.f) fVar.b().d).iterator();
        while (true) {
            n.b bVar = (n.b) it;
            if (!bVar.hasNext()) {
                cVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            X0.d.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (h0.c) entry.getValue();
            if (X0.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            J j2 = new J(fVar.b(), (P) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
            fVar.e().a(new C0146a(4, j2));
        }
    }

    public static final K e(P p2) {
        G g2 = new G();
        O c2 = p2.c();
        a0.b a2 = p2 instanceof InterfaceC0064h ? ((InterfaceC0064h) p2).a() : C0056a.f1105b;
        X0.d.e(c2, "store");
        X0.d.e(a2, "defaultCreationExtras");
        return (K) new C0011l(c2, g2, a2).n(X0.h.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, r rVar) {
        X0.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
