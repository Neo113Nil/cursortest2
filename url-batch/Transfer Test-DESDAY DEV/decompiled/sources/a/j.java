package a;

import Y.z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c.C0084a;
import c.C0085b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1195a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1196b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1197c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1198e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1199f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1200g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1195a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0085b c0085b = (C0085b) this.f1198e.get(str);
        if ((c0085b != null ? c0085b.f1729a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0085b.f1729a.a(c0085b.f1730b.O(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1199f.remove(str);
        this.f1200g.putParcelable(str, new C0084a(intent, i2));
        return true;
    }

    public final B.j b(String str, T.e eVar, z zVar) {
        Object parcelable;
        g1.f.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1196b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = new m1.a(new m1.c(0, new m1.h(1))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1195a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1198e.put(str, new C0085b(zVar, eVar));
        LinkedHashMap linkedHashMap3 = this.f1199f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1200g;
        if (i >= 34) {
            parcelable = G.a.a(bundle, str, C0084a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0084a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0084a c0084a = (C0084a) parcelable;
        if (c0084a != null) {
            bundle.remove(str);
            zVar.a(eVar.O(c0084a.f1728b, c0084a.f1727a));
        }
        return new B.j(this, 9, str);
    }
}
