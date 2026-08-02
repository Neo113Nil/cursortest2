package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzvs {
    public final zzcp zza;
    public final int[] zzb;

    public zzvs(zzcp zzcpVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzdw.zzc("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzcpVar;
        this.zzb = iArr;
    }
}
