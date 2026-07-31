package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.LibraryVersion;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzafc {
    private final int zza;

    private static int zza(String str) {
        try {
            List<String> zza = zzt.zza("[.-]").zza((CharSequence) str);
            if (zza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza.size() >= 3) {
                return (Integer.parseInt(zza.get(0)) * 1000000) + (Integer.parseInt(zza.get(1)) * 1000) + Integer.parseInt(zza.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e));
            return -1;
        }
    }

    public static zzafc zza() {
        String version = LibraryVersion.getInstance().getVersion("firebase-auth");
        if (TextUtils.isEmpty(version) || version.equals("UNKNOWN")) {
            version = CreateTicketViewModelKt.EmailId;
        }
        return new zzafc(version);
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }

    private zzafc(String str) {
        this.zza = zza(str);
    }
}
