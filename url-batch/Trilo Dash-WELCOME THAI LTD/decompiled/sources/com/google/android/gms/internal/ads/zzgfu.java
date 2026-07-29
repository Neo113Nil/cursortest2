package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgfu extends zzgko implements zzglz {
    private static final zzgfu zzb;
    private int zze;
    private zzgkx zzf = zzaH();

    static {
        zzgfu zzgfuVar = new zzgfu();
        zzb = zzgfuVar;
        zzgko.zzaN(zzgfu.class, zzgfuVar);
    }

    private zzgfu() {
    }

    public static zzgfr zzd() {
        return (zzgfr) zzb.zzaw();
    }

    public static zzgfu zzf(InputStream inputStream, zzgka zzgkaVar) throws IOException {
        return (zzgfu) zzgko.zzaC(zzb, inputStream, zzgkaVar);
    }

    public static zzgfu zzg(byte[] bArr, zzgka zzgkaVar) throws zzgla {
        return (zzgfu) zzgko.zzaD(zzb, bArr, zzgkaVar);
    }

    static /* synthetic */ void zzj(zzgfu zzgfuVar, zzgft zzgftVar) {
        zzgftVar.getClass();
        zzgkx zzgkxVar = zzgfuVar.zzf;
        if (!zzgkxVar.zzc()) {
            zzgfuVar.zzf = zzgko.zzaI(zzgkxVar);
        }
        zzgfuVar.zzf.add(zzgftVar);
    }

    public final int zza() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgft.class});
        }
        if (i2 == 3) {
            return new zzgfu();
        }
        zzgfq zzgfqVar = null;
        if (i2 == 4) {
            return new zzgfr(zzgfqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zze;
    }

    public final List zzh() {
        return this.zzf;
    }
}
