package io.bidmachine.rendering.internal.animation;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.AnimationFunctionType;
import io.bidmachine.rendering.model.AnimationParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class h {
    private final Map a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationFunctionType.values().length];
            try {
                iArr[AnimationFunctionType.EaseIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationFunctionType.EaseOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimationFunctionType.EaseInOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public h(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.a = params;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
    }

    public final ViewPropertyAnimator a(View view, AnimationEventType eventType, e targetValues) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(targetValues, "targetValues");
        AnimationParams animationParams = (AnimationParams) this.a.get(eventType);
        if (animationParams == null) {
            return null;
        }
        ViewPropertyAnimator withStartAction = view.animate().alpha(targetValues.a()).translationX(targetValues.b()).translationY(targetValues.c()).setDuration(animationParams.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION java.lang.String()).withStartAction(new Runnable() { // from class: io.bidmachine.rendering.internal.animation.h$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                h.a();
            }
        });
        withStartAction.setInterpolator(a(animationParams.getFunction()));
        return withStartAction;
    }

    private final TimeInterpolator a(AnimationFunctionType animationFunctionType) {
        int i = animationFunctionType == null ? -1 : a.$EnumSwitchMapping$0[animationFunctionType.ordinal()];
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i != 3) {
            return new LinearInterpolator();
        }
        return new AccelerateDecelerateInterpolator();
    }
}
