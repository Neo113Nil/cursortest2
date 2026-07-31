package yads;

import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class bd1 {
    public static final String a(String str, JSONObject jSONObject) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(jSONObject.getString(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (String) m8023constructorimpl;
    }
}
