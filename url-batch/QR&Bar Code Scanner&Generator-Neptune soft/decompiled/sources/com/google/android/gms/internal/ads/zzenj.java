package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzenj extends com.google.android.gms.ads.internal.client.zzbn {
    final zzfed zza;
    final zzdoz zzb;
    private final Context zzc;
    private final zzcom zzd;
    private com.google.android.gms.ads.internal.client.zzbf zze;

    public zzenj(zzcom zzcomVar, Context context, String str) {
        zzfed zzfedVar = new zzfed();
        this.zza = zzfedVar;
        this.zzb = new zzdoz();
        this.zzd = zzcomVar;
        zzfedVar.zzs(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final com.google.android.gms.ads.internal.client.zzbl zze() {
        zzdpb zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzfed zzfedVar = this.zza;
        if (zzfedVar.zzg() == null) {
            zzfedVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzc());
        }
        return new zzenk(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(zzbnc zzbncVar) {
        this.zzb.zza(zzbncVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(zzbnf zzbnfVar) {
        this.zzb.zzb(zzbnfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String str, zzbnl zzbnlVar, zzbni zzbniVar) {
        this.zzb.zzc(str, zzbnlVar, zzbniVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(zzbsl zzbslVar) {
        this.zzb.zzd(zzbslVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(zzbnp zzbnpVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb.zze(zzbnpVar);
        this.zza.zzr(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(zzbns zzbnsVar) {
        this.zzb.zzf(zzbnsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.zze = zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbsc zzbscVar) {
        this.zza.zzv(zzbscVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzbls zzblsVar) {
        this.zza.zzA(zzblsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        this.zza.zzQ(zzcdVar);
    }
}
