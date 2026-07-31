package yads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class dz2 {
    public static SharedPreferences a(dz2 dz2Var, Context context, String str) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService(POBConstants.KEY_USER);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.UserManager");
            m8023constructorimpl = Result.m8023constructorimpl(Boolean.valueOf(((UserManager) systemService).isUserUnlocked()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.TRUE;
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = bool;
        }
        return !((Boolean) m8023constructorimpl).booleanValue() ? context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0) : context.getSharedPreferences(str, 0);
    }
}
