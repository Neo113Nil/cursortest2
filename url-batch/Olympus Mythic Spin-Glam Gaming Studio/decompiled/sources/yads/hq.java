package yads;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes5.dex */
public final class hq {
    public final yu2 a;
    public final mt1 b;
    public final gq c;

    public hq(yu2 yu2Var) {
        nt3 nt3Var = (nt3) yu2Var;
        Context context = nt3Var.a;
        mt1 a = pr.a(context, context);
        nt3Var.getClass();
        gq gqVar = new gq(new ot3());
        this.a = yu2Var;
        this.b = a;
        this.c = gqVar;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.y);
        p0.startActivity(p1);
    }

    public final boolean a(Context context, v3 v3Var, t8 t8Var, x8 x8Var, String str) {
        y1 a = x1.a();
        long a2 = c21.a();
        Intent a3 = this.c.a(context, str, a2);
        a.a(a2, new w1(t8Var, v3Var, x8Var, this.a, null, 0, null, 112));
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a3);
            return true;
        } catch (Exception e) {
            a.a(a2);
            e.toString();
            boolean z = ob1.a;
            this.b.reportError("Failed to show Browser", e);
            return false;
        }
    }
}
