package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbeu {
    final /* synthetic */ zzbev zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbeu(zzbev zzbevVar, byte[] bArr, zzbet zzbetVar) {
        this.zza = zzbevVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbev zzbevVar = this.zza;
            if (zzbevVar.zzb) {
                zzbevVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzcgp.zzf("Clearcut log failed", e);
        }
    }

    public final zzbeu zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziG)).booleanValue()) {
            zzd();
        } else {
            executorService = this.zza.zzc;
            executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbes
                @Override // java.lang.Runnable
                public final void run() {
                    zzbeu.this.zzd();
                }
            });
        }
    }
}
