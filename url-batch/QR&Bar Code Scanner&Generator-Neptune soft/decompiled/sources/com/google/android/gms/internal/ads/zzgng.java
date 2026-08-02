package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzgng extends zzgre implements zzgsp {
    private static final zzgng zzb;
    private String zze = "";
    private zzgrn zzf = zzaK();

    static {
        zzgng zzgngVar = new zzgng();
        zzb = zzgngVar;
        zzgre.zzaQ(zzgng.class, zzgngVar);
    }

    private zzgng() {
    }

    public static zzgng zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzgmf.class});
        }
        if (i2 == 3) {
            return new zzgng();
        }
        zzgne zzgneVar = null;
        if (i2 == 4) {
            return new zzgnf(zzgneVar);
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
