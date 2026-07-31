package io.appmetrica.analytics.impl;

import com.safedk.android.analytics.events.CrashEvent;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Xa {
    public static final HashSet a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("get_ad");
        hashSet.add(CrashEvent.e);
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    public static ArrayList a(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject != null) {
                return Cb.a(optJSONObject.getJSONArray("urls"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
