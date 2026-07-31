package com.safedk.android.internal;

import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.SDKDependancy;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

@SDKDependancy(packageName = "okio")
/* loaded from: classes3.dex */
public class SafeDKSource implements Source {
    private static final String TAG = "SafeDKSource";
    private int bodyId;
    private final Source delegate;

    public static BufferedSource create(BufferedSource delegate, int bodyId) {
        return Okio.buffer(new SafeDKSource(delegate, bodyId));
    }

    private SafeDKSource(BufferedSource delegate, int bodyId) {
        this.delegate = delegate;
        this.bodyId = bodyId;
    }

    @Override // okio.Source
    public long read(Buffer sink, long byteCount) throws IOException {
        try {
            long ForwardingSource_read = ForwardingSource_read(sink, byteCount);
            Logger.d(TAG, "retrofit read - body id= ", Integer.valueOf(this.bodyId), ",  max bytes= ", Long.valueOf(byteCount), " actual count= ", Long.valueOf(ForwardingSource_read));
            if (ForwardingSource_read > 0) {
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.d.get(Integer.valueOf(this.bodyId));
                if (requestInfo != null) {
                    long size = sink.size();
                    long j = size - ForwardingSource_read;
                    byte[] byteArray = sink.snapshot().substring((int) j, (int) size).toByteArray();
                    Logger.d(TAG, "retrofit read - updating buffer body id= ", Integer.valueOf(this.bodyId), ",  total length= ", Long.valueOf(size), ",    offset= ", Long.valueOf(j), ", chunk read length= ", Integer.valueOf(byteArray.length));
                    requestInfo.a(byteArray, byteArray.length);
                } else {
                    Logger.v(TAG, "retrofit read cant find bodyId ", Integer.valueOf(this.bodyId));
                }
            }
            return ForwardingSource_read;
        } catch (IOException e) {
            Logger.e(TAG, "retrofit SafeDKSource :", e.getMessage());
            throw e;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ForwardingSource_close();
        NetworkBridge.RequestInfo remove = NetworkBridge.d.remove(Integer.valueOf(this.bodyId));
        Logger.v(TAG, "retrofit closing. close reqInfo = ", remove);
        if (remove != null && remove.d()) {
            Logger.v(TAG, "retrofit closing. package: ", remove.a(), ", url: ", remove.b());
            CreativeInfoManager.a(remove.a(), remove.b(), remove.c(), (Map<String, List<String>>) null);
        }
    }

    public final Source delegate() {
        return this.delegate;
    }

    public long ForwardingSource_read(Buffer sink, long byteCount) throws IOException {
        return this.delegate.read(sink, byteCount);
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public Timeout getTimeout() {
        return this.delegate.getTimeout();
    }

    public void ForwardingSource_close() throws IOException {
        this.delegate.close();
    }
}
