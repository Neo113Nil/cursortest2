package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class td {
    public static Map a(String str) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(str);
            Sequence asSequence = SequencesKt.asSequence(jSONObject.keys());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : asSequence) {
                linkedHashMap.put(obj, jSONObject.get((String) obj));
            }
            m8023constructorimpl = Result.m8023constructorimpl(linkedHashMap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        Map map = (Map) m8023constructorimpl;
        return map == null ? MapsKt.emptyMap() : map;
    }
}
