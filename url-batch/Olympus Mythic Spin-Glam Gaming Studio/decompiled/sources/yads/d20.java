package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d20 implements sj3 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final g20 e;
    public final String f;
    public final w03 g;
    public final String h;
    public final int i;
    public final String j;

    public d20(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, g20 g20Var, String str, w03 w03Var, String str2, int i, String str3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
        this.e = g20Var;
        this.f = str;
        this.g = w03Var;
        this.h = str2;
        this.i = i;
        this.j = str3;
    }

    @Override // yads.sj3
    public final Map a() {
        ArrayList arrayList = this.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n83 n83Var = (n83) it.next();
            String str = n83Var.a;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(n83Var.b);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d20)) {
            return false;
        }
        d20 d20Var = (d20) obj;
        return Intrinsics.areEqual(this.a, d20Var.a) && Intrinsics.areEqual(this.b, d20Var.b) && Intrinsics.areEqual(this.c, d20Var.c) && Intrinsics.areEqual(this.d, d20Var.d) && Intrinsics.areEqual(this.e, d20Var.e) && Intrinsics.areEqual(this.f, d20Var.f) && Intrinsics.areEqual(this.g, d20Var.g) && Intrinsics.areEqual(this.h, d20Var.h) && this.i == d20Var.i && Intrinsics.areEqual(this.j, d20Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        g20 g20Var = this.e;
        int hashCode2 = (hashCode + (g20Var == null ? 0 : g20Var.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        w03 w03Var = this.g;
        int hashCode4 = (hashCode3 + (w03Var == null ? 0 : w03Var.hashCode())) * 31;
        String str2 = this.h;
        int a = yd3.a(this.i, (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.j;
        return a + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "Creative(mediaFiles=" + this.a + ", interactiveCreativeFiles=" + this.b + ", icons=" + this.c + ", trackingEventsList=" + this.d + ", creativeExtensions=" + this.e + ", clickThroughUrl=" + this.f + ", skipOffset=" + this.g + ", id=" + this.h + ", durationMillis=" + this.i + ", adParameters=" + this.j + ")";
    }
}
