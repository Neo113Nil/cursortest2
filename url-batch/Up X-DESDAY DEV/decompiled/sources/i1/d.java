package i1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f2403c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2404a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2405b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = Q0.o.f666a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(Q0.p.d0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                X0.e.d(set, "singleton(...)");
            }
        }
        f2403c = new d(set, null);
    }

    public d(Set set, p pVar) {
        this.f2404a = set;
        this.f2405b = pVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (X0.e.a(dVar.f2404a, this.f2404a) && X0.e.a(dVar.f2405b, this.f2405b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2404a.hashCode() + 1517) * 41;
        p pVar = this.f2405b;
        return hashCode + (pVar != null ? pVar.hashCode() : 0);
    }
}
