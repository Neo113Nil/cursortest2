package yads;

import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public final class b93 {
    public static List a(JSONArray jSONArray) {
        Object m8023constructorimpl;
        List createListBuilder = CollectionsKt.createListBuilder();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(jSONArray.getString(i));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
                createListBuilder.add((String) m8023constructorimpl);
            }
        }
        return CollectionsKt.build(createListBuilder);
    }
}
