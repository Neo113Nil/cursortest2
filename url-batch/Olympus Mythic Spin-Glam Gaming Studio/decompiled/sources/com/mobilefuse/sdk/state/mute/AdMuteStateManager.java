package com.mobilefuse.sdk.state.mute;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdMuteStateManager.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;", "", "<init>", "()V", "Lcom/mobilefuse/sdk/state/mute/AdMuteStateObserver;", "observer", "", "addObserver", "(Lcom/mobilefuse/sdk/state/mute/AdMuteStateObserver;)Z", "removeObserver", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/state/mute/AdMutedState;", "transform", "", "update", "(Lkotlin/jvm/functions/Function1;)V", "_state", "Lcom/mobilefuse/sdk/state/mute/AdMutedState;", "", "observers", "Ljava/util/List;", "getState", "()Lcom/mobilefuse/sdk/state/mute/AdMutedState;", "state", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class AdMuteStateManager {
    private AdMutedState _state = new AdMutedState(false, null, 3, null);
    private final List<AdMuteStateObserver> observers = new ArrayList();

    @NotNull
    /* renamed from: getState, reason: from getter */
    public final AdMutedState get_state() {
        return this._state;
    }

    public final boolean addObserver(@NotNull AdMuteStateObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return this.observers.add(observer);
    }

    public final boolean removeObserver(@NotNull AdMuteStateObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return this.observers.remove(observer);
    }

    public final void update(@NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        this._state = (AdMutedState) transform.invoke(this._state);
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((AdMuteStateObserver) it.next()).onMuteStateChanged(this._state);
        }
    }
}
