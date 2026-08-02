package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgnm extends zzgre implements zzgsp {
    private static final zzgnm zzb;
    private int zze;

    static {
        zzgnm zzgnmVar = new zzgnm();
        zzb = zzgnmVar;
        zzgre.zzaQ(zzgnm.class, zzgnmVar);
    }

    private zzgnm() {
    }

    public static zzgnm zzc() {
        return zzb;
    }

    public static zzgnm zzd(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgnm) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgnm();
        }
        zzgnk zzgnkVar = null;
        if (i2 == 4) {
            return new zzgnl(zzgnkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
