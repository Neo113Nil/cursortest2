package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes9.dex */
public final class CallbackExecutor {
    private CallbackExecutor() {
    }

    @NonNull
    @KeepForSdk
    public static ExecutorService executorService() {
        return zzi.zza;
    }
}
