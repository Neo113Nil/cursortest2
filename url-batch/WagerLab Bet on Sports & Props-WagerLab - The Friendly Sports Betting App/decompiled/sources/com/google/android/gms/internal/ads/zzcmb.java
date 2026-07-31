package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzcmb implements zzgoq {
    final /* synthetic */ zzfjv zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ zzcmi zzd;

    zzcmb(zzcmi zzcmiVar, zzfjv zzfjvVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfjvVar;
        this.zzb = str;
        this.zzc = zzvVar;
        Objects.requireNonNull(zzcmiVar);
        this.zzd = zzcmiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(final Throwable th) {
        final zzfjv zzfjvVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcma
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzle)).booleanValue();
                Throwable th2 = th;
                zzcmb zzcmbVar = zzcmb.this;
                if (booleanValue) {
                    zzcmi zzcmiVar = zzcmbVar.zzd;
                    zzcmiVar.zzb = zzbtt.zzc(zzcmiVar.zzi());
                    zzcmiVar.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcmi zzcmiVar2 = zzcmbVar.zzd;
                    zzcmiVar2.zza = zzbtt.zza(zzcmiVar2.zzi());
                    zzcmiVar2.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfjvVar.zzb(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfjv zzfjvVar = this.zza;
        final String str = (String) obj;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfjv.this.zzb(str, zzvVar, null, null);
            }
        });
    }
}
