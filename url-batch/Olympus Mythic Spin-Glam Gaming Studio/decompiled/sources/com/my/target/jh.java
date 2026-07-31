package com.my.target;

import com.my.target.p;
import com.my.target.tb;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class jh extends p {
    private final nh h;

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
            return mh.a();
        }

        @Override // com.my.target.p.a
        public v d() {
            return lh.a();
        }
    }

    private jh(n nVar, tb.a aVar, nh nhVar) {
        super(new a(), nVar, aVar);
        this.h = nhVar;
    }

    public static p a(n nVar, tb.a aVar) {
        return new jh(nVar, aVar, null);
    }

    public static p a(nh nhVar, n nVar, tb.a aVar) {
        return new jh(nVar, aVar, nhVar);
    }

    @Override // com.my.target.p
    protected void a(tb tbVar, jg jgVar) {
        s c = s.c();
        nh nhVar = this.h;
        if (nhVar != null) {
            nh nhVar2 = (nh) b(nhVar, c);
            if (nhVar2 != null) {
                c = s.c();
            }
            a(nhVar2, c, tbVar);
            return;
        }
        super.a(tbVar, jgVar);
    }
}
