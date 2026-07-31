package com.vungle.ads.internal.network.converters;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes13.dex */
public final class c extends Lambda implements Function1 {
    public static final c a = new c();

    public c() {
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
