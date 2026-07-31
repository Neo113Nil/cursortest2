package com.my.target;

import com.my.target.internal.api.internalnativead.medialoader.Cancellable;
import com.my.target.internal.api.internalnativead.models.InternalImageData;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class h7 implements Cancellable {
    private final InternalImageData a;
    private final Runnable b;
    private volatile boolean c = false;

    public h7(InternalImageData internalImageData, Runnable runnable) {
        this.a = internalImageData;
        this.b = runnable;
    }

    public boolean a() {
        return this.c;
    }

    public synchronized void cancel() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.run();
    }
}
