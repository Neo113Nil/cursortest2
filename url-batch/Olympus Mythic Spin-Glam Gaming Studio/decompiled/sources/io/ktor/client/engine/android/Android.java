package io.ktor.client.engine.android;

import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Android.kt */
/* loaded from: classes5.dex */
public final class Android implements HttpClientEngineFactory {
    public static final Android INSTANCE = new Android();

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof Android);
    }

    public int hashCode() {
        return 885084173;
    }

    public String toString() {
        return "Android";
    }

    private Android() {
    }

    @Override // io.ktor.client.engine.HttpClientEngineFactory
    public HttpClientEngine create(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AndroidEngineConfig androidEngineConfig = new AndroidEngineConfig();
        block.invoke(androidEngineConfig);
        return new AndroidClientEngine(androidEngineConfig);
    }
}
