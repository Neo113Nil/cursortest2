package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.pg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5595pg implements Runnable {
    public final File a;
    public final Consumer b;

    public RunnableC5595pg(File file, C5767w6 c5767w6) {
        this.a = file;
        this.b = c5767w6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (!this.a.exists() || !this.a.isDirectory() || (listFiles = this.a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                this.b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
