package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgbe {
    public static zzgbd zza(String str) throws GeneralSecurityException {
        zzgbd zzgbdVar = (zzgbd) zzgby.zzk().get(str);
        if (zzgbdVar != null) {
            return zzgbdVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
