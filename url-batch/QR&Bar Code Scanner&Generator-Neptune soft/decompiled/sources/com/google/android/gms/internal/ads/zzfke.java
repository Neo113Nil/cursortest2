package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfke extends zzgre implements zzgsp {
    private static final zzfke zzb;
    private zzgrn zze = zzaK();

    static {
        zzfke zzfkeVar = new zzfke();
        zzb = zzfkeVar;
        zzgre.zzaQ(zzfke.class, zzfkeVar);
    }

    private zzfke() {
    }

    public static zzfkb zzc() {
        return (zzfkb) zzb.zzaz();
    }

    static /* synthetic */ void zzf(zzfke zzfkeVar, zzfkd zzfkdVar) {
        zzfkdVar.getClass();
        zzgrn zzgrnVar = zzfkeVar.zze;
        if (!zzgrnVar.zzc()) {
            zzfkeVar.zze = zzgre.zzaL(zzgrnVar);
        }
        zzfkeVar.zze.add(zzfkdVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfkd.class});
        }
        if (i2 == 3) {
            return new zzfke();
        }
        zzfka zzfkaVar = null;
        if (i2 == 4) {
            return new zzfkb(zzfkaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
