package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdbx implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzdbx(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final zzcgv zza = ((zzcpc) this.zzb).zza();
        final zzfef zza2 = ((zzdcr) this.zzc).zza();
        return new zzfsm() { // from class: com.google.android.gms.internal.ads.zzdbw
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                Context context2 = context;
                zzcgv zzcgvVar = zza;
                zzfef zzfefVar = zza2;
                zzfdk zzfdkVar = (zzfdk) obj;
                com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context2);
                zzasVar.zzp(zzfdkVar.zzC);
                zzasVar.zzq(zzfdkVar.zzD.toString());
                zzasVar.zzo(zzcgvVar.zza);
                zzasVar.zzn(zzfefVar.zzf);
                return zzasVar;
            }
        };
    }
}
