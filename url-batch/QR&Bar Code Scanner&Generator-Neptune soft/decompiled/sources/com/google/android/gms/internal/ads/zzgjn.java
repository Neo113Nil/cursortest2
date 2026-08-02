package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgjn extends zzgre implements zzgsp {
    private static final zzgjn zzb;
    private int zze;
    private int zzf;

    static {
        zzgjn zzgjnVar = new zzgjn();
        zzb = zzgjnVar;
        zzgre.zzaQ(zzgjn.class, zzgjnVar);
    }

    private zzgjn() {
    }

    public static zzgjm zzc() {
        return (zzgjm) zzb.zzaz();
    }

    public static zzgjn zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgjn) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
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
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        if (i2 == 3) {
            return new zzgjn();
        }
        zzgjl zzgjlVar = null;
        if (i2 == 4) {
            return new zzgjm(zzgjlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
