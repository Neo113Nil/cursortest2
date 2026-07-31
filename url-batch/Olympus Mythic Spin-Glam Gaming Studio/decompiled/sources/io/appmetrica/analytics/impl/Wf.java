package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* loaded from: classes13.dex */
public final class Wf implements Parcelable {
    public final ContentValues a;
    public final ResultReceiver b;
    public static final String c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<Wf> CREATOR = new Vf();

    public Wf(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.b = resultReceiver;
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap b = Wm.b(map);
            synchronized (this) {
                this.a.put("PROCESS_CFG_CLIDS", Cb.b(b));
            }
        }
    }

    public final void b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.a.put("PROCESS_CFG_CUSTOM_HOSTS", Do.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
            }
        }
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            i();
        }
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                b(appMetricaConfig);
                a(appMetricaConfig);
                c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public final Integer f() {
        return this.a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public final String g() {
        return this.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public final boolean h() {
        return this.a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public final synchronized void i() {
        this.a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.a + ", mDataResultReceiver=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.b);
        parcel.writeBundle(bundle);
    }

    public final HashMap a() {
        return Cb.c(this.a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public final String c() {
        return this.a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public final String d() {
        return this.a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    public Wf(Wf wf) {
        synchronized (wf) {
            this.a = new ContentValues(wf.a);
            this.b = wf.b;
        }
    }

    public final ArrayList b() {
        String asString = this.a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return Cb.b(asString);
    }

    public Wf(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.a = contentValues == null ? new ContentValues() : contentValues;
        this.b = resultReceiver;
    }
}
