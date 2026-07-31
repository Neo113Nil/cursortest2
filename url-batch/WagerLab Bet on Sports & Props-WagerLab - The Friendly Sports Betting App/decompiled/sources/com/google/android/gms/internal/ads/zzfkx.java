package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfkx implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb;
    final /* synthetic */ zzflb zzc;

    zzfkx(zzflb zzflbVar, long j, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = j;
        this.zzb = zzeaVar;
        Objects.requireNonNull(zzflbVar);
        this.zzc = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String zzQ;
        zzflb zzflbVar = this.zzc;
        if (zzflbVar.zzA() != null) {
            zzfkk zzA = zzflbVar.zzA();
            long j = this.zza;
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            zzfkr zzC = zzflbVar.zzC();
            zzQ = zzflb.zzQ(zzeaVar);
            zzA.zzi(j, zzQ, zzC, zzflbVar.zze.zzd, zzflbVar.zzn(), zzflbVar.zzz());
        }
    }
}
