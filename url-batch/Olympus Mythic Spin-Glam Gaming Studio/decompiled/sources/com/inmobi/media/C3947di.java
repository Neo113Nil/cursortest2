package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.di, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3947di {
    public static final /* synthetic */ KProperty[] a = {Reflection.property1(new PropertyReference1Impl(C3947di.class, "areImraidLogsEnabled", "getAreImraidLogsEnabled()Z", 0))};

    public static JSONObject a(String browser, String event) {
        Intrinsics.checkNotNullParameter(browser, "browser");
        Intrinsics.checkNotNullParameter(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("browser", browser);
        jSONObject.put("event", event);
        return jSONObject;
    }
}
