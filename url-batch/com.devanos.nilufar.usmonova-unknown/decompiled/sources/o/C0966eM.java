package o;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: o.eM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0966eM implements InterfaceC0288Kz {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ C0966eM(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // o.InterfaceC0288Kz
    public final void j(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        switch (this.h) {
            case 0:
                MP mp = (MP) this.i;
                if (enumC0054Bz != EnumC0054Bz.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0365Nz.getLifecycle().b(this);
                Bundle a = mp.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C0966eM.class.getClassLoader()).asSubclass(IP.class);
                        AbstractC0048Bt.m(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                AbstractC0048Bt.m(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(mp instanceof InterfaceC0746b00)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                C0680a00 viewModelStore = ((InterfaceC0746b00) mp).getViewModelStore();
                                KP savedStateRegistry = mp.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    AbstractC0048Bt.n(str2, "key");
                                    UZ uz = (UZ) linkedHashMap.get(str2);
                                    AbstractC0048Bt.k(uz);
                                    AbstractC1305jX.h(uz, savedStateRegistry, mp.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(AbstractC1888sN.s("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(AbstractC1888sN.k("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                AbstractActivityC0446Rc abstractActivityC0446Rc = (AbstractActivityC0446Rc) this.i;
                AbstractActivityC0446Rc.access$ensureViewModelStore(abstractActivityC0446Rc);
                abstractActivityC0446Rc.getLifecycle().b(this);
                return;
            case 2:
                new HashMap();
                InterfaceC1522mq[] interfaceC1522mqArr = (InterfaceC1522mq[]) this.i;
                if (interfaceC1522mqArr.length > 0) {
                    InterfaceC1522mq interfaceC1522mq = interfaceC1522mqArr[0];
                    throw null;
                }
                if (interfaceC1522mqArr.length <= 0) {
                    return;
                }
                InterfaceC1522mq interfaceC1522mq2 = interfaceC1522mqArr[0];
                throw null;
            case 3:
                if (enumC0054Bz == EnumC0054Bz.ON_STOP) {
                    ((AbstractComponentCallbacksC0069Co) this.i).getClass();
                    return;
                }
                return;
            default:
                if (enumC0054Bz != EnumC0054Bz.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0054Bz).toString());
                }
                interfaceC0365Nz.getLifecycle().b(this);
                ((GP) this.i).b();
                return;
        }
    }
}
