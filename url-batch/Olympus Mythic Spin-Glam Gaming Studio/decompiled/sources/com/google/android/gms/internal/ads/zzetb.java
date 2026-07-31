package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
public final class zzetb extends com.google.android.gms.ads.internal.client.zzbp {

    @VisibleForTesting
    final zzflv zza;

    @VisibleForTesting
    final zzdra zzb;
    private final Context zzc;
    private final zzcob zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzetb(zzcob zzcobVar, Context context, String str) {
        zzflv zzflvVar = new zzflv();
        this.zza = zzflvVar;
        this.zzb = new zzdra();
        this.zzd = zzcobVar;
        zzflvVar.zzg(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdrb zzg = this.zzb.zzg();
        ArrayList zzh = zzg.zzh();
        zzflv zzflvVar = this.zza;
        zzflvVar.zzm(zzh);
        zzflvVar.zzn(zzg.zzi());
        if (zzflvVar.zzf() == null) {
            zzflvVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzb());
        }
        return new zzetc(this.zzc, this.zzd, zzflvVar, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbnq zzbnqVar) {
        this.zzb.zzb(zzbnqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(zzbnt zzbntVar) {
        this.zzb.zza(zzbntVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, zzbnz zzbnzVar, @Nullable zzbnw zzbnwVar) {
        this.zzb.zzf(str, zzbnzVar, zzbnwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbmk zzbmkVar) {
        this.zza.zzo(zzbmkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbod zzbodVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb.zzd(zzbodVar);
        this.zza.zzc(zzrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzr(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(zzbog zzbogVar) {
        this.zzb.zzc(zzbogVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbst zzbstVar) {
        this.zza.zzq(zzbstVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbtc zzbtcVar) {
        this.zzb.zze(zzbtcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzs(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.zza.zzab(zzcpVar);
    }
}
