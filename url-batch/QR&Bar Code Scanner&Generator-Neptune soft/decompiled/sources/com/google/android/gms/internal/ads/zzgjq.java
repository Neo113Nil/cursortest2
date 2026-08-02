package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgjq extends zzgre implements zzgsp {
    private static final zzgjq zzb;
    private int zze;
    private zzgpw zzf = zzgpw.zzb;

    static {
        zzgjq zzgjqVar = new zzgjq();
        zzb = zzgjqVar;
        zzgre.zzaQ(zzgjq.class, zzgjqVar);
    }

    private zzgjq() {
    }

    public static zzgjp zzc() {
        return (zzgjp) zzb.zzaz();
    }

    public static zzgjq zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgjq) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
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
            return new zzgjq();
        }
        zzgjo zzgjoVar = null;
        if (i2 == 4) {
            return new zzgjp(zzgjoVar);
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
