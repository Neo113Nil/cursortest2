package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzzj {
    private final zzdy zza = new zzdy(10);

    public final zzbl zza(zzyt zzytVar, zzabz zzabzVar) throws IOException {
        zzbl zzblVar = null;
        int i = 0;
        while (true) {
            try {
                ((zzym) zzytVar).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int zzj = this.zza.zzj();
                int i2 = zzj + 10;
                if (zzblVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzym) zzytVar).zzm(bArr, 10, zzj, false);
                    zzblVar = zzacb.zza(bArr, i2, zzabzVar, new zzabc());
                } else {
                    ((zzym) zzytVar).zzl(zzj, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzytVar.zzj();
        ((zzym) zzytVar).zzl(i, false);
        return zzblVar;
    }
}
