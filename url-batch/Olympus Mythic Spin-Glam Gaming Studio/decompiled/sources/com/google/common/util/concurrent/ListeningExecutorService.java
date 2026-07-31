package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public interface ListeningExecutorService extends ExecutorService {
    ListenableFuture submit(Callable callable);
}
