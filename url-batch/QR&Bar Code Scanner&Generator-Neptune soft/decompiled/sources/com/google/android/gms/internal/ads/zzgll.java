package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgll extends zzgre implements zzgsp {
    private static final zzgll zzb;
    private zzglo zze;

    static {
        zzgll zzgllVar = new zzgll();
        zzb = zzgllVar;
        zzgre.zzaQ(zzgll.class, zzgllVar);
    }

    private zzgll() {
    }

    public static zzglk zza() {
        return (zzglk) zzb.zzaz();
    }

    public static zzgll zzd(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgll) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzf(zzgll zzgllVar, zzglo zzgloVar) {
        zzgloVar.getClass();
        zzgllVar.zze = zzgloVar;
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
            return new zzgll();
        }
        zzglj zzgljVar = null;
        if (i2 == 4) {
            return new zzglk(zzgljVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzglo zze() {
        zzglo zzgloVar = this.zze;
        return zzgloVar == null ? zzglo.zzd() : zzgloVar;
    }
}
