package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzaii {
    public static String zza(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z = false;
        while (it.hasNext()) {
            String str2 = ((zzaiv) it.next()).zza.zzg.zzo;
            if (zzar.zzb(str2)) {
                return MimeTypes.VIDEO_MP4;
            }
            if (zzar.zza(str2)) {
                z = true;
            } else if (zzar.zzc(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, MimeTypes.IMAGE_AVIF)) {
                    str = MimeTypes.IMAGE_AVIF;
                }
            }
        }
        return z ? MimeTypes.AUDIO_MP4 : str != null ? str : MimeTypes.APPLICATION_MP4;
    }
}
