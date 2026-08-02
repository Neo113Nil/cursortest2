package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzasi extends Exception {
    private zzasi(int i, String str, Throwable th, int i2) {
        super(null, th);
    }

    public static zzasi zza(Exception exc, int i) {
        return new zzasi(1, null, exc, i);
    }

    public static zzasi zzb(IOException iOException) {
        return new zzasi(0, null, iOException, -1);
    }

    static zzasi zzc(RuntimeException runtimeException) {
        return new zzasi(2, null, runtimeException, -1);
    }
}
