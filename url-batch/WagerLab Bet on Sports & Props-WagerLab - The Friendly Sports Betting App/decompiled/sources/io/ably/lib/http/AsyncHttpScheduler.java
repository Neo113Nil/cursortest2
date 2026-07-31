package io.ably.lib.http;

import io.ably.lib.types.ClientOptions;
import io.ably.lib.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class AsyncHttpScheduler extends HttpScheduler {
    private static final long KEEP_ALIVE_TIME = 2000;
    protected static final String TAG = "io.ably.lib.http.AsyncHttpScheduler";

    public AsyncHttpScheduler(HttpCore httpCore, ClientOptions clientOptions) {
        super(httpCore, new CloseableThreadPoolExecutor(clientOptions));
    }

    private AsyncHttpScheduler(HttpCore httpCore, CloseableExecutor closeableExecutor) {
        super(httpCore, closeableExecutor);
    }

    public AsyncHttpScheduler exchangeHttpCore(HttpCore httpCore) {
        return new AsyncHttpScheduler(httpCore, this.executor);
    }

    public void connect() {
        ((CloseableThreadPoolExecutor) this.executor).connect();
    }

    private static class CloseableThreadPoolExecutor implements CloseableExecutor {
        private volatile ThreadPoolExecutor executor;
        private final ClientOptions options;

        CloseableThreadPoolExecutor(ClientOptions clientOptions) {
            this.options = clientOptions;
            this.executor = new ThreadPoolExecutor(clientOptions.asyncHttpThreadpoolSize, clientOptions.asyncHttpThreadpoolSize, 2000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.executor.execute(runnable);
        }

        @Override // java.lang.AutoCloseable
        public void close() throws Exception {
            int size = this.executor.shutdownNow().size();
            if (size > 0) {
                Log.w(AsyncHttpScheduler.TAG, "close() drained (cancelled) task count: " + size);
            }
        }

        public void connect() {
            if (this.executor.isShutdown()) {
                this.executor = new ThreadPoolExecutor(this.options.asyncHttpThreadpoolSize, this.options.asyncHttpThreadpoolSize, 2000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            }
        }
    }
}
