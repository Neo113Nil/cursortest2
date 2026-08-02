package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzyn {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    public final String zzf;

    private zzyn(List list, int i, int i2, int i3, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = f;
        this.zzf = str;
    }

    public static zzyn zza(zzef zzefVar) throws zzbu {
        int i;
        int i2;
        float f;
        String str;
        try {
            zzefVar.zzG(4);
            int zzk = (zzefVar.zzk() & 3) + 1;
            if (zzk == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzk2 = zzefVar.zzk() & 31;
            for (int i3 = 0; i3 < zzk2; i3++) {
                arrayList.add(zzb(zzefVar));
            }
            int zzk3 = zzefVar.zzk();
            for (int i4 = 0; i4 < zzk3; i4++) {
                arrayList.add(zzb(zzefVar));
            }
            if (zzk2 > 0) {
                zzaae zzd = zzaaf.zzd((byte[]) arrayList.get(0), zzk + 1, ((byte[]) arrayList.get(0)).length);
                int i5 = zzd.zze;
                int i6 = zzd.zzf;
                float f2 = zzd.zzg;
                str = zzdf.zza(zzd.zza, zzd.zzb, zzd.zzc);
                i = i5;
                i2 = i6;
                f = f2;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
                str = null;
            }
            return new zzyn(arrayList, zzk, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbu.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzef zzefVar) {
        int zzo = zzefVar.zzo();
        int zzc = zzefVar.zzc();
        zzefVar.zzG(zzo);
        return zzdf.zzc(zzefVar.zzH(), zzc, zzo);
    }
}
