package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaug implements Runnable {
    final /* synthetic */ zzauh zza;

    zzaug(zzauh zzauhVar) {
        this.zza = zzauhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfoh zzfohVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z = this.zza.zzp;
            if (z) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzauh.zzj(this.zza);
            } catch (Exception e) {
                zzfohVar = this.zza.zzh;
                zzfohVar.zzc(2023, -1L, e);
            }
            obj2 = this.zza.zzo;
            synchronized (obj2) {
                this.zza.zzp = false;
            }
        }
    }
}
