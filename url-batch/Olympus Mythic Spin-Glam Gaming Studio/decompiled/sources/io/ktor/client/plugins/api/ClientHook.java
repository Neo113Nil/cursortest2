package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;

/* compiled from: ClientHook.kt */
/* loaded from: classes5.dex */
public interface ClientHook {
    void install(HttpClient httpClient, Object obj);
}
