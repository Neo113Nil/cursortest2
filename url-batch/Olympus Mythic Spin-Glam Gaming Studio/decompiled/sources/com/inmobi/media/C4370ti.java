package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ti, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4370ti implements InterfaceC4315rg {
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi a;

    public C4370ti(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        this.a = gestureDetectorOnGestureListenerC4476xi;
    }

    public final void a(String id, int i, String str, long j, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullExpressionValue(GestureDetectorOnGestureListenerC4476xi.i1, "access$getTAG$cp(...)");
        JSONObject a = AbstractC4343si.a("code", i);
        if (str != null) {
            a.put("msg", str);
        }
        a.put("retryCount", i2);
        String jSONObject = a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        this.a.h("window.imraidview.broadcastEvent('onPingComplete', '" + id + "', " + j + ", '" + jSONObject + "');");
    }
}
