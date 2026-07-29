package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzpp implements zzqd {
    private final zzfph zzb;
    private final zzfph zzc;

    public zzpp(int i, boolean z) {
        zzpn zzpnVar = new zzpn(i);
        zzpo zzpoVar = new zzpo(i);
        this.zzb = zzpnVar;
        this.zzc = zzpoVar;
    }

    static /* synthetic */ HandlerThread zza(int i) {
        String zzs;
        zzs = zzpr.zzs(i, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzs);
    }

    static /* synthetic */ HandlerThread zzb(int i) {
        String zzs;
        zzs = zzpr.zzs(i, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzs);
    }

    public final zzpr zzc(zzqc zzqcVar) throws IOException {
        MediaCodec mediaCodec;
        zzpr zzprVar;
        String str = zzqcVar.zza.zza;
        zzpr zzprVar2 = null;
        try {
            int i = zzeg.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzprVar = new zzpr(mediaCodec, zza(((zzpn) this.zzb).zza), zzb(((zzpo) this.zzc).zza), false, null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            Trace.endSection();
            zzpr.zzh(zzprVar, zzqcVar.zzb, zzqcVar.zzd, null, 0);
            return zzprVar;
        } catch (Exception e3) {
            e = e3;
            zzprVar2 = zzprVar;
            if (zzprVar2 != null) {
                zzprVar2.zzl();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
