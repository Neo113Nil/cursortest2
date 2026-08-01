package i0;

import Y.AbstractComponentCallbacksC0055q;
import a.h;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0079l;
import androidx.lifecycle.InterfaceC0074g;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import g.AbstractActivityC0129i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3029a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3030b;

    public /* synthetic */ C0174a(int i, Object obj) {
        this.f3029a = i;
        this.f3030b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0079l enumC0079l) {
        View view;
        switch (this.f3029a) {
            case 0:
                if (enumC0079l != EnumC0079l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                tVar.e().f(this);
                f fVar = (f) this.f3030b;
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
                        Class<? extends U> asSubclass = Class.forName(str, false, C0174a.class.getClassLoader()).asSubclass(b.class);
                        i1.f.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                i1.f.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof S)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                Q c3 = ((S) fVar).c();
                                d b2 = fVar.b();
                                c3.getClass();
                                LinkedHashMap linkedHashMap = c3.f1883a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    i1.f.e(str2, "key");
                                    O o2 = (O) linkedHashMap.get(str2);
                                    i1.f.b(o2);
                                    J.c(o2, b2, fVar.e());
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
                if (enumC0079l != EnumC0079l.ON_STOP || (view = ((AbstractComponentCallbacksC0055q) this.f3030b).f1486E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                AbstractActivityC0129i abstractActivityC0129i = (AbstractActivityC0129i) this.f3030b;
                if (abstractActivityC0129i.f1586e == null) {
                    h hVar = (h) abstractActivityC0129i.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        abstractActivityC0129i.f1586e = hVar.f1570a;
                    }
                    if (abstractActivityC0129i.f1586e == null) {
                        abstractActivityC0129i.f1586e = new Q();
                    }
                }
                abstractActivityC0129i.f1583a.f(this);
                return;
            case 3:
                new HashMap();
                InterfaceC0074g[] interfaceC0074gArr = (InterfaceC0074g[]) this.f3030b;
                if (interfaceC0074gArr.length > 0) {
                    InterfaceC0074g interfaceC0074g = interfaceC0074gArr[0];
                    throw null;
                }
                if (interfaceC0074gArr.length <= 0) {
                    return;
                }
                InterfaceC0074g interfaceC0074g2 = interfaceC0074gArr[0];
                throw null;
            default:
                if (enumC0079l != EnumC0079l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0079l).toString());
                }
                tVar.e().f(this);
                L l2 = (L) this.f3030b;
                if (l2.f1879b) {
                    return;
                }
                Bundle c4 = l2.f1878a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = l2.f1880c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c4 != null) {
                    bundle.putAll(c4);
                }
                l2.f1880c = bundle;
                l2.f1879b = true;
                return;
        }
    }
}
