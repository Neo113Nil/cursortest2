package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfeh {
    static Task zza;
    public static AppSetIdClient zzb;
    private static final Object zzc = new Object();

    public static void zza(Context context, boolean z) {
        synchronized (zzc) {
            if (zzb == null) {
                zzb = AppSet.getClient(context);
            }
            Task task = zza;
            if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z && zza.isComplete()))) {
                zza = ((AppSetIdClient) Preconditions.checkNotNull(zzb, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
            }
        }
    }

    public static Task zzb(Context context) {
        Task task;
        zza(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }
}
