package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzrf implements zzpz {
    final /* synthetic */ zzrg zza;

    /* synthetic */ zzrf(zzrg zzrgVar, byte[] bArr) {
        Objects.requireNonNull(zzrgVar);
        this.zza = zzrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zza() {
        zzlk zzaX;
        zzaX = this.zza.zzaX();
        if (zzaX != null) {
            zzaX.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zzb(Exception exc) {
        zzds.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzav().zzi(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zzc(zzpw zzpwVar) {
        this.zza.zzav().zzl(zzpwVar);
    }
}
