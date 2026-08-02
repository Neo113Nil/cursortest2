package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcja implements Runnable {
    private final zzcim zza;
    private boolean zzb = false;

    zzcja(zzcim zzcimVar) {
        this.zza = zzcimVar;
    }

    private final void zzc() {
        com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this);
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
