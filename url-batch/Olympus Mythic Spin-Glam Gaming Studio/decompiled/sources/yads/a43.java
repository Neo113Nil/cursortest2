package yads;

import java.util.Map;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a43 {
    public static String a(Map map) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            for (Map.Entry entry : map.entrySet()) {
                JsonElementBuildersKt.put(jsonObjectBuilder, (String) entry.getKey(), (String) entry.getValue());
            }
            m8023constructorimpl = Result.m8023constructorimpl(jsonObjectBuilder.build().toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            boolean z = ob1.a;
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (String) m8023constructorimpl;
    }

    public static Map a(String str) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(a(new JSONObject(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            boolean z = ob1.a;
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (Map) m8023constructorimpl;
    }

    public static Map a(JSONObject jSONObject) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ad1.a(jSONObject));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            Objects.toString(jSONObject);
            boolean z = ob1.a;
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (Map) m8023constructorimpl;
    }
}
