package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class wd extends w {
    private final r4 a = r4.e;

    private wd() {
    }

    public static wd a() {
        return new wd();
    }

    private void a(jb jbVar) {
        jbVar.a(new g3() { // from class: com.my.target.wd$$ExternalSyntheticLambda0
            @Override // com.my.target.g3
            public final void accept(Object obj) {
                wd.this.a((kb) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(kb kbVar) {
        if (kbVar.j() && (kbVar.g() instanceof hd)) {
            hd hdVar = (hd) kbVar.g();
            this.a.a(hdVar.c(), hdVar.e());
        }
    }

    @Override // com.my.target.w
    public hd a(hd hdVar, n nVar, s sVar) {
        List<sc> c = hdVar.c();
        if (c.isEmpty()) {
            jb b = hdVar.b();
            if (b != null && b.b()) {
                a(b);
                return hdVar;
            }
            sVar.b(q.r);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int g = nVar.g();
        boolean z = g == 0 || g == 1;
        this.a.a(c, hdVar.e());
        for (sc scVar : c) {
            ImageData y = scVar.y();
            if (y != null) {
                y.useCache(true);
                if (z) {
                    arrayList.add(y);
                }
            }
            ImageData w = scVar.w();
            if (w != null) {
                w.useCache(true);
                if (z) {
                    arrayList.add(w);
                }
            }
            e a = scVar.a();
            if (a != null) {
                ImageData g2 = a.g();
                g2.useCache(true);
                if (z) {
                    arrayList.add(g2);
                }
            }
            ImageData Z = scVar.Z();
            if (Z != null) {
                arrayList.add(Z);
            }
        }
        if (arrayList.size() > 0) {
            b6.a(arrayList).c();
        }
        return hdVar;
    }
}
