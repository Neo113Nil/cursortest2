package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzeyl implements zzeyv {
    private final zzeyv zza;
    private zzdbb zzb;

    public zzeyl(zzeyv zzeyvVar) {
        this.zza = zzeyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdbb zzd() {
        return this.zzb;
    }

    public final synchronized zzfvj zzb(zzeyw zzeywVar, zzeyu zzeyuVar, zzdbb zzdbbVar) {
        this.zzb = zzdbbVar;
        if (zzeywVar.zza == null) {
            return ((zzeyk) this.zza).zzb(zzeywVar, zzeyuVar, zzdbbVar);
        }
        zzcyz zzb = this.zzb.zzb();
        return zzb.zzh(zzb.zzj(zzfva.zzi(zzeywVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ zzfvj zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }
}
