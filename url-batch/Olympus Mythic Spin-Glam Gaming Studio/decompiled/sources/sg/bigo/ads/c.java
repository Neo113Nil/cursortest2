package sg.bigo.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: sg.bigo.ads.c$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConsentOptions.values().length];
            a = iArr;
            try {
                iArr[ConsentOptions.LGPD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConsentOptions.CCPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConsentOptions.COPPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ConsentOptions.GDPR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class a {
        private static final List<a> h = new ArrayList();
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
        }

        public static List<a> a() {
            return h;
        }

        public static void a(a aVar) {
            h.add(aVar);
        }

        static JSONObject b(a aVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("consent_type", aVar.a);
                jSONObject.put("last_status", aVar.b);
                jSONObject.put("cur_status", aVar.c);
                jSONObject.put("get_token", aVar.d);
                jSONObject.put("tcf_applias", aVar.e);
                jSONObject.put("tcf_purpose", aVar.f);
                jSONObject.put("tcf_interests", aVar.g);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public static void b() {
            h.clear();
        }

        public static Map<String, String> c() {
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = new JSONArray();
            Iterator<a> it = h.iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next()));
            }
            hashMap.put("user_consent_event", jSONArray.toString());
            hashMap.put(CommonUrlParts.UUID, sg.bigo.ads.bw.a.t());
            return hashMap;
        }
    }
}
