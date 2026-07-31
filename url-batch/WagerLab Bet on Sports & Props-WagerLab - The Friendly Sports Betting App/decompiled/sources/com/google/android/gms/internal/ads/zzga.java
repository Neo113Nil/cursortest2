package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public interface zzga extends zzi {
    long zzb(zzge zzgeVar) throws IOException;

    Uri zzc();

    void zzd() throws IOException;

    void zze(zzgy zzgyVar);

    default Map zzj() {
        return Collections.emptyMap();
    }
}
