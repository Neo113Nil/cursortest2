package com.google.android.gms.common.util;

import android.os.StrictMode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@RequiresApi
/* loaded from: classes5.dex */
final class zzc {
    @DoNotInline
    static StrictMode.VmPolicy.Builder zza(StrictMode.VmPolicy.Builder builder) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        permitUnsafeIntentLaunch = builder.permitUnsafeIntentLaunch();
        return permitUnsafeIntentLaunch;
    }
}
