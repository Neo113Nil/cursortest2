package com.inmobi.media;

import android.content.ContentValues;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC3986f3 {
    public static final ContentValues a(Z2 z2) {
        String str;
        Intrinsics.checkNotNullParameter(z2, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(z2.a));
        contentValues.put("url", z2.b);
        contentValues.put("pending_attempts", Integer.valueOf(z2.f));
        contentValues.put("ts", Long.valueOf(z2.g));
        contentValues.put("created_ts", Long.valueOf(z2.h));
        contentValues.put("follow_redirect", Boolean.valueOf(z2.d));
        contentValues.put("ping_in_webview", Boolean.valueOf(z2.e));
        Map map = z2.c;
        if (map != null && !map.isEmpty()) {
            try {
                Map map2 = z2.c;
                Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                str = new JSONObject(map2).toString();
            } catch (Exception unused) {
                str = "";
            }
            Intrinsics.checkNotNull(str);
            contentValues.put("track_extras", str);
        }
        return contentValues;
    }
}
