package o;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class W1 {
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
        R1 r1 = (R1) this.e.get(str);
        if ((r1 != null ? r1.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                r1.a.a(r1.b.c(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new K1(intent, i2));
        return true;
    }

    public abstract void b(int i, N1 n1, Object obj);

    public final V1 c(String str, N1 n1, L1 l1) {
        AbstractC0048Bt.n(str, "key");
        d(str);
        this.e.put(str, new R1(n1, l1));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            l1.a(obj);
        }
        Bundle bundle = this.g;
        K1 k1 = (K1) EB.w(str, bundle);
        if (k1 != null) {
            bundle.remove(str);
            l1.a(n1.c(k1.i, k1.h));
        }
        return new V1(this, str, n1);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = ((C0577Wd) PQ.y(T1.i)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        AbstractC0048Bt.n(str, "key");
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((K1) EB.w(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        S1 s1 = (S1) linkedHashMap2.get(str);
        if (s1 != null) {
            ArrayList arrayList = s1.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s1.a.b((InterfaceC0288Kz) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
