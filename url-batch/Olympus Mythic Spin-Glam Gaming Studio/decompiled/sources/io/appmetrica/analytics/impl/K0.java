package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class K0 {
    public static String a(J0 j0) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", j0.a).put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, j0.b).put("reporterType", j0.c.getStringValue()).put("processID", j0.d).put("processSessionID", j0.e).put("errorEnvironment", j0.f).toString().getBytes(Charsets.UTF_8), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static J0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), Charsets.UTF_8));
            return new J0(jSONObject.getString("apiKey"), jSONObject.getString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME), CounterConfigurationReporterType.INSTANCE.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
