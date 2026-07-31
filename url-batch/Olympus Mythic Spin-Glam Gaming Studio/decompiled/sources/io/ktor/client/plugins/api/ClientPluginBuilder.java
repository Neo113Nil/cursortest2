package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientPluginBuilder.kt */
/* loaded from: classes15.dex */
public final class ClientPluginBuilder {
    private final HttpClient client;
    private final List hooks;
    private final AttributeKey key;
    private Function0 onClose;
    private final Object pluginConfig;

    public ClientPluginBuilder(AttributeKey key, HttpClient client, Object pluginConfig) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(pluginConfig, "pluginConfig");
        this.key = key;
        this.client = client;
        this.pluginConfig = pluginConfig;
        this.hooks = new ArrayList();
        this.onClose = new Function0() { // from class: io.ktor.client.plugins.api.ClientPluginBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        };
    }

    public final HttpClient getClient() {
        return this.client;
    }

    public final Object getPluginConfig() {
        return this.pluginConfig;
    }

    public final List getHooks$ktor_client_core() {
        return this.hooks;
    }

    public final Function0 getOnClose$ktor_client_core() {
        return this.onClose;
    }

    public final void onRequest(Function4 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        on(RequestHook.INSTANCE, block);
    }

    public final void transformResponseBody(Function5 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        on(TransformResponseBodyHook.INSTANCE, block);
    }

    public final void on(ClientHook hook, Object obj) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        this.hooks.add(new HookHandler(hook, obj));
    }
}
