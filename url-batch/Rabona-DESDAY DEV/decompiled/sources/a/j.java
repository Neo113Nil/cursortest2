package a;

import X.z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c.C0078a;
import c.C0079b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1051a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1052b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1053c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1054e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1055f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1056g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1051a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0079b c0079b = (C0079b) this.f1054e.get(str);
        if ((c0079b != null ? c0079b.f1515a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0079b.f1515a.a(c0079b.f1516b.N(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1055f.remove(str);
        this.f1056g.putParcelable(str, new C0078a(intent, i2));
        return true;
    }

    public final B.j b(String str, q1.l lVar, z zVar) {
        Object parcelable;
        X0.d.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1052b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            for (Number number : new d1.a(new Q0.o(1, new d1.e(1)))) {
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1051a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1054e.put(str, new C0079b(zVar, lVar));
        LinkedHashMap linkedHashMap3 = this.f1055f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1056g;
        if (i >= 34) {
            parcelable = G.a.a(bundle, str, C0078a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0078a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0078a c0078a = (C0078a) parcelable;
        if (c0078a != null) {
            bundle.remove(str);
            zVar.a(lVar.N(c0078a.f1514b, c0078a.f1513a));
        }
        return new B.j(this, 10, str);
    }
}
