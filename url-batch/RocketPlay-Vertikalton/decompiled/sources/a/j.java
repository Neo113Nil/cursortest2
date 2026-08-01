package a;

import Y.z;
import a1.AbstractC0067d;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c.C0100a;
import c.C0101b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1574a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1575b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1576c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1577e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1578f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1579g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1574a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0101b c0101b = (C0101b) this.f1577e.get(str);
        if ((c0101b != null ? c0101b.f2109a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0101b.f2109a.a(c0101b.f2110b.o(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1578f.remove(str);
        this.f1579g.putParcelable(str, new C0100a(intent, i2));
        return true;
    }

    public final B.j b(String str, AbstractC0067d abstractC0067d, z zVar) {
        Object parcelable;
        i1.f.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1575b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = new o1.a(new W0.q(1, new o1.h(1))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1574a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1577e.put(str, new C0101b(zVar, abstractC0067d));
        LinkedHashMap linkedHashMap3 = this.f1578f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1579g;
        if (i >= 34) {
            parcelable = G.a.a(bundle, str, C0100a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0100a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0100a c0100a = (C0100a) parcelable;
        if (c0100a != null) {
            bundle.remove(str);
            zVar.a(abstractC0067d.o(c0100a.f2108b, c0100a.f2107a));
        }
        return new B.j(this, 10, str);
    }
}
