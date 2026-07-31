package io.ktor.client.engine;

import java.net.Proxy;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: HttpClientEngineConfig.kt */
/* loaded from: classes5.dex */
public abstract class HttpClientEngineConfig {
    private CoroutineDispatcher dispatcher;
    private Proxy proxy;
    private int threadsCount = 4;

    public final CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final Proxy getProxy() {
        return this.proxy;
    }
}
