package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbbn;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdgu implements zzcvs, zzdde {
    private final zzbxo zza;
    private final Context zzb;
    private final zzbxr zzc;
    private final View zzd;
    private String zze;
    private final zzbbn.zza.EnumC0070zza zzf;

    public zzdgu(zzbxo zzbxoVar, Context context, zzbxr zzbxrVar, View view, zzbbn.zza.EnumC0070zza enumC0070zza) {
        this.zza = zzbxoVar;
        this.zzb = context;
        this.zzc = zzbxrVar;
        this.zzd = view;
        this.zzf = enumC0070zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    @ParametersAreNonnullByDefault
    public final void zzd(zzbvh zzbvhVar, String str, String str2) {
        zzbxr zzbxrVar = this.zzc;
        Context context = this.zzb;
        if (zzbxrVar.zza(context)) {
            try {
                zzbxrVar.zzo(context, zzbxrVar.zzj(context), this.zza.zzb(), zzbvhVar.zzb(), zzbvhVar.zzc());
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        this.zza.zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzg(view.getContext(), this.zze);
        }
        this.zza.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzh() {
        zzbbn.zza.EnumC0070zza enumC0070zza = this.zzf;
        if (enumC0070zza == zzbbn.zza.EnumC0070zza.APP_OPEN) {
            return;
        }
        String zzf = this.zzc.zzf(this.zzb);
        this.zze = zzf;
        zzbbn.zza.EnumC0070zza enumC0070zza2 = zzbbn.zza.EnumC0070zza.REWARD_BASED_VIDEO_AD;
        String.valueOf(zzf);
        this.zze = String.valueOf(zzf).concat(enumC0070zza == enumC0070zza2 ? "/Rewarded" : "/Interstitial");
    }
}
