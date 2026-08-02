package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfoy {
    final /* synthetic */ zzfoz zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfoy(zzfoz zzfozVar, byte[] bArr, zzfox zzfoxVar) {
        this.zza = zzfozVar;
        this.zzb = bArr;
    }

    public final zzfoy zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfoy zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfoz zzfozVar = this.zza;
            if (zzfozVar.zzb) {
                zzfozVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
