package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgij extends zzgre implements zzgsp {
    private static final zzgij zzb;
    private zzgip zze;
    private zzgld zzf;

    static {
        zzgij zzgijVar = new zzgij();
        zzb = zzgijVar;
        zzgre.zzaQ(zzgij.class, zzgijVar);
    }

    private zzgij() {
    }

    public static zzgii zza() {
        return (zzgii) zzb.zzaz();
    }

    public static zzgij zzd(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgij) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzg(zzgij zzgijVar, zzgip zzgipVar) {
        zzgipVar.getClass();
        zzgijVar.zze = zzgipVar;
    }

    static /* synthetic */ void zzh(zzgij zzgijVar, zzgld zzgldVar) {
        zzgldVar.getClass();
        zzgijVar.zzf = zzgldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgij();
        }
        zzgih zzgihVar = null;
        if (i2 == 4) {
            return new zzgii(zzgihVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgip zze() {
        zzgip zzgipVar = this.zze;
        return zzgipVar == null ? zzgip.zze() : zzgipVar;
    }

    public final zzgld zzf() {
        zzgld zzgldVar = this.zzf;
        return zzgldVar == null ? zzgld.zze() : zzgldVar;
    }
}
