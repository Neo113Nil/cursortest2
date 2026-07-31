package io.ktor.events;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import io.ktor.util.collections.CopyOnWriteHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Events.kt */
/* loaded from: classes4.dex */
public final class Events {
    private final CopyOnWriteHashMap handlers = new CopyOnWriteHashMap();

    public final void raise(EventDefinition definition, Object obj) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.handlers.get(definition));
    }
}
