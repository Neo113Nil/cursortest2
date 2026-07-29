package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzazu {
    public final List zza;
    public final int zzb;

    private zzazu(List list, int i) {
        this.zza = list;
        this.zzb = i;
    }

    public static zzazu zza(zzazg zzazgVar) throws zzarv {
        try {
            zzazgVar.zzw(21);
            int zzg = zzazgVar.zzg() & 3;
            int zzg2 = zzazgVar.zzg();
            int zzc = zzazgVar.zzc();
            int i = 0;
            for (int i2 = 0; i2 < zzg2; i2++) {
                zzazgVar.zzw(1);
                int zzj = zzazgVar.zzj();
                for (int i3 = 0; i3 < zzj; i3++) {
                    int zzj2 = zzazgVar.zzj();
                    i += zzj2 + 4;
                    zzazgVar.zzw(zzj2);
                }
            }
            zzazgVar.zzv(zzc);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < zzg2; i5++) {
                zzazgVar.zzw(1);
                int zzj3 = zzazgVar.zzj();
                for (int i6 = 0; i6 < zzj3; i6++) {
                    int zzj4 = zzazgVar.zzj();
                    System.arraycopy(zzaze.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzazgVar.zza, zzazgVar.zzc(), bArr, i7, zzj4);
                    i4 = i7 + zzj4;
                    zzazgVar.zzw(zzj4);
                }
            }
            return new zzazu(i == 0 ? null : Collections.singletonList(bArr), zzg + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzarv("Error parsing HEVC config", e);
        }
    }
}
