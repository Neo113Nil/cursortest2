package com.five_corp.ad.internal.view;

/* loaded from: classes15.dex */
public final class x implements Runnable {
    public final /* synthetic */ E a;

    public x(E e) {
        this.a = e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e.setVisibility(0);
    }
}
