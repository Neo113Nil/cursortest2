package com.five_corp.ad.internal.system;

import androidx.lifecycle.ProcessLifecycleOwner;

/* loaded from: classes5.dex */
public final class a implements Runnable {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProcessLifecycleOwner.get().getLifecycleRegistry().addObserver(this.a);
    }
}
