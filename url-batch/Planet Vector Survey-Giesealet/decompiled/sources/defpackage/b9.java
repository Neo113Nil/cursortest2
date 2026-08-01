package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class b9 extends k01 {
    public final String a = "SaveableStateHolder_BackStackEntryKey";
    public final UUID b;
    public WeakReference c;

    public b9(bn0 bn0Var) {
        Object obj;
        bn0Var.getClass();
        e10 e10Var = bn0Var.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) e10Var.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) e10Var.d;
        try {
            g70 g70Var = (g70) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (g70Var == null || (obj = ((et0) g70Var).getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) e10Var.c).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            uuid = UUID.randomUUID();
            String str = this.a;
            str.getClass();
            if (uuid != null) {
                ArrayList arrayList = dn0.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (((Class) obj2).isInstance(uuid)) {
                        }
                    }
                }
                g8.o("Can't put value with type ", uuid.getClass(), " into saved state");
                throw null;
            }
            ArrayList arrayList2 = dn0.a;
            bn0Var.a.get(str);
            e10Var.d(uuid, str);
        }
        this.b = uuid;
    }

    @Override // defpackage.k01
    public final void onCleared() {
        super.onCleared();
        WeakReference weakReference = this.c;
        if (weakReference == null) {
            nz.f0("saveableStateHolderRef");
            throw null;
        }
        wm0 wm0Var = (wm0) weakReference.get();
        if (wm0Var != null) {
            a70 a70Var = wm0Var.b;
            UUID uuid = this.b;
            if (a70Var.k(uuid) == null) {
                wm0Var.a.remove(uuid);
            }
        }
        WeakReference weakReference2 = this.c;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            nz.f0("saveableStateHolderRef");
            throw null;
        }
    }
}
