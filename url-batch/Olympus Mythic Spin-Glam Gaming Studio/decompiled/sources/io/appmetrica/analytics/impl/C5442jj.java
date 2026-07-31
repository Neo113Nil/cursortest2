package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.jj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5442jj implements InterfaceC5468kj {
    public final Context a;
    public final String b = "content://" + a() + "/clids";
    public final String c = "clid_key";
    public final String d = "clid_value";

    public C5442jj(@NotNull Context context) {
        this.a = context;
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5468kj, kotlin.jvm.functions.Function0
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final I3 mo4828invoke() {
        Cursor cursor;
        if (!PackageManagerUtils.hasContentProvider(this.a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC5754vj.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.a.getContentResolver().query(Uri.parse(this.b), null, null, null, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            try {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Error while getting satellite clids", new Object[0]) + "\n" + StringUtils.throwableToString(th), new Object[0]);
                return null;
            } finally {
                Do.a(cursor);
            }
        }
        if (cursor == null) {
            AbstractC5754vj.a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(this.c));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.d));
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    AbstractC5754vj.a("Invalid clid {%s : %s}", string, string2);
                } else {
                    linkedHashMap.put(string, string2);
                }
            } catch (Throwable unused) {
            }
        }
        AbstractC5754vj.a("Clids from satellite: %s", linkedHashMap);
        return new I3(linkedHashMap, EnumC5483l8.e);
    }
}
