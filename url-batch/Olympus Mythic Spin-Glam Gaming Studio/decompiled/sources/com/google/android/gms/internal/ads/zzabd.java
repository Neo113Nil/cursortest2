package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzabd {
    public final zzbg zza;
    public final int[] zzb;

    public zzabd(zzbg zzbgVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzeh.zzf("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbgVar;
        this.zzb = iArr;
    }
}
