package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class nb {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        w1 w1Var = (w1) this.e.get(str);
        if ((w1Var != null ? w1Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                w1Var.a.a(w1Var.b.P(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new t1(intent, i2));
        return true;
    }

    public final o4 b(String str, m60 m60Var, kk kkVar) {
        Object parcelable;
        LinkedHashMap linkedHashMap = this.b;
        int i = 1;
        if (((Integer) linkedHashMap.get(str)) == null) {
            v1 v1Var = new v1(0);
            for (Number number : new dc(new we(v1Var, new h(5, v1Var), 1))) {
                Integer valueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.a;
                if (!linkedHashMap2.containsKey(valueOf)) {
                    int intValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.e.put(str, new w1(kkVar, m60Var));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            kkVar.a(obj);
        }
        int i2 = Build.VERSION.SDK_INT;
        Bundle bundle = this.g;
        if (i2 >= 34) {
            parcelable = f0.b(bundle, str);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!t1.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        t1 t1Var = (t1) parcelable;
        if (t1Var != null) {
            bundle.remove(str);
            kkVar.a(m60Var.P(t1Var.g, t1Var.f));
        }
        return new o4(this, str, i);
    }
}
