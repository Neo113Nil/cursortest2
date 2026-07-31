package yads;

import android.os.Build;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes11.dex */
public abstract class wa2 {
    public static ta2 a(AdActivity adActivity, u1 u1Var) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Build.VERSION.SDK_INT >= 33 ? new va2(adActivity, u1Var) : new ua2());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            boolean z = ob1.a;
            m8023constructorimpl = new ua2();
        }
        return (ta2) m8023constructorimpl;
    }
}
