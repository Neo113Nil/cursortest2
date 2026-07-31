package com.mobilefuse.sdk.state.mute;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdMuteStateObserver.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/state/mute/AdMuteStateObserver;", "", "onMuteStateChanged", "", "adMutedState", "Lcom/mobilefuse/sdk/state/mute/AdMutedState;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes11.dex */
public interface AdMuteStateObserver {
    void onMuteStateChanged(@NotNull AdMutedState adMutedState);
}
