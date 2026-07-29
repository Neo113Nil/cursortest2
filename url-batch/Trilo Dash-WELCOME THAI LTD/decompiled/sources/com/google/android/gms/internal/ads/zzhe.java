package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzhe {
    final Context zza;
    final zzcx zzb;
    final zzfph zzc;
    final zzfph zzd;
    zzfph zze;
    zzfph zzf;
    final zzfph zzg;
    final zzfoi zzh;
    final Looper zzi;
    final zzi zzj;
    final zzjx zzk;
    boolean zzl;
    final zzgp zzm;

    public zzhe(final Context context, zzckr zzckrVar, byte[] bArr) {
        zzgy zzgyVar = new zzgy(zzckrVar, null);
        zzgz zzgzVar = new zzgz(context);
        zzfph zzfphVar = new zzfph() { // from class: com.google.android.gms.internal.ads.zzha
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return new zzvf(context);
            }
        };
        zzhb zzhbVar = new zzfph() { // from class: com.google.android.gms.internal.ads.zzhb
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return new zzgq();
            }
        };
        zzhc zzhcVar = new zzhc(context);
        zzhd zzhdVar = new zzfoi() { // from class: com.google.android.gms.internal.ads.zzhd
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                return new zzmm((zzcx) obj);
            }
        };
        this.zza = context;
        this.zzc = zzgyVar;
        this.zzd = zzgzVar;
        this.zze = zzfphVar;
        this.zzf = zzhbVar;
        this.zzg = zzhcVar;
        this.zzh = zzhdVar;
        this.zzi = zzeg.zzD();
        this.zzj = zzi.zza;
        this.zzk = zzjx.zze;
        this.zzm = new zzgp(0.97f, 1.03f, 1000L, 1.0E-7f, zzeg.zzv(20L), zzeg.zzv(500L), 0.999f, null);
        this.zzb = zzcx.zza;
    }

    static /* synthetic */ zzsa zza(Context context) {
        return new zzro(context, new zzyo());
    }
}
