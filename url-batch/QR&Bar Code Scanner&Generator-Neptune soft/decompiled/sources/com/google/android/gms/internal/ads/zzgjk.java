package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgjk extends zzgre implements zzgsp {
    private static final zzgjk zzb;
    private int zze;
    private zzgpw zzf = zzgpw.zzb;

    static {
        zzgjk zzgjkVar = new zzgjk();
        zzb = zzgjkVar;
        zzgre.zzaQ(zzgjk.class, zzgjkVar);
    }

    private zzgjk() {
    }

    public static zzgjj zzc() {
        return (zzgjj) zzb.zzaz();
    }

    public static zzgjk zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgjk) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
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
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgjk();
        }
        zzgji zzgjiVar = null;
        if (i2 == 4) {
            return new zzgjj(zzgjiVar);
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
