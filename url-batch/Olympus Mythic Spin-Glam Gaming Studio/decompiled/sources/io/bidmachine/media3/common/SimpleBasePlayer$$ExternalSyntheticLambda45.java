package io.bidmachine.media3.common;

import io.bidmachine.media3.common.Player;
import io.bidmachine.media3.common.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class SimpleBasePlayer$$ExternalSyntheticLambda45 implements ListenerSet.Event {
    @Override // io.bidmachine.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }
}
