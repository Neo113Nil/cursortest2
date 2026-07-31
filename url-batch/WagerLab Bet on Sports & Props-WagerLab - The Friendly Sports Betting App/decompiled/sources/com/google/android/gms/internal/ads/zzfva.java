package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfva {
    public static byte[] zza(String str, boolean z) throws IllegalArgumentException {
        byte[] zzk = zzgmk.zzl().zzk(str);
        if (zzk.length != 0 || str.length() <= 0) {
            return zzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
