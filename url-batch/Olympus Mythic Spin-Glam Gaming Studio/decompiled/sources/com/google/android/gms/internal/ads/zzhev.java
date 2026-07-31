package com.google.android.gms.internal.ads;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhev {
    static final zzhtw zza(zzhfj zzhfjVar) {
        try {
            return ((zzhot) zzhnw.zza().zzk(null, zzhot.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzhpc("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(POBCommonConstants.NULL_VALUE), e);
        }
    }

    public static final zzhfj zzb(zzhfj zzhfjVar) throws GeneralSecurityException {
        return zzhfjVar != null ? zzhfjVar : zzhft.zzb(zza(null).zzaN());
    }
}
