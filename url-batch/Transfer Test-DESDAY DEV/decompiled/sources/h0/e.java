package h0;

import java.util.AbstractSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2601a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractSet f2602b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f2603c;

    public e(Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        g1.f.e(abstractSet, "foreignKeys");
        this.f2601a = map;
        this.f2602b = abstractSet;
        this.f2603c = abstractSet2;
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
        if (!this.f2601a.equals(eVar.f2601a) || !g1.f.a(this.f2602b, eVar.f2602b)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f2603c;
        if (abstractSet2 == null || (abstractSet = eVar.f2603c) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f2602b.hashCode() + ((this.f2601a.hashCode() + 272286454) * 31);
    }

    public final String toString() {
        return "TableInfo{name='game_sessions', columns=" + this.f2601a + ", foreignKeys=" + this.f2602b + ", indices=" + this.f2603c + '}';
    }
}
