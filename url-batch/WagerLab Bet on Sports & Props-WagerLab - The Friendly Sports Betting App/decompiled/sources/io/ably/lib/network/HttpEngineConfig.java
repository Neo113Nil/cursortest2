package io.ably.lib.network;

/* loaded from: classes7.dex */
public class HttpEngineConfig {
    private final ProxyConfig proxy;

    protected boolean canEqual(Object obj) {
        return obj instanceof HttpEngineConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpEngineConfig)) {
            return false;
        }
        HttpEngineConfig httpEngineConfig = (HttpEngineConfig) obj;
        if (!httpEngineConfig.canEqual(this)) {
            return false;
        }
        ProxyConfig proxy = getProxy();
        ProxyConfig proxy2 = httpEngineConfig.getProxy();
        return proxy != null ? proxy.equals(proxy2) : proxy2 == null;
    }

    public int hashCode() {
        ProxyConfig proxy = getProxy();
        return 59 + (proxy == null ? 43 : proxy.hashCode());
    }

    public String toString() {
        return "HttpEngineConfig(proxy=" + getProxy() + ")";
    }

    public static class HttpEngineConfigBuilder {
        private ProxyConfig proxy;

        HttpEngineConfigBuilder() {
        }

        public HttpEngineConfig build() {
            return new HttpEngineConfig(this.proxy);
        }

        public HttpEngineConfigBuilder proxy(ProxyConfig proxyConfig) {
            this.proxy = proxyConfig;
            return this;
        }

        public String toString() {
            return "HttpEngineConfig.HttpEngineConfigBuilder(proxy=" + this.proxy + ")";
        }
    }

    public static HttpEngineConfigBuilder builder() {
        return new HttpEngineConfigBuilder();
    }

    public HttpEngineConfig(ProxyConfig proxyConfig) {
        this.proxy = proxyConfig;
    }

    public ProxyConfig getProxy() {
        return this.proxy;
    }
}
