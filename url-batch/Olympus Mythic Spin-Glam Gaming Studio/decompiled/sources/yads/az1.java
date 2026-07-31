package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes15.dex */
public final class az1 extends f42 implements m12 {
    public final ry1 Q;
    public final i12 R;
    public final ri2 S;
    public final w22 T;

    public az1(Context context, ry1 ry1Var, i12 i12Var, ri2 ri2Var, np npVar, sz1 sz1Var) {
        super(context, npVar, sz1Var);
        this.Q = ry1Var;
        this.R = i12Var;
        this.S = ri2Var;
        v3 v3Var = npVar.a.c;
        dq2 dq2Var = ry1Var.a;
        w22 w22Var = new w22(v3Var, dq2Var.b, this.i, this.j, new d03(ry1Var));
        this.T = w22Var;
        a(w22Var);
    }

    @Override // yads.m12
    public final void a(f22 f22Var, ku kuVar) {
        a(f22Var.c, this.S, new o22(f22Var), kuVar);
    }

    @Override // yads.m12
    public final String c() {
        return this.N;
    }

    @Override // yads.m12
    public final j00 e() {
        return this.Q.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01bc  */
    @Override // yads.m12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w00 getAdAssets() {
        i10 i10Var;
        m10 m10Var;
        List list;
        i12 i12Var = this.R;
        yy1 yy1Var = i12Var.f;
        ry1 ry1Var = i12Var.a;
        yy1Var.getClass();
        List<ph> list2 = ry1Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (ph phVar : list2) {
            Pair pair = TuplesKt.to(phVar.a, phVar.c);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Object obj = linkedHashMap.get("media");
        n10 n10Var = null;
        dn1 dn1Var = obj instanceof dn1 ? (dn1) obj : null;
        Object obj2 = linkedHashMap.get("favicon");
        q31 q31Var = obj2 instanceof q31 ? (q31) obj2 : null;
        Object obj3 = linkedHashMap.get("icon");
        q31 q31Var2 = obj3 instanceof q31 ? (q31) obj3 : null;
        Object obj4 = linkedHashMap.get("close_button");
        bw bwVar = obj4 instanceof bw ? (bw) obj4 : null;
        Object obj5 = linkedHashMap.get("age");
        String str = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = linkedHashMap.get("body");
        String str2 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = linkedHashMap.get("call_to_action");
        String str3 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = linkedHashMap.get("domain");
        String str4 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = linkedHashMap.get("price");
        String str5 = obj9 instanceof String ? (String) obj9 : null;
        Object obj10 = linkedHashMap.get("rating");
        String str6 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = linkedHashMap.get("review_count");
        String str7 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = linkedHashMap.get("sponsored");
        String str8 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = linkedHashMap.get("title");
        String str9 = obj13 instanceof String ? (String) obj13 : null;
        Object obj14 = linkedHashMap.get("warning");
        k10 k10Var = obj14 instanceof k10 ? (k10) obj14 : obj14 instanceof String ? new k10((String) obj14) : null;
        boolean z = linkedHashMap.get("feedback") != null;
        y00 a = yy1Var.b.a((dn1Var == null || (list = dn1Var.c) == null) ? null : (q31) CollectionsKt.firstOrNull(list), yy1Var.a);
        y00 a2 = yy1Var.b.a(q31Var, yy1Var.a);
        y00 a3 = yy1Var.b.a(q31Var2, yy1Var.a);
        yy1Var.c.getClass();
        if (dn1Var != null) {
            de3 de3Var = dn1Var.b;
            List list3 = dn1Var.c;
            ij1 ij1Var = dn1Var.a;
            if (de3Var != null) {
                int i = ((t62) ((we3) CollectionsKt.first(de3Var.a)).d).c;
                i10Var = new i10(i != 0 ? r1.b / i : 1.7777778f, true);
            } else if (list3 != null && list3.size() > 1) {
                i10Var = new i10((float) vx1.a(list3), false);
            } else if (ij1Var != null) {
                i10Var = new i10(ij1Var.b, ij1Var.c);
            }
            yy1Var.e.getClass();
            if (bwVar != null) {
                int ordinal = bwVar.a.ordinal();
                if (ordinal == 0) {
                    m10Var = m10.b;
                } else {
                    if (ordinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m10Var = m10.c;
                }
                n10Var = new n10(m10Var, bwVar.b);
            }
            yy1Var.d.getClass();
            return new w00(i10Var, a2, a3, a, n10Var, str, str2, str3, str4, str5, y22.a(str6), str7, str8, str9, k10Var, z);
        }
        i10Var = null;
        yy1Var.e.getClass();
        if (bwVar != null) {
        }
        yy1Var.d.getClass();
        return new w00(i10Var, a2, a3, a, n10Var, str, str2, str3, str4, str5, y22.a(str6), str7, str8, str9, k10Var, z);
    }

    @Override // yads.m12
    public final dq2 getAdType() {
        return this.R.a.a;
    }

    @Override // yads.m12
    public final String getInfo() {
        return this.R.a.d;
    }

    @Override // yads.f42, yads.m12
    public final void loadImages() {
        i12 i12Var = this.R;
        List listOf = CollectionsKt.listOf(i12Var.a);
        x31 x31Var = i12Var.e;
        x31Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(linkedHashSet, x31Var.a(((ry1) it.next()).b));
        }
        i12Var.d.a(linkedHashSet, new h12(i12Var));
    }

    @Override // yads.m12
    public final xz a(f22 f22Var) {
        vz vzVar;
        try {
            this.T.f = d32.c;
            a(f22Var.c, this.S, new o22(f22Var));
            return wz.a;
        } catch (v02 e) {
            ab1.a("Ad binding failed: %s", e.b);
            vzVar = new vz(e.c, e);
            return vzVar;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Ad binding failed with unexpected exception";
            }
            ab1.a("Ad binding failed with unexpected error: %s", message);
            vzVar = new vz(null, th);
            return vzVar;
        }
    }

    @Override // yads.m12
    public final String a() {
        return this.R.a.e;
    }
}
