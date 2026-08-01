package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import com.vectorharbor.planetvectorsurvey.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ch0 {
    public static long a;
    public static Method b;

    public static final void a(pz0 pz0Var, wg0 wg0Var) {
        oz0 oz0Var = pz0Var.b;
        oz0 oz0Var2 = pz0Var.a;
        boolean c = rg0.c(wg0Var);
        long j = wg0Var.b;
        long j2 = 0;
        if (c) {
            kk[] kkVarArr = oz0Var2.c;
            Arrays.fill(kkVarArr, 0, kkVarArr.length, (Object) null);
            oz0Var2.d = 0;
            kk[] kkVarArr2 = oz0Var.c;
            Arrays.fill(kkVarArr2, 0, kkVarArr2.length, (Object) null);
            oz0Var.d = 0;
            pz0Var.c = 0L;
        }
        if (!rg0.d(wg0Var)) {
            List list = wg0Var.k;
            if (list == null) {
                list = wp.d;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                gw gwVar = (gw) list.get(i);
                long j3 = gwVar.a;
                long h = ra0.h(gwVar.c, j2);
                oz0Var2.a(j3, Float.intBitsToFloat((int) (h >> 32)));
                oz0Var.a(j3, Float.intBitsToFloat((int) (h & 4294967295L)));
                i++;
                j2 = 0;
            }
            long h2 = ra0.h(wg0Var.l, 0L);
            oz0Var2.a(j, Float.intBitsToFloat((int) (h2 >> 32)));
            oz0Var.a(j, Float.intBitsToFloat((int) (h2 & 4294967295L)));
        }
        if (rg0.d(wg0Var) && j - pz0Var.c > 40) {
            kk[] kkVarArr3 = oz0Var2.c;
            Arrays.fill(kkVarArr3, 0, kkVarArr3.length, (Object) null);
            oz0Var2.d = 0;
            kk[] kkVarArr4 = oz0Var.c;
            Arrays.fill(kkVarArr4, 0, kkVarArr4.length, (Object) null);
            oz0Var.d = 0;
            pz0Var.c = 0L;
        }
        pz0Var.c = j;
    }

    public static void b(mr0 mr0Var, List list, bi biVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int c = mr0Var.c((h2) list.get(i));
            int L = mr0Var.L(mr0Var.b, mr0Var.q(c));
            Object obj = L < mr0Var.g(mr0Var.b, mr0Var.q(c + 1)) ? mr0Var.c[mr0Var.h(L)] : hh.a;
            ri0 ri0Var = obj instanceof ri0 ? (ri0) obj : null;
            if (ri0Var != null) {
                ri0Var.a = biVar;
            }
        }
    }

    public static float c(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static void d(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final float e(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final r01 f(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            r01 r01Var = tag instanceof r01 ? (r01) tag : null;
            if (r01Var != null) {
                return r01Var;
            }
            Object k = ud0.k(view);
            view = k instanceof View ? (View) k : null;
        }
        return null;
    }

    public static final dh0 g(View view) {
        dh0 dh0Var = (dh0) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (dh0Var != null) {
            return dh0Var;
        }
        dh0 dh0Var2 = new dh0();
        view.setTag(R.id.pooling_container_listener_holder_tag, dh0Var2);
        return dh0Var2;
    }

    public static final void h(pp0 pp0Var) {
        nz.a0(pp0Var).z();
    }

    public static boolean i() {
        if (Build.VERSION.SDK_INT >= 29) {
            return rw0.a();
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List j(mr0 mr0Var, int i, mr0 mr0Var2, boolean z, boolean z2, boolean z3) {
        wp wpVar;
        boolean z4;
        int i2;
        int i3;
        int s = mr0Var.s(i);
        int i4 = i + s;
        int f = mr0Var.f(i);
        int f2 = mr0Var.f(i4);
        int i5 = f2 - f;
        boolean z5 = i >= 0 && (mr0Var.b[(mr0Var.q(i) * 5) + 1] & 201326592) != 0;
        mr0Var2.u(s);
        mr0Var2.v(i5, mr0Var2.t);
        if (mr0Var.g < i4) {
            mr0Var.z(i4);
        }
        if (mr0Var.k < f2) {
            mr0Var.A(f2, i4);
        }
        int[] iArr = mr0Var2.b;
        int i6 = mr0Var2.t;
        int i7 = i6 * 5;
        p8.R(mr0Var.b, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = mr0Var2.c;
        int i8 = mr0Var2.i;
        System.arraycopy(mr0Var.c, f, objArr, i8, i5);
        int i9 = mr0Var2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + s;
        int g = i8 - mr0Var2.g(iArr, i6);
        int i12 = mr0Var2.m;
        int i13 = mr0Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int g2 = mr0Var2.g(iArr, i15) + g;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = mr0Var2.k;
            }
            iArr2[(i15 * 5) + 4] = mr0.i(g2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        mr0Var2.m = i14;
        int a2 = lr0.a(mr0Var.d, i, mr0Var.o());
        int a3 = lr0.a(mr0Var.d, i4, mr0Var.o());
        if (a2 < a3) {
            ArrayList arrayList = mr0Var.d;
            ArrayList arrayList2 = new ArrayList(a3 - a2);
            for (int i17 = a2; i17 < a3; i17++) {
                h2 h2Var = (h2) arrayList.get(i17);
                h2Var.a += i10;
                arrayList2.add(h2Var);
            }
            mr0Var2.d.addAll(lr0.a(mr0Var2.d, mr0Var2.t, mr0Var2.o()), arrayList2);
            arrayList.subList(a2, a3).clear();
            wpVar = arrayList2;
        } else {
            wpVar = wp.d;
        }
        if (!wpVar.isEmpty()) {
            HashMap hashMap = mr0Var.e;
            HashMap hashMap2 = mr0Var2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = wpVar.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = mr0Var2.v;
        mr0Var2.M(i9);
        int C = mr0Var.C(mr0Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = C >= 0;
            if (z7) {
                mr0Var.N();
                mr0Var.a(C - mr0Var.t);
                mr0Var.N();
            }
            mr0Var.a(i - mr0Var.t);
            boolean F = mr0Var.F();
            if (z7) {
                mr0Var.K();
                mr0Var.j();
                mr0Var.K();
                mr0Var.j();
            }
            z4 = F;
        } else {
            boolean G = mr0Var.G(i, s);
            mr0Var.H(f, i5, i - 1);
            z4 = G;
        }
        if (z4) {
            th.c("Unexpectedly removed anchors");
        }
        int i20 = mr0Var2.o;
        int i21 = iArr3[i7 + 1];
        mr0Var2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            mr0Var2.t = i11;
            mr0Var2.i = i8 + i5;
        }
        if (z6) {
            mr0Var2.R(i9);
        }
        return wpVar;
    }

    public static final void k(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            cy.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float e = e(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * e);
                }
            }
            float sqrt = (float) Math.sqrt(e(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : e(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float e2 = e(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    e2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = e2 / fArr11[i14];
        }
    }

    public static final Object l(yn0 yn0Var, yn0 yn0Var2, qu quVar) {
        Object jfVar;
        Object Q;
        try {
            px0.k(2, quVar);
            jfVar = quVar.invoke(yn0Var2, yn0Var);
        } catch (Throwable th) {
            jfVar = new jf(th, false);
        }
        ck ckVar = ck.d;
        if (jfVar == ckVar || (Q = yn0Var.Q(jfVar)) == nk.h) {
            return ckVar;
        }
        if (Q instanceof jf) {
            throw ((jf) Q).a;
        }
        return nk.R(Q);
    }
}
