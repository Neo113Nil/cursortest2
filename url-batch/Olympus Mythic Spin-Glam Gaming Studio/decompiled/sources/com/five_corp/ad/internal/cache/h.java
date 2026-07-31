package com.five_corp.ad.internal.cache;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public final class h implements Runnable {
    public final /* synthetic */ e a;
    public final /* synthetic */ Bitmap b;

    public h(e eVar, Bitmap bitmap) {
        this.a = eVar;
        this.b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
