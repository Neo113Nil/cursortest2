package h0;

import i1.f;
import java.util.AbstractSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3026a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractSet f3027b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f3028c;

    public e(Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        f.e(abstractSet, "foreignKeys");
        this.f3026a = map;
        this.f3027b = abstractSet;
        this.f3028c = abstractSet2;
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.getClass();
        if (!this.f3026a.equals(eVar.f3026a) || !f.a(this.f3027b, eVar.f3027b)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f3028c;
        if (abstractSet2 == null || (abstractSet = eVar.f3028c) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f3027b.hashCode() + ((this.f3026a.hashCode() - 373341288) * 31);
    }

    public final String toString() {
        return "TableInfo{name='water_entries', columns=" + this.f3026a + ", foreignKeys=" + this.f3027b + ", indices=" + this.f3028c + '}';
    }
}
