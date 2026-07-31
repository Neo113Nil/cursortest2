package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzcia implements Runnable {
    zzcia(zzcic zzcicVar) {
        Objects.requireNonNull(zzcicVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
