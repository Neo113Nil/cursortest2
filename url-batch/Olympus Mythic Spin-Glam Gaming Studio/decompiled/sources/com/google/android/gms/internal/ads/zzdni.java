package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdni implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;

    private zzdni(zzdnb zzdnbVar, zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
    }

    public static zzdni zza(zzdnb zzdnbVar, zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzdni(zzdnbVar, zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcpa) this.zzb).zza();
        final zzfld zza2 = ((zzczc) this.zzc).zza();
        final zzflw zza3 = ((zzddg) this.zzd).zza();
        return new zzdlo(new zzdfd() { // from class: com.google.android.gms.internal.ads.zzdna
            @Override // com.google.android.gms.internal.ads.zzdfd
            public final /* synthetic */ void zzg() {
                zzflw zzflwVar = zza3;
                JSONObject jSONObject = zza2.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, zza.afmaVersion, jSONObject.toString(), zzflwVar.zzg);
            }
        }, zzcgj.zzh);
    }
}
