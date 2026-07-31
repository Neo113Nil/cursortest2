package io.bidmachine.rendering.internal.animation;

import io.bidmachine.rendering.model.AnimationEventType;

/* loaded from: classes15.dex */
public interface b {
    static /* synthetic */ void a(b bVar, io.bidmachine.rendering.internal.b bVar2, AnimationEventType animationEventType, boolean z, Runnable runnable, Runnable runnable2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareAndAnimate");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        bVar.a(bVar2, animationEventType, z, (i & 8) != 0 ? null : runnable, (i & 16) != 0 ? null : runnable2);
    }

    void a();

    void a(io.bidmachine.rendering.internal.b bVar);

    void a(io.bidmachine.rendering.internal.b bVar, AnimationEventType animationEventType, boolean z, Runnable runnable, Runnable runnable2);

    void a(io.bidmachine.rendering.internal.b bVar, boolean z, AnimationEventType animationEventType);

    void a(io.bidmachine.rendering.internal.c cVar);

    void a(io.bidmachine.rendering.internal.c cVar, AnimationEventType animationEventType);

    void a(io.bidmachine.rendering.internal.c cVar, AnimationEventType animationEventType, boolean z, Runnable runnable, Runnable runnable2);

    boolean a(int i);

    void b(io.bidmachine.rendering.internal.b bVar, AnimationEventType animationEventType, boolean z, Runnable runnable, Runnable runnable2);
}
