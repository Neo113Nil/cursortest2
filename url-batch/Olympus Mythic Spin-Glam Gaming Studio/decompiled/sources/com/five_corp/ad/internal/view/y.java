package com.five_corp.ad.internal.view;

/* loaded from: classes15.dex */
public final class y implements Runnable {
    public final /* synthetic */ E a;

    public y(E e) {
        this.a = e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.setKeepScreenOn(false);
        this.a.e.setVisibility(8);
    }
}
