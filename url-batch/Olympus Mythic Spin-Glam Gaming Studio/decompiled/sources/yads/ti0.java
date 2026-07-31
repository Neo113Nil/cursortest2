package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ti0 {
    public static final List a = CollectionsKt.listOf((Object[]) new String[]{"native_ad_view", "timer_container", "timer_value", "skip_button", "linear_progress_view", "video_progress", "mute_button"});

    public final Set a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        a(jSONObject, ii0.b, new si0(this, arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!a.contains(((hi0) next).b)) {
                arrayList2.add(next);
            }
        }
        return CollectionsKt.toSet(arrayList2);
    }

    public static void a(JSONObject jSONObject, ii0 ii0Var, si0 si0Var) {
        Object obj;
        JSONObject optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("extensions");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (Intrinsics.areEqual((optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("params")) == null) ? null : optJSONObject.optString("view_name"), "native_ad_view")) {
                    ii0Var = ii0.c;
                    break;
                }
                i++;
            }
        }
        si0Var.invoke(jSONObject, ii0Var);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                obj = jSONObject.get(keys.next());
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, ii0Var, si0Var);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, ii0Var, si0Var);
            }
        }
    }

    public static void a(JSONArray jSONArray, ii0 ii0Var, si0 si0Var) {
        Object obj;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                obj = jSONArray.get(i);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, ii0Var, si0Var);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, ii0Var, si0Var);
            }
        }
    }
}
