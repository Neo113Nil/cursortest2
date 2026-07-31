package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class B5 {
    public final C5 a;

    public B5(C5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = listener;
    }

    public abstract void a();

    public abstract void b();
}
