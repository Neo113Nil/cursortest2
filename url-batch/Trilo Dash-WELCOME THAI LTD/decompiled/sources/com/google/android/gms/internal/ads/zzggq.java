package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzggq extends zzgko implements zzglz {
    private static final zzggq zzb;
    private String zze = "";
    private zzgkx zzf = zzaH();

    static {
        zzggq zzggqVar = new zzggq();
        zzb = zzggqVar;
        zzgko.zzaN(zzggq.class, zzggqVar);
    }

    private zzggq() {
    }

    public static zzggq zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzgfp.class});
        }
        if (i2 == 3) {
            return new zzggq();
        }
        zzggo zzggoVar = null;
        if (i2 == 4) {
            return new zzggp(zzggoVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzd() {
        return this.zzf;
    }
}
