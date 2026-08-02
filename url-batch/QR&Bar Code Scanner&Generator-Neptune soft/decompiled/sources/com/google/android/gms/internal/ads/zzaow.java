package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaow implements Runnable {
    final /* synthetic */ zzaox zza;

    zzaow(zzaox zzaoxVar) {
        this.zza = zzaoxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfmx zzfmxVar;
        Object obj2;
        obj = this.zza.zzm;
        synchronized (obj) {
            z = this.zza.zzn;
            if (z) {
                return;
            }
            this.zza.zzn = true;
            try {
                zzaox.zzj(this.zza);
            } catch (Exception e) {
                zzfmxVar = this.zza.zzh;
                zzfmxVar.zzc(2023, -1L, e);
            }
            obj2 = this.zza.zzm;
            synchronized (obj2) {
                this.zza.zzn = false;
            }
        }
    }
}
