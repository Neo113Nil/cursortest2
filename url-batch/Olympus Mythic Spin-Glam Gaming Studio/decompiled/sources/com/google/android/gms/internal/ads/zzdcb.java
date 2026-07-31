package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdcb implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzdcb(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzdcb zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzdcb(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcpa) this.zzb).zza();
        final zzflw zza2 = ((zzddg) this.zzc).zza();
        return new zzgub() { // from class: com.google.android.gms.internal.ads.zzdca
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzfld zzfldVar = (zzfld) obj;
                com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
                zzatVar.zze(zzfldVar.zzB);
                zzatVar.zzf(zzfldVar.zzC.toString());
                zzatVar.zzd(zza.afmaVersion);
                zzatVar.zzc(zza2.zzg);
                return zzatVar;
            }
        };
    }
}
