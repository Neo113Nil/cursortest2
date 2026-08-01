package defpackage;

import android.os.Build;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class w4 implements mv {
    public static boolean f = true;
    public boolean a;
    public Object b;
    public Object c = mz.f();
    public Object d = new ArrayList();
    public Object e;

    public w4(boolean z, bu buVar) {
        this.a = z;
        this.b = buVar;
    }

    @Override // defpackage.mv
    public void a(nv nvVar) {
        synchronized (this.c) {
            if (!nvVar.s) {
                nvVar.s = true;
                nvVar.b();
            }
        }
    }

    @Override // defpackage.mv
    public nv b() {
        ov vvVar;
        ov ovVar;
        nv nvVar;
        synchronized (this.c) {
            try {
                f3 f3Var = (f3) this.b;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    f3Var.getUniqueDrawingId();
                }
                if (i >= 29) {
                    ovVar = new tv();
                } else {
                    if (f) {
                        try {
                            vvVar = new rv((f3) this.b, new oc(), new nc());
                        } catch (Throwable unused) {
                            f = false;
                            vvVar = new vv(e((f3) this.b));
                        }
                    } else {
                        vvVar = new vv(e((f3) this.b));
                    }
                    ovVar = vvVar;
                }
                nvVar = new nv(ovVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return nvVar;
    }

    public void c(r10 r10Var, float f2, long j) {
        float floatValue = ((Number) ((b6) this.c).c()).floatValue();
        if (floatValue > 0.0f) {
            long b = ge.b(j, floatValue);
            if (!this.a) {
                y6.m(r10Var, b, f2, 0L, 124);
                return;
            }
            float e = fr0.e(r10Var.c());
            float c = fr0.c(r10Var.c());
            t7 t7Var = r10Var.d.e;
            long r = t7Var.r();
            t7Var.p().i();
            ((t7) ((p01) t7Var.e).e).p().d(0.0f, 0.0f, e, c, 1);
            y6.m(r10Var, b, f2, 0L, 124);
            t7Var.p().g();
            t7Var.B(r);
        }
    }

    public void d(kz kzVar, bk bkVar) {
        ArrayList arrayList = (ArrayList) this.d;
        boolean z = kzVar instanceof ow;
        if (z) {
            arrayList.add(kzVar);
        } else if (kzVar instanceof pw) {
            arrayList.remove(((pw) kzVar).a);
        } else if (kzVar instanceof gs) {
            arrayList.add(kzVar);
        } else if (kzVar instanceof hs) {
            arrayList.remove(((hs) kzVar).a);
        } else if (kzVar instanceof eo) {
            arrayList.add(kzVar);
        } else if (kzVar instanceof fo) {
            arrayList.remove(((fo) kzVar).a);
        } else if (!(kzVar instanceof co)) {
            return;
        } else {
            arrayList.remove(((co) kzVar).a);
        }
        kz kzVar2 = (kz) zd.i0(arrayList);
        if (nz.l((kz) this.e, kzVar2)) {
            return;
        }
        kj kjVar = null;
        if (kzVar2 != null) {
            el0 el0Var = (el0) ((bu) this.b).a();
            float f2 = z ? el0Var.c : kzVar instanceof gs ? el0Var.b : kzVar instanceof eo ? el0Var.a : 0.0f;
            ox0 ox0Var = ol0.a;
            if (!(kzVar2 instanceof ow)) {
                if (kzVar2 instanceof gs) {
                    ox0Var = new ox0(45, 0, so.b);
                } else if (kzVar2 instanceof eo) {
                    ox0Var = new ox0(45, 0, so.b);
                }
            }
            d31.E(bkVar, null, new v80(this, f2, ox0Var, (kj) null), 3);
        } else {
            kz kzVar3 = (kz) this.e;
            ox0 ox0Var2 = ol0.a;
            if (!(kzVar3 instanceof ow) && !(kzVar3 instanceof gs) && (kzVar3 instanceof eo)) {
                ox0Var2 = new ox0(150, 0, so.b);
            }
            d31.E(bkVar, null, new c(this, ox0Var2, kjVar, 13), 3);
        }
        this.e = kzVar2;
    }

    public ko e(f3 f3Var) {
        j01 j01Var = (j01) this.d;
        if (j01Var != null) {
            return j01Var;
        }
        j01 j01Var2 = new j01(f3Var.getContext());
        j01Var2.setClipChildren(false);
        j01Var2.setClipToPadding(false);
        j01Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        f3Var.addView(j01Var2, -1);
        this.d = j01Var2;
        return j01Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int f(j3 j3Var, f3 f3Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        hw hwVar = (hw) this.c;
        kw kwVar = (kw) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            j3 r = ((p01) this.d).r(j3Var, f3Var);
            b40 b40Var = (b40) r.e;
            int c = b40Var.c();
            for (int i3 = 0; i3 < c; i3++) {
                wg0 wg0Var = (wg0) b40Var.d(i3);
                if (!wg0Var.d && !wg0Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int c2 = b40Var.c();
            for (int i4 = 0; i4 < c2; i4++) {
                wg0 wg0Var2 = (wg0) b40Var.d(i4);
                if (objArr != false || rg0.c(wg0Var2)) {
                    ((p10) this.b).t(wg0Var2.c, (kw) this.e, wg0Var2.i, true);
                    if (!kwVar.d.g()) {
                        hwVar.a(wg0Var2.a, kwVar, rg0.c(wg0Var2));
                        kwVar.clear();
                    }
                }
            }
            boolean b = hwVar.b(r, z);
            int c3 = b40Var.c();
            int i5 = 0;
            while (true) {
                if (i5 >= c3) {
                    i = 0;
                    break;
                }
                wg0 wg0Var3 = (wg0) b40Var.d(i5);
                if (!ra0.b(rg0.q(wg0Var3, true), 0L) && wg0Var3.b()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int c4 = b40Var.c();
            int i6 = 0;
            while (true) {
                if (i6 >= c4) {
                    i2 = 0;
                    break;
                }
                if (((wg0) b40Var.d(i6)).b()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (b ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }
}
