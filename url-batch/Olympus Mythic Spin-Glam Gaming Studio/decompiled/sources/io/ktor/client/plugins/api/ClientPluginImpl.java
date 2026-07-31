package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* compiled from: CreatePluginUtils.kt */
/* loaded from: classes10.dex */
final class ClientPluginImpl implements ClientPlugin {
    private final Function1 body;
    private final Function0 createConfiguration;
    private final AttributeKey key;

    public ClientPluginImpl(String name, Function0 createConfiguration, Function1 body) {
        KType kType;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createConfiguration, "createConfiguration");
        Intrinsics.checkNotNullParameter(body, "body");
        this.createConfiguration = createConfiguration;
        this.body = body;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientPluginInstance.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KTypeParameter typeParameter = Reflection.typeParameter(Reflection.getOrCreateKotlinClass(ClientPluginImpl.class), "PluginConfigT", KVariance.INVARIANT, false);
            Reflection.setUpperBounds(typeParameter, Reflection.typeOf(Object.class));
            kType = Reflection.typeOf(ClientPluginInstance.class, companion.invariant(Reflection.typeOf(typeParameter)));
        } catch (Throwable unused) {
            kType = null;
        }
        this.key = new AttributeKey(name, new TypeInfo(orCreateKotlinClass, kType));
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public AttributeKey getKey() {
        return this.key;
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public ClientPluginInstance prepare(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object mo4828invoke = this.createConfiguration.mo4828invoke();
        block.invoke(mo4828invoke);
        return new ClientPluginInstance(getKey(), mo4828invoke, this.body);
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public void install(ClientPluginInstance plugin, HttpClient scope) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(scope, "scope");
        plugin.install(scope);
    }
}
