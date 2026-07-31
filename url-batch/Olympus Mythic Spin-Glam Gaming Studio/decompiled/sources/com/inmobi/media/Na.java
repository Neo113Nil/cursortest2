package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class Na extends Pi {
    public final JSONObject a;

    public Na(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.a = jsonObject;
    }

    @Override // com.inmobi.media.Pi
    public final void a(BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        String jSONObject = this.a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        bufferedSink.writeUtf8(jSONObject);
    }

    @Override // com.inmobi.media.Pi
    public final String a() {
        return "application/json";
    }
}
