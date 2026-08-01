package x1;

import W0.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f4488c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f4489a;

    /* renamed from: b, reason: collision with root package name */
    public final F1.d f4490b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    static {
        ArrayList arrayList = new ArrayList();
        W0.u uVar = W0.u.f1286a;
        int size = arrayList.size();
        W0.u uVar2 = uVar;
        if (size != 0) {
            if (size != 1) {
                ?? linkedHashSet = new LinkedHashSet(v.r0(arrayList.size()));
                W0.j.y0(arrayList, linkedHashSet);
                uVar2 = linkedHashSet;
            } else {
                ?? singleton = Collections.singleton(arrayList.get(0));
                i1.f.d(singleton, "singleton(...)");
                uVar2 = singleton;
            }
        }
        f4488c = new d(uVar2, null);
    }

    public d(Set set, F1.d dVar) {
        this.f4489a = set;
        this.f4490b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (i1.f.a(dVar.f4489a, this.f4489a) && i1.f.a(dVar.f4490b, this.f4490b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4489a.hashCode() + 1517) * 41;
        F1.d dVar = this.f4490b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
