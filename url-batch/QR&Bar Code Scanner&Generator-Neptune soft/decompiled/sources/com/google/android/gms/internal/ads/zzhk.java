package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhk {
    final Context zza;
    zzde zzb;
    zzftn zzc;
    zzftn zzd;
    zzftn zze;
    zzftn zzf;
    zzftn zzg;
    zzfsm zzh;
    Looper zzi;
    zzk zzj;
    int zzk;
    boolean zzl;
    zzkd zzm;
    long zzn;
    long zzo;
    boolean zzp;
    boolean zzq;
    zzgv zzr;

    static /* synthetic */ zzsh zza(Context context) {
        return new zzrv(context, new zzzd());
    }

    public zzhk(final Context context, zzcly zzclyVar, byte[] bArr) {
        zzhe zzheVar = new zzhe(zzclyVar, null);
        zzhf zzhfVar = new zzhf(context);
        zzftn zzftnVar = new zzftn() { // from class: com.google.android.gms.internal.ads.zzhg
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return new zzvr(context);
            }
        };
        zzhh zzhhVar = new zzftn() { // from class: com.google.android.gms.internal.ads.zzhh
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return new zzgw();
            }
        };
        zzhi zzhiVar = new zzhi(context);
        zzhj zzhjVar = new zzfsm() { // from class: com.google.android.gms.internal.ads.zzhj
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                return new zzms((zzde) obj);
            }
        };
        Objects.requireNonNull(context);
        this.zza = context;
        this.zzc = zzheVar;
        this.zzd = zzhfVar;
        this.zze = zzftnVar;
        this.zzf = zzhhVar;
        this.zzg = zzhiVar;
        this.zzh = zzhjVar;
        this.zzi = zzen.zzE();
        this.zzj = zzk.zza;
        this.zzk = 1;
        this.zzl = true;
        this.zzm = zzkd.zze;
        this.zzr = new zzgv(0.97f, 1.03f, 1000L, 1.0E-7f, zzen.zzv(20L), zzen.zzv(500L), 0.999f, null);
        this.zzb = zzde.zza;
        this.zzn = 500L;
        this.zzo = 2000L;
        this.zzp = true;
    }
}
