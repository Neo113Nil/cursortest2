package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbfk extends zzgre implements zzgsp {
    private static final zzbfk zzb;
    private zzgrn zze = zzaK();

    static {
        zzbfk zzbfkVar = new zzbfk();
        zzb = zzbfkVar;
        zzgre.zzaQ(zzbfk.class, zzbfkVar);
    }

    private zzbfk() {
    }

    public static zzbfe zza() {
        return (zzbfe) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbfk zzbfkVar, zzbfd zzbfdVar) {
        zzbfdVar.getClass();
        zzgrn zzgrnVar = zzbfkVar.zze;
        if (!zzgrnVar.zzc()) {
            zzbfkVar.zze = zzgre.zzaL(zzgrnVar);
        }
        zzbfkVar.zze.add(zzbfdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzbfd.class});
        }
        if (i2 == 3) {
            return new zzbfk();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbfe(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
