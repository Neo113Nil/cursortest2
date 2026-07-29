package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzcht implements Runnable {
    private final zzchf zza;
    private boolean zzb = false;

    zzcht(zzchf zzchfVar) {
        this.zza = zzchfVar;
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
        this.zza.zzs();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzs();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
