package androidx.lifecycle;

import K.C0019l;
import android.view.View;
import b0.AbstractC0090b;
import b0.C0089a;
import com.luckycounter.drinkwater.R;
import i0.C0174a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import q1.AbstractC0352s;
import q1.AbstractC0358y;
import q1.a0;

/* loaded from: classes.dex */
public abstract class J implements P {

    /* renamed from: a, reason: collision with root package name */
    public static final M0.e f1873a = new M0.e(18);

    /* renamed from: b, reason: collision with root package name */
    public static final M0.e f1874b = new M0.e(19);

    /* renamed from: c, reason: collision with root package name */
    public static final M0.e f1875c = new M0.e(17);
    public static final M0.e d = new M0.e(20);

    public static final void c(O o2, i0.d dVar, v vVar) {
        AutoCloseable autoCloseable;
        i1.f.e(dVar, "registry");
        i1.f.e(vVar, "lifecycle");
        c0.a aVar = o2.f1882a;
        if (aVar != null) {
            synchronized (aVar.f2112a) {
                autoCloseable = (AutoCloseable) aVar.f2113b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(i0.f fVar) {
        i0.c cVar;
        EnumC0080m enumC0080m = fVar.e().d;
        if (enumC0080m != EnumC0080m.f1897b && enumC0080m != EnumC0080m.f1898c) {
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
            i1.f.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (i0.c) entry.getValue();
            if (i1.f.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            L l2 = new L(fVar.b(), (S) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", l2);
            fVar.e().a(new C0174a(4, l2));
        }
    }

    public static final C0082o e(t tVar) {
        C0082o c0082o;
        i1.f.e(tVar, "<this>");
        v e2 = tVar.e();
        i1.f.e(e2, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = e2.f1908a;
            c0082o = (C0082o) atomicReference.get();
            if (c0082o == null) {
                a0 a0Var = new a0(null);
                w1.d dVar = AbstractC0358y.f3924a;
                c0082o = new C0082o(e2, F1.d.Y(a0Var, u1.m.f4201a.f3929f));
                while (!atomicReference.compareAndSet(null, c0082o)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                w1.d dVar2 = AbstractC0358y.f3924a;
                AbstractC0352s.g(c0082o, u1.m.f4201a.f3929f, new C0081n(c0082o, null), 2);
                break loop0;
            }
            break;
        }
        return c0082o;
    }

    public static final M f(S s2) {
        I i = new I();
        Q c2 = s2.c();
        AbstractC0090b a2 = s2 instanceof InterfaceC0075h ? ((InterfaceC0075h) s2).a() : C0089a.f2101b;
        i1.f.e(c2, "store");
        i1.f.e(a2, "defaultCreationExtras");
        return (M) new C0019l(c2, i, a2).f(i1.j.a(M.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void g(View view, t tVar) {
        i1.f.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, tVar);
    }
}
