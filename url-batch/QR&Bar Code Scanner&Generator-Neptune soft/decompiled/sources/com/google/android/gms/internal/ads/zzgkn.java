package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgkn extends zzgre implements zzgsp {
    private static final zzgkn zzb;
    private int zze;
    private zzgkq zzf;
    private zzgpw zzg = zzgpw.zzb;

    static {
        zzgkn zzgknVar = new zzgkn();
        zzb = zzgknVar;
        zzgre.zzaQ(zzgkn.class, zzgknVar);
    }

    private zzgkn() {
    }

    public static zzgkm zzc() {
        return (zzgkm) zzb.zzaz();
    }

    public static zzgkn zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgkn) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzi(zzgkn zzgknVar, zzgkq zzgkqVar) {
        zzgkqVar.getClass();
        zzgknVar.zzf = zzgkqVar;
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
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgkn();
        }
        zzgkl zzgklVar = null;
        if (i2 == 4) {
            return new zzgkm(zzgklVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkq zzf() {
        zzgkq zzgkqVar = this.zzf;
        return zzgkqVar == null ? zzgkq.zzf() : zzgkqVar;
    }

    public final zzgpw zzg() {
        return this.zzg;
    }
}
