package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class gx0 {
    public final mt1 a;
    public final fx0 b;

    public gx0(yu2 yu2Var) {
        nt3 nt3Var = (nt3) yu2Var;
        Context context = nt3Var.a;
        mt1 a = pr.a(context, context);
        nt3Var.getClass();
        fx0 fx0Var = new fx0(new ot3());
        this.a = a;
        this.b = fx0Var;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.y);
        p0.startActivity(p1);
    }

    public final Object a(Activity activity, w1 w1Var) {
        Object m8023constructorimpl;
        long a = c21.a();
        Intent a2 = this.b.a(activity, a);
        y1 a3 = x1.a();
        a3.a(a, w1Var);
        try {
            Result.Companion companion = Result.INSTANCE;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(activity, a2);
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            a3.a(a);
            ab1.a("Failed to show Fullscreen Ad. Exception: " + m8026exceptionOrNullimpl, new Object[0]);
            this.a.reportError("Failed to show Fullscreen Ad", m8026exceptionOrNullimpl);
        }
        return m8023constructorimpl;
    }
}
