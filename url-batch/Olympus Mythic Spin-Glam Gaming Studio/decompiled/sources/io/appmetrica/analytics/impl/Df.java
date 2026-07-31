package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Df implements InterfaceC5468kj {
    public final Context a;
    public final String b = "content://" + a() + "/preload_info";
    public final String c = "tracking_id";
    public final String d = "additional_parameters";

    public Df(@NotNull Context context) {
        this.a = context;
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5468kj, kotlin.jvm.functions.Function0
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Kf mo4828invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (!PackageManagerUtils.hasContentProvider(this.a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC5754vj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.a.getContentResolver().query(Uri.parse(this.b), null, null, null, null);
            try {
                if (cursor == null) {
                    AbstractC5754vj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject2 = new JSONObject(string2);
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    AbstractC5754vj.a("Tracking id from Satellite is not a number.", new Object[0]);
                                }
                                AbstractC5754vj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                Kf kf = new Kf(string, jSONObject2, !TextUtils.isEmpty(string), false, EnumC5483l8.e);
                                Do.a(cursor);
                                return kf;
                            }
                        }
                        jSONObject = new JSONObject();
                        jSONObject2 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC5754vj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC5754vj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                        Kf kf2 = new Kf(string, jSONObject2, !TextUtils.isEmpty(string), false, EnumC5483l8.e);
                        Do.a(cursor);
                        return kf2;
                    }
                    AbstractC5754vj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        Do.a(cursor);
        return null;
    }
}
