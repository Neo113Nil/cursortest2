package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgmk extends zzgre implements zzgsp {
    private static final zzgmk zzb;
    private int zze;
    private zzgrn zzf = zzaK();

    static {
        zzgmk zzgmkVar = new zzgmk();
        zzb = zzgmkVar;
        zzgre.zzaQ(zzgmk.class, zzgmkVar);
    }

    private zzgmk() {
    }

    public static zzgmh zzd() {
        return (zzgmh) zzb.zzaz();
    }

    public static zzgmk zzf(InputStream inputStream, zzgqq zzgqqVar) throws IOException {
        return (zzgmk) zzgre.zzaF(zzb, inputStream, zzgqqVar);
    }

    public static zzgmk zzg(byte[] bArr, zzgqq zzgqqVar) throws zzgrq {
        return (zzgmk) zzgre.zzaG(zzb, bArr, zzgqqVar);
    }

    static /* synthetic */ void zzj(zzgmk zzgmkVar, zzgmj zzgmjVar) {
        zzgmjVar.getClass();
        zzgrn zzgrnVar = zzgmkVar.zzf;
        if (!zzgrnVar.zzc()) {
            zzgmkVar.zzf = zzgre.zzaL(zzgrnVar);
        }
        zzgmkVar.zzf.add(zzgmjVar);
    }

    public final int zza() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgmj.class});
        }
        if (i2 == 3) {
            return new zzgmk();
        }
        zzgmg zzgmgVar = null;
        if (i2 == 4) {
            return new zzgmh(zzgmgVar);
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
