package yads;

import android.net.Uri;
import android.webkit.URLUtil;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes9.dex */
public abstract class jb3 {
    public static String a(String str) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Uri.parse(b(str)).getHost());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (String) m8023constructorimpl;
    }

    public static String b(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return str;
        }
        return com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u + str;
    }
}
