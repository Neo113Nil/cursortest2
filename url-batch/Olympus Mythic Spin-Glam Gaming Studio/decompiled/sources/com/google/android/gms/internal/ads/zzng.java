package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public interface zzng {
    static boolean zzad(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    String zzV();

    int zza();

    int zzae(zzv zzvVar) throws zzjn;

    int zzu() throws zzjn;

    default void zzv(zznf zznfVar) {
    }

    default void zzw() {
    }
}
