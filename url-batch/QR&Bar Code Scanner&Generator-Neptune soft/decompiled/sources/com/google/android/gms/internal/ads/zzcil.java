package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcil implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcim zzb;

    zzcil(zzcim zzcimVar, boolean z) {
        this.zzb = zzcimVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
