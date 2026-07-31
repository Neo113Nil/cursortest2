package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5621qf extends Sd implements To {
    public static final long d = 0;
    public static final int e = -1;
    public static final String f = "";
    public static final String g = "";
    public static final String r = "SESSION_";
    public static final C5672sf h = new C5672sf("PERMISSIONS_CHECK_TIME", null);
    public static final C5672sf i = new C5672sf("PROFILE_ID", null);
    public static final C5672sf j = new C5672sf("APP_ENVIRONMENT", null);
    public static final C5672sf k = new C5672sf("APP_ENVIRONMENT_REVISION", null);
    public static final C5672sf l = new C5672sf("LAST_APP_VERSION_WITH_FEATURES", null);
    public static final C5672sf m = new C5672sf("APPLICATION_FEATURES", null);
    public static final C5672sf n = new C5672sf("CERTIFICATES_SHA1_FINGERPRINTS", null);
    public static final C5672sf o = new C5672sf("VITAL_DATA", null);
    public static final C5672sf p = new C5672sf("SENT_EXTERNAL_ATTRIBUTIONS", null);
    public static final C5672sf q = new C5672sf("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);
    public static final C5672sf s = new C5672sf("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public C5621qf(InterfaceC5357gb interfaceC5357gb) {
        super(interfaceC5357gb);
    }

    public final C5621qf a(C5449k0 c5449k0) {
        synchronized (this) {
            d(j.b, c5449k0.a);
            d(k.b, c5449k0.b);
        }
        return this;
    }

    public final void b(boolean z) {
        d(s.b, z);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    @NonNull
    public final Set<String> c() {
        return this.a.b();
    }

    public final C5449k0 d() {
        C5449k0 c5449k0;
        synchronized (this) {
            c5449k0 = new C5449k0(this.a.getString(j.b, JsonUtils.EMPTY_JSON), this.a.getLong(k.b, 0L));
        }
        return c5449k0;
    }

    public final String e() {
        return this.a.getString(m.b, "");
    }

    public final Map<String, Long> f() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.a.getString(q.b, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf, io.appmetrica.analytics.impl.Ol, io.appmetrica.analytics.impl.To
    public final void flushAsync() {
        this.a.flushAsync();
    }

    @NonNull
    public final List<String> g() {
        String str = n.b;
        List emptyList = Collections.emptyList();
        String[] strArr = emptyList == null ? null : (String[]) emptyList.toArray(new String[emptyList.size()]);
        String string = this.a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = jSONArray.optString(i2);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int h() {
        return this.a.getInt(l.b, -1);
    }

    public final long i() {
        return this.a.getLong(h.b, 0L);
    }

    @Nullable
    public final String j() {
        return this.a.getString(i.b, null);
    }

    @NonNull
    public final Map<Integer, String> k() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.a.getString(p.b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    @Override // io.appmetrica.analytics.impl.To
    @Nullable
    public final String b() {
        return this.a.getString(o.b, null);
    }

    public final String h(String str) {
        return this.a.getString(new C5672sf(r, str).b, "");
    }

    public final C5621qf i(String str) {
        return (C5621qf) d(m.b, str);
    }

    public final C5621qf j(@Nullable String str) {
        return (C5621qf) d(i.b, str);
    }

    public final C5621qf e(String str, String str2) {
        return (C5621qf) d(new C5672sf(r, str).b, str2);
    }

    public final void b(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        d(p.b, jSONObject.toString());
    }

    public final C5621qf a(long j2) {
        return (C5621qf) d(h.b, j2);
    }

    public final C5621qf a(int i2) {
        return (C5621qf) d(l.b, i2);
    }

    @Override // io.appmetrica.analytics.impl.Sd
    @NonNull
    public final String g(@NonNull String str) {
        return new C5672sf(str, null).b;
    }

    public final C5621qf a(List<String> list) {
        return (C5621qf) a(n.b, list);
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(s.b, z);
    }

    @Override // io.appmetrica.analytics.impl.To
    public final void a(@NonNull String str) {
        d(o.b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf, io.appmetrica.analytics.impl.To
    public final void a() {
        super.a();
    }

    public final void a(@NonNull Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        d(q.b, jSONObject.toString());
    }
}
