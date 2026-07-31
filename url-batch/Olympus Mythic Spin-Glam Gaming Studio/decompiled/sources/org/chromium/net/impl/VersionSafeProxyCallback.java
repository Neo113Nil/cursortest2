package org.chromium.net.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.Proxy;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes6.dex */
final class VersionSafeProxyCallback {
    private static final int PROXY_CALLBACK_API_LEVEL = 38;

    @NonNull
    private final Proxy.Callback mBackend;

    @NonNull
    private final Executor mExecutor;

    private boolean apiContainsProxyCallbackClass() {
        return VersionSafeCallbacks.ApiVersion.getMaximumAvailableApiLevel() >= 38;
    }

    VersionSafeProxyCallback(@NonNull Executor executor, @NonNull Proxy.Callback callback) {
        if (!apiContainsProxyCallbackClass()) {
            throw new AssertionError(String.format("This should not have been created: the Cronet API being used has an ApiLevel of %s, but ProxyCallback was added in ApiLevel %s", Integer.valueOf(VersionSafeCallbacks.ApiVersion.getMaximumAvailableApiLevel()), 38));
        }
        Objects.requireNonNull(executor);
        this.mExecutor = executor;
        Objects.requireNonNull(callback);
        this.mBackend = callback;
    }

    @NonNull
    Executor getExecutor() {
        return this.mExecutor;
    }

    void onBeforeTunnelRequest(Proxy.Callback.Request request) {
        this.mBackend.onBeforeTunnelRequest(request);
    }

    boolean onTunnelHeadersReceived(@NonNull List<Map.Entry<String, String>> list, int i) {
        return this.mBackend.onTunnelHeadersReceived(list, i);
    }
}
