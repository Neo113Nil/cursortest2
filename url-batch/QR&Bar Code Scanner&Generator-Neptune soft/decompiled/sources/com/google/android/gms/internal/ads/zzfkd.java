package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfkd extends zzgre implements zzgsp {
    private static final zzfkd zzb;
    private zzfjz zze;

    static {
        zzfkd zzfkdVar = new zzfkd();
        zzb = zzfkdVar;
        zzgre.zzaQ(zzfkd.class, zzfkdVar);
    }

    private zzfkd() {
    }

    public static zzfkc zza() {
        return (zzfkc) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzfkd zzfkdVar, zzfjz zzfjzVar) {
        zzfjzVar.getClass();
        zzfkdVar.zze = zzfjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzfkd();
        }
        zzfka zzfkaVar = null;
        if (i2 == 4) {
            return new zzfkc(zzfkaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
