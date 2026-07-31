package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public interface zzsq {
    void zza(int i, int i2, int i3, long j, int i4);

    void zzb(int i, int i2, zzhd zzhdVar, long j, int i3);

    void zzc(int i, boolean z);

    void zzd(int i, long j);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    ByteBuffer zzh(int i);

    ByteBuffer zzi(int i);

    void zzj();

    void zzk();

    default boolean zzl(zzsp zzspVar) {
        return false;
    }

    void zzm(Surface surface);

    void zzn();

    void zzo(Bundle bundle);

    void zzp(int i);
}
