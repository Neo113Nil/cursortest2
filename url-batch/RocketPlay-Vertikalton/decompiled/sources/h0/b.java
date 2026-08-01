package h0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3016a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3017b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3018c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3019e;

    public b(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f3016a = str;
        this.f3017b = str2;
        this.f3018c = str3;
        this.d = arrayList;
        this.f3019e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3016a.equals(bVar.f3016a) && this.f3017b.equals(bVar.f3017b) && this.f3018c.equals(bVar.f3018c) && this.d.equals(bVar.d)) {
            return this.f3019e.equals(bVar.f3019e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3019e.hashCode() + ((this.d.hashCode() + ((this.f3018c.hashCode() + ((this.f3017b.hashCode() + (this.f3016a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f3016a + "', onDelete='" + this.f3017b + " +', onUpdate='" + this.f3018c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.f3019e + '}';
    }
}
