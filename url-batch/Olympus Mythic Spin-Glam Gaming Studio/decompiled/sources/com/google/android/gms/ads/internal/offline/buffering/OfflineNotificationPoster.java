package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbzm;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public class OfflineNotificationPoster extends Worker {
    private final zzbzm zza;

    public OfflineNotificationPoster(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zzb().zzj(context, new zzbvq());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.Result doWork() {
        try {
            this.zza.zzj(ObjectWrapper.wrap(getApplicationContext()), new zza(getInputData().getString(ShareConstants.MEDIA_URI), getInputData().getString("gws_query_id"), getInputData().getString("image_url")));
            return ListenableWorker.Result.success();
        } catch (RemoteException unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
