package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcnh implements zzgcf {
    final /* synthetic */ zzfll zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcni zzc;

    zzcnh(zzcni zzcniVar, zzfll zzfllVar, String str) {
        this.zza = zzfllVar;
        this.zzb = str;
        this.zzc = zzcniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(final Throwable th) {
        zzgcu zzgcuVar;
        zzgcuVar = this.zzc.zzg;
        final zzfll zzfllVar = this.zza;
        final String str = this.zzb;
        zzgcuVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnf
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                Context context2;
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzju)).booleanValue();
                zzcnh zzcnhVar = zzcnh.this;
                Throwable th2 = th;
                if (booleanValue) {
                    zzcni zzcniVar = zzcnhVar.zzc;
                    context2 = zzcniVar.zzc;
                    zzcniVar.zzb = zzbtq.zzc(context2);
                    zzcnhVar.zzc.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcni zzcniVar2 = zzcnhVar.zzc;
                    context = zzcniVar2.zzc;
                    zzcniVar2.zza = zzbtq.zza(context);
                    zzcnhVar.zzc.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                zzfllVar.zzc(str, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzgcu zzgcuVar;
        zzcni zzcniVar = this.zzc;
        final zzfll zzfllVar = this.zza;
        final String str = (String) obj;
        zzgcuVar = zzcniVar.zzg;
        zzgcuVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcng
            @Override // java.lang.Runnable
            public final void run() {
                zzfll.this.zzc(str, null);
            }
        });
    }
}
