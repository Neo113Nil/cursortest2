package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhuc extends zzifm implements zzigx {
    private static final zzhuc zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zzify zzb = zzifm.zzbM();

    static {
        zzhuc zzhucVar = new zzhuc();
        zzc = zzhucVar;
        zzifm.zzbu(zzhuc.class, zzhucVar);
    }

    private zzhuc() {
    }

    public static zzhuc zze(byte[] bArr, zziew zziewVar) throws zzige {
        return (zzhuc) zzifm.zzbV(zzc, bArr, zziewVar);
    }

    public static zzhuc zzg(InputStream inputStream, zziew zziewVar) throws IOException {
        return (zzhuc) zzifm.zzbX(zzc, inputStream, zziewVar);
    }

    public static zzhtz zzh() {
        return (zzhtz) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhub zzd(int i) {
        return (zzhub) this.zzb.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhub.class});
        }
        if (ordinal == 3) {
            return new zzhuc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhtz(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzhuc.class) {
                try {
                    zziheVar = zzd;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzc);
                        zzd = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzi(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzj(zzhub zzhubVar) {
        zzhubVar.getClass();
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            this.zzb = zzifm.zzbN(zzifyVar);
        }
        this.zzb.add(zzhubVar);
    }
}
