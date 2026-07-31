package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RequiresApi
/* loaded from: classes4.dex */
public final class zzvl {
    private final HashSet zza;

    @Nullable
    private LoudnessCodecController zzb;

    public zzvl() {
        throw null;
    }

    public zzvl(zzvk zzvkVar) {
        this.zza = new HashSet();
    }

    public final void zza(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.zzb = null;
        }
        create = LoudnessCodecController.create(i, zzhdp.zza(), new zzvi(this));
        this.zzb = create;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public final void zzb(MediaCodec mediaCodec) {
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        zzguk.zzi(this.zza.add(mediaCodec));
    }

    public final void zzc(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.zza.remove(mediaCodec) || (loudnessCodecController = this.zzb) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void zzd() {
        this.zza.clear();
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
