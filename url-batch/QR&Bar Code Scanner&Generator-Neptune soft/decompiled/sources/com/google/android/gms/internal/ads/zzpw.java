package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzpw implements zzqk {
    private final zzftn zzb;
    private final zzftn zzc;

    public zzpw(int i, boolean z) {
        zzpu zzpuVar = new zzpu(i);
        zzpv zzpvVar = new zzpv(i);
        this.zzb = zzpuVar;
        this.zzc = zzpvVar;
    }

    static /* synthetic */ HandlerThread zza(int i) {
        String zzs;
        zzs = zzpy.zzs(i, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzs);
    }

    static /* synthetic */ HandlerThread zzb(int i) {
        String zzs;
        zzs = zzpy.zzs(i, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzs);
    }

    public final zzpy zzc(zzqj zzqjVar) throws IOException {
        MediaCodec mediaCodec;
        zzpy zzpyVar;
        String str = zzqjVar.zza.zza;
        zzpy zzpyVar2 = null;
        try {
            int i = zzen.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzpyVar = new zzpy(mediaCodec, zza(((zzpu) this.zzb).zza), zzb(((zzpv) this.zzc).zza), false, null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            Trace.endSection();
            zzpy.zzh(zzpyVar, zzqjVar.zzb, zzqjVar.zzd, null, 0);
            return zzpyVar;
        } catch (Exception e3) {
            e = e3;
            zzpyVar2 = zzpyVar;
            if (zzpyVar2 != null) {
                zzpyVar2.zzl();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
