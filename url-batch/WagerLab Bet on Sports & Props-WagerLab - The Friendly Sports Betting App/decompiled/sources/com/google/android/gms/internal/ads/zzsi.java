package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzsi implements zzso {
    private final Context zza;

    @Deprecated
    public zzsi() {
        this.zza = null;
    }

    public zzsi(Context context, zzght zzghtVar, zzght zzghtVar2) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final zzsq zzb(zzsn zzsnVar) throws IOException {
        Context context;
        if (Build.VERSION.SDK_INT >= 31 || ((context = this.zza) != null && Build.VERSION.SDK_INT >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int zzg = zzar.zzg(zzsnVar.zzc.zzo);
            zzds.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzeo.zzQ(zzg)));
            return new zzsa(zzg).zza(zzsnVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzst zzstVar = zzsnVar.zza;
            String str = zzstVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzsnVar.zzd;
                int i = 0;
                if (surface == null && zzstVar.zzh && Build.VERSION.SDK_INT >= 35) {
                    i = 8;
                }
                createByCodecName.configure(zzsnVar.zzb, surface, (MediaCrypto) null, i);
                Trace.endSection();
                Trace.beginSection("startCodec");
                createByCodecName.start();
                Trace.endSection();
                return new zztm(createByCodecName, zzsnVar.zzf, null);
            } catch (IOException | RuntimeException e) {
                e = e;
                mediaCodec = createByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        }
    }
}
