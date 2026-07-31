package org.chromium.net.impl;

import androidx.annotation.NonNull;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.chromium.net.Proxy;

/* loaded from: classes13.dex */
final class ProxyCallbackRequestImpl extends Proxy.Callback.Request {
    private boolean mIsConsumed;
    private final long mProxyCallbackRequestAdapter;

    interface Natives {
        void cancel(long j);

        boolean proceed(long j, String[] strArr);
    }

    @CalledByNative
    ProxyCallbackRequestImpl(long j) {
        this.mProxyCallbackRequestAdapter = j;
    }

    @Override // org.chromium.net.Proxy.Callback.Request
    public void proceed(@NonNull List<Map.Entry<String, String>> list) {
        if (this.mIsConsumed) {
            throw new IllegalStateException("This request has already been consumed: either proceed or close has already been called");
        }
        Objects.requireNonNull(list);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : list) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        if (!ProxyCallbackRequestImplJni.get().proceed(this.mProxyCallbackRequestAdapter, (String[]) arrayList.toArray(new String[arrayList.size()]))) {
            throw new IllegalArgumentException("One of the headers is invalid");
        }
        this.mIsConsumed = true;
    }

    @Override // org.chromium.net.Proxy.Callback.Request, java.lang.AutoCloseable
    public void close() {
        if (this.mIsConsumed) {
            return;
        }
        ProxyCallbackRequestImplJni.get().cancel(this.mProxyCallbackRequestAdapter);
        this.mIsConsumed = true;
    }
}
