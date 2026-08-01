package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.layout.b;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class y3 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(int i, Object obj, Object obj2) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    private final Object d(Object obj) {
        p5 p5Var = (p5) this.f;
        q5 q5Var = (q5) this.g;
        synchronized (p5Var.h) {
            p5Var.j.remove(q5Var);
        }
        return ky0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0399, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj) {
        er erVar;
        g20 lifecycle;
        Object[] objArr;
        int i = 7;
        int i2 = 3;
        View view = null;
        int i3 = 1;
        switch (this.e) {
            case 0:
                Context context = (Context) this.f;
                Context applicationContext = context.getApplicationContext();
                z3 z3Var = (z3) this.g;
                applicationContext.registerComponentCallbacks(z3Var);
                return new x3(r7 ? 1 : 0, context, z3Var);
            case 1:
                Context context2 = (Context) this.f;
                Context applicationContext2 = context2.getApplicationContext();
                a4 a4Var = (a4) this.g;
                applicationContext2.registerComponentCallbacks(a4Var);
                return new x3(i3, context2, a4Var);
            case 2:
                return d(obj);
            case 3:
                ((Choreographer) ((r5) this.f).e).removeFrameCallback((q5) this.g);
                return ky0.a;
            case 4:
                xf0 xf0Var = (xf0) obj;
                yf0 yf0Var = (yf0) this.f;
                float g = ((fj) this.g).c.g();
                xf0Var.getClass();
                xf0.b(xf0Var, yf0Var);
                yf0Var.M(bz.c(0L, yf0Var.h), g, null);
                return ky0.a;
            case 5:
                yw0 yw0Var = (yw0) obj;
                a70 a70Var = ((p6) this.f).d;
                bt0 bt0Var = (bt0) a70Var.g(yw0Var.b());
                long j = bt0Var != null ? ((iz) bt0Var.getValue()).a : 0L;
                bt0 bt0Var2 = (bt0) a70Var.g(yw0Var.c());
                long j2 = bt0Var2 != null ? ((iz) bt0Var2.getValue()).a : 0L;
                hr0 hr0Var = (hr0) ((o6) this.g).b.getValue();
                return (hr0Var == null || (erVar = (er) hr0Var.a.invoke(new iz(j), new iz(j2))) == null) ? nk.K(7, null) : erVar;
            case 6:
                xf0.m((xf0) obj, (yf0) this.f, ((r9) this.g).r);
                return ky0.a;
            case 7:
                r10 r10Var = (r10) obj;
                r10Var.b();
                y6.o(r10Var, ((uc0) this.f).a, (px0) this.g, 0.0f, null, 60);
                return ky0.a;
            case 8:
                r10 r10Var2 = (r10) obj;
                r10Var2.b();
                y6.o(r10Var2, (e5) this.f, (px0) this.g, 0.0f, null, 60);
                return ky0.a;
            case 9:
                ((l70) ((p01) this.f).e).i((bj) this.g);
                return ky0.a;
            case 10:
                pz0 pz0Var = (pz0) this.f;
                oz0 oz0Var = pz0Var.b;
                oz0 oz0Var2 = pz0Var.a;
                ch0.a(pz0Var, (wg0) obj);
                qo0 qo0Var = (qo0) this.g;
                float a = ((e01) mz.A(qo0Var, hi.s)).a();
                long b = rg0.b(a, a);
                if (mz0.b(b) <= 0.0f || mz0.c(b) <= 0.0f) {
                    cy.b("maximumVelocity should be a positive value. You specified=" + ((Object) mz0.f(b)));
                }
                long b2 = rg0.b(oz0Var2.b(mz0.b(b)), oz0Var.b(mz0.c(b)));
                kk[] kkVarArr = oz0Var2.c;
                Arrays.fill(kkVarArr, 0, kkVarArr.length, (Object) null);
                oz0Var2.d = 0;
                kk[] kkVarArr2 = oz0Var.c;
                Arrays.fill(kkVarArr2, 0, kkVarArr2.length, (Object) null);
                oz0Var.d = 0;
                pz0Var.c = 0L;
                eb ebVar = qo0Var.x;
                if (ebVar != null) {
                    int i4 = ho.a;
                    ebVar.r(new rn(rg0.b(Float.isNaN(mz0.b(b2)) ? 0.0f : mz0.b(b2), Float.isNaN(mz0.c(b2)) ? 0.0f : mz0.c(b2))));
                }
                return ky0.a;
            case 11:
                View view2 = (View) obj;
                View view3 = (View) this.f;
                fs fsVar = new fs(view2.getNextFocusForwardId());
                View view4 = null;
                while (true) {
                    View B = x40.B(view2, fsVar, view4);
                    if (B == null && view2 != view3) {
                        ViewParent parent = view2.getParent();
                        if (parent != null && (parent instanceof View)) {
                            View view5 = (View) parent;
                            view4 = view2;
                            view2 = view5;
                        }
                    }
                }
                return Boolean.valueOf(view == ((View) this.g));
            case 12:
                ((r60) this.f).b((kz) this.g);
                return ky0.a;
            case 13:
                zx zxVar = (zx) this.f;
                xx xxVar = (xx) this.g;
                zxVar.a.b(xxVar);
                zxVar.b.setValue(Boolean.TRUE);
                return new x3(i2, zxVar, xxVar);
            case 14:
                d90 d90Var = (d90) obj;
                s80 s80Var = (s80) this.g;
                d90Var.getClass();
                b90 b90Var = d90Var.a;
                b90Var.e = 0;
                b90Var.f = 0;
                m80 m80Var = (m80) this.f;
                if (m80Var instanceof p80) {
                    int i5 = m80.l;
                    Iterator it = kq0.z(m80Var, j80.f).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            m80 m80Var2 = (m80) it.next();
                            y70 y70Var = (y70) s80Var.g.f();
                            m80 m80Var3 = y70Var != null ? y70Var.e : null;
                            if (nz.l(m80Var2, m80Var3 != null ? m80Var3.e : null)) {
                            }
                        } else {
                            int i6 = p80.q;
                            p80 p80Var = s80Var.c;
                            if (p80Var == null) {
                                g8.s("You must call setGraph() before calling getGraph()");
                                return null;
                            }
                            Iterator it2 = kq0.z(p80Var, j80.g).iterator();
                            if (!it2.hasNext()) {
                                g8.e("Sequence is empty.");
                                return null;
                            }
                            Object next = it2.next();
                            while (it2.hasNext()) {
                                next = it2.next();
                            }
                            d90Var.b = ((m80) next).i;
                            d90Var.d = false;
                            d90Var.e = true;
                        }
                    }
                }
                return ky0.a;
            case 15:
                s80 s80Var2 = (s80) this.f;
                o20 o20Var = (o20) this.g;
                s80Var2.getClass();
                o20Var.getClass();
                h50 h50Var = s80Var2.s;
                if (!o20Var.equals(s80Var2.o)) {
                    o20 o20Var2 = s80Var2.o;
                    if (o20Var2 != null && (lifecycle = o20Var2.getLifecycle()) != null) {
                        lifecycle.b(h50Var);
                    }
                    s80Var2.o = o20Var;
                    o20Var.getLifecycle().a(h50Var);
                }
                return new u80(0);
            case 16:
                return new x3(4, (bt0) this.f, (rg) this.g);
            case 17:
                c40 c40Var = (c40) obj;
                jm0 jm0Var = (jm0) this.f;
                if (jm0Var.r.j.g() > 0) {
                    c40Var.d = true;
                    f40 f40Var = c40Var.g;
                    b10 X = f40Var.X();
                    if (bz.a(c40Var.e, 9223372034707292159L)) {
                        c40Var.e = nz.c0(X.b(0L));
                        c40Var.f = X.A();
                    }
                    f40Var.Z().G.b();
                    long A = X.A();
                    a70 a70Var2 = ((py) this.g).i;
                    int i7 = (int) (A >> 32);
                    int i8 = (int) (A & 4294967295L);
                    for (l21 l21Var : b.b) {
                        Object g2 = a70Var2.g(l21Var);
                        g2.getClass();
                        u21 u21Var = (u21) g2;
                        b.a(c40Var, ((m21) l21Var).c, u21Var.h, i7, i8);
                        if (((Boolean) u21Var.b.getValue()).booleanValue()) {
                            b.a(c40Var, u21Var.f, u21Var.j, i7, i8);
                            b.a(c40Var, u21Var.g, u21Var.k, i7, i8);
                        }
                        b.a(c40Var, ((m21) l21Var).d, u21Var.i, i7, i8);
                    }
                    if (jm0Var.r.k.h()) {
                        x60 x60Var = jm0Var.r.k;
                        Object[] objArr2 = x60Var.a;
                        int i9 = x60Var.b;
                        for (int i10 = 0; i10 < i9; i10++) {
                            f70 f70Var = (f70) objArr2[i10];
                            jy jyVar = (jy) jm0Var.r.l.get(i10);
                            Rect rect = (Rect) f70Var.getValue();
                            c40Var.b(jyVar.b(), rect.left);
                            c40Var.b(jyVar.d(), rect.top);
                            c40Var.b(jyVar.c(), rect.right);
                            c40Var.b(jyVar.a(), rect.bottom);
                        }
                    }
                }
                return ky0.a;
            case 18:
                xo0 xo0Var = (xo0) this.f;
                zo0 zo0Var = (zo0) this.g;
                long j3 = ((pn) obj).a;
                long a2 = zo0Var.d == sc0.e ? ra0.a(j3, 1) : ra0.a(j3, 2);
                zo0 zo0Var2 = xo0Var.a;
                zo0Var2.g = 1;
                bd0 bd0Var = zo0Var2.b;
                if (bd0Var == null || !(zo0Var2.a.d() || zo0Var2.a.a())) {
                    zo0.a(zo0Var2, zo0Var2.h, a2, 1);
                } else {
                    bd0Var.h(a2, zo0Var2.g, zo0Var2.j);
                }
                return ky0.a;
            case 19:
                xf0.m((xf0) obj, (yf0) this.f, ((er0) this.g).C);
                return ky0.a;
            case 20:
                d31.E((bk) this.f, null, new v80((cx0) this.g, null), 1);
                return new u80(1);
            case 21:
                cx0 cx0Var = (cx0) this.f;
                cx0 cx0Var2 = (cx0) this.g;
                cx0Var.j.add(cx0Var2);
                return new x3(6, cx0Var, cx0Var2);
            case 22:
                return new x3(i, (cx0) this.f, (xw0) this.g);
            case 23:
                ((Number) obj).longValue();
                uy0 uy0Var = (uy0) this.f;
                float f = uy0Var.e;
                uy0Var.e = 0.0f;
                ((mu) this.g).c(Float.valueOf(f));
                return ky0.a;
            case 24:
                i21 i21Var = (i21) this.f;
                View view6 = (View) this.g;
                qy qyVar = i21Var.t;
                if (i21Var.s == 0) {
                    int i11 = c01.a;
                    xz0.b(view6, qyVar);
                    if (view6.isAttachedToWindow()) {
                        view6.requestApplyInsets();
                    }
                    view6.addOnAttachStateChangeListener(qyVar);
                    c01.a(view6, qyVar);
                }
                i21Var.s++;
                return new x3(8, i21Var, view6);
            default:
                y2 y2Var = (y2) obj;
                qu quVar = (qu) this.g;
                a31 a31Var = (a31) this.f;
                if (!a31Var.f) {
                    g20 lifecycle2 = y2Var.a.getLifecycle();
                    a31Var.h = quVar;
                    if (a31Var.g == null) {
                        a31Var.g = lifecycle2;
                        lifecycle2.a(a31Var);
                    } else if (((q20) lifecycle2).c.compareTo(f20.f) >= 0) {
                        bi biVar = a31Var.e;
                        eg egVar = new eg(1330788943, true, new z21(a31Var, quVar, i3));
                        synchronized (biVar.g) {
                            objArr = biVar.x == 1;
                            if (objArr != false) {
                                biVar.x = 0;
                            }
                        }
                        int i12 = biVar.x;
                        if (i12 != 0) {
                            gh0.b(i12 != 1 ? i12 != 2 ? i12 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
                        }
                        if (objArr == true) {
                            qh qhVar = biVar.w;
                            qhVar.y = 100;
                            qhVar.x = true;
                            biVar.d.a(biVar, egVar);
                            if (qhVar.E || qhVar.y != 100) {
                                gh0.a("Cannot disable reuse from root if it was caused by other groups");
                            }
                            qhVar.y = -1;
                            qhVar.x = false;
                        } else {
                            biVar.d.a(biVar, egVar);
                        }
                    }
                }
                return ky0.a;
        }
    }
}
