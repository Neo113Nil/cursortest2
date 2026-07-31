package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzapo implements Comparable {
    public final int zza;
    public final zzapj zzb;

    public zzapo(int i, zzapj zzapjVar) {
        this.zza = i;
        this.zzb = zzapjVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzapo) obj).zza);
    }
}
