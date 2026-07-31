package com.my.target;

import com.my.target.p;
import com.my.target.tb;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class v6 extends p {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a implements p.a {
        private final int a;

        a(int i) {
            this.a = i;
        }

        @Override // com.my.target.p.a
        public boolean a() {
            return false;
        }

        @Override // com.my.target.p.a
        public z b() {
            return y6.a(this.a);
        }

        @Override // com.my.target.p.a
        public w c() {
            return null;
        }

        @Override // com.my.target.p.a
        public v d() {
            return w6.a(this.a);
        }
    }

    private v6(n nVar, int i, tb.a aVar) {
        super(new a(i), nVar, aVar);
    }

    public static p a(n nVar, tb.a aVar, int i) {
        return new v6(nVar, i, aVar);
    }
}
