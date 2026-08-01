package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class g1 implements Runnable {
    public final /* synthetic */ int f;
    public final Object g;
    public final /* synthetic */ Object h;

    public g1(re reVar, ArrayList arrayList, u20 u20Var) {
        this.f = 5;
        this.g = arrayList;
        this.h = u20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qs qsVar;
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                e1 e1Var = (e1) obj2;
                k1 k1Var = (k1) obj;
                ss ssVar = k1Var.h;
                if (ssVar != null && (qsVar = ssVar.e) != null) {
                    qsVar.n(ssVar);
                }
                View view = (View) k1Var.m;
                if (view != null && view.getWindowToken() != null) {
                    if (!e1Var.b()) {
                        if (e1Var.f != null) {
                            e1Var.d(0, 0, false, false);
                        }
                    }
                    k1Var.y = e1Var;
                }
                k1Var.A = null;
                return;
            case 1:
                ((r1) obj2).a = obj;
                return;
            case 2:
                ((Application) obj2).unregisterActivityLifecycleCallbacks((r1) obj);
                return;
            case 3:
                try {
                    Method method = s1.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        s1.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                Typeface typeface = (Typeface) obj;
                oo ooVar = (oo) ((uv) obj2).f;
                if (ooVar != null) {
                    ooVar.C(typeface);
                    return;
                }
                return;
            case 5:
                ArrayList arrayList = (ArrayList) obj2;
                u20 u20Var = (u20) obj;
                if (arrayList.contains(u20Var)) {
                    arrayList.remove(u20Var);
                    n20.a(u20Var.c.J, u20Var.a);
                    return;
                }
                return;
            default:
                ((nj) obj2).accept(obj);
                return;
        }
    }

    public /* synthetic */ g1(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public g1(k1 k1Var, e1 e1Var) {
        this.f = 0;
        this.h = k1Var;
        this.g = e1Var;
    }
}
