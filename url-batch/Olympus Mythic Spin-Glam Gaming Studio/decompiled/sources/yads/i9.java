package yads;

import android.webkit.WebView;
import com.pubmatic.sdk.crashanalytics.POBCrashAnalyticsConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class i9 {
    public final String a;
    public w3 c;
    public el1 d;
    public long f = System.nanoTime();
    public int e = 1;
    public kv3 b = new kv3(null);

    public i9(String str) {
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, JSONObject jSONObject) {
        kw3.a.a((WebView) this.b.get(), "publishMediaEvent", str, jSONObject, this.a);
    }

    public void b() {
    }

    public void a(av3 av3Var, g9 g9Var) {
        a(av3Var, g9Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(av3 av3Var, g9 g9Var, JSONObject jSONObject) {
        String str;
        String str2 = av3Var.h;
        JSONObject jSONObject2 = new JSONObject();
        ov3.a(jSONObject2, "environment", "app");
        ov3.a(jSONObject2, "adSessionType", g9Var.e);
        ov3.a(jSONObject2, POBCrashAnalyticsConstants.DEVICE_INFO_KEY, hv3.a());
        int a = wu3.a();
        if (a == 1) {
            str = "ctv";
        } else if (a == 2) {
            str = "mobile";
        } else {
            if (a != 3) {
                throw null;
            }
            str = "other";
        }
        ov3.a(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        ov3.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        g9Var.a.getClass();
        ov3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, "Yandex");
        g9Var.a.getClass();
        ov3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, "8.1.0");
        ov3.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        ov3.a(jSONObject4, "libraryVersion", "1.5.6-Yandex");
        ov3.a(jSONObject4, "appId", hw3.b.a.getApplicationContext().getPackageName());
        ov3.a(jSONObject2, "app", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        for (xd3 xd3Var : Collections.unmodifiableList(g9Var.b)) {
            ov3.a(jSONObject5, xd3Var.a, xd3Var.c);
        }
        kw3.a.a((WebView) this.b.get(), "startSession", str2, jSONObject2, jSONObject5, jSONObject);
    }

    public void a() {
        this.b.clear();
    }
}
