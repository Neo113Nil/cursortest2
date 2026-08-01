package h0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2591a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2592b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2593c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2594e;

    public b(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f2591a = str;
        this.f2592b = str2;
        this.f2593c = str3;
        this.d = arrayList;
        this.f2594e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2591a.equals(bVar.f2591a) && this.f2592b.equals(bVar.f2592b) && this.f2593c.equals(bVar.f2593c) && this.d.equals(bVar.d)) {
            return this.f2594e.equals(bVar.f2594e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2594e.hashCode() + ((this.d.hashCode() + ((this.f2593c.hashCode() + ((this.f2592b.hashCode() + (this.f2591a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f2591a + "', onDelete='" + this.f2592b + " +', onUpdate='" + this.f2593c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.f2594e + '}';
    }
}
