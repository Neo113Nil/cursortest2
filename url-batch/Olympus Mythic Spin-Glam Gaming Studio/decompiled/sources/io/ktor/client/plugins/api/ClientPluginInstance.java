package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import java.io.Closeable;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientPluginInstance.kt */
/* loaded from: classes14.dex */
public final class ClientPluginInstance implements Closeable {
    private final Function1 body;
    private final Object config;
    private final AttributeKey key;
    private Function0 onClose;

    public ClientPluginInstance(AttributeKey key, Object config, Function1 body) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(body, "body");
        this.key = key;
        this.config = config;
        this.body = body;
        this.onClose = new Function0() { // from class: io.ktor.client.plugins.api.ClientPluginInstance$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        };
    }

    public final void install(HttpClient scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        ClientPluginBuilder clientPluginBuilder = new ClientPluginBuilder(this.key, scope, this.config);
        this.body.invoke(clientPluginBuilder);
        this.onClose = clientPluginBuilder.getOnClose$ktor_client_core();
        Iterator it = clientPluginBuilder.getHooks$ktor_client_core().iterator();
        while (it.hasNext()) {
            ((HookHandler) it.next()).install(scope);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.onClose.mo4828invoke();
    }
}
