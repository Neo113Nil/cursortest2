package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class eb extends z0 {
    private String A0;
    private fb y0;
    private String z0;

    protected eb(w0 w0Var, sh shVar) {
        super(w0Var, shVar);
    }

    public static eb B0() {
        return a(w0.d, null);
    }

    public static eb a(w0 w0Var, sh shVar) {
        return new eb(w0Var, shVar);
    }

    public static eb b(w0 w0Var, sh shVar) {
        return a(w0Var, shVar);
    }

    public fb A0() {
        return this.y0;
    }

    public void E(String str) {
        this.z0 = str;
    }

    public void F(String str) {
        this.A0 = str;
    }

    @Override // com.my.target.b
    public int R() {
        fb fbVar = this.y0;
        if (fbVar != null) {
            return fbVar.getWidth();
        }
        return 0;
    }

    @Override // com.my.target.b
    public int v() {
        fb fbVar = this.y0;
        if (fbVar != null) {
            return fbVar.getHeight();
        }
        return 0;
    }

    public String y0() {
        return this.z0;
    }

    public String z0() {
        return this.A0;
    }

    public void a(fb fbVar) {
        this.y0 = fbVar;
    }
}
