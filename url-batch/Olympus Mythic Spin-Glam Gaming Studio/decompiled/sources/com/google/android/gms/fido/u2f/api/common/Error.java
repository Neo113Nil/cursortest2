package com.google.android.gms.fido.u2f.api.common;

import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@Deprecated
/* loaded from: classes5.dex */
public class Error {
    private final ErrorCode zza;
    private final String zzb;

    public String toString() {
        return this.zzb == null ? String.format(Locale.ENGLISH, "{errorCode: %d}", Integer.valueOf(this.zza.getCode())) : String.format(Locale.ENGLISH, "{errorCode: %d, errorMessage: %s}", Integer.valueOf(this.zza.getCode()), this.zzb);
    }
}
