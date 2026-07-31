package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class uc extends b {
    private String X;
    private String Y;
    private String Z;
    private String a0;

    private uc(w0 w0Var, sh shVar) {
        super(w0Var, shVar, null);
    }

    public static uc a(sc scVar, sh shVar) {
        uc ucVar = new uc(scVar.f(), shVar);
        ucVar.d = scVar.d;
        ucVar.p = scVar.p;
        ucVar.H = scVar.H;
        ucVar.I = scVar.I;
        ucVar.y = scVar.y;
        ucVar.x = scVar.x;
        ucVar.J = scVar.J;
        ucVar.w = scVar.w;
        ucVar.j = scVar.j;
        ucVar.k = scVar.k;
        ucVar.o = scVar.o;
        ucVar.l = scVar.l;
        ucVar.n = scVar.n;
        return ucVar;
    }

    public void A(String str) {
        this.a0 = str;
    }

    public void B(String str) {
        this.Y = str;
    }

    @Override // com.my.target.b
    public String D() {
        return this.Z;
    }

    public String X() {
        return this.a0;
    }

    public String Y() {
        return this.Y;
    }

    @Override // com.my.target.b
    public void k(String str) {
        this.X = str;
    }

    @Override // com.my.target.b
    public String r() {
        return this.X;
    }

    @Override // com.my.target.b
    public void r(String str) {
        this.Z = str;
    }
}
