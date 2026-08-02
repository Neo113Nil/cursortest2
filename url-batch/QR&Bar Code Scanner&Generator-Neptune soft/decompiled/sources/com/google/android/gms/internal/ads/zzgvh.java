package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgvh extends zzgre implements zzgsp {
    private static final zzgvh zzb;
    private int zze;
    private byte zzh = 2;
    private zzgpw zzf = zzgpw.zzb;
    private zzgpw zzg = zzgpw.zzb;

    static {
        zzgvh zzgvhVar = new zzgvh();
        zzb = zzgvhVar;
        zzgre.zzaQ(zzgvh.class, zzgvhVar);
    }

    private zzgvh() {
    }

    public static zzgvg zza() {
        return (zzgvg) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzgvh zzgvhVar, zzgpw zzgpwVar) {
        zzgvhVar.zze |= 1;
        zzgvhVar.zzf = zzgpwVar;
    }

    static /* synthetic */ void zze(zzgvh zzgvhVar, zzgpw zzgpwVar) {
        zzgvhVar.zze |= 2;
        zzgvhVar.zzg = zzgpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgvh();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgvg(zzguqVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
