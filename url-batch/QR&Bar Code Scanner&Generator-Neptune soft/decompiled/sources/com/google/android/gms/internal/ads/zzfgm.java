package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfgm {
    private final zzffq zza;
    private final zzfgk zzb;
    private final zzffm zzc;
    private zzfgs zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfgm(zzffq zzffqVar, zzffm zzffmVar, zzfgk zzfgkVar) {
        this.zza = zzffqVar;
        this.zzc = zzffmVar;
        this.zzb = zzfgkVar;
        zzffmVar.zzb(new zzfgh(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfs)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfgl zzfglVar = (zzfgl) this.zzd.pollFirst();
                if (zzfglVar == null || (zzfglVar.zza() != null && this.zza.zze(zzfglVar.zza()))) {
                    zzfgs zzfgsVar = new zzfgs(this.zza, this.zzb, zzfglVar);
                    this.zze = zzfgsVar;
                    zzfgsVar.zzd(new zzfgi(this, zzfglVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized zzfzp zza(zzfgl zzfglVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfglVar);
    }

    public final synchronized void zze(zzfgl zzfglVar) {
        this.zzd.add(zzfglVar);
    }

    final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
