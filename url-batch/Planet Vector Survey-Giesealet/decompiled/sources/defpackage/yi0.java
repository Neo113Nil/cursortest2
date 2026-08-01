package defpackage;

import android.os.Bundle;
import com.vectorharbor.planetvectorsurvey.MainActivity;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yi0 implements m20 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ yi0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.m20
    public final void g(o20 o20Var, e20 e20Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ln0 ln0Var = (ln0) obj;
                if (e20Var != e20.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                o20Var.getLifecycle().b(this);
                Bundle a = ln0Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    g8.s("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, yi0.class.getClassLoader()).asSubclass(gn0.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(ln0Var instanceof r01)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + ln0Var).toString());
                                }
                                q01 viewModelStore = ((r01) ln0Var).getViewModelStore();
                                in0 savedStateRegistry = ln0Var.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    k01 k01Var = (k01) linkedHashMap.get(str3);
                                    if (k01Var != null) {
                                        nk.e(k01Var, savedStateRegistry, ln0Var.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                g8.j("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException("Class " + str2 + " wasn't found", e3);
                    }
                }
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) obj;
                zf.access$ensureViewModelStore(mainActivity);
                mainActivity.getLifecycle().b(this);
                return;
            case 2:
                new HashMap();
                cv[] cvVarArr = (cv[]) obj;
                if (cvVarArr.length > 0) {
                    cv cvVar = cvVarArr[0];
                    throw null;
                }
                if (cvVarArr.length <= 0) {
                    return;
                }
                cv cvVar2 = cvVarArr[0];
                throw null;
            default:
                if (e20Var == e20.ON_CREATE) {
                    o20Var.getLifecycle().b(this);
                    ((en0) obj).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + e20Var).toString());
                }
        }
    }
}
