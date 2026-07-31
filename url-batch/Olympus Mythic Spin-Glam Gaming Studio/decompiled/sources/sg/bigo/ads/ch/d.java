package sg.bigo.ads.ch;

import sg.bigo.ads.ai.k;
import sg.bigo.ads.an.g;
import sg.bigo.ads.ci.i;

/* loaded from: classes15.dex */
public final class d {
    private sg.bigo.ads.cf.b a;
    private g b;
    private sg.bigo.ads.ci.e c;
    private i d;
    private sg.bigo.ads.cl.e e;
    private c f;
    private c g;
    private c h;

    public static class a {
        private static final d a = new d();
    }

    public final void a(String str, sg.bigo.ads.cf.i iVar, sg.bigo.ads.cf.i iVar2) {
        c cVar;
        if (str == null || iVar == null || iVar2 == null || !k.a.x() || k.a.y() <= 0 || k.a.z() <= 0 || k.a.A() <= 0 || this.a == null) {
            return;
        }
        if (str.equals("/Ad/GetSDKConfig")) {
            if (iVar.d() == 1) {
                return;
            }
            if (this.f == null) {
                this.f = new e(this.a, this.b, this.c, this.d);
            }
            cVar = this.f;
        } else {
            if (!str.equals("/Ad/ReportUniBaina")) {
                if (iVar.d() != 1) {
                    if (this.h == null) {
                        this.h = new sg.bigo.ads.ch.a(this.a, this.b, this.c, this.d);
                    }
                    c cVar2 = this.h;
                    ((sg.bigo.ads.ch.a) cVar2).a = this.e;
                    cVar2.c();
                    return;
                }
                return;
            }
            if (iVar.d() == 1) {
                return;
            }
            if (this.g == null) {
                this.g = new b(this.a, this.b, this.c, this.d);
            }
            cVar = this.g;
        }
        cVar.c();
    }

    public final void a(sg.bigo.ads.cf.b bVar, g gVar, sg.bigo.ads.ci.e eVar, i iVar, sg.bigo.ads.cl.e eVar2) {
        this.a = bVar;
        this.b = gVar;
        this.c = eVar;
        this.d = iVar;
        this.e = eVar2;
    }
}
