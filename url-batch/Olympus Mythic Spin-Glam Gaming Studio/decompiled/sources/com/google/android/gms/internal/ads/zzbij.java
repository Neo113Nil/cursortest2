package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbij {
    final /* synthetic */ zzbik zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbij(zzbik zzbikVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzbikVar);
        this.zza = zzbikVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            zzbik zzbikVar = this.zza;
            if (zzbikVar.zzb) {
                zzbikVar.zza.zzh(this.zzb);
                zzbikVar.zza.zzi(0);
                zzbikVar.zza.zzj(this.zzc);
                zzbikVar.zza.zzg(null);
                zzbikVar.zza.zzf();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Clearcut log failed", e);
        }
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbii
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbij.this.zzc();
            }
        });
    }

    public final zzbij zzb(int i) {
        this.zzc = i;
        return this;
    }
}
