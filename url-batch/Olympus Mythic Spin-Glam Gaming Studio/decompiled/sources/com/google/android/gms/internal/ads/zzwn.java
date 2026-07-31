package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzwn implements zzvq {
    private final MediaCodec zza;

    public zzwn(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzb(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzc(int i, int i2, zziv zzivVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzivVar.zzb(), j, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzd(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzg() {
    }
}
