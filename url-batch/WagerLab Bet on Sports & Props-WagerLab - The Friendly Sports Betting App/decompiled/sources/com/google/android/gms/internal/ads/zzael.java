package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzael implements zzadv {
    final /* synthetic */ zzaen zza;
    private final long zzb;

    public zzael(zzaen zzaenVar, long j) {
        Objects.requireNonNull(zzaenVar);
        this.zza = zzaenVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        zzaen zzaenVar = this.zza;
        zzadt zzg = zzaenVar.zza()[0].zzg(j);
        for (int i = 1; i < zzaenVar.zza().length; i++) {
            zzadt zzg2 = zzaenVar.zza()[i].zzg(j);
            if (zzg2.zza.zzc < zzg.zza.zzc) {
                zzg = zzg2;
            }
        }
        return zzg;
    }
}
