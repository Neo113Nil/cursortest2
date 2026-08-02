package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgjh extends zzgre implements zzgsp {
    private static final zzgjh zzb;
    private int zze;
    private int zzf;

    static {
        zzgjh zzgjhVar = new zzgjh();
        zzb = zzgjhVar;
        zzgre.zzaQ(zzgjh.class, zzgjhVar);
    }

    private zzgjh() {
    }

    public static zzgjg zzc() {
        return (zzgjg) zzb.zzaz();
    }

    public static zzgjh zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgjh) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
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
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgjh();
        }
        zzgjf zzgjfVar = null;
        if (i2 == 4) {
            return new zzgjg(zzgjfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
