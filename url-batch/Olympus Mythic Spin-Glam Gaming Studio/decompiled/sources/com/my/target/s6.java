package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class s6 extends w {
    private s6() {
    }

    public static s6 a() {
        return new s6();
    }

    @Override // com.my.target.w
    public l6 a(l6 l6Var, n nVar, s sVar) {
        q0 q0Var;
        ArrayList c = l6Var.c();
        int size = c.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = c.get(i2);
            i2++;
            ((hb) obj).c();
        }
        int g = nVar.g();
        boolean z = g == 0 || g == 4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = c.size();
        while (i < size2) {
            Object obj2 = c.get(i);
            i++;
            for (eb ebVar : ((hb) obj2).d()) {
                e a = ebVar.a();
                if (a != null) {
                    ImageData g2 = a.g();
                    g2.useCache(true);
                    arrayList.add(g2);
                }
                if (z && (q0Var = (q0) ebVar.A0()) != null) {
                    arrayList2.add(new cb(q0Var, ebVar.f()));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            b6.a(arrayList).c();
        }
        if (!arrayList2.isEmpty()) {
            s0.a(arrayList2).a();
        }
        return l6Var;
    }
}
