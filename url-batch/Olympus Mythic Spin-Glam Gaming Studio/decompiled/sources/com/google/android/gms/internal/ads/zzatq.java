package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzatq implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzats zzc;

    zzatq(zzats zzatsVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        Objects.requireNonNull(zzatsVar);
        this.zzc = zzatsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzats zzatsVar = this.zzc;
        zzatsVar.zzx().zza(this.zza, this.zzb);
        zzatsVar.zzx().zzb(zzatsVar.toString());
    }
}
