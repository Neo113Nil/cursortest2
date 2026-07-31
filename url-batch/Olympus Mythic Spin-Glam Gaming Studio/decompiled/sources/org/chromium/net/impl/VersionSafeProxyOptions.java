package org.chromium.net.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.net.Proxy;
import org.chromium.net.ProxyOptions;
import org.chromium.net.impl.VersionSafeCallbacks;
import org.chromium.net.impl.proto.Proxy;
import org.chromium.net.impl.proto.ProxyOptions;
import org.chromium.net.impl.proto.ProxyScheme;

/* loaded from: classes14.dex */
final class VersionSafeProxyOptions {
    private static final int SET_PROXY_OPTIONS_API_LEVEL = 38;

    @NonNull
    private final ProxyOptions mBackend;

    private static boolean apiContainsProxyOptionsClass() {
        return VersionSafeCallbacks.ApiVersion.getMaximumAvailableApiLevel() >= 38;
    }

    VersionSafeProxyOptions(@NonNull ProxyOptions proxyOptions) {
        if (!apiContainsProxyOptionsClass()) {
            throw new AssertionError(String.format("This should have not been created: the Cronet API being used has an ApiLevel of %s, but setProxyOptions was added in ApiLevel %s", Integer.valueOf(VersionSafeCallbacks.ApiVersion.getMaximumAvailableApiLevel()), 38));
        }
        Objects.requireNonNull(proxyOptions);
        this.mBackend = proxyOptions;
        if (proxyOptions.getProxyList().isEmpty()) {
            throw new AssertionError("The list of proxies should never be empty, this is checked in the API layer");
        }
    }

    @NonNull
    List<VersionSafeProxyCallback> createProxyCallbackList() {
        ArrayList arrayList = new ArrayList();
        Iterator<Proxy> it = this.mBackend.getProxyList().iterator();
        while (it.hasNext()) {
            Proxy next = it.next();
            arrayList.add(next == null ? null : new VersionSafeProxyCallback(next.getExecutor(), next.getCallback()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @NonNull
    org.chromium.net.impl.proto.ProxyOptions createProxyOptionsProto() {
        ProxyOptions.Builder newBuilder = org.chromium.net.impl.proto.ProxyOptions.newBuilder();
        for (Proxy proxy : this.mBackend.getProxyList()) {
            Proxy.Builder newBuilder2 = org.chromium.net.impl.proto.Proxy.newBuilder();
            if (proxy == null) {
                newBuilder2.setScheme(ProxyScheme.DIRECT);
            } else {
                newBuilder2.setHost(proxy.getHost());
                newBuilder2.setPort(proxy.getPort());
                int scheme = proxy.getScheme();
                if (scheme == 0) {
                    newBuilder2.setScheme(ProxyScheme.HTTP);
                } else if (scheme == 1) {
                    newBuilder2.setScheme(ProxyScheme.HTTPS);
                } else {
                    throw new AssertionError(String.format("Unknown Proxy.Scheme: %s. This should have been caught by the API layer", Integer.valueOf(scheme)));
                }
            }
            newBuilder.addProxies(newBuilder2.build());
        }
        return newBuilder.build();
    }
}
