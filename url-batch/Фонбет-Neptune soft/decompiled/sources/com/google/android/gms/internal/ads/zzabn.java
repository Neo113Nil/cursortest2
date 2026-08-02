package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzabn {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final String zzk;

    private zzabn(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = f;
        this.zzk = str;
    }

    public static zzabn zza(zzek zzekVar) throws zzbo {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        try {
            zzekVar.zzL(4);
            int zzm = zzekVar.zzm() & 3;
            int i8 = zzm + 1;
            if (i8 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzm2 = zzekVar.zzm() & 31;
            for (int i9 = 0; i9 < zzm2; i9++) {
                arrayList.add(zzb(zzekVar));
            }
            int zzm3 = zzekVar.zzm();
            for (int i10 = 0; i10 < zzm3; i10++) {
                arrayList.add(zzb(zzekVar));
            }
            if (zzm2 > 0) {
                zzfg zze = zzfh.zze((byte[]) arrayList.get(0), zzm + 2, ((byte[]) arrayList.get(0)).length);
                int i11 = zze.zze;
                int i12 = zze.zzf;
                int i13 = zze.zzh + 8;
                int i14 = zze.zzi + 8;
                int i15 = zze.zzj;
                int i16 = zze.zzk;
                int i17 = zze.zzl;
                float f2 = zze.zzg;
                str = zzdk.zza(zze.zza, zze.zzb, zze.zzc);
                i6 = i16;
                i7 = i17;
                f = f2;
                i3 = i13;
                i4 = i14;
                i5 = i15;
                i = i11;
                i2 = i12;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                f = 1.0f;
            }
            return new zzabn(arrayList, i8, i, i2, i3, i4, i5, i6, i7, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbo.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzek zzekVar) {
        int zzq = zzekVar.zzq();
        int zzd = zzekVar.zzd();
        zzekVar.zzL(zzq);
        return zzdk.zzc(zzekVar.zzM(), zzd, zzq);
    }
}
