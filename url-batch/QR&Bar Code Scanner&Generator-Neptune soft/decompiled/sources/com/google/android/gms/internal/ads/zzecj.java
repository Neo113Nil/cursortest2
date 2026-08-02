package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzecj implements zzfzc {
    final /* synthetic */ zzeck zza;

    zzecj(zzeck zzeckVar) {
        this.zza = zzeckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        Pattern pattern;
        zzefo zzefoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfm)).booleanValue()) {
            pattern = zzeck.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzefoVar = this.zza.zzf;
                zzefoVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzefo zzefoVar;
        zzefo zzefoVar2;
        zzfdw zzfdwVar = (zzfdw) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfm)).booleanValue()) {
            zzefoVar = this.zza.zzf;
            zzefoVar.zzi(zzfdwVar.zzb.zzb.zze);
            zzefoVar2 = this.zza.zzf;
            zzefoVar2.zzj(zzfdwVar.zzb.zzb.zzf);
        }
    }
}
