package yads;

import java.net.URI;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes5.dex */
public final class mb3 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(String str) {
        Object m8023constructorimpl;
        boolean z;
        try {
            Result.Companion companion = Result.INSTANCE;
            new URI(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (str != null && str.length() != 0) {
            z = true;
            m8023constructorimpl = Result.m8023constructorimpl(Boolean.valueOf(z));
            Boolean bool = Boolean.FALSE;
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                m8023constructorimpl = bool;
            }
            return ((Boolean) m8023constructorimpl).booleanValue();
        }
        z = false;
        m8023constructorimpl = Result.m8023constructorimpl(Boolean.valueOf(z));
        Boolean bool2 = Boolean.FALSE;
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
        }
        return ((Boolean) m8023constructorimpl).booleanValue();
    }
}
