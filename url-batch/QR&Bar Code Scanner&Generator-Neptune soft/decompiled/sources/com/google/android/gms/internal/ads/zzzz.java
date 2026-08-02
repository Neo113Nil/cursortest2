package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzzz {
    private final zzef zza = new zzef(10);

    public final zzbq zza(zzzj zzzjVar, zzada zzadaVar) throws IOException {
        zzbq zzbqVar = null;
        int i = 0;
        while (true) {
            try {
                ((zzyy) zzzjVar).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int zzj = this.zza.zzj();
                int i2 = zzj + 10;
                if (zzbqVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzyy) zzzjVar).zzm(bArr, 10, zzj, false);
                    zzbqVar = zzadc.zza(bArr, i2, zzadaVar, new zzacd());
                } else {
                    ((zzyy) zzzjVar).zzl(zzj, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzzjVar.zzj();
        ((zzyy) zzzjVar).zzl(i, false);
        return zzbqVar;
    }
}
