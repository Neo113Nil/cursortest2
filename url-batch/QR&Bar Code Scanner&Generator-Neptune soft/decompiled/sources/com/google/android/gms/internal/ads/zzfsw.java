package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfsw {
    private static final Logger zza = Logger.getLogger(zzfsw.class.getName());
    private static final zzfsv zzb = new zzfsv(null);

    private zzfsw() {
    }

    static String zza(@CheckForNull String str) {
        return str == null ? "" : str;
    }

    static boolean zzb(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}
