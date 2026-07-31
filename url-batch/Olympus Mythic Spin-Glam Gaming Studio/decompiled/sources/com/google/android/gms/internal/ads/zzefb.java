package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public class zzefb extends Exception {
    private final int zza;

    public zzefb(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzefb(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzefb(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
