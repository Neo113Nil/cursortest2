package com.pubmatic.sdk.common.network;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.RequestQueue;
import com.android.volley.ResponseDelivery;

/* loaded from: classes4.dex */
public class POBRequestQueue extends RequestQueue {
    POBRequestQueue(Cache cache, Network network, int i, ResponseDelivery responseDelivery) {
        super(cache, network, i, responseDelivery);
    }
}
