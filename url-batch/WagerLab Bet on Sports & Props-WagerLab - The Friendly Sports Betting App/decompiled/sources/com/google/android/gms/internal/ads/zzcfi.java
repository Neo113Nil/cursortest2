package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzcfi implements Runnable {
    final /* synthetic */ zzcfn zza;

    zzcfi(zzcfn zzcfnVar) {
        Objects.requireNonNull(zzcfnVar);
        this.zza = zzcfnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
