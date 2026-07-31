package io.ktor.client.plugins.api;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreatePluginUtils.kt */
/* loaded from: classes6.dex */
public abstract class CreatePluginUtilsKt {
    public static final ClientPlugin createClientPlugin(String name, Function0 createConfiguration, Function1 body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createConfiguration, "createConfiguration");
        Intrinsics.checkNotNullParameter(body, "body");
        return new ClientPluginImpl(name, createConfiguration, body);
    }

    public static final ClientPlugin createClientPlugin(String name, Function1 body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        return createClientPlugin(name, new Function0() { // from class: io.ktor.client.plugins.api.CreatePluginUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, body);
    }
}
