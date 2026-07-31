package com.vungle.ads.internal.network;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes3.dex */
public final class b0 extends Lambda implements Function1 {
    public static final b0 a = new b0();

    public b0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonBuilder Json = (JsonBuilder) obj;
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        Json.setEncodeDefaults(true);
        Json.setExplicitNulls(false);
        Json.setAllowStructuredMapKeys(true);
        return Unit.INSTANCE;
    }
}
