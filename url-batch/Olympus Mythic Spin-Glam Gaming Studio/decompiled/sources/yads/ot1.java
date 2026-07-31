package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;

/* loaded from: classes5.dex */
public abstract class ot1 {
    public static final vw2 a;
    public static volatile mt1 b;

    static {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        a = vw2Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mt1 a(Context context, bu2 bu2Var, dq3 dq3Var) {
        cg cgVar;
        sf sfVar = new sf();
        bg a2 = gf.a(context);
        String str = pa.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
        boolean z = false;
        if (a2.a.a()) {
            try {
                cgVar = new cg(LazyKt.lazy(new xf(dq3Var, context, a2, str)), a2.a);
            } catch (Throwable unused) {
                boolean z2 = ob1.a;
            }
            Lazy lazy = LazyKt.lazy(new nt1(context));
            if (bu2Var != null && bu2Var.h0) {
                z = true;
            }
            mt1 mt1Var = new mt1(cgVar, lazy, z);
            cu2 cu2Var = new cu2(context, sfVar);
            lu2 lu2Var = cu2Var.b;
            du2 du2Var = cu2Var.a;
            lu2Var.getClass();
            synchronized (lu2.b) {
                try {
                    if (!lu2Var.a.containsKey(du2Var)) {
                        lu2Var.a.put(du2Var, null);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return mt1Var;
        }
        try {
            a2.b.getClass();
            AppMetrica.setDataSendingEnabled(false);
        } catch (Throwable unused2) {
            boolean z3 = ob1.a;
        }
        cgVar = null;
        Lazy lazy2 = LazyKt.lazy(new nt1(context));
        if (bu2Var != null) {
            z = true;
        }
        mt1 mt1Var2 = new mt1(cgVar, lazy2, z);
        cu2 cu2Var2 = new cu2(context, sfVar);
        lu2 lu2Var2 = cu2Var2.b;
        du2 du2Var2 = cu2Var2.a;
        lu2Var2.getClass();
        synchronized (lu2.b) {
        }
    }
}
