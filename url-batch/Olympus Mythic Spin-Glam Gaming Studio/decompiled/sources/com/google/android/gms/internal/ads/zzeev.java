package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
final class zzeev implements zzaso {
    final /* synthetic */ zzeew zza;

    zzeev(zzeew zzeewVar) {
        Objects.requireNonNull(zzeewVar);
        this.zza = zzeewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaso
    public final void zza(int i) {
        zzasp zzd;
        try {
            zzfrt zza = zzfru.zza();
            zza.zzh(i != 0 ? i != 1 ? i != 2 ? i != 3 ? 7 : 6 : 5 : 4 : 3);
            if (i == 0 && (zzd = this.zza.zzc().zzd()) != null) {
                zza.zzb(zzd.zzb());
                zza.zzc(zzd.zzc());
                zza.zzd(zzd.zzd());
                zza.zze(zzd.zze());
                zza.zzf(zzd.zzf());
                if (!TextUtils.isEmpty(zzd.zza())) {
                    zza.zza(zzd.zza());
                }
                if (!TextUtils.isEmpty(zzd.zzg())) {
                    zza.zzg(zzd.zzg());
                }
            }
            zzeew zzeewVar = this.zza;
            zzeewVar.zzc().zzc();
            zzeaj zzd2 = zzeewVar.zzd();
            String encodeToString = Base64.encodeToString(((zzfru) zza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfY)).booleanValue()) {
                zzeai zza2 = zzd2.zza();
                zza2.zzc("action", "irda");
                zza2.zzc("irdd", encodeToString);
                zza2.zzf();
            }
            zzeewVar.zze().zzQ(true);
        } catch (Exception e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfZ)).booleanValue()) {
                zzeew zzeewVar2 = this.zza;
                if (zzeewVar2.zzb == null) {
                    zzeewVar2.zzb = zzcaq.zzc(zzeewVar2.zzb());
                }
                zzeewVar2.zzb.zzh(e, "InstallReferrerUnsampled.onInstallReferrerSetupFinished");
                return;
            }
            zzeew zzeewVar3 = this.zza;
            if (zzeewVar3.zza == null) {
                zzeewVar3.zza = zzcaq.zza(zzeewVar3.zzb());
            }
            zzeewVar3.zza.zzh(e, "InstallReferrer.onInstallReferrerSetupFinished");
        }
    }
}
