package h0;

import X.AbstractComponentCallbacksC0048q;
import a.h;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0063g;
import androidx.lifecycle.InterfaceC0072p;
import androidx.lifecycle.J;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.r;
import g.AbstractActivityC0138i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146a implements InterfaceC0072p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2374a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2375b;

    public /* synthetic */ C0146a(int i, Object obj) {
        this.f2374a = i;
        this.f2375b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0072p
    public final void e(r rVar, EnumC0068l enumC0068l) {
        View view;
        switch (this.f2374a) {
            case 0:
                if (enumC0068l != EnumC0068l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                rVar.e().f(this);
                f fVar = (f) this.f2375b;
                Bundle c2 = fVar.b().c("androidx.savedstate.Restarter");
                if (c2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = c2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C0146a.class.getClassLoader()).asSubclass(b.class);
                        X0.d.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                X0.d.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof P)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                O c3 = ((P) fVar).c();
                                d b2 = fVar.b();
                                c3.getClass();
                                LinkedHashMap linkedHashMap = c3.f1349a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    X0.d.e(str2, "key");
                                    M m2 = (M) linkedHashMap.get(str2);
                                    X0.d.b(m2);
                                    H.c(m2, b2, fVar.e());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    b2.f();
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException("Failed to instantiate " + str, e2);
                            }
                        } catch (NoSuchMethodException e3) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException("Class " + str + " wasn't found", e4);
                    }
                }
                return;
            case 1:
                if (enumC0068l != EnumC0068l.ON_STOP || (view = ((AbstractComponentCallbacksC0048q) this.f2375b).f956E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                AbstractActivityC0138i abstractActivityC0138i = (AbstractActivityC0138i) this.f2375b;
                if (abstractActivityC0138i.f1062e == null) {
                    h hVar = (h) abstractActivityC0138i.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        abstractActivityC0138i.f1062e = hVar.f1046a;
                    }
                    if (abstractActivityC0138i.f1062e == null) {
                        abstractActivityC0138i.f1062e = new O();
                    }
                }
                abstractActivityC0138i.f1059a.f(this);
                return;
            case 3:
                new HashMap();
                InterfaceC0063g[] interfaceC0063gArr = (InterfaceC0063g[]) this.f2375b;
                if (interfaceC0063gArr.length > 0) {
                    InterfaceC0063g interfaceC0063g = interfaceC0063gArr[0];
                    throw null;
                }
                if (interfaceC0063gArr.length <= 0) {
                    return;
                }
                InterfaceC0063g interfaceC0063g2 = interfaceC0063gArr[0];
                throw null;
            default:
                if (enumC0068l != EnumC0068l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0068l).toString());
                }
                rVar.e().f(this);
                J j2 = (J) this.f2375b;
                if (j2.f1345b) {
                    return;
                }
                Bundle c4 = j2.f1344a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = j2.f1346c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c4 != null) {
                    bundle.putAll(c4);
                }
                j2.f1346c = bundle;
                j2.f1345b = true;
                return;
        }
    }
}
