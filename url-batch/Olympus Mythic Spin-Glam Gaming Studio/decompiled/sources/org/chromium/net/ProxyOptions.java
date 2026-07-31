package org.chromium.net;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresOptIn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ProxyOptions {

    @NonNull
    private final List<Proxy> mProxyList;

    @RequiresOptIn
    public @interface Experimental {
    }

    public ProxyOptions(@NonNull List<Proxy> list) {
        Objects.requireNonNull(list);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("ProxyList cannot be empty");
        }
        int indexOf = list.indexOf(null);
        if (indexOf != -1 && indexOf != list.size() - 1) {
            throw new IllegalArgumentException("Null is allowed only as the last element in the proxy list");
        }
        this.mProxyList = new ArrayList(list);
    }

    @NonNull
    public List<Proxy> getProxyList() {
        return Collections.unmodifiableList(this.mProxyList);
    }
}
