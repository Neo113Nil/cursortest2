package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbg {
    public static final zzbg zza = new zzaj().zzc();
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzah
    };
    public final String zzc;
    public final zzay zzd;

    @Deprecated
    public final zzba zze;
    public final zzaw zzf;
    public final zzbm zzg;
    public final zzan zzh;

    @Deprecated
    public final zzap zzi;
    public final zzbd zzj;

    /* synthetic */ zzbg(String str, zzap zzapVar, zzba zzbaVar, zzaw zzawVar, zzbm zzbmVar, zzbd zzbdVar, zzbf zzbfVar) {
        this.zzc = str;
        this.zzd = zzbaVar;
        this.zze = zzbaVar;
        this.zzf = zzawVar;
        this.zzg = zzbmVar;
        this.zzh = zzapVar;
        this.zzi = zzapVar;
        this.zzj = zzbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbg)) {
            return false;
        }
        zzbg zzbgVar = (zzbg) obj;
        return zzen.zzT(this.zzc, zzbgVar.zzc) && this.zzh.equals(zzbgVar.zzh) && zzen.zzT(this.zzd, zzbgVar.zzd) && zzen.zzT(this.zzf, zzbgVar.zzf) && zzen.zzT(this.zzg, zzbgVar.zzg) && zzen.zzT(this.zzj, zzbgVar.zzj);
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() * 31;
        zzay zzayVar = this.zzd;
        return (((((((hashCode + (zzayVar != null ? zzayVar.hashCode() : 0)) * 31) + this.zzf.hashCode()) * 31) + this.zzh.hashCode()) * 31) + this.zzg.hashCode()) * 31;
    }
}
