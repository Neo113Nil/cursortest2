package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgmo extends zzgre implements zzgsp {
    private static final zzgmo zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgmo zzgmoVar = new zzgmo();
        zzb = zzgmoVar;
        zzgre.zzaQ(zzgmo.class, zzgmoVar);
    }

    private zzgmo() {
    }

    public static zzgmn zza() {
        return (zzgmn) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzgmo zzgmoVar, String str) {
        str.getClass();
        zzgmoVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgmo();
        }
        zzgml zzgmlVar = null;
        if (i2 == 4) {
            return new zzgmn(zzgmlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
