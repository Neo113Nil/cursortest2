package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
final class zzadb {
    final /* synthetic */ zzadc zza;
    private zzv zzb;

    /* synthetic */ zzadb(zzadc zzadcVar, byte[] bArr) {
        Objects.requireNonNull(zzadcVar);
        this.zza = zzadcVar;
    }

    public final void zza(final zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzv(zzbvVar.zzb);
        zztVar.zzw(zzbvVar.zzc);
        zztVar.zzo("video/raw");
        this.zzb = zztVar.zzQ();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzada
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzadb.this.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j, long j2, boolean z) {
        if (z) {
            zzadc zzadcVar = this.zza;
            if (zzadcVar.zzA() != null) {
                zzadcVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzadb.this.zza.zzB().zzb();
                    }
                });
            }
        }
        zzv zzvVar = this.zzb;
        if (zzvVar == null) {
            zzvVar = new zzt().zzQ();
        }
        zzv zzvVar2 = zzvVar;
        zzadc zzadcVar2 = this.zza;
        zzadcVar2.zzD().zzcS(j2, j, zzvVar2, null);
        ((zzafb) zzadcVar2.zzz().remove()).zza(j);
    }
}
