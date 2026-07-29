package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzccc implements zzfuw {
    final /* synthetic */ zzfvj zza;

    zzccc(zzccd zzccdVar, zzfvj zzfvjVar) {
        this.zza = zzfvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        List list;
        list = zzccd.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzccd.zzc;
        list.remove(this.zza);
    }
}
