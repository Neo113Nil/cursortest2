package io.bidmachine.rendering.internal.animation;

import io.bidmachine.rendering.model.EventType;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements io.bidmachine.rendering.internal.event.e {
    private static final a c = new a(null);
    private static final List d = CollectionsKt.listOf(EventType.OnClick);
    private final b a;
    private final Function0 b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(b animationController, Function0 function0) {
        Intrinsics.checkNotNullParameter(animationController, "animationController");
        this.a = animationController;
        this.b = function0;
    }

    @Override // io.bidmachine.rendering.internal.event.e
    public boolean a(List params) {
        boolean z;
        Intrinsics.checkNotNullParameter(params, "params");
        Object orNull = CollectionsKt.getOrNull(params, 0);
        if (!(orNull instanceof EventType)) {
            return false;
        }
        boolean z2 = true;
        Object orNull2 = CollectionsKt.getOrNull(params, 1);
        if (!(orNull2 instanceof Integer) || !d.contains(orNull)) {
            return false;
        }
        Function0 function0 = this.b;
        Integer num = function0 != null ? (Integer) function0.mo4828invoke() : null;
        if (num != null) {
            Integer num2 = num.intValue() != -1 ? num : null;
            if (num2 != null) {
                z = this.a.a(num2.intValue());
                boolean a2 = this.a.a(((Number) orNull2).intValue());
                if (!z && !a2) {
                    z2 = false;
                }
                io.bidmachine.rendering.internal.k.b("AdAnimationEventInterceptor", "Intercept result=" + z2 + "; eventType=" + orNull + "; viewId=" + orNull2, new Object[0]);
                return z2;
            }
        }
        z = false;
        boolean a22 = this.a.a(((Number) orNull2).intValue());
        if (!z) {
            z2 = false;
        }
        io.bidmachine.rendering.internal.k.b("AdAnimationEventInterceptor", "Intercept result=" + z2 + "; eventType=" + orNull + "; viewId=" + orNull2, new Object[0]);
        return z2;
    }
}
