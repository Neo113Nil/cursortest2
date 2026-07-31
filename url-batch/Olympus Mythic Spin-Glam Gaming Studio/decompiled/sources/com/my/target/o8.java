package com.my.target;

import com.my.target.p;
import com.my.target.tb;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class o8 extends p {
    private final i9 h;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a implements p.a {
        private a() {
        }

        @Override // com.my.target.p.a
        public boolean a() {
            return true;
        }

        @Override // com.my.target.p.a
        public z b() {
            return z.a();
        }

        @Override // com.my.target.p.a
        public w c() {
            return h9.a();
        }

        @Override // com.my.target.p.a
        public v d() {
            return g9.a();
        }
    }

    private o8(n nVar, tb.a aVar, i9 i9Var) {
        super(new a(), nVar, aVar);
        this.h = i9Var;
    }

    public static p a(n nVar, tb.a aVar) {
        return new o8(nVar, aVar, null);
    }

    public static p a(i9 i9Var, n nVar, tb.a aVar) {
        return new o8(nVar, aVar, i9Var);
    }

    @Override // com.my.target.p
    protected void a(tb tbVar, jg jgVar) {
        if (this.h != null) {
            s c = s.c();
            i9 i9Var = (i9) b(this.h, c);
            if (i9Var != null) {
                c = s.c();
            }
            a(i9Var, c, tbVar);
            return;
        }
        super.a(tbVar, jgVar);
    }
}
