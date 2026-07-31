package io.bidmachine.rendering.internal.animation;

import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.util.Tag;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class d {
    public static final d a = new d();

    private d() {
    }

    public static final a a(AdPhaseParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return a.a(new Tag("AdPhaseAnimator"), params.getAnimationParams(), new k(params));
    }

    public static final a a(AdElementParams params, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        return a.a(new Tag("AdElementAnimator (" + params.getName() + ')'), params.getAnimationParams(), new j(params, z));
    }

    private final a a(Tag tag, Map map, f fVar) {
        return new a(tag, new h(map), fVar);
    }
}
