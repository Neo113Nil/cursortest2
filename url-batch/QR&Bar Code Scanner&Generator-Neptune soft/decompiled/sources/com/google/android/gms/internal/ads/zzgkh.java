package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgkh extends zzgre implements zzgsp {
    private static final zzgkh zzb;
    private zzgkk zze;

    static {
        zzgkh zzgkhVar = new zzgkh();
        zzb = zzgkhVar;
        zzgre.zzaQ(zzgkh.class, zzgkhVar);
    }

    private zzgkh() {
    }

    public static zzgkg zza() {
        return (zzgkg) zzb.zzaz();
    }

    public static zzgkh zzd(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgkh) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzf(zzgkh zzgkhVar, zzgkk zzgkkVar) {
        zzgkkVar.getClass();
        zzgkhVar.zze = zzgkkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgkh();
        }
        zzgkf zzgkfVar = null;
        if (i2 == 4) {
            return new zzgkg(zzgkfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkk zze() {
        zzgkk zzgkkVar = this.zze;
        return zzgkkVar == null ? zzgkk.zze() : zzgkkVar;
    }
}
