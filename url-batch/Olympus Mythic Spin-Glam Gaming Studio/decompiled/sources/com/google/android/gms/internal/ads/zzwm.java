package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzwm implements zzvp {
    private final MediaCodec zza;

    @Nullable
    private final zzvl zzb;

    /* synthetic */ zzwm(MediaCodec mediaCodec, zzvl zzvlVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzvlVar;
        if (Build.VERSION.SDK_INT < 35 || zzvlVar == null) {
            return;
        }
        zzvlVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zza(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzb(int i, int i2, zziv zzivVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzivVar.zzb(), j, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzc(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzd(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final int zze() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    @Nullable
    public final ByteBuffer zzh(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    @Nullable
    public final ByteBuffer zzj(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzk() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzl() {
        zzvl zzvlVar;
        zzvl zzvlVar2;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                this.zza.stop();
            }
            if (i >= 35 && (zzvlVar2 = this.zzb) != null) {
                zzvlVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zzvlVar = this.zzb) != null) {
                zzvlVar.zzc(this.zza);
            }
            this.zza.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzn(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    @RequiresApi
    public final void zzo() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    @RequiresApi
    public final void zzr(List list) {
        this.zza.subscribeToVendorParameters(list);
    }
}
