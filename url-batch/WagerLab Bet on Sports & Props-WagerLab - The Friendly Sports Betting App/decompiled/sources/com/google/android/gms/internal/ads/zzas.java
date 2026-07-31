package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public class zzas extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzas(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzas zza(String str, Throwable th) {
        return new zzas(str, th, true, 0);
    }

    public static zzas zzb(String str, Throwable th) {
        return new zzas(str, th, true, 1);
    }

    public static zzas zzc(String str) {
        return new zzas(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String concat = message != null ? message.concat(" ") : "";
        boolean z = this.zza;
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(concat.length() + 20 + String.valueOf(z).length() + 11 + String.valueOf(i).length() + 1);
        sb.append(concat);
        sb.append("{contentIsMalformed=");
        sb.append(z);
        sb.append(", dataType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
