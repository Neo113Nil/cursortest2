package androidx.compose.ui.graphics;

import defpackage.ea0;
import defpackage.er0;
import defpackage.f2;
import defpackage.ge;
import defpackage.nz;
import defpackage.rq0;
import defpackage.t50;
import defpackage.uw0;
import defpackage.y6;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class GraphicsLayerElement extends z50 {
    public final float a;
    public final long b;
    public final rq0 c;
    public final boolean d;
    public final long e;
    public final long f;

    public GraphicsLayerElement(float f, long j, rq0 rq0Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = j;
        this.c = rq0Var;
        this.d = z;
        this.e = j2;
        this.f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.a, graphicsLayerElement.a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && uw0.a(this.b, graphicsLayerElement.b) && nz.l(this.c, graphicsLayerElement.c) && this.d == graphicsLayerElement.d && ge.c(this.e, graphicsLayerElement.e) && ge.c(this.f, graphicsLayerElement.f);
    }

    @Override // defpackage.z50
    public final t50 f() {
        er0 er0Var = new er0();
        er0Var.r = 1.0f;
        er0Var.s = 1.0f;
        er0Var.t = 1.0f;
        er0Var.u = this.a;
        er0Var.v = 8.0f;
        er0Var.w = this.b;
        er0Var.x = this.c;
        er0Var.y = this.d;
        er0Var.z = this.e;
        er0Var.A = this.f;
        er0Var.B = 3;
        er0Var.C = new f2(23, er0Var);
        return er0Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        er0 er0Var = (er0) t50Var;
        er0Var.r = 1.0f;
        er0Var.s = 1.0f;
        er0Var.t = 1.0f;
        er0Var.u = this.a;
        er0Var.v = 8.0f;
        er0Var.w = this.b;
        er0Var.x = this.c;
        er0Var.y = this.d;
        er0Var.z = this.e;
        er0Var.A = this.f;
        er0Var.B = 3;
        ea0 ea0Var = nz.Y(er0Var, 2).s;
        if (ea0Var != null) {
            ea0Var.S0(er0Var.C, true);
        }
    }

    public final int hashCode() {
        int t = y6.t(8.0f, y6.t(0.0f, y6.t(0.0f, y6.t(0.0f, y6.t(this.a, y6.t(0.0f, y6.t(0.0f, y6.t(1.0f, y6.t(1.0f, Float.floatToIntBits(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = uw0.c;
        long j = this.b;
        return (((ge.i(this.f) + ((ge.i(this.e) + ((((this.c.hashCode() + ((((int) (j ^ (j >>> 32))) + t) * 31)) * 31) + (this.d ? 1231 : 1237)) * 961)) * 31)) * 961) + 3) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=1.0, translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.a);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) uw0.b(this.b));
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", clip=");
        sb.append(this.d);
        sb.append(", renderEffect=null, ambientShadowColor=");
        y6.z(this.e, sb, ", spotShadowColor=");
        sb.append((Object) ge.j(this.f));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) nz.g0(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
