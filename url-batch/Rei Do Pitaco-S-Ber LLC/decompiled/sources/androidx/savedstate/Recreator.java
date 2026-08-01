package androidx.savedstate;

import android.os.Bundle;
import defpackage.fp;
import defpackage.h3;
import defpackage.jp;
import defpackage.l8;
import defpackage.lp;
import defpackage.m60;
import defpackage.p80;
import defpackage.s80;
import defpackage.t80;
import defpackage.u00;
import defpackage.x00;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class Recreator implements jp {
    public final x00 a;

    public Recreator(x00 x00Var) {
        this.a = x00Var;
    }

    @Override // defpackage.jp
    public final void b(lp lpVar, fp fpVar) {
        if (fpVar != fp.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lpVar.e().f(this);
        x00 x00Var = this.a;
        Bundle c = x00Var.a().c("androidx.savedstate.Restarter");
        if (c == null) {
            return;
        }
        ArrayList<String> stringArrayList = c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            l8.u("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(u00.class);
                asSubclass.getClass();
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        newInstance.getClass();
                        if (!(x00Var instanceof t80)) {
                            l8.u("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                            return;
                        }
                        s80 d = ((t80) x00Var).d();
                        h3 a = x00Var.a();
                        d.getClass();
                        LinkedHashMap linkedHashMap = d.a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            str3.getClass();
                            p80 p80Var = (p80) linkedHashMap.get(str3);
                            p80Var.getClass();
                            m60.g(p80Var, a, x00Var.e());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            a.f();
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate " + str2, e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("Class " + str2 + " wasn't found", e3);
            }
        }
    }
}
