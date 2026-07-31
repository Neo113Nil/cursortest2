package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class No extends SimpleThreadSafeToggle implements ApplicationStateObserver {
    public No() {
        super(false, "[VisibleAppStateOnlyTrackingStatusToggle]");
        synchronized (this) {
            a(Ka.k().e().registerStickyObserver(this));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(ApplicationState applicationState) {
        updateState(applicationState == ApplicationState.VISIBLE);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final synchronized void onApplicationStateChanged(@NotNull ApplicationState applicationState) {
        a(applicationState);
    }
}
