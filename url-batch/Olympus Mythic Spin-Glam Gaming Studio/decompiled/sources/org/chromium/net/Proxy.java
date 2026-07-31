package org.chromium.net;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public final class Proxy {
    public static final int HTTP = 0;
    public static final int HTTPS = 1;

    @NonNull
    private final Callback mCallback;

    @NonNull
    private final Executor mExecutor;

    @NonNull
    private final String mHost;
    private final int mPort;
    private final int mScheme;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Scheme {
    }

    public static abstract class Callback {

        public static abstract class Request implements AutoCloseable {
            @Override // java.lang.AutoCloseable
            public abstract void close();

            public abstract void proceed(@NonNull List<Map.Entry<String, String>> list);
        }

        public abstract boolean onTunnelHeadersReceived(@NonNull List<Map.Entry<String, String>> list, int i);

        public void onBeforeTunnelRequest(@NonNull Request request) {
            try {
                List<Map.Entry<String, String>> onBeforeTunnelRequest = onBeforeTunnelRequest();
                if (onBeforeTunnelRequest != null) {
                    request.proceed(onBeforeTunnelRequest);
                }
                if (request != null) {
                    request.close();
                }
            } catch (Throwable th) {
                if (request != null) {
                    try {
                        request.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Nullable
        @Deprecated
        public List<Map.Entry<String, String>> onBeforeTunnelRequest() {
            throw new UnsupportedOperationException("At least one overload of onBeforeTunnelRequest must be overridden");
        }
    }

    public Proxy(int i, @NonNull String str, int i2, @NonNull Executor executor, @NonNull Callback callback) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(String.format("Unknown scheme %s", Integer.valueOf(i)));
        }
        this.mScheme = i;
        Objects.requireNonNull(str);
        this.mHost = str;
        this.mPort = i2;
        Objects.requireNonNull(executor);
        this.mExecutor = executor;
        Objects.requireNonNull(callback);
        this.mCallback = callback;
    }

    @Deprecated
    public Proxy(int i, @NonNull String str, int i2, @NonNull Callback callback) {
        this(i, str, i2, new Executor() { // from class: org.chromium.net.Proxy$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, callback);
    }

    public int getScheme() {
        return this.mScheme;
    }

    @NonNull
    public String getHost() {
        return this.mHost;
    }

    public int getPort() {
        return this.mPort;
    }

    @NonNull
    public Executor getExecutor() {
        return this.mExecutor;
    }

    @NonNull
    public Callback getCallback() {
        return this.mCallback;
    }
}
