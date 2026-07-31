package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzzs extends zzat {
    public final zzgxm zzc;

    public zzzs(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzgxm.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        zzgxm zzgxmVar = this.zzc;
        String message = super.getMessage();
        if (zzgxmVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String valueOf = String.valueOf(zzgxmVar);
        StringBuilder sb = new StringBuilder(length + 17 + valueOf.length());
        sb.append(message);
        sb.append("\nsniff failures: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
