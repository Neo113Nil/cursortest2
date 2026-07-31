package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientHook.kt */
/* loaded from: classes11.dex */
public final class HookHandler {
    private final Object handler;
    private final ClientHook hook;

    public HookHandler(ClientHook hook, Object obj) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        this.hook = hook;
        this.handler = obj;
    }

    public final void install(HttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.hook.install(client, this.handler);
    }
}
