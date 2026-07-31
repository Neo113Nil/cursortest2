package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Af implements O5 {
    @Override // io.appmetrica.analytics.impl.O5, kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Kf invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("tracking_id");
        if (StringUtils.isNullOrEmpty(asString)) {
            AbstractC5754vj.a("Tracking id is empty", new Object[0]);
            return null;
        }
        if (ParseUtils.parseLong(asString) == null) {
            AbstractC5754vj.a("Tracking id from preload info content provider is not a number", new Object[0]);
            return null;
        }
        try {
            String asString2 = contentValues.getAsString("additional_params");
            if (StringUtils.isNullOrEmpty(asString2)) {
                AbstractC5754vj.a("No additional params", new Object[0]);
                return null;
            }
            JSONObject jSONObject = new JSONObject(asString2);
            if (jSONObject.length() == 0) {
                AbstractC5754vj.a("Additional params are empty", new Object[0]);
                return null;
            }
            AbstractC5754vj.a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
            return new Kf(asString, jSONObject, true, false, EnumC5483l8.f);
        } catch (Throwable th) {
            ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Could not parse additional parameters", new Object[0]) + "\n" + StringUtils.throwableToString(th), new Object[0]);
            return null;
        }
    }
}
