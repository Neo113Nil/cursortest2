package com.five_corp.ad.internal.view;

/* loaded from: classes15.dex */
public final class B implements Runnable {
    public final /* synthetic */ E a;

    public B(E e) {
        this.a = e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.setKeepScreenOn(false);
        this.a.a();
    }
}
