package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgjw extends zzgre implements zzgsp {
    private static final zzgjw zzb;
    private int zze;
    private zzgpw zzf = zzgpw.zzb;

    static {
        zzgjw zzgjwVar = new zzgjw();
        zzb = zzgjwVar;
        zzgre.zzaQ(zzgjw.class, zzgjwVar);
    }

    private zzgjw() {
    }

    public static zzgjv zzc() {
        return (zzgjv) zzb.zzaz();
    }

    public static zzgjw zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgjw) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgjw();
        }
        zzgju zzgjuVar = null;
        if (i2 == 4) {
            return new zzgjv(zzgjuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgpw zzf() {
        return this.zzf;
    }
}
