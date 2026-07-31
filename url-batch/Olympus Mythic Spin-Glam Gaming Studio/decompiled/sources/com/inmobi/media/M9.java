package com.inmobi.media;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class M9 implements ThreadFactory {
    public final boolean a;
    public final String b;

    public M9(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = z;
        this.b = "TIM-" + name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        try {
            Thread thread = new Thread(r, this.b);
            thread.setDaemon(this.a);
            return thread;
        } catch (InternalError e) {
            e.toString();
            return null;
        }
    }
}
