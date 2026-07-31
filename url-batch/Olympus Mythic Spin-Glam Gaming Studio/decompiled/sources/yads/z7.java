package yads;

import android.content.Context;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes4.dex */
public final class z7 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y7 a(Context context) {
        Object m8023constructorimpl;
        Throwable m8026exceptionOrNullimpl;
        d7 c;
        Object u6Var;
        try {
            Result.Companion companion = Result.INSTANCE;
            bu2 a = uw2.a().a(context);
            c = a != null ? a.c() : null;
            if (c != null && tq0.a(context.getApplicationContext(), sq0.f)) {
                c = new d7(c.a, true, c.c, c.d, c.e, c.f, c.g, c.h);
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (c != null && c.a()) {
            AdQualityVerifierAdapterConfiguration a2 = o7.a(c, tq0.a(context.getApplicationContext(), sq0.f));
            AdQualityVerifierAdapter a3 = n7.a();
            if (a3 == null) {
                boolean z = ob1.a;
                u6Var = new u6();
            } else {
                g7 a4 = x7.a(c);
                long verificationTimeoutInSec = 1 + a2.getVerificationTimeoutInSec();
                w7 w7Var = new w7(a4);
                l7 l7Var = new l7(a4);
                boolean z2 = ob1.a;
                u6Var = new z6(a3, a2, verificationTimeoutInSec, w7Var, l7Var);
            }
            m8023constructorimpl = Result.m8023constructorimpl(u6Var);
            m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            if (m8026exceptionOrNullimpl != null) {
                m8026exceptionOrNullimpl.getMessage();
                boolean z3 = ob1.a;
                m8023constructorimpl = new u6();
            }
            return (y7) m8023constructorimpl;
        }
        boolean z4 = ob1.a;
        u6Var = new u6();
        m8023constructorimpl = Result.m8023constructorimpl(u6Var);
        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
        }
        return (y7) m8023constructorimpl;
    }
}
