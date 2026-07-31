package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzqy extends Exception {
    public final int zza;
    public final boolean zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqy(int i, boolean z) {
        super(r1.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("AudioOutput write failed: ");
        sb.append(i);
        this.zzb = z;
        this.zza = i;
    }
}
