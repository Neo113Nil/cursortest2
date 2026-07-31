package com.ironsource.mediationsdk.adunit.adapter.listener;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public interface NetworkInitializationListener {
    void onInitFailed(int i, @Nullable String str);

    default void onInitFailed(int i, @Nullable String str, Map<String, Object> map) {
        onInitFailed(i, str);
    }

    void onInitSuccess();

    default void onInitSuccess(Map<String, Object> map) {
        onInitSuccess();
    }
}
