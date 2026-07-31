package com.vungle.ads.internal.network;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes6.dex */
public final class s extends Lambda implements Function1 {
    public static final s a = new s();

    public s() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonBuilder Json = (JsonBuilder) obj;
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        Json.setEncodeDefaults(true);
        Json.setExplicitNulls(false);
        return Unit.INSTANCE;
    }
}
