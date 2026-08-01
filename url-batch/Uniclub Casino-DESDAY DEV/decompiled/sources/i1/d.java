package i1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f2409c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2410a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2411b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = Q0.s.f670a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(Q0.t.b0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                X0.d.d(set, "singleton(...)");
            }
        }
        f2409c = new d(set, null);
    }

    public d(Set set, r rVar) {
        this.f2410a = set;
        this.f2411b = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (X0.d.a(dVar.f2410a, this.f2410a) && X0.d.a(dVar.f2411b, this.f2411b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2410a.hashCode() + 1517) * 41;
        r rVar = this.f2411b;
        return hashCode + (rVar != null ? rVar.hashCode() : 0);
    }
}
