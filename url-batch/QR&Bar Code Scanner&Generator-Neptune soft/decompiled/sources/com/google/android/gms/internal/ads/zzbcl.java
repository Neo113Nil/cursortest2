package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbcl implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbcp zzb;

    zzbcl(zzbcp zzbcpVar, View view) {
        this.zzb = zzbcpVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
