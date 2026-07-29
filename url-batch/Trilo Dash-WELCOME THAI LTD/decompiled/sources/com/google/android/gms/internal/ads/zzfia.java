package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfia extends zzgko implements zzglz {
    private static final zzfia zzb;
    private zzgkx zze = zzaH();

    static {
        zzfia zzfiaVar = new zzfia();
        zzb = zzfiaVar;
        zzgko.zzaN(zzfia.class, zzfiaVar);
    }

    private zzfia() {
    }

    public static zzfhx zzc() {
        return (zzfhx) zzb.zzaw();
    }

    static /* synthetic */ void zzf(zzfia zzfiaVar, zzfhz zzfhzVar) {
        zzfhzVar.getClass();
        zzgkx zzgkxVar = zzfiaVar.zze;
        if (!zzgkxVar.zzc()) {
            zzfiaVar.zze = zzgko.zzaI(zzgkxVar);
        }
        zzfiaVar.zze.add(zzfhzVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfhz.class});
        }
        if (i2 == 3) {
            return new zzfia();
        }
        zzfhw zzfhwVar = null;
        if (i2 == 4) {
            return new zzfhx(zzfhwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
