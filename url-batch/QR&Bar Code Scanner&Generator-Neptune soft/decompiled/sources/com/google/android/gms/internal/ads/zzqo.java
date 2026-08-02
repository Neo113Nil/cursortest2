package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzqo {
    public static void zza(zzqj zzqjVar, zznb zznbVar) {
        LogSessionId zza = zznbVar.zza();
        if (zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zzqjVar.zzb.setString("log-session-id", zza.getStringId());
    }
}
