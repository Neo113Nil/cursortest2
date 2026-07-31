package io.ktor.client;

import io.ktor.client.engine.HttpClientEngineFactory;
import java.util.Iterator;
import java.util.ServiceLoader;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* compiled from: HttpClientJvm.kt */
/* loaded from: classes10.dex */
public abstract class HttpClientJvmKt {
    private static final HttpClientEngineFactory FACTORY;

    static {
        HttpClientEngineFactory factory;
        Iterator it = ServiceLoader.load(HttpClientEngineContainer.class, HttpClientEngineContainer.class.getClassLoader()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        HttpClientEngineContainer httpClientEngineContainer = (HttpClientEngineContainer) SequencesKt.firstOrNull(SequencesKt.asSequence(it));
        if (httpClientEngineContainer == null || (factory = httpClientEngineContainer.getFactory()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
        }
        FACTORY = factory;
    }

    public static final HttpClient HttpClient(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return HttpClientKt.HttpClient(FACTORY, block);
    }
}
