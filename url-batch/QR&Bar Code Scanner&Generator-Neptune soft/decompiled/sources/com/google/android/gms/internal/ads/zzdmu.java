package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdmu implements zzdda, zzdjx {
    private final zzcec zza;
    private final Context zzb;
    private final zzceu zzc;
    private final View zzd;
    private String zze;
    private final zzbez zzf;

    public zzdmu(zzcec zzcecVar, Context context, zzceu zzceuVar, View view, zzbez zzbezVar) {
        this.zza = zzcecVar;
        this.zzb = context;
        this.zzc = zzceuVar;
        this.zzd = view;
        this.zzf = zzbezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzbv() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjx
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjx
    public final void zzg() {
        if (this.zzf == zzbez.APP_OPEN) {
            return;
        }
        String zzd = this.zzc.zzd(this.zzb);
        this.zze = zzd;
        this.zze = String.valueOf(zzd).concat(this.zzf == zzbez.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzj() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzo() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    @ParametersAreNonnullByDefault
    public final void zzp(zzcbs zzcbsVar, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzceu zzceuVar = this.zzc;
                Context context = this.zzb;
                zzceuVar.zzo(context, zzceuVar.zza(context), this.zza.zza(), zzcbsVar.zzc(), zzcbsVar.zzb());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzr() {
    }
}
