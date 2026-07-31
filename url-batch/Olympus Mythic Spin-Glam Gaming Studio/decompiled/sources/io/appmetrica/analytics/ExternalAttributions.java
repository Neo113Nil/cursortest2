package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Ab;
import io.appmetrica.analytics.impl.Ae;
import io.appmetrica.analytics.impl.Ee;
import io.appmetrica.analytics.impl.EnumC5304ea;
import io.appmetrica.analytics.impl.Vc;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ExternalAttributions {
    @NonNull
    public static ExternalAttribution adjust(@Nullable Object obj) {
        return obj == null ? new Ae(EnumC5304ea.b) : new Ee(EnumC5304ea.b, obj);
    }

    @NonNull
    public static ExternalAttribution airbridge(@Nullable Map<String, String> map) {
        return map == null ? new Ae(EnumC5304ea.e) : new Vc(EnumC5304ea.e, map);
    }

    @NonNull
    public static ExternalAttribution appsflyer(@Nullable Map<String, Object> map) {
        return map == null ? new Ae(EnumC5304ea.a) : new Vc(EnumC5304ea.a, map);
    }

    @NonNull
    public static ExternalAttribution kochava(@Nullable JSONObject jSONObject) {
        return jSONObject == null ? new Ae(EnumC5304ea.c) : new Ab(EnumC5304ea.c, jSONObject);
    }

    @NonNull
    public static ExternalAttribution singular(@Nullable Map<String, Object> map) {
        return map == null ? new Ae(EnumC5304ea.f) : new Vc(EnumC5304ea.f, map);
    }

    @NonNull
    public static ExternalAttribution tenjin(@Nullable Map<String, String> map) {
        return map == null ? new Ae(EnumC5304ea.d) : new Vc(EnumC5304ea.d, map);
    }
}
