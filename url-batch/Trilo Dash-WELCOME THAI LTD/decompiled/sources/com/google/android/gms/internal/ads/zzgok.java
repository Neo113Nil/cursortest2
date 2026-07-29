package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgok extends zzgko implements zzglz {
    private static final zzgok zzb;
    private int zze;
    private zzgoj zzf;
    private int zzj;
    private byte zzk = 2;
    private zzgkx zzg = zzaH();
    private zzgjg zzh = zzgjg.zzb;
    private zzgjg zzi = zzgjg.zzb;

    static {
        zzgok zzgokVar = new zzgok();
        zzb = zzgokVar;
        zzgko.zzaN(zzgok.class, zzgokVar);
    }

    private zzgok() {
    }

    public static zzgoh zza() {
        return (zzgoh) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgok zzgokVar, zzgog zzgogVar) {
        zzgogVar.getClass();
        zzgkx zzgkxVar = zzgokVar.zzg;
        if (!zzgkxVar.zzc()) {
            zzgokVar.zzg = zzgko.zzaI(zzgkxVar);
        }
        zzgokVar.zzg.add(zzgogVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", zzgog.class, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzgok();
        }
        zzgoa zzgoaVar = null;
        if (i2 == 4) {
            return new zzgoh(zzgoaVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
