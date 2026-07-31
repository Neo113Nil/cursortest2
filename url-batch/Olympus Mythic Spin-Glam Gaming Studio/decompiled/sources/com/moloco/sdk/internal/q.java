package com.moloco.sdk.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class q {

    @NotNull
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.q$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return q.a();
        }
    });

    public static final Json a() {
        return JsonKt.Json$default(null, new Function1() { // from class: com.moloco.sdk.internal.q$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.a((JsonBuilder) obj);
            }
        }, 1, null);
    }

    @NotNull
    public static final Json b() {
        return c();
    }

    public static final Json c() {
        return (Json) a.getValue();
    }

    public static final Unit a(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setLenient(true);
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }
}
