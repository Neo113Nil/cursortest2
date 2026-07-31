package com.yandex.div.core.actions;

import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: DivActionTypedDictSetValueHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"clone", "Lorg/json/JSONObject;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DivActionTypedDictSetValueHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject clone(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.get(next));
        }
        return jSONObject2;
    }
}
