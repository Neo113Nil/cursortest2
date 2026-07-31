package com.my.target;

import com.my.target.p;
import com.my.target.tb;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class pd extends p {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a implements p.a {
        private a() {
        }

        @Override // com.my.target.p.a
        public boolean a() {
            return false;
        }

        @Override // com.my.target.p.a
        public z b() {
            return z.a();
        }

        @Override // com.my.target.p.a
        public w c() {
            return rd.a();
        }

        @Override // com.my.target.p.a
        public v d() {
            return qd.a();
        }
    }

    private pd(n nVar, tb.a aVar) {
        super(new a(), nVar, aVar);
    }

    public static p a(n nVar, tb.a aVar) {
        return new pd(nVar, aVar);
    }

    @Override // com.my.target.p
    protected a0 a(y yVar, Map map) {
        if (this.b.f() > 0) {
            mi.a("NativeAppwallAdFactory: Check cached data");
            z3 c = jg.c();
            String a2 = c != null ? c.a(this.b.j(), this.b.f()) : null;
            if (a2 != null) {
                mi.a("NativeAppwallAdFactory: Cached data loaded successfully");
                yVar.a(true);
                return new a0(null, a2);
            }
            mi.a("NativeAppwallAdFactory: No cached data");
        }
        return super.a(yVar, map);
    }
}
