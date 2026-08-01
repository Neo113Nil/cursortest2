package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class lo extends mz implements mo {
    public final /* synthetic */ int t = 1;
    public final q4 u;
    public final to v;
    public Object w;

    public lo(q4 q4Var, to toVar, zc0 zc0Var) {
        this.u = q4Var;
        this.v = toVar;
        this.w = zc0Var;
    }

    public static boolean b0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean c0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(ra0.d(j), ra0.e(j));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.u50
    public final Object a(qu quVar, Object obj) {
        switch (this.t) {
        }
        return quVar.invoke(obj, this);
    }

    @Override // defpackage.mo
    public final void b(r10 r10Var) {
        boolean z;
        RecordingCanvas beginRecording;
        float f;
        boolean z2;
        float f2;
        float f3;
        int i = this.t;
        q4 q4Var = this.u;
        to toVar = this.v;
        switch (i) {
            case 0:
                id0 id0Var = ((zc0) this.w).b;
                nc ncVar = r10Var.d;
                q4Var.l(ncVar.e.r());
                if (fr0.f(ncVar.e.r())) {
                    r10Var.b();
                    return;
                }
                r10Var.b();
                q4Var.f.getValue();
                Canvas a = p2.a(ncVar.e.p());
                boolean f4 = to.f(toVar.f);
                c10 c10Var = c10.d;
                if (f4) {
                    z = c0(270.0f, mz.o(-fr0.c(r10Var.c()), r10Var.o(r10Var.getLayoutDirection() == c10Var ? id0Var.a : id0Var.c)), toVar.c(), a);
                } else {
                    z = false;
                }
                if (to.f(toVar.d)) {
                    z = c0(0.0f, mz.o(0.0f, r10Var.o(id0Var.b)), toVar.e(), a) || z;
                }
                if (to.f(toVar.g)) {
                    EdgeEffect d = toVar.d();
                    z = c0(90.0f, mz.o(0.0f, r10Var.o(r10Var.getLayoutDirection() == c10Var ? id0Var.c : id0Var.a) + (-((float) a50.H(fr0.e(r10Var.c()))))), d, a) || z;
                }
                if (to.f(toVar.e)) {
                    z = c0(180.0f, mz.o(-fr0.e(r10Var.c()), (-fr0.c(r10Var.c())) + r10Var.o(id0Var.d)), toVar.b(), a) || z;
                }
                if (z) {
                    q4Var.c();
                    return;
                }
                return;
            default:
                nc ncVar2 = r10Var.d;
                q4Var.l(ncVar2.e.r());
                t7 t7Var = ncVar2.e;
                t7 t7Var2 = ncVar2.e;
                if (fr0.f(t7Var.r())) {
                    r10Var.b();
                    return;
                }
                q4Var.f.getValue();
                u50 u50Var = td.a;
                float o = r10Var.o(30.0f);
                Canvas a2 = p2.a(t7Var2.p());
                boolean z3 = to.f(toVar.d) || to.g(toVar.h) || to.f(toVar.e) || to.g(toVar.i);
                boolean z4 = to.f(toVar.f) || to.g(toVar.j) || to.f(toVar.g) || to.g(toVar.k);
                if (z3 && z4) {
                    d0().setPosition(0, 0, a2.getWidth(), a2.getHeight());
                } else if (z3) {
                    d0().setPosition(0, 0, (a50.H(o) * 2) + a2.getWidth(), a2.getHeight());
                } else {
                    if (!z4) {
                        r10Var.b();
                        return;
                    }
                    d0().setPosition(0, 0, a2.getWidth(), (a50.H(o) * 2) + a2.getHeight());
                }
                beginRecording = d0().beginRecording();
                if (to.g(toVar.j)) {
                    EdgeEffect edgeEffect = toVar.j;
                    if (edgeEffect == null) {
                        edgeEffect = toVar.a();
                        toVar.j = edgeEffect;
                    }
                    b0(90.0f, edgeEffect, beginRecording);
                    edgeEffect.finish();
                }
                boolean f5 = to.f(toVar.f);
                r7 r7Var = r7.a;
                if (f5) {
                    EdgeEffect c = toVar.c();
                    z2 = b0(270.0f, c, beginRecording);
                    if (to.g(toVar.f)) {
                        float e = ra0.e(q4Var.b());
                        EdgeEffect edgeEffect2 = toVar.j;
                        if (edgeEffect2 == null) {
                            edgeEffect2 = toVar.a();
                            toVar.j = edgeEffect2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float b = i2 >= 31 ? r7Var.b(c) : 0.0f;
                        f = o;
                        float f6 = 1.0f - e;
                        if (i2 >= 31) {
                            r7Var.c(edgeEffect2, b, f6);
                        } else {
                            edgeEffect2.onPull(b, f6);
                        }
                    } else {
                        f = o;
                    }
                } else {
                    f = o;
                    z2 = false;
                }
                if (to.g(toVar.h)) {
                    EdgeEffect edgeEffect3 = toVar.h;
                    if (edgeEffect3 == null) {
                        edgeEffect3 = toVar.a();
                        toVar.h = edgeEffect3;
                    }
                    b0(180.0f, edgeEffect3, beginRecording);
                    edgeEffect3.finish();
                }
                if (to.f(toVar.d)) {
                    EdgeEffect e2 = toVar.e();
                    z2 = b0(0.0f, e2, beginRecording) || z2;
                    if (to.g(toVar.d)) {
                        float d2 = ra0.d(q4Var.b());
                        EdgeEffect edgeEffect4 = toVar.h;
                        if (edgeEffect4 == null) {
                            edgeEffect4 = toVar.a();
                            toVar.h = edgeEffect4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float b2 = i3 >= 31 ? r7Var.b(e2) : 0.0f;
                        if (i3 >= 31) {
                            r7Var.c(edgeEffect4, b2, d2);
                        } else {
                            edgeEffect4.onPull(b2, d2);
                        }
                    }
                }
                if (to.g(toVar.k)) {
                    EdgeEffect edgeEffect5 = toVar.k;
                    if (edgeEffect5 == null) {
                        edgeEffect5 = toVar.a();
                        toVar.k = edgeEffect5;
                    }
                    b0(270.0f, edgeEffect5, beginRecording);
                    edgeEffect5.finish();
                }
                if (to.f(toVar.g)) {
                    EdgeEffect d3 = toVar.d();
                    z2 = b0(90.0f, d3, beginRecording) || z2;
                    if (to.g(toVar.g)) {
                        float e3 = ra0.e(q4Var.b());
                        EdgeEffect edgeEffect6 = toVar.k;
                        if (edgeEffect6 == null) {
                            edgeEffect6 = toVar.a();
                            toVar.k = edgeEffect6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float b3 = i4 >= 31 ? r7Var.b(d3) : 0.0f;
                        if (i4 >= 31) {
                            r7Var.c(edgeEffect6, b3, e3);
                        } else {
                            edgeEffect6.onPull(b3, e3);
                        }
                    }
                }
                if (to.g(toVar.i)) {
                    EdgeEffect edgeEffect7 = toVar.i;
                    if (edgeEffect7 == null) {
                        edgeEffect7 = toVar.a();
                        toVar.i = edgeEffect7;
                    }
                    b0(0.0f, edgeEffect7, beginRecording);
                    edgeEffect7.finish();
                }
                if (to.f(toVar.e)) {
                    EdgeEffect b4 = toVar.b();
                    boolean z5 = b0(180.0f, b4, beginRecording) || z2;
                    if (to.g(toVar.e)) {
                        float d4 = ra0.d(q4Var.b());
                        EdgeEffect edgeEffect8 = toVar.i;
                        if (edgeEffect8 == null) {
                            edgeEffect8 = toVar.a();
                            toVar.i = edgeEffect8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float b5 = i5 >= 31 ? r7Var.b(b4) : 0.0f;
                        float f7 = 1.0f - d4;
                        if (i5 >= 31) {
                            r7Var.c(edgeEffect8, b5, f7);
                        } else {
                            edgeEffect8.onPull(b5, f7);
                        }
                    }
                    z2 = z5;
                }
                if (z2) {
                    q4Var.c();
                }
                float f8 = z4 ? 0.0f : f;
                float f9 = z3 ? 0.0f : f;
                c10 layoutDirection = r10Var.getLayoutDirection();
                o2 o2Var = new o2();
                o2Var.a = beginRecording;
                long r = t7Var2.r();
                t7 t7Var3 = ncVar2.e;
                mc mcVar = ((nc) t7Var3.g).d;
                sl slVar = mcVar.a;
                c10 c10Var2 = mcVar.b;
                kc p = t7Var3.p();
                long r2 = ncVar2.e.r();
                t7 t7Var4 = ncVar2.e;
                nv nvVar = (nv) t7Var4.f;
                t7Var4.z(r10Var);
                t7Var4.A(layoutDirection);
                t7Var4.y(o2Var);
                t7Var4.B(r);
                t7Var4.f = null;
                o2Var.i();
                try {
                    ((p01) ncVar2.e.e).v(f8, f9);
                    try {
                        r10Var.b();
                        o2Var.g();
                        t7 t7Var5 = ncVar2.e;
                        t7Var5.z(slVar);
                        t7Var5.A(c10Var2);
                        t7Var5.y(p);
                        t7Var5.B(r2);
                        t7Var5.f = nvVar;
                        d0().endRecording();
                        int save = a2.save();
                        a2.translate(f2, f3);
                        a2.drawRenderNode(d0());
                        a2.restoreToCount(save);
                        return;
                    } finally {
                        ((p01) ncVar2.e.e).v(-f8, -f9);
                    }
                } catch (Throwable th) {
                    o2Var.g();
                    t7 t7Var6 = ncVar2.e;
                    t7Var6.z(slVar);
                    t7Var6.A(c10Var2);
                    t7Var6.y(p);
                    t7Var6.B(r2);
                    t7Var6.f = nvVar;
                    throw th;
                }
        }
    }

    @Override // defpackage.u50
    public final /* synthetic */ u50 c(u50 u50Var) {
        int i = this.t;
        return y6.d(this, u50Var);
    }

    public RenderNode d0() {
        RenderNode renderNode = (RenderNode) this.w;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode e = n2.e();
        this.w = e;
        return e;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // defpackage.u50
    public final boolean e(mu muVar) {
        switch (this.t) {
        }
        return ((Boolean) muVar.c(this)).booleanValue();
    }

    public lo(q4 q4Var, to toVar) {
        this.u = q4Var;
        this.v = toVar;
    }
}
