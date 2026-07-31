package com.five_corp.ad.internal.view;

/* loaded from: classes15.dex */
public final class D implements Runnable {
    public final /* synthetic */ E a;

    public D(E e) {
        this.a = e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.setKeepScreenOn(true);
        this.a.e.setVisibility(8);
    }
}
