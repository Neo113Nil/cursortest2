package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class Kf implements InterfaceC5509m8 {

    @Nullable
    public final String a;

    @NonNull
    public final JSONObject b;
    public final boolean c;
    public final boolean d;

    @NonNull
    public final EnumC5483l8 e;

    public Kf(@Nullable String str, @NonNull JSONObject jSONObject, boolean z, boolean z2, @NonNull EnumC5483l8 enumC5483l8) {
        this.a = str;
        this.b = jSONObject;
        this.c = z;
        this.d = z2;
        this.e = enumC5483l8;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5509m8
    @NonNull
    public final EnumC5483l8 a() {
        return this.e;
    }

    @Nullable
    public final JSONObject b() {
        if (!this.c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.a);
            if (this.b.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("additionalParams", this.b);
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    @NonNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.a);
            jSONObject.put("additionalParams", this.b);
            jSONObject.put("wasSet", this.c);
            jSONObject.put("autoTracking", this.d);
            jSONObject.put("source", this.e.a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.a + "', additionalParameters=" + this.b + ", wasSet=" + this.c + ", autoTrackingEnabled=" + this.d + ", source=" + this.e + '}';
    }

    @NonNull
    public static Kf a(@Nullable JSONObject jSONObject) {
        EnumC5483l8 enumC5483l8;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        EnumC5483l8.b.getClass();
        EnumC5483l8[] values = EnumC5483l8.values();
        int length = values.length;
        while (true) {
            if (i >= length) {
                enumC5483l8 = null;
                break;
            }
            enumC5483l8 = values[i];
            if (Intrinsics.areEqual(enumC5483l8.a, optStringOrNull2)) {
                break;
            }
            i++;
        }
        return new Kf(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, enumC5483l8 == null ? EnumC5483l8.c : enumC5483l8);
    }
}
