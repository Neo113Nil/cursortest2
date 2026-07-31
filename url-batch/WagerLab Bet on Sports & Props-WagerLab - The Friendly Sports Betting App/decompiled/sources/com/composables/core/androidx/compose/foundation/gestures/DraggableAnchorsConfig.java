package com.composables.core.androidx.compose.foundation.gestures;

import com.composables.core.androidx.collection.MutableObjectFloatMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\t\u001a\u00020\n*\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0004¢\u0006\u0002\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/composables/core/androidx/compose/foundation/gestures/DraggableAnchorsConfig;", "T", "", "<init>", "()V", "anchors", "Lcom/composables/core/androidx/collection/MutableObjectFloatMap;", "getAnchors$core_release", "()Lcom/composables/core/androidx/collection/MutableObjectFloatMap;", "at", "", ViewProps.POSITION, "", "(Ljava/lang/Object;F)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final MutableObjectFloatMap<T> anchors = new MutableObjectFloatMap<>(0, 1, null);

    public final MutableObjectFloatMap<T> getAnchors$core_release() {
        return this.anchors;
    }

    public final void at(T t, float f) {
        this.anchors.set(t, f);
    }
}
