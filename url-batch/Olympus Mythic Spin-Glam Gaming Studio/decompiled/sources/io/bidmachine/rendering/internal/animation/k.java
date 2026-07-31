package io.bidmachine.rendering.internal.animation;

import android.view.View;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.AnimationDirectionType;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.AnimationParams;
import io.bidmachine.rendering.model.AnimationStyleType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class k implements f {
    private final AdPhaseParams a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AnimationEventType.values().length];
            try {
                iArr[AnimationEventType.Appear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationEventType.Disappear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AnimationStyleType.values().length];
            try {
                iArr2[AnimationStyleType.Fade.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AnimationStyleType.Slide.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AnimationDirectionType.values().length];
            try {
                iArr3[AnimationDirectionType.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[AnimationDirectionType.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AnimationDirectionType.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[AnimationDirectionType.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public k(AdPhaseParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.a = params;
    }

    @Override // io.bidmachine.rendering.internal.animation.f
    public e a(View view, AnimationEventType eventType) {
        AnimationDirectionType directionOrDefault;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        int i = a.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            return new e(1.0f, 0.0f, 0.0f);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        AnimationParams animationParams = this.a.getAnimationParams().get(eventType);
        AnimationDirectionType animationDirectionType = null;
        AnimationStyleType style = animationParams != null ? animationParams.getStyle() : null;
        if (animationParams != null && (directionOrDefault = animationParams.getDirectionOrDefault()) != null) {
            animationDirectionType = directionOrDefault.inverted();
        }
        return a(view, style, animationDirectionType);
    }

    @Override // io.bidmachine.rendering.internal.animation.f
    public e b(View view, AnimationEventType eventType) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        int i = a.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            AnimationParams animationParams = this.a.getAnimationParams().get(eventType);
            return a(view, animationParams != null ? animationParams.getStyle() : null, animationParams != null ? animationParams.getDirectionOrDefault() : null);
        }
        if (i == 2) {
            return new e(view);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final e a(View view, AnimationStyleType animationStyleType, AnimationDirectionType animationDirectionType) {
        e a2;
        int i = animationStyleType == null ? -1 : a.$EnumSwitchMapping$1[animationStyleType.ordinal()];
        if (i == 1) {
            return new e(0.0f, view.getTranslationX(), view.getTranslationY());
        }
        if (i != 2) {
            return new e(view);
        }
        return (animationDirectionType == null || (a2 = a(view, animationDirectionType)) == null) ? new e(view) : a2;
    }

    private final e a(View view, AnimationDirectionType animationDirectionType) {
        float measuredWidth = view.getMeasuredWidth();
        int[] iArr = a.$EnumSwitchMapping$2;
        int i = iArr[animationDirectionType.ordinal()];
        if (i != 1) {
            measuredWidth = i != 2 ? view.getTranslationX() : -measuredWidth;
        }
        float measuredHeight = view.getMeasuredHeight();
        int i2 = iArr[animationDirectionType.ordinal()];
        if (i2 != 3) {
            measuredHeight = i2 != 4 ? view.getTranslationY() : -measuredHeight;
        }
        return new e(view.getAlpha(), measuredWidth, measuredHeight);
    }
}
