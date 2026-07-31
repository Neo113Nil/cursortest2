package yads;

import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class hv3 {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        ov3.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        ov3.a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        ov3.a(jSONObject, "os", "Android");
        return jSONObject;
    }
}
