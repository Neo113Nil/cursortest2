package yads;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes3.dex */
public abstract class n7 {
    public static AdQualityVerifierAdapter a() {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object a = rm2.a("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", new Object[0]);
            m8023constructorimpl = Result.m8023constructorimpl(a instanceof AdQualityVerifierAdapter ? (AdQualityVerifierAdapter) a : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            m8026exceptionOrNullimpl.getMessage();
            boolean z = ob1.a;
        }
        return (AdQualityVerifierAdapter) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }
}
