package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzuz implements zzvn {
    private final zzgvc zza;
    private final zzgvc zzb;
    private boolean zzc;

    public zzuz(final int i) {
        zzgvc zzgvcVar = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzuy
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                String zzw;
                zzw = zzva.zzw(i, "ExoPlayer:MediaCodecAsyncAdapter:");
                return new HandlerThread(zzw);
            }
        };
        zzgvc zzgvcVar2 = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzux
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                String zzw;
                zzw = zzva.zzw(i, "ExoPlayer:MediaCodecQueueingThread:");
                return new HandlerThread(zzw);
            }
        };
        this.zza = zzgvcVar;
        this.zzb = zzgvcVar2;
        this.zzc = true;
    }

    public final void zza(boolean z) {
        this.zzc = z;
    }

    public final zzva zzb(zzvm zzvmVar) throws IOException {
        MediaCodec mediaCodec;
        zzvq zzwnVar;
        int i;
        zzva zzvaVar;
        Surface surface;
        zzvs zzvsVar = zzvmVar.zza;
        String str = zzvsVar.zza;
        zzva zzvaVar2 = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                try {
                    if (this.zzc && Build.VERSION.SDK_INT >= 36) {
                        zzwnVar = new zzwn(mediaCodec);
                        i = 4;
                        zzvaVar = new zzva(mediaCodec, (HandlerThread) this.zza.zza(), zzwnVar, zzvmVar.zzf, null);
                        Trace.endSection();
                        surface = zzvmVar.zzd;
                        if (surface == null && zzvsVar.zzh && Build.VERSION.SDK_INT >= 35) {
                            i |= 8;
                        }
                        zzvaVar.zzt(zzvmVar.zzb, surface, null, i);
                        return zzvaVar;
                    }
                    Trace.endSection();
                    surface = zzvmVar.zzd;
                    if (surface == null) {
                        i |= 8;
                    }
                    zzvaVar.zzt(zzvmVar.zzb, surface, null, i);
                    return zzvaVar;
                } catch (Exception e) {
                    e = e;
                    zzvaVar2 = zzvaVar;
                    if (zzvaVar2 != null) {
                        zzvaVar2.zzl();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
                zzwnVar = new zzvd(mediaCodec, (HandlerThread) this.zzb.zza(), new zzdt(zzdp.zza), false);
                i = 0;
                zzvaVar = new zzva(mediaCodec, (HandlerThread) this.zza.zza(), zzwnVar, zzvmVar.zzf, null);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final /* bridge */ /* synthetic */ zzvp zzc(zzvm zzvmVar) throws IOException {
        throw null;
    }
}
