package com.my.target;

import com.facebook.share.internal.ShareConstants;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public class j7 extends com.my.target.b {
    private final n X;
    private b Y;
    private c Z;
    private d a0;
    private List b0;
    private String c0;
    private String d0;
    private List e0;
    private b8 f0;
    private rj g0;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class a extends com.my.target.b {
        private String X;
        private String Y;
        private String Z;
        private String a0;
        private String b0;

        private a() {
        }

        public static a a(j7 j7Var) {
            a aVar = new a();
            aVar.d = j7Var.d;
            aVar.p = j7Var.p;
            aVar.H = j7Var.H;
            aVar.I = j7Var.I;
            aVar.y = j7Var.y;
            aVar.x = j7Var.x;
            aVar.J = j7Var.J;
            aVar.w = j7Var.w;
            aVar.j = j7Var.j;
            aVar.k = j7Var.k;
            aVar.o = j7Var.o;
            aVar.l = j7Var.l;
            aVar.n = j7Var.n;
            return aVar;
        }

        public void A(String str) {
            this.X = str;
        }

        public void B(String str) {
            this.b0 = str;
        }

        public void C(String str) {
            this.Z = str;
        }

        @Override // com.my.target.b
        public String D() {
            return this.a0;
        }

        public String X() {
            return this.X;
        }

        public String Y() {
            return this.b0;
        }

        public String Z() {
            return this.Z;
        }

        @Override // com.my.target.b
        public void k(String str) {
            this.Y = str;
        }

        @Override // com.my.target.b
        public String r() {
            return this.Y;
        }

        @Override // com.my.target.b
        public void r(String str) {
            this.a0 = str;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class b extends com.my.target.b {
        private final String X;

        private b(String str) {
            this.X = str;
        }

        public static b a(j7 j7Var, String str) {
            b bVar = new b(str);
            bVar.G = j7Var.G;
            bVar.K = j7Var.K;
            bVar.J = j7Var.J;
            bVar.H = j7Var.H;
            bVar.I = j7Var.I;
            bVar.p = j7Var.p;
            bVar.y = j7Var.y;
            bVar.x = j7Var.x;
            return bVar;
        }

        public String X() {
            return this.X;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class c extends com.my.target.b {
        private final String X;

        private c(String str) {
            this.X = str;
        }

        public static c A(String str) {
            return new c(str);
        }

        public String X() {
            return this.X;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class d extends com.my.target.b {
        public final String X;
        public final String Y;
        public final int Z;
        public final int a0;
        public final List b0;

        public d(String str, String str2, int i, int i2, List list) {
            this.X = str;
            this.Y = str2;
            this.Z = i;
            this.a0 = i2;
            this.b0 = list;
        }

        public static d a(String str, String str2, int i, int i2, List list) {
            return new d(str, str2, i, i2, list);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class e {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final String e;

        public e(String str, int i, int i2, int i3, String str2) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = str2;
        }
    }

    private j7(n nVar, w0 w0Var, rj rjVar) {
        super(w0Var, null, nVar.c());
        this.c0 = "unknown";
        this.d0 = "UNKNOWN";
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.X = nVar;
        if (Z() != null) {
            this.d0 = "HTML";
        } else if (y() != null) {
            this.d0 = ShareConstants.IMAGE_URL;
        }
        this.g0 = rjVar;
    }

    public static j7 a(n nVar, w0 w0Var, rj rjVar) {
        return new j7(nVar, w0Var, rjVar);
    }

    public void A(String str) {
        this.c0 = str;
    }

    public List X() {
        return this.e0;
    }

    public n Y() {
        return this.X;
    }

    public c Z() {
        return this.Z;
    }

    public String a0() {
        return this.c0;
    }

    public void b(List list) {
        this.e0 = list;
    }

    public d b0() {
        return this.a0;
    }

    public void c(List list) {
        this.b0 = list;
    }

    public b c0() {
        return this.Y;
    }

    public List d0() {
        return this.b0;
    }

    public String e0() {
        return this.d0;
    }

    public Float f0() {
        return this.j;
    }

    public Integer g0() {
        return this.k;
    }

    public b8 h0() {
        return this.f0;
    }

    public rj i0() {
        return this.g0;
    }

    public void a(b bVar) {
        this.Y = bVar;
    }

    public void a(c cVar) {
        this.Z = cVar;
    }

    public void a(d dVar) {
        this.a0 = dVar;
    }

    public void a(b8 b8Var) {
        this.f0 = b8Var;
    }
}
