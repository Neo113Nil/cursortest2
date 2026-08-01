package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class er0 extends t50 implements i10, pp0 {
    public long A;
    public int B;
    public f2 C;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public long w;
    public rq0 x;
    public boolean y;
    public long z;

    @Override // defpackage.pp0
    public final /* synthetic */ boolean M() {
        return false;
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // defpackage.t50
    public final boolean W() {
        return false;
    }

    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        yf0 d = b50Var.d(j);
        return f40Var.h0(d.d, d.e, xp.d, new y3(19, d, this));
    }

    @Override // defpackage.pp0
    public final boolean e() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.r);
        sb.append(", scaleY=");
        sb.append(this.s);
        sb.append(", alpha = ");
        sb.append(this.t);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.u);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.v);
        sb.append(", transformOrigin=");
        sb.append((Object) uw0.b(this.w));
        sb.append(", shape=");
        sb.append(this.x);
        sb.append(", clip=");
        sb.append(this.y);
        sb.append(", renderEffect=null, ambientShadowColor=");
        y6.z(this.z, sb, ", spotShadowColor=");
        y6.z(this.A, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) nz.g0(this.B));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // defpackage.pp0
    public final void v(np0 np0Var) {
    }
}
