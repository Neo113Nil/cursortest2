package com.monetization.ads.exo.source.dash.offline;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import yads.by2;
import yads.dy2;
import yads.e30;
import yads.er;
import yads.eu;
import yads.fr;
import yads.g30;
import yads.k30;
import yads.l30;
import yads.lo;
import yads.m30;
import yads.mo;
import yads.oo2;
import yads.sb3;
import yads.sc2;
import yads.ta;
import yads.tl2;
import yads.uj0;
import yads.wl1;

/* loaded from: classes6.dex */
public final class DashDownloader extends dy2 {
    private final mo j;

    public DashDownloader(wl1 wl1Var, er erVar, Executor executor) {
        super(wl1Var, new g30(), erVar, executor);
        this.j = new mo();
    }

    @Override // yads.dy2
    protected final ArrayList a(fr frVar, e30 e30Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < e30Var.m.size(); i++) {
            sc2 sc2Var = (sc2) e30Var.m.get(i);
            long a = sb3.a(sc2Var.b);
            long a2 = sb3.a(e30Var.a(i));
            int i2 = 0;
            for (List list = sc2Var.c; i2 < list.size(); list = list) {
                a(frVar, (ta) list.get(i2), a, a2, z, arrayList);
                i2++;
            }
        }
        return arrayList;
    }

    private void a(fr frVar, ta taVar, long j, long j2, boolean z, ArrayList arrayList) {
        k30 d;
        DashDownloader dashDownloader = this;
        ta taVar2 = taVar;
        int i = 0;
        while (i < taVar2.c.size()) {
            oo2 oo2Var = (oo2) taVar2.c.get(i);
            try {
                int i2 = taVar2.b;
                d = oo2Var.d();
                if (d == null) {
                    eu euVar = (eu) dashDownloader.a(new a(frVar, i2, oo2Var), z);
                    d = euVar == null ? null : new m30(euVar, oo2Var.c);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
            if (d != null) {
                long c = d.c(j2);
                if (c != -1) {
                    lo b = dashDownloader.j.b(oo2Var.b);
                    int i3 = sb3.a;
                    String str = b.a;
                    tl2 tl2Var = oo2Var.e;
                    if (tl2Var != null) {
                        arrayList.add(new by2(j, l30.a(oo2Var, str, tl2Var, 0)));
                    }
                    tl2 e2 = oo2Var.e();
                    if (e2 != null) {
                        arrayList.add(new by2(j, l30.a(oo2Var, str, e2, 0)));
                    }
                    long b2 = d.b();
                    long j3 = (b2 + c) - 1;
                    for (long j4 = b2; j4 <= j3; j4++) {
                        arrayList.add(new by2(d.a(j4) + j, l30.a(oo2Var, str, d.b(j4), 0)));
                    }
                    i++;
                    dashDownloader = this;
                    taVar2 = taVar;
                } else {
                    throw new uj0("Unbounded segment index");
                }
            } else {
                throw new uj0("Missing segment index");
            }
        }
    }
}
