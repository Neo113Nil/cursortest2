package yads;

import java.net.URI;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public abstract class ib3 {
    public static String a(String str) {
        Object obj;
        String str2;
        String str3;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (str == null) {
                str3 = "bad_url";
            } else {
                boolean contains$default = StringsKt.contains$default((CharSequence) str, (CharSequence) "://", false, 2, (Object) null);
                if (!contains$default) {
                    str = b(str);
                }
                URI uri = new URI(str);
                if (contains$default) {
                    str2 = uri.getScheme() + "://";
                } else {
                    str2 = "";
                }
                str3 = str2 + uri.getHost();
            }
            obj = Result.m8023constructorimpl(str3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            obj = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m8028isFailureimpl(obj) ? "bad_url" : obj);
    }

    public static String b(String str) {
        return "stub://" + str;
    }
}
