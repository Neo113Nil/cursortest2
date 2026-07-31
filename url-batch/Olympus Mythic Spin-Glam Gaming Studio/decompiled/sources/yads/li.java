package yads;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class li {
    public final zh a;

    public li(Context context, mt1 mt1Var, lf1 lf1Var, int i) {
        this.a = new zh(context, mt1Var, (i & 4) != 0 ? new lf1(context, mt1Var) : lf1Var);
    }

    public final ArrayList a(JSONObject jSONObject, dm dmVar) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("assets");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            boolean z = jSONObject2.getBoolean("required");
            try {
                arrayList.add(this.a.a(jSONObject2, dmVar));
            } catch (Throwable th) {
                if (z) {
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
