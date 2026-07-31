package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzgfs implements Comparable {
    final Runnable zza;
    final long zzb;

    zzgfs(Runnable runnable, long j) {
        this.zza = runnable;
        this.zzb = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zzb, ((zzgfs) obj).zzb);
    }
}
