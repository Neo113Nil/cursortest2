package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfke {
    public static void zza(ListenableFuture listenableFuture, zzfkf zzfkfVar, zzfju zzfjuVar) {
        zzg(listenableFuture, zzfkfVar, zzfjuVar, false);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfkf zzfkfVar, zzfju zzfjuVar) {
        zzg(listenableFuture, zzfkfVar, zzfjuVar, true);
    }

    public static void zzc(ListenableFuture listenableFuture, zzfkf zzfkfVar, zzfju zzfjuVar) {
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            zzgcj.zzr(zzgca.zzu(listenableFuture), new zzfkd(zzfkfVar, zzfjuVar), zzbzo.zzf);
        }
    }

    public static void zzd(ListenableFuture listenableFuture, zzfju zzfjuVar) {
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            zzgcj.zzr(zzgca.zzu(listenableFuture), new zzfkb(zzfjuVar), zzbzo.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhU), str);
    }

    public static int zzf(zzffg zzffgVar) {
        int zzf = com.google.android.gms.ads.nonagon.signalgeneration.zzq.zzf(zzffgVar) - 1;
        return (zzf == 0 || zzf == 1) ? 7 : 23;
    }

    private static void zzg(ListenableFuture listenableFuture, zzfkf zzfkfVar, zzfju zzfjuVar, boolean z) {
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            zzgcj.zzr(zzgca.zzu(listenableFuture), new zzfkc(zzfkfVar, zzfjuVar, z), zzbzo.zzf);
        }
    }
}
