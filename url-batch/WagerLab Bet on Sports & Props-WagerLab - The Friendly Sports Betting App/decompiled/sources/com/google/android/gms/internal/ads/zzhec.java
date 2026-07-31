package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhec extends zzhih implements zzhjt {
    private static final zzhec zzc;
    private static volatile zzhka zzd;
    private int zza;
    private zzhit zzb = zzbM();

    static {
        zzhec zzhecVar = new zzhec();
        zzc = zzhecVar;
        zzhih.zzbu(zzhec.class, zzhecVar);
    }

    private zzhec() {
    }

    public static zzhec zze(InputStream inputStream, zzhhr zzhhrVar) throws IOException {
        return (zzhec) zzhih.zzbX(zzc, inputStream, zzhhrVar);
    }

    public static zzhdz zzg() {
        return (zzhdz) zzc.zzbn();
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
    public final zzheb zzd(int i) {
        return (zzheb) this.zzb.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzheb.class});
        }
        if (ordinal == 3) {
            return new zzhec();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhdz(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzd;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhec.class) {
            zzhkaVar = zzd;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzc);
                zzd = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzh(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzi(zzheb zzhebVar) {
        zzhebVar.getClass();
        zzhit zzhitVar = this.zzb;
        if (!zzhitVar.zza()) {
            this.zzb = zzhih.zzbN(zzhitVar);
        }
        this.zzb.add(zzhebVar);
    }
}
