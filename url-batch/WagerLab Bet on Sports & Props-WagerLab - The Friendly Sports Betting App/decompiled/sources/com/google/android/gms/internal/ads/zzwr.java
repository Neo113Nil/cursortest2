package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzwr extends zzas {
    public final zzgjz zzc;

    public zzwr(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzgjz.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzas, java.lang.Throwable
    public final String getMessage() {
        zzgjz zzgjzVar = this.zzc;
        String message = super.getMessage();
        if (zzgjzVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String valueOf = String.valueOf(zzgjzVar);
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(valueOf).length());
        sb.append(message);
        sb.append("\nsniff failures: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
