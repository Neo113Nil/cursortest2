package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;

/* loaded from: classes5.dex */
public interface AdapterAdRewardListener extends AdapterAdInteractionListener {
    void onAdRewarded();

    default void onAdRewarded(Map<String, Object> map) {
        onAdRewarded();
    }
}
