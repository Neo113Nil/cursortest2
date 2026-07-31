package com.five_corp.ad.internal.view;

import android.view.View;

/* loaded from: classes15.dex */
public final class w implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ E b;

    public w(E e, View view) {
        this.b = e;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.addView(this.a);
    }
}
