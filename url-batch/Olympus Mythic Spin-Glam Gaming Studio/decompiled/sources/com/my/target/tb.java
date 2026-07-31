package com.my.target;

import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class tb {
    final Map a;
    private final Map b;
    private final long c;
    private final int d;
    private boolean e;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class a {
        private final int a;
        private boolean b = false;

        a(int i) {
            this.a = i;
        }

        public void a(boolean z) {
            this.b = z;
        }

        public tb b() {
            tb tbVar = new tb(this.a, "myTarget", 4);
            tbVar.a(this.b);
            return tbVar;
        }

        public tb a() {
            tb tbVar = new tb(this.a, "myTarget", 0);
            tbVar.a(this.b);
            return tbVar;
        }

        public tb a(String str, float f) {
            tb tbVar = new tb(this.a, str, 5);
            tbVar.a(this.b);
            tbVar.a.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Float.valueOf(f));
            return tbVar;
        }
    }

    tb(int i, String str, int i2) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.b = new HashMap();
        this.d = i2;
        this.c = System.currentTimeMillis();
        hashMap.put("slot", Integer.valueOf(i));
        hashMap.put("network", str);
    }

    public static a a(int i) {
        return new a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        String a2 = a();
        mi.a("MetricMessage: Send metrics message - \n " + a2);
        j5.a().a("https://ad.mail.ru/sdk/ms/", Base64.encodeToString(a2.getBytes(StandardCharsets.UTF_8), 0));
    }

    public void b() {
        b(this.d, System.currentTimeMillis() - this.c);
    }

    public void d() {
        if (!this.e) {
            mi.a("MetricMessage: Metrics sending disabled");
            return;
        }
        if (this.b.isEmpty()) {
            mi.a("MetricMessage: Metrics not send: empty");
            return;
        }
        v3 a2 = u4.b().a();
        if (a2 == null) {
            mi.a("MetricMessage: Metrics not send: basic info not collected");
            return;
        }
        this.a.put("instanceId", a2.a);
        this.a.put("os", a2.b);
        this.a.put("osver", a2.c);
        this.a.put("app", a2.d);
        this.a.put("appver", a2.e);
        this.a.put("sdkver", a2.g);
        o0.d(new Runnable() { // from class: com.my.target.tb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                tb.this.c();
            }
        });
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void b(int i, long j) {
        this.b.put(Integer.valueOf(i), Long.valueOf(j));
    }

    public void a(int i, long j) {
        Long l = (Long) this.b.get(Integer.valueOf(i));
        if (l != null) {
            j += l.longValue();
        }
        b(i, j);
    }

    String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : this.a.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("events", jSONArray);
            for (Map.Entry entry2 : this.b.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", entry2.getKey());
                jSONObject2.put("value", entry2.getValue());
                jSONArray.put(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}
