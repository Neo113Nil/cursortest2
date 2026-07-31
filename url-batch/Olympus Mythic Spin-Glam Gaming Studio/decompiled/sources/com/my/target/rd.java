package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class rd extends w {
    private rd() {
    }

    public static rd a() {
        return new rd();
    }

    @Override // com.my.target.w
    public sd a(sd sdVar, n nVar, s sVar) {
        if (nVar.f() > 0 && !sdVar.m() && sdVar.j() != null) {
            z3 c = jg.c();
            int j = nVar.j();
            if (c != null) {
                c.a(j, sdVar.j().toString(), false);
            } else {
                mi.a("NativeAppwallAdResultProcessor: Unable to open disk cache and save data for slotId " + j);
            }
        }
        int g = nVar.g();
        if (g == 0 || g == 1) {
            ArrayList arrayList = new ArrayList();
            for (md mdVar : sdVar.c()) {
                ImageData k0 = mdVar.k0();
                ImageData a0 = mdVar.a0();
                ImageData e0 = mdVar.e0();
                ImageData w = mdVar.w();
                ImageData g0 = mdVar.g0();
                ImageData X = mdVar.X();
                ImageData f0 = mdVar.f0();
                ImageData d0 = mdVar.d0();
                if (k0 != null) {
                    arrayList.add(k0);
                }
                if (a0 != null) {
                    arrayList.add(a0);
                }
                if (e0 != null) {
                    arrayList.add(e0);
                }
                if (w != null) {
                    arrayList.add(w);
                }
                if (g0 != null) {
                    arrayList.add(g0);
                }
                if (X != null) {
                    arrayList.add(X);
                }
                if (f0 != null) {
                    arrayList.add(f0);
                }
                if (d0 != null) {
                    arrayList.add(d0);
                }
            }
            if (arrayList.size() > 0) {
                b6.a(arrayList).c();
            }
        }
        return sdVar;
    }
}
