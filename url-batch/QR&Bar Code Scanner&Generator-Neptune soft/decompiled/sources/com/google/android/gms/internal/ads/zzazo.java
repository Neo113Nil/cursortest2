package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzazo {
    public final Uri zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;

    public zzazo(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        zzbac.zzc(j >= 0);
        zzbac.zzc(j2 >= 0);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1L : j3;
            zzbac.zzc(z);
            this.zza = uri;
            this.zzb = j;
            this.zzc = j2;
            this.zzd = j3;
        }
        z = true;
        zzbac.zzc(z);
        this.zza = uri;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
    }

    public final String toString() {
        return "DataSpec[" + String.valueOf(this.zza) + ", " + Arrays.toString((byte[]) null) + ", " + this.zzb + ", " + this.zzc + ", " + this.zzd + ", null, 0]";
    }
}
