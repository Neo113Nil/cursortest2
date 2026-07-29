package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbdq {
    final /* synthetic */ zzbdr zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbdq(zzbdr zzbdrVar, byte[] bArr, zzbdp zzbdpVar) {
        this.zza = zzbdrVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbdr zzbdrVar = this.zza;
            if (zzbdrVar.zzb) {
                zzbdrVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzcfi.zzf("Clearcut log failed", e);
        }
    }

    public final zzbdq zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzin)).booleanValue()) {
            zzd();
        } else {
            executorService = this.zza.zzc;
            executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdo
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdq.this.zzd();
                }
            });
        }
    }
}
