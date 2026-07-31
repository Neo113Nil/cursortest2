package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgch implements zzgcg {
    private final zzfvl zza;
    private final zzfvl zzb;
    private final zzhpr zzc;
    private final zzgea zzd;

    zzgch(zzfvl zzfvlVar, zzfvl zzfvlVar2, zzhpr zzhprVar, zzgea zzgeaVar) {
        this.zza = zzfvlVar;
        this.zzb = zzfvlVar2;
        this.zzc = zzhprVar;
        this.zzd = zzgeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final ListenableFuture zza() {
        ListenableFuture zzb = this.zza.zzb();
        this.zzd.zze(15302, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final ListenableFuture zzb(zzfwm zzfwmVar) {
        ListenableFuture zzc = this.zza.zzc(zzfwmVar);
        this.zzd.zze(15303, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final ListenableFuture zzc(byte[] bArr) {
        ListenableFuture zzc = this.zzb.zzc(bArr);
        this.zzd.zze(15305, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final File zzd() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final ListenableFuture zze(byte[] bArr) {
        ListenableFuture zzc = ((zzfvl) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(15307, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final File zzf() {
        return ((zzfvl) this.zzc.zzb()).zza();
    }
}
