package io.ably.lib.network;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes7.dex */
public class DefaultHttpEngine implements HttpEngine {
    private final HttpEngineConfig config;

    public DefaultHttpEngine(HttpEngineConfig httpEngineConfig) {
        this.config = httpEngineConfig;
    }

    @Override // io.ably.lib.network.HttpEngine
    public HttpCall call(HttpRequest httpRequest) {
        Proxy proxy;
        if (isUsingProxy()) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.config.getProxy().getHost(), this.config.getProxy().getPort()));
        } else {
            proxy = Proxy.NO_PROXY;
        }
        return new DefaultHttpCall(httpRequest, proxy);
    }

    @Override // io.ably.lib.network.HttpEngine
    public boolean isUsingProxy() {
        return this.config.getProxy() != null;
    }
}
