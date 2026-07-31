package io.ktor.client;

import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.PlatformUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpClientConfig.kt */
/* loaded from: classes13.dex */
public final class HttpClientConfig {
    private boolean expectSuccess;
    private final Map plugins = new LinkedHashMap();
    private final Map pluginConfigurations = new LinkedHashMap();
    private final Map customInterceptors = new LinkedHashMap();
    private Function1 engineConfig = new Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit engineConfig$lambda$0;
            engineConfig$lambda$0 = HttpClientConfig.engineConfig$lambda$0((HttpClientEngineConfig) obj);
            return engineConfig$lambda$0;
        }
    };
    private boolean followRedirects = true;
    private boolean useDefaultTransformers = true;
    private boolean developmentMode = PlatformUtils.INSTANCE.getIS_DEVELOPMENT_MODE();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit engineConfig$lambda$0(HttpClientEngineConfig httpClientEngineConfig) {
        Intrinsics.checkNotNullParameter(httpClientEngineConfig, "<this>");
        return Unit.INSTANCE;
    }

    public final Function1 getEngineConfig$ktor_client_core() {
        return this.engineConfig;
    }

    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public final boolean getUseDefaultTransformers() {
        return this.useDefaultTransformers;
    }

    public final boolean getExpectSuccess() {
        return this.expectSuccess;
    }

    public static /* synthetic */ void install$default(HttpClientConfig httpClientConfig, HttpClientPlugin httpClientPlugin, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit install$lambda$2;
                    install$lambda$2 = HttpClientConfig.install$lambda$2(obj2);
                    return install$lambda$2;
                }
            };
        }
        httpClientConfig.install(httpClientPlugin, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit install$lambda$2(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return Unit.INSTANCE;
    }

    public final void install(final HttpClientPlugin plugin, final Function1 configure) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(configure, "configure");
        final Function1 function1 = (Function1) this.pluginConfigurations.get(plugin.getKey());
        this.pluginConfigurations.put(plugin.getKey(), new Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit install$lambda$3;
                install$lambda$3 = HttpClientConfig.install$lambda$3(Function1.this, configure, obj);
                return install$lambda$3;
            }
        });
        if (this.plugins.containsKey(plugin.getKey())) {
            return;
        }
        this.plugins.put(plugin.getKey(), new Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit install$lambda$5;
                install$lambda$5 = HttpClientConfig.install$lambda$5(HttpClientPlugin.this, (HttpClient) obj);
                return install$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit install$lambda$3(Function1 function1, Function1 function12, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (function1 != null) {
            function1.invoke(obj);
        }
        function12.invoke(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit install$lambda$5(HttpClientPlugin httpClientPlugin, HttpClient scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Attributes attributes = (Attributes) scope.getAttributes().computeIfAbsent(HttpClientPluginKt.getPLUGIN_INSTALLED_LIST(), new Function0() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Attributes install$lambda$5$lambda$4;
                install$lambda$5$lambda$4 = HttpClientConfig.install$lambda$5$lambda$4();
                return install$lambda$5$lambda$4;
            }
        });
        Object obj = scope.getConfig$ktor_client_core().pluginConfigurations.get(httpClientPlugin.getKey());
        Intrinsics.checkNotNull(obj);
        Object prepare = httpClientPlugin.prepare((Function1) obj);
        httpClientPlugin.install(prepare, scope);
        attributes.put(httpClientPlugin.getKey(), prepare);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Attributes install$lambda$5$lambda$4() {
        return AttributesJvmKt.Attributes(true);
    }

    public final void install(String key, Function1 block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        this.customInterceptors.put(key, block);
    }

    public final void install(HttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        Iterator it = this.plugins.values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(client);
        }
        Iterator it2 = this.customInterceptors.values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(client);
        }
    }

    public final void plusAssign(HttpClientConfig other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.followRedirects = other.followRedirects;
        this.useDefaultTransformers = other.useDefaultTransformers;
        this.expectSuccess = other.expectSuccess;
        this.plugins.putAll(other.plugins);
        this.pluginConfigurations.putAll(other.pluginConfigurations);
        this.customInterceptors.putAll(other.customInterceptors);
    }
}
