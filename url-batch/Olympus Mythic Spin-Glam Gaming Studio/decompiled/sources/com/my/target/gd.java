package com.my.target;

import com.my.target.common.models.ImageData;
import com.my.target.d7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class gd extends w {
    private final r4 a = r4.e;

    private gd() {
    }

    public static gd a() {
        return new gd();
    }

    private void a(jb jbVar, final long j) {
        jbVar.a(new g3() { // from class: com.my.target.gd$$ExternalSyntheticLambda0
            @Override // com.my.target.g3
            public final void accept(Object obj) {
                gd.this.a(j, (kb) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, kb kbVar) {
        if (kbVar.j() && (kbVar.g() instanceof hd)) {
            this.a.a(((hd) kbVar.g()).c(), j);
        }
    }

    @Override // com.my.target.w
    public hd a(hd hdVar, n nVar, s sVar) {
        List<sc> c = hdVar.c();
        if (c.isEmpty()) {
            jb b = hdVar.b();
            if (b != null && b.b()) {
                a(b, hdVar.e());
                return hdVar;
            }
            sVar.b(q.r);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int g = nVar.g();
        boolean z = g == 0 || g == 1;
        this.a.a(c, hdVar.e());
        for (sc scVar : c) {
            eb d0 = scVar.d0();
            if (d0 != null) {
                dj djVar = (dj) d0.A0();
                boolean z2 = g == 0 || g == 2;
                if (djVar != null && z2 && djVar.c()) {
                    arrayList2.add(new cb(djVar, scVar.f()));
                }
            }
            ImageData y = scVar.y();
            if (y != null) {
                y.useCache(true);
                if (z) {
                    arrayList.add(new cb(y, scVar.f()));
                }
            }
            ImageData w = scVar.w();
            if (w != null) {
                w.useCache(true);
                if (z) {
                    arrayList.add(new cb(w, scVar.f()));
                }
            }
            Iterator it = scVar.c0().iterator();
            while (it.hasNext()) {
                ImageData y2 = ((uc) it.next()).y();
                if (y2 != null) {
                    y2.useCache(true);
                    if (z) {
                        arrayList.add(new cb(y2, scVar.f()));
                    }
                }
            }
            e a = scVar.a();
            if (a != null) {
                ImageData g2 = a.g();
                g2.useCache(true);
                if (z) {
                    arrayList.add(new cb(g2, scVar.f()));
                }
            }
            ImageData Z = scVar.Z();
            if (Z != null) {
                arrayList.add(new cb(Z, scVar.f()));
            }
            c7 X = scVar.X();
            if (X != null) {
                for (d7 d7Var : X.a()) {
                    ImageData imageData = d7Var.c;
                    if (imageData == null) {
                        imageData = null;
                    }
                    d7.b bVar = d7Var.d;
                    if (bVar != null) {
                        imageData = bVar.a;
                    }
                    if (imageData != null) {
                        imageData.useCache(true);
                        if (z) {
                            arrayList.add(new cb(imageData, scVar.f()));
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            b6.b(arrayList).c();
        }
        if (arrayList2.size() > 0) {
            gj.a(arrayList2).a();
        }
        return hdVar;
    }
}
