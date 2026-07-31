package com.pubmatic.sdk.common.network;

import androidx.annotation.NonNull;
import com.android.volley.ExecutorDelivery;
import com.android.volley.Network;
import com.android.volley.toolbox.NoCache;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;

/* loaded from: classes.dex */
public class POBVolley {
    public static POBRequestQueue newRequestQueue(@NonNull Network network) {
        POBRequestQueue pOBRequestQueue = new POBRequestQueue(new NoCache(), network, 4, new ExecutorDelivery(POBTaskHandler.getInstance().getBackgroundThreadExecutor()));
        pOBRequestQueue.start();
        return pOBRequestQueue;
    }
}
