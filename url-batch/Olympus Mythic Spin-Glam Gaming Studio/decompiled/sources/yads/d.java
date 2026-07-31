package yads;

import com.ironsource.C4993ye;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.LongCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class d {
    public static c a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(C4993ye.d), a(jSONObject.getJSONArray("test_ids")));
        } catch (Throwable unused) {
            boolean z = ob1.a;
            return null;
        }
    }

    public static LinkedHashSet a(JSONArray jSONArray) {
        Object m8023constructorimpl;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(Boolean.valueOf(linkedHashSet.add(Long.valueOf(jSONArray.getLong(i)))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
                Objects.toString(TuplesKt.to(jSONArray.get(i), LongCompanionObject.INSTANCE));
                boolean z = ob1.a;
            }
        }
        return linkedHashSet;
    }
}
