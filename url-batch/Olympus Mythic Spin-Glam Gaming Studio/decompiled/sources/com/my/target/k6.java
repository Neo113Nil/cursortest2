package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class k6 extends w {
    private k6() {
    }

    public static k6 a() {
        return new k6();
    }

    @Override // com.my.target.w
    public l6 a(l6 l6Var, n nVar, s sVar) {
        ImageData a;
        ImageData e;
        ArrayList c = l6Var.c();
        int size = c.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = c.get(i2);
            i2++;
            ((hb) obj).c();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList c2 = l6Var.c();
        int size2 = c2.size();
        while (i < size2) {
            Object obj2 = c2.get(i);
            i++;
            for (z0 z0Var : ((hb) obj2).d()) {
                e a2 = z0Var.a();
                if (a2 != null) {
                    ImageData g = a2.g();
                    g.useCache(true);
                    arrayList.add(g);
                }
                l3 d0 = z0Var.d0();
                if (d0 != null && (e = d0.e()) != null) {
                    e.useCache(true);
                    arrayList.add(e);
                }
                ue h0 = z0Var.h0();
                if (h0 != null && (a = h0.a()) != null) {
                    a.useCache(true);
                    arrayList.add(a);
                }
            }
        }
        if (arrayList.size() > 0) {
            b6.a(arrayList).c();
        }
        return l6Var;
    }
}
