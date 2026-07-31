package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lg0 {
    public final w31 a;
    public final td b;

    public lg0() {
        w31 w31Var = new w31();
        td tdVar = new td();
        this.a = w31Var;
        this.b = tdVar;
    }

    public final fg0 a(JSONObject jSONObject) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("target");
        String optString3 = jSONObject.optString("layout");
        if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0 || optString3 == null || optString3.length() == 0) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            w31 w31Var = this.a;
            w31Var.getClass();
            ArrayList arrayList2 = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList2.add(w31Var.a.a(optJSONArray.getJSONObject(i)));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("analyticsParameters");
        if (optJSONObject != null) {
            this.b.getClass();
            Sequence asSequence = SequencesKt.asSequence(optJSONObject.keys());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : asSequence) {
                linkedHashMap2.put(obj, optJSONObject.get((String) obj));
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        return new fg0(optString, optString2, optString3, arrayList, linkedHashMap);
    }
}
