package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultExecutorSupplier.java */
/* loaded from: classes15.dex */
public class a implements j {
    private final ThreadPoolExecutor a;
    private final b b;

    a(int i) {
        b bVar = new b(i <= 0 ? 10 : i, new o(10), new ThreadPoolExecutor.DiscardPolicy());
        this.b = bVar;
        bVar.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o(10), new ThreadPoolExecutor.DiscardPolicy());
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.j
    public ExecutorService getDownloadResultTasks() {
        return this.a;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.j
    public b getDownloadTasks() {
        return this.b;
    }
}
