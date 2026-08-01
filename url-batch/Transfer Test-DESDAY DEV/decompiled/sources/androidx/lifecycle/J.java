package androidx.lifecycle;

import K.C0014m;
import android.view.View;
import b0.AbstractC0082b;
import b0.C0081a;
import c0.C0087a;
import com.football.transfertrivia.R;
import i0.C0138a;
import i0.C0141d;
import i0.InterfaceC0140c;
import i0.InterfaceC0143f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o1.AbstractC0302t;
import o1.AbstractC0308z;
import o1.c0;

/* loaded from: classes.dex */
public abstract class J implements P {

    /* renamed from: a, reason: collision with root package name */
    public static final O0.e f1494a = new O0.e(17);

    /* renamed from: b, reason: collision with root package name */
    public static final O0.e f1495b = new O0.e(18);

    /* renamed from: c, reason: collision with root package name */
    public static final O0.e f1496c = new O0.e(16);
    public static final O0.e d = new O0.e(19);

    public static final void c(O o2, C0141d c0141d, v vVar) {
        AutoCloseable autoCloseable;
        g1.f.e(c0141d, "registry");
        g1.f.e(vVar, "lifecycle");
        C0087a c0087a = o2.f1503a;
        if (c0087a != null) {
            synchronized (c0087a.f1732a) {
                autoCloseable = (AutoCloseable) c0087a.f1733b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(InterfaceC0143f interfaceC0143f) {
        InterfaceC0140c interfaceC0140c;
        EnumC0072m enumC0072m = interfaceC0143f.d().d;
        if (enumC0072m != EnumC0072m.f1518b && enumC0072m != EnumC0072m.f1519c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((n.f) interfaceC0143f.b().d).iterator();
        while (true) {
            n.b bVar = (n.b) it;
            if (!bVar.hasNext()) {
                interfaceC0140c = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            g1.f.d(entry, "components");
            String str = (String) entry.getKey();
            interfaceC0140c = (InterfaceC0140c) entry.getValue();
            if (g1.f.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC0140c == null) {
            L l2 = new L(interfaceC0143f.b(), (S) interfaceC0143f);
            interfaceC0143f.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", l2);
            interfaceC0143f.d().a(new C0138a(4, l2));
        }
    }

    public static final C0074o e(t tVar) {
        C0074o c0074o;
        g1.f.e(tVar, "<this>");
        v d2 = tVar.d();
        g1.f.e(d2, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = d2.f1529a;
            c0074o = (C0074o) atomicReference.get();
            if (c0074o == null) {
                c0 c0Var = new c0(null);
                u1.d dVar = AbstractC0308z.f3345a;
                p1.c cVar = s1.m.f3714a.f3430f;
                g1.f.e(cVar, "context");
                c0074o = new C0074o(d2, T.e.P(c0Var, cVar));
                while (!atomicReference.compareAndSet(null, c0074o)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                u1.d dVar2 = AbstractC0308z.f3345a;
                AbstractC0302t.i(c0074o, s1.m.f3714a.f3430f, new C0073n(c0074o, null));
                break loop0;
            }
            break;
        }
        return c0074o;
    }

    public static final M f(S s2) {
        I i = new I();
        Q c2 = s2.c();
        AbstractC0082b a2 = s2 instanceof InterfaceC0067h ? ((InterfaceC0067h) s2).a() : C0081a.f1724b;
        g1.f.e(c2, "store");
        g1.f.e(a2, "defaultCreationExtras");
        return (M) new C0014m(c2, i, a2).f(g1.j.a(M.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void g(View view, t tVar) {
        g1.f.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, tVar);
    }
}
