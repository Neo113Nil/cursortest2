package yads;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes4.dex */
public final class cg0 {
    public final mt1 a;
    public final n1 b;
    public final i2 c;

    public cg0(v3 v3Var, yu2 yu2Var, t8 t8Var) {
        nt3 nt3Var = (nt3) yu2Var;
        Context context = nt3Var.a;
        mt1 a = pr.a(context, context);
        n1 n1Var = new n1(v3Var, yu2Var, t8Var);
        nt3Var.getClass();
        i2 i2Var = new i2(new ot3());
        this.a = a;
        this.b = n1Var;
        this.c = i2Var;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.y);
        p0.startActivity(p1);
    }

    public final Object a(Context context, Intent intent, qg2 qg2Var) {
        Object m8023constructorimpl;
        y1 y1Var;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(qg2Var), 1);
        cancellableContinuationImpl.initCancellability();
        long andIncrement = c21.a.getAndIncrement();
        ot3 ot3Var = this.c.a;
        Intent intent2 = new Intent(context, (Class<?>) AdActivity.class);
        intent2.putExtra("window_type", "window_type_activity_result");
        intent2.putExtra("data_identifier", andIncrement);
        n1 n1Var = this.b;
        ag0 ag0Var = new ag0(cancellableContinuationImpl);
        bg0 bg0Var = new bg0(cancellableContinuationImpl);
        n1Var.getClass();
        w1 w1Var = new w1(n1Var.c, n1Var.a, new x8(), n1Var.b, null, 0, new yf0(intent, ag0Var, bg0Var), 48);
        y1 y1Var2 = y1.c;
        if (y1Var2 == null) {
            synchronized (y1.b) {
                y1Var = y1.c;
                if (y1Var == null) {
                    y1Var = new y1();
                    y1.c = y1Var;
                }
            }
            y1Var2 = y1Var;
        }
        y1Var2.a(andIncrement, w1Var);
        cancellableContinuationImpl.invokeOnCancellation(new zf0(y1Var2, andIncrement));
        try {
            Result.Companion companion = Result.INSTANCE;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            y1Var2.a(andIncrement);
            this.a.reportError("Failed to launch AdActivity for result", m8026exceptionOrNullimpl);
            if (cancellableContinuationImpl.isActive()) {
                cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl)));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(qg2Var);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
