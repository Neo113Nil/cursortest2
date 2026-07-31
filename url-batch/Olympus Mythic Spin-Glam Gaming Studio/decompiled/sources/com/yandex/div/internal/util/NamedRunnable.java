package com.yandex.div.internal.util;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.yandex.div.core.annotations.InternalApi;

@InternalApi
/* loaded from: classes6.dex */
public abstract class NamedRunnable implements Runnable {

    @NonNull
    private final String mThreadSuffix;

    @WorkerThread
    public abstract void execute();

    public NamedRunnable(@NonNull String str) {
        this.mThreadSuffix = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(name + "-" + this.mThreadSuffix);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
