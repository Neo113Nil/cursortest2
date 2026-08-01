package h0;

import i1.f;
import java.util.ArrayList;
import java.util.List;
import p1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3023a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3024b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3025c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public d(String str, boolean z2, List list, List list2) {
        this.f3023a = str;
        this.f3024b = z2;
        this.f3025c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3024b != dVar.f3024b || !this.f3025c.equals(dVar.f3025c) || !f.a(this.d, dVar.d)) {
            return false;
        }
        String str = this.f3023a;
        boolean J2 = l.J(str, "index_", false);
        String str2 = dVar.f3023a;
        return J2 ? l.J(str2, "index_", false) : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f3023a;
        return this.d.hashCode() + ((this.f3025c.hashCode() + ((((l.J(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f3024b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f3023a + "', unique=" + this.f3024b + ", columns=" + this.f3025c + ", orders=" + this.d + "'}";
    }
}
