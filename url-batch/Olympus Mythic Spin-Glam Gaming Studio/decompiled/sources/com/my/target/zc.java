package com.my.target;

import com.my.target.p;
import com.my.target.tb;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class zc extends p {
    private final hd h;
    private final String i;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class a implements p.a {
        @Override // com.my.target.p.a
        public boolean a() {
            return false;
        }

        @Override // com.my.target.p.a
        public z b() {
            return id.b();
        }

        @Override // com.my.target.p.a
        public w c() {
            return gd.a();
        }

        @Override // com.my.target.p.a
        public v d() {
            return fd.a();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class b implements p.a {
        @Override // com.my.target.p.a
        public boolean a() {
            return false;
        }

        @Override // com.my.target.p.a
        public z b() {
            return id.b();
        }

        @Override // com.my.target.p.a
        public w c() {
            return wd.a();
        }

        @Override // com.my.target.p.a
        public v d() {
            return vd.a();
        }
    }

    private zc(p.a aVar, n nVar, tb.a aVar2, hd hdVar, String str) {
        super(aVar, nVar, aVar2);
        this.h = hdVar;
        this.i = str;
    }

    public static p a(p.a aVar, n nVar, tb.a aVar2) {
        return new zc(aVar, nVar, aVar2, null, null);
    }

    public static p a(p.a aVar, hd hdVar, n nVar, tb.a aVar2) {
        return new zc(aVar, nVar, aVar2, hdVar, null);
    }

    public static p a(p.a aVar, String str, n nVar, tb.a aVar2) {
        return new zc(aVar, nVar, aVar2, null, str);
    }

    @Override // com.my.target.p
    protected void a(tb tbVar, jg jgVar) {
        s c = s.c();
        if (this.i != null) {
            hd hdVar = (hd) b((hd) this.a.d().a(this.i, y.b(""), this.h, this.b, this.c, tbVar, null, c), c);
            if (hdVar != null) {
                c = s.c();
            }
            a(hdVar, c, tbVar);
            return;
        }
        hd hdVar2 = this.h;
        if (hdVar2 != null) {
            hd hdVar3 = (hd) b(hdVar2, c);
            if (hdVar3 != null) {
                c = s.c();
            }
            a(hdVar3, c, tbVar);
            return;
        }
        super.a(tbVar, jgVar);
    }
}
