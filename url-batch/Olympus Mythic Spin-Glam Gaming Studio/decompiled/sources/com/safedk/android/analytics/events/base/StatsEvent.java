package com.safedk.android.analytics.events.base;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.internal.b;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistableBase;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.n;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class StatsEvent extends PersistableBase implements Comparable<StatsEvent> {
    public static final String A = "timestamp";
    public static final String B = "application";
    private static final String a = "StatsEvent";
    protected static final String ax = "sdk";
    private static final long serialVersionUID = 0;
    protected static final String w = "sdk_version";
    public static final String x = "sdk_uuid";
    protected static final String y = "isBackground";
    public static final String z = "event_type";
    protected String C;
    protected String D;
    protected StatsCollector.EventType E;
    protected boolean F;
    protected long G;
    protected int H;
    protected boolean I;
    protected boolean J;
    String K;
    protected transient boolean az;

    public abstract StatsCollector.EventType a();

    public abstract void a(StatsEvent statsEvent);

    public abstract String b();

    public StatsEvent() {
        this.I = true;
        this.J = false;
        this.K = null;
        this.az = false;
    }

    public StatsEvent(String sdk, StatsCollector.EventType eventType) {
        this.I = true;
        this.J = false;
        this.K = null;
        this.az = false;
        this.E = eventType;
        this.C = sdk;
        this.F = b.getInstance().isInBackground();
        this.G = n.b(System.currentTimeMillis());
        this.H = SafeDK.l();
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(sdk);
        this.K = sdkUUIDByPackage;
        if (sdkUUIDByPackage == null) {
            Logger.d(a, "sdk_null_check StatsEvent sdk = ", sdk);
        }
        Logger.d(a, "StatsEvent ctor sdk=", sdk);
    }

    public boolean j() {
        return this.az;
    }

    public void a(boolean z2) {
        this.az = z2;
    }

    public String k() {
        return this.C;
    }

    public long l() {
        return this.G;
    }

    public void a(long j) {
        this.G = j;
    }

    public Bundle d() {
        String str;
        Bundle bundle = new Bundle();
        String str2 = this.C;
        if (str2 != null && this.K == null) {
            String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str2);
            this.K = sdkUUIDByPackage;
            if (sdkUUIDByPackage == null) {
                this.K = this.C;
            }
        }
        String str3 = this.K;
        if (str3 != null) {
            bundle.putString("sdk_uuid", str3);
        }
        if (this.K != null && this.D == null && (str = SdksMapping.getAllSdkVersionsMap().get(this.K)) != null) {
            bundle.putString("sdk_version", str);
        }
        bundle.putString("event_type", a().toString());
        bundle.putLong("timestamp", this.G);
        if (!TextUtils.isEmpty(this.D)) {
            bundle.putString("sdk_version", this.D);
        }
        return bundle;
    }

    public void b(StatsEvent statsEvent) {
        if (a() == statsEvent.a()) {
            this.I |= statsEvent.I;
            a(statsEvent);
        } else {
            Logger.e(a, "Cannot aggregate events of different types");
        }
    }

    protected long m() {
        return n.c(this.G);
    }

    public boolean a_() {
        return this.I;
    }

    public void b(boolean z2) {
        this.I = z2;
    }

    public boolean n() {
        return this.J;
    }

    public void c(boolean z2) {
        this.J = z2;
    }

    public Set<String> e() {
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(StatsEvent statsEvent) {
        if (statsEvent == null) {
            throw null;
        }
        long j = this.G;
        long j2 = statsEvent.G;
        if (j == j2) {
            return 0;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        return d().toString();
    }

    public Bundle a(Bundle bundle) {
        return bundle;
    }

    @Override // com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdk", this.C);
        jSONObject.put("sdkVersion", this.D);
        StatsCollector.EventType eventType = this.E;
        jSONObject.put("type", eventType != null ? eventType.name() : null);
        jSONObject.put(y, this.F);
        jSONObject.put("timestamp", this.G);
        jSONObject.put("appVersionCode", this.H);
        jSONObject.put("isMature", this.I);
        jSONObject.put("isNextSession", this.J);
        jSONObject.put("sdkUid", this.K);
        jSONObject.put("isFirstSession", this.az);
        return jSONObject;
    }

    @Override // com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.C = jSONObject.optString("sdk", "");
            this.D = jSONObject.optString("sdkVersion", "");
            this.E = StatsCollector.EventType.valueOf(jSONObject.optString("type", ""));
            this.F = jSONObject.optBoolean(y, false);
            this.G = jSONObject.optLong("timestamp", 0L);
            this.H = jSONObject.optInt("appVersionCode", 0);
            this.I = jSONObject.optBoolean("isMature", true);
            this.J = jSONObject.optBoolean("isNextSession", false);
            this.K = jSONObject.optString("sdkUid", "");
            this.az = jSONObject.optBoolean("isFirstSession", false);
        }
    }
}
