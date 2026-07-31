package yads;

import android.content.Context;
import android.util.Base64;
import com.ironsource.O6;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class sw2 {
    public final Context a;
    public final mt1 b;
    public final vw2 c;

    public sw2(Context context, mt1 mt1Var) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        this.a = context;
        this.b = mt1Var;
        this.c = vw2Var2;
    }

    public final Map a(Map map, int i, v3 v3Var, int i2) {
        return MapsKt.mapOf(TuplesKt.to("headers_size", Integer.valueOf((a(map) + 512) / 1024)), TuplesKt.to("sdk_request_size", Integer.valueOf((i + 512) / 1024)), TuplesKt.to("bidding_data_network_sizes", a(v3Var.h)), TuplesKt.to("ad_type_format", v3Var.a.b), TuplesKt.to("code", Integer.valueOf(i2)), TuplesKt.to("sdk_version", "8.1.0"), TuplesKt.to("app_id", this.a.getPackageName()));
    }

    public static int a(Map map) {
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            byte[] bytes = (((String) entry.getKey()) + ": " + ((String) entry.getValue()) + "\r\n").getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            i += bytes.length;
        }
        return i;
    }

    public static Map a(String str) {
        if (str != null && str.length() != 0) {
            try {
                JSONArray optJSONArray = new JSONObject(new String(Base64.decode(str, 0), Charsets.UTF_8)).optJSONArray(O6.E1);
                if (optJSONArray == null) {
                    return MapsKt.emptyMap();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString(O6.G1, "unknown_" + i);
                        byte[] bytes = optJSONObject.toString().getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        linkedHashMap.put(optString, Integer.valueOf((bytes.length + 512) / 1024));
                    }
                }
                return linkedHashMap;
            } catch (Exception unused) {
                boolean z = ob1.a;
                return MapsKt.emptyMap();
            }
        }
        return MapsKt.emptyMap();
    }
}
