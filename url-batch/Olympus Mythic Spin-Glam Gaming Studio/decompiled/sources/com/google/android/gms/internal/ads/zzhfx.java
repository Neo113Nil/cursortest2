package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhfx implements zzhep {
    zzhfx() {
    }

    @Override // com.google.android.gms.internal.ads.zzhep
    public final Object zza(zzhfe zzhfeVar, Class cls) throws GeneralSecurityException {
        if (cls == zzhek.class) {
            return cls.cast(zzhle.zza(zzhfeVar, zzhfw.zza));
        }
        throw new GeneralSecurityException("AeadConfigurationV1 can only create AEADs");
    }
}
