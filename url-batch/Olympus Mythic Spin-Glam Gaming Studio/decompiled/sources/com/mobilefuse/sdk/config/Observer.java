package com.mobilefuse.sdk.config;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Observer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H&¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/config/Observer;", "", "onChanged", "", "key", "Lcom/mobilefuse/sdk/config/ObservableConfigKey;", "value", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes6.dex */
public interface Observer {
    void onChanged(@NotNull ObservableConfigKey key, @NotNull Object value) throws Throwable;
}
