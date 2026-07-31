package yads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class fn0 {
    public static String a(Set set) {
        if (set != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                dn0 dn0Var = (dn0) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", dn0Var.a.name());
                jSONObject.put("value", dn0Var.b);
                jSONArray = jSONArray.put(jSONObject);
            }
            if (jSONArray != null) {
                return jSONArray.toString();
            }
        }
        return null;
    }

    public static Set a(String str) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(a(new JSONArray(str)));
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
        return (Set) m8023constructorimpl;
    }

    public static Set a(JSONArray jSONArray) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Set createSetBuilder = SetsKt.createSetBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                createSetBuilder.add(new dn0(en0.valueOf(jSONObject.getString("type")), jSONObject.getString("value")));
            }
            m8023constructorimpl = Result.m8023constructorimpl(SetsKt.build(createSetBuilder));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            Objects.toString(jSONArray);
            boolean z = ob1.a;
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (Set) m8023constructorimpl;
    }
}
