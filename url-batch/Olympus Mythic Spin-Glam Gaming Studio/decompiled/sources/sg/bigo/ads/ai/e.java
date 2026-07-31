package sg.bigo.ads.ai;

import androidx.annotation.NonNull;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface e {

    public static class a {
        public String a = "";
        public String b = "";
        public String c = "";
        public String d = "";
    }

    public static class b {
        public String a = "";
        public String b = "";
    }

    public static class c {
        public String a;
        public int b;
        public String[] c;
        public String d;

        public c(@NonNull JSONObject jSONObject) {
            this.a = "";
            this.b = 0;
            this.c = null;
            this.d = "";
            this.a = jSONObject.optString("title", "");
            this.b = jSONObject.optInt("type", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.c = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.c[i] = optJSONArray.optString(i);
                }
            }
            this.d = jSONObject.optString("id", "");
        }
    }

    String a();

    String b();

    long c();

    int d();

    String e();

    int f();

    String g();

    String h();

    f[] i();

    f j();

    f k();

    b l();

    c[] m();

    a n();
}
