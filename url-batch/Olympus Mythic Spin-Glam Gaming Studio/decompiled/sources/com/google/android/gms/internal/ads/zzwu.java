package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzwu implements zzxz, zzuo {
    final /* synthetic */ zzww zza;
    private final Object zzb;
    private zzxy zzc;
    private zzun zzd;

    public zzwu(zzww zzwwVar, Object obj) {
        Objects.requireNonNull(zzwwVar);
        this.zza = zzwwVar;
        this.zzc = zzwwVar.zzf(null);
        this.zzd = zzwwVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, @Nullable zzxo zzxoVar) {
        zzxo zzxoVar2;
        if (zzxoVar != null) {
            zzxoVar2 = this.zza.zzy(this.zzb, zzxoVar);
            if (zzxoVar2 == null) {
                return false;
            }
        } else {
            zzxoVar2 = null;
        }
        zzww zzwwVar = this.zza;
        zzwwVar.zzx(this.zzb, 0);
        zzxy zzxyVar = this.zzc;
        int i2 = zzxyVar.zza;
        if (!Objects.equals(zzxyVar.zzb, zzxoVar2)) {
            this.zzc = zzwwVar.zzg(0, zzxoVar2);
        }
        zzun zzunVar = this.zzd;
        int i3 = zzunVar.zza;
        if (Objects.equals(zzunVar.zzb, zzxoVar2)) {
            return true;
        }
        this.zzd = zzwwVar.zzi(0, zzxoVar2);
        return true;
    }

    private final zzxk zzg(zzxk zzxkVar, @Nullable zzxo zzxoVar) {
        zzww zzwwVar = this.zza;
        Object obj = this.zzb;
        zzwwVar.zzz(obj, zzxkVar.zzc, zzxoVar);
        zzwwVar.zzz(obj, zzxkVar.zzd, zzxoVar);
        return zzxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzai(int i, @Nullable zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar, int i2) {
        if (zzf(0, zzxoVar)) {
            zzxy zzxyVar = this.zzc;
            zzg(zzxkVar, zzxoVar);
            zzxyVar.zzd(zzxfVar, zzxkVar, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzaj(int i, @Nullable zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar) {
        if (zzf(0, zzxoVar)) {
            zzxy zzxyVar = this.zzc;
            zzg(zzxkVar, zzxoVar);
            zzxyVar.zze(zzxfVar, zzxkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzak(int i, @Nullable zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar) {
        if (zzf(0, zzxoVar)) {
            zzxy zzxyVar = this.zzc;
            zzg(zzxkVar, zzxoVar);
            zzxyVar.zzf(zzxfVar, zzxkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzal(int i, @Nullable zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar, IOException iOException, boolean z) {
        if (zzf(0, zzxoVar)) {
            zzxy zzxyVar = this.zzc;
            zzg(zzxkVar, zzxoVar);
            zzxyVar.zzg(zzxfVar, zzxkVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzam(int i, @Nullable zzxo zzxoVar, zzxk zzxkVar) {
        if (zzf(0, zzxoVar)) {
            zzxy zzxyVar = this.zzc;
            zzg(zzxkVar, zzxoVar);
            zzxyVar.zzh(zzxkVar);
        }
    }
}
