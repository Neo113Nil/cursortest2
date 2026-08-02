package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbay {
    public final List zza;
    public final int zzb;

    private zzbay(List list, int i) {
        this.zza = list;
        this.zzb = i;
    }

    public static zzbay zza(zzbak zzbakVar) throws zzasz {
        try {
            zzbakVar.zzw(21);
            int zzg = zzbakVar.zzg() & 3;
            int zzg2 = zzbakVar.zzg();
            int zzc = zzbakVar.zzc();
            int i = 0;
            for (int i2 = 0; i2 < zzg2; i2++) {
                zzbakVar.zzw(1);
                int zzj = zzbakVar.zzj();
                for (int i3 = 0; i3 < zzj; i3++) {
                    int zzj2 = zzbakVar.zzj();
                    i += zzj2 + 4;
                    zzbakVar.zzw(zzj2);
                }
            }
            zzbakVar.zzv(zzc);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < zzg2; i5++) {
                zzbakVar.zzw(1);
                int zzj3 = zzbakVar.zzj();
                for (int i6 = 0; i6 < zzj3; i6++) {
                    int zzj4 = zzbakVar.zzj();
                    System.arraycopy(zzbai.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzbakVar.zza, zzbakVar.zzc(), bArr, i7, zzj4);
                    i4 = i7 + zzj4;
                    zzbakVar.zzw(zzj4);
                }
            }
            return new zzbay(i == 0 ? null : Collections.singletonList(bArr), zzg + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzasz("Error parsing HEVC config", e);
        }
    }
}
