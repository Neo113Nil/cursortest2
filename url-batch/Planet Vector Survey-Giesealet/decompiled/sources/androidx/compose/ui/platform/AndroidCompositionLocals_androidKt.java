package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.vectorharbor.planetvectorsurvey.R;
import defpackage.a4;
import defpackage.a50;
import defpackage.al;
import defpackage.cn;
import defpackage.dn;
import defpackage.dx;
import defpackage.ew;
import defpackage.f2;
import defpackage.f3;
import defpackage.f70;
import defpackage.g8;
import defpackage.hh;
import defpackage.hi;
import defpackage.ih;
import defpackage.ii0;
import defpackage.in0;
import defpackage.ji;
import defpackage.ki0;
import defpackage.ky0;
import defpackage.ln0;
import defpackage.lt0;
import defpackage.mu;
import defpackage.mz;
import defpackage.n30;
import defpackage.nz;
import defpackage.o1;
import defpackage.q30;
import defpackage.qf;
import defpackage.qh;
import defpackage.qu;
import defpackage.ri0;
import defpackage.rk0;
import defpackage.s5;
import defpackage.t3;
import defpackage.ud0;
import defpackage.v3;
import defpackage.w3;
import defpackage.xm0;
import defpackage.y2;
import defpackage.y3;
import defpackage.y7;
import defpackage.ym0;
import defpackage.z3;
import defpackage.zm0;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final ji a = new ji(t3.f);
    public static final lt0 b = new lt0(t3.g);
    public static final ji c = new ji(o1.j);
    public static final lt0 d = new lt0(t3.h);
    public static final lt0 e = new lt0(t3.i);
    public static final lt0 f = new lt0(t3.j);

    public static final void a(f3 f3Var, qu quVar, ih ihVar, int i) {
        char c2;
        boolean areAllPrimitivesSupported;
        LinkedHashMap linkedHashMap;
        boolean z;
        qh qhVar = (qh) ihVar;
        qhVar.W(-520299287);
        int i2 = (qhVar.h(f3Var) ? 4 : 2) | i | (qhVar.h(quVar) ? 32 : 16);
        if (qhVar.N(i2 & 1, (i2 & 19) != 18)) {
            Context context = f3Var.getContext();
            Object K = qhVar.K();
            y7 y7Var = hh.a;
            if (K == y7Var) {
                K = ud0.o(new Configuration(context.getResources().getConfiguration()));
                qhVar.e0(K);
            }
            f70 f70Var = (f70) K;
            Object K2 = qhVar.K();
            int i3 = 3;
            if (K2 == y7Var) {
                K2 = new f2(i3, f70Var);
                qhVar.e0(K2);
            }
            f3Var.setConfigurationChangeObserver((mu) K2);
            Object K3 = qhVar.K();
            if (K3 == y7Var) {
                K3 = new s5();
                qhVar.e0(K3);
            }
            s5 s5Var = (s5) K3;
            y2 viewTreeOwners = f3Var.getViewTreeOwners();
            if (viewTreeOwners == null) {
                g8.s("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            ln0 ln0Var = viewTreeOwners.b;
            Object K4 = qhVar.K();
            if (K4 == y7Var) {
                Object parent = f3Var.getParent();
                parent.getClass();
                View view = (View) parent;
                c2 = 3;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = xm0.class.getSimpleName() + ':' + str;
                in0 savedStateRegistry = ln0Var.getSavedStateRegistry();
                Bundle a2 = savedStateRegistry.a(str2);
                if (a2 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a2.keySet()) {
                        ArrayList parcelableArrayList = a2.getParcelableArrayList(str3);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str3, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                o1 o1Var = o1.t;
                lt0 lt0Var = zm0.a;
                ym0 ym0Var = new ym0(linkedHashMap, o1Var);
                try {
                    savedStateRegistry.c(str2, new qf(1, ym0Var));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                K4 = new cn(ym0Var, new dn(z, savedStateRegistry, str2));
                qhVar.e0(K4);
            } else {
                c2 = 3;
            }
            cn cnVar = (cn) K4;
            boolean h = qhVar.h(cnVar);
            Object K5 = qhVar.K();
            if (h || K5 == y7Var) {
                K5 = new f2(4, cnVar);
                qhVar.e0(K5);
            }
            mz.h(ky0.a, (mu) K5, qhVar);
            Object K6 = qhVar.K();
            if (K6 == y7Var) {
                if (Build.VERSION.SDK_INT >= 31) {
                    areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
                    if (areAllPrimitivesSupported) {
                        f3Var.getView();
                        K6 = new al();
                        qhVar.e0(K6);
                    }
                }
                K6 = new al();
                qhVar.e0(K6);
            }
            ew ewVar = (ew) K6;
            Configuration configuration = (Configuration) f70Var.getValue();
            Object K7 = qhVar.K();
            if (K7 == y7Var) {
                K7 = new dx();
                qhVar.e0(K7);
            }
            dx dxVar = (dx) K7;
            Object K8 = qhVar.K();
            Object obj = K8;
            if (K8 == y7Var) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                qhVar.e0(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object K9 = qhVar.K();
            if (K9 == y7Var) {
                K9 = new z3(configuration3, dxVar);
                qhVar.e0(K9);
            }
            z3 z3Var = (z3) K9;
            boolean h2 = qhVar.h(context);
            Object K10 = qhVar.K();
            if (h2 || K10 == y7Var) {
                K10 = new y3(0, context, z3Var);
                qhVar.e0(K10);
            }
            mz.h(dxVar, (mu) K10, qhVar);
            Object K11 = qhVar.K();
            if (K11 == y7Var) {
                K11 = new rk0();
                qhVar.e0(K11);
            }
            rk0 rk0Var = (rk0) K11;
            Object K12 = qhVar.K();
            if (K12 == y7Var) {
                K12 = new a4(rk0Var);
                qhVar.e0(K12);
            }
            a4 a4Var = (a4) K12;
            boolean h3 = qhVar.h(context);
            Object K13 = qhVar.K();
            if (h3 || K13 == y7Var) {
                K13 = new y3(1, context, a4Var);
                qhVar.e0(K13);
            }
            mz.h(rk0Var, (mu) K13, qhVar);
            ji jiVar = hi.v;
            boolean booleanValue = ((Boolean) qhVar.j(jiVar)).booleanValue() | f3Var.getScrollCaptureInProgress$ui_release();
            ki0 a3 = a.a((Configuration) f70Var.getValue());
            ki0 a4 = b.a(context);
            ki0 a5 = n30.a.a(viewTreeOwners.a);
            ki0 a6 = q30.a.a(ln0Var);
            ki0 a7 = zm0.a.a(cnVar);
            ki0 a8 = f.a(f3Var.getView());
            ki0 a9 = d.a(dxVar);
            ki0 a10 = e.a(rk0Var);
            ki0 a11 = jiVar.a(Boolean.valueOf(booleanValue));
            ki0 a12 = hi.l.a(ewVar);
            ki0[] ki0VarArr = new ki0[10];
            ki0VarArr[0] = a3;
            ki0VarArr[1] = a4;
            ki0VarArr[2] = a5;
            ki0VarArr[c2] = a6;
            ki0VarArr[4] = a7;
            ki0VarArr[5] = a8;
            ki0VarArr[6] = a9;
            ki0VarArr[7] = a10;
            ki0VarArr[8] = a11;
            ki0VarArr[9] = a12;
            nz.c(ki0VarArr, a50.E(1059770793, new v3(f3Var, s5Var, quVar, 0), qhVar), qhVar, 56);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new w3(i, 0, f3Var, quVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final ii0 getLocalSavedStateRegistryOwner() {
        return q30.a;
    }
}
