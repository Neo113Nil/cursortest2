package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zznu extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzaf zzc;

    public zznu(int i, int i2, int i3, int i4, zzaf zzafVar, boolean z, Exception exc) {
        super("AudioTrack init failed " + i + " Config(" + i2 + ", " + i3 + ", " + i4 + ")" + (true != z ? "" : " (recoverable)"), exc);
        this.zza = i;
        this.zzb = z;
        this.zzc = zzafVar;
    }
}
