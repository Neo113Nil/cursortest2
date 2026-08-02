package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgnz extends RuntimeException {
    public zzgnz(String str) {
        super(str);
    }

    public static Object zza(zzgny zzgnyVar) {
        try {
            return zzgnyVar.zza();
        } catch (Exception e) {
            throw new zzgnz(e);
        }
    }

    public zzgnz(String str, Throwable th) {
        super(str, th);
    }

    public zzgnz(Throwable th) {
        super(th);
    }
}
