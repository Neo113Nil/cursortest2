package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgog extends zzgko implements zzglz {
    private static final zzgog zzb;
    private int zze;
    private byte zzh = 2;
    private zzgjg zzf = zzgjg.zzb;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgog zzgogVar = new zzgog();
        zzb = zzgogVar;
        zzgko.zzaN(zzgog.class, zzgogVar);
    }

    private zzgog() {
    }

    public static zzgof zza() {
        return (zzgof) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgog zzgogVar, zzgjg zzgjgVar) {
        zzgogVar.zze |= 1;
        zzgogVar.zzf = zzgjgVar;
    }

    static /* synthetic */ void zze(zzgog zzgogVar, zzgjg zzgjgVar) {
        zzgogVar.zze |= 2;
        zzgogVar.zzg = zzgjgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgog();
        }
        zzgoa zzgoaVar = null;
        if (i2 == 4) {
            return new zzgof(zzgoaVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
