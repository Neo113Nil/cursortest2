package com.facebook.ads.internal.api;

import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public interface AudienceNetworkRemoteServiceApi {
    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();
}
