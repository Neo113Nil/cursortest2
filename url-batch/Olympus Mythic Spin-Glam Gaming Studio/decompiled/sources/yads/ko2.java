package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ko2 {
    public static JSONObject a(Map map) {
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("ad_unit_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject b(String str, Map map) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = map.get("ad_type");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj2);
        Object obj3 = map.get("ad_unit_id");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj3);
        Object obj4 = map.get("sdk_version");
        if (obj4 == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj4);
        if (str != null) {
            obj = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(obj, "toLowerCase(...)");
        }
        obj = JSONObject.NULL;
        jSONObject.put("ad_network", obj);
        Object obj5 = map.get(CreativeInfo.c);
        if (obj5 != null) {
            jSONObject.put("banner_id", obj5);
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject c(String str, Map map) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = map.get("ad_type");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj2);
        Object obj3 = map.get("ad_unit_id");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj3);
        Object obj4 = map.get("sdk_version");
        if (obj4 == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj4);
        if (str != null) {
            obj = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(obj, "toLowerCase(...)");
        }
        obj = JSONObject.NULL;
        jSONObject.put("ad_network", obj);
        Object obj5 = map.get(CreativeInfo.c);
        if (obj5 != null) {
            jSONObject.put("banner_id", obj5);
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject d(String str, Map map) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = map.get("ad_type");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj2);
        Object obj3 = map.get("ad_unit_id");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj3);
        Object obj4 = map.get("sdk_version");
        if (obj4 == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj4);
        if (str != null) {
            obj = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(obj, "toLowerCase(...)");
        }
        obj = JSONObject.NULL;
        jSONObject.put("ad_network", obj);
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject a(String str, Map map) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = map.get("ad_type");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj2);
        Object obj3 = map.get("ad_unit_id");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj3);
        Object obj4 = map.get("sdk_version");
        if (obj4 == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj4);
        if (str != null) {
            obj = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(obj, "toLowerCase(...)");
        }
        obj = JSONObject.NULL;
        jSONObject.put("ad_network", obj);
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject a(Map map, y4 y4Var, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        JSONObject jSONObject = new JSONObject();
        Object obj5 = map.get("ad_type");
        if (obj5 == null) {
            obj5 = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj5);
        Object obj6 = map.get("ad_unit_id");
        if (obj6 == null) {
            obj6 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj6);
        Object obj7 = map.get("sdk_version");
        if (obj7 == null) {
            obj7 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj7);
        if (str != null) {
            obj = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(obj, "toLowerCase(...)");
        }
        obj = JSONObject.NULL;
        jSONObject.put("ad_network", obj);
        Object obj8 = map.get(CreativeInfo.c);
        if (obj8 != null) {
            jSONObject.put("banner_id", obj8);
        }
        JSONObject jSONObject2 = null;
        String str2 = y4Var != null ? y4Var.b : null;
        if (str2 != null) {
            try {
                jSONObject2 = new JSONObject(str2);
            } catch (Throwable unused) {
                boolean z = ob1.a;
            }
        }
        if (jSONObject2 == null || (obj2 = jSONObject2.optString("revenue")) == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_revenue", obj2);
        if (jSONObject2 == null || (obj3 = jSONObject2.optString("currency")) == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("currency", obj3);
        if (jSONObject2 == null || (obj4 = jSONObject2.optString("precision")) == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put("precision", obj4);
        return jSONObject;
    }
}
