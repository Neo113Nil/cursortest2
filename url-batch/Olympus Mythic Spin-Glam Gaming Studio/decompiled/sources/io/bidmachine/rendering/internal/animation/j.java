package io.bidmachine.rendering.internal.animation;

import android.content.Context;
import android.view.View;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AnimationDirectionType;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.AnimationParams;
import io.bidmachine.rendering.model.AnimationStyleType;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.model.SideType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class j implements f {
    private final AdElementParams a;
    private final boolean b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

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
            int[] iArr3 = new int[SideType.values().length];
            try {
                iArr3[SideType.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[SideType.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[SideType.CenterX.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[SideType.Top.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[SideType.Bottom.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[SideType.CenterY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AnimationDirectionType.values().length];
            try {
                iArr4[AnimationDirectionType.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[AnimationDirectionType.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[AnimationDirectionType.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[AnimationDirectionType.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public j(AdElementParams params, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.a = params;
        this.b = z;
    }

    @Override // io.bidmachine.rendering.internal.animation.f
    public e a(View view, AnimationEventType eventType) {
        AnimationDirectionType directionOrDefault;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        ElementLayoutParams elementLayoutParams = this.a.getElementLayoutParams();
        int i = a.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            Float opacity = this.a.getAppearanceParams().getOpacity();
            float floatValue = opacity != null ? opacity.floatValue() : 1.0f;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return new e(floatValue, elementLayoutParams.getTranslationXPx(context), elementLayoutParams.getTranslationYPx(context));
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
        return a(view, elementLayoutParams, style, animationDirectionType);
    }

    @Override // io.bidmachine.rendering.internal.animation.f
    public e b(View view, AnimationEventType eventType) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        int i = a.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            AnimationParams animationParams = this.a.getAnimationParams().get(eventType);
            return a(view, this.a.getElementLayoutParams(), animationParams != null ? animationParams.getStyle() : null, animationParams != null ? animationParams.getDirectionOrDefault() : null);
        }
        if (i == 2) {
            return a(view);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final e a(View view, ElementLayoutParams elementLayoutParams, AnimationStyleType animationStyleType, AnimationDirectionType animationDirectionType) {
        e eVar;
        int i = animationStyleType == null ? -1 : a.$EnumSwitchMapping$1[animationStyleType.ordinal()];
        if (i == 1) {
            eVar = new e(0.0f, view.getTranslationX(), view.getTranslationY());
        } else {
            if (i != 2) {
                return a(view);
            }
            if (animationDirectionType == null || (eVar = a(view, elementLayoutParams, animationDirectionType)) == null) {
                return a(view);
            }
        }
        return eVar;
    }

    private final e a(View view, ElementLayoutParams elementLayoutParams, AnimationDirectionType animationDirectionType) {
        Context context = view.getContext();
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        float marginLeftPx = elementLayoutParams.getMarginLeftPx(context);
        float marginRightPx = elementLayoutParams.getMarginRightPx(context);
        float marginTopPx = elementLayoutParams.getMarginTopPx(context);
        float marginBottomPx = elementLayoutParams.getMarginBottomPx(context);
        int widthPx = elementLayoutParams.getWidthPx(context);
        int heightPx = elementLayoutParams.getHeightPx(context);
        if ((widthPx <= 0 || heightPx <= 0) && (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0)) {
            int visibility = view.getVisibility();
            view.setVisibility(0);
            if (view2 != null) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view2.getMeasuredHeight(), 1073741824));
            }
            view.setVisibility(visibility);
        }
        float f = widthPx;
        Float valueOf = Float.valueOf(f);
        if (f <= 0.0f) {
            valueOf = null;
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : view.getMeasuredWidth();
        float f2 = heightPx;
        Float valueOf2 = f2 > 0.0f ? Float.valueOf(f2) : null;
        float floatValue2 = valueOf2 != null ? valueOf2.floatValue() : view.getMeasuredHeight();
        float translationXPx = elementLayoutParams.getTranslationXPx(context);
        float translationYPx = elementLayoutParams.getTranslationYPx(context);
        float measuredWidth = view2 != null ? view2.getMeasuredWidth() : floatValue;
        float measuredHeight = view2 != null ? view2.getMeasuredHeight() : floatValue2;
        int[] iArr = a.$EnumSwitchMapping$3;
        int i = iArr[animationDirectionType.ordinal()];
        if (i == 1) {
            SideType a2 = g.a(elementLayoutParams);
            int i2 = a2 == null ? -1 : a.$EnumSwitchMapping$2[a2.ordinal()];
            if (i2 == 1) {
                translationXPx = measuredWidth - marginLeftPx;
            } else if (i2 == 2) {
                translationXPx = floatValue - marginRightPx;
            } else if (i2 == 3) {
                translationXPx = (measuredWidth + floatValue) / 2;
            }
        } else if (i == 2) {
            SideType a3 = g.a(elementLayoutParams);
            int i3 = a3 == null ? -1 : a.$EnumSwitchMapping$2[a3.ordinal()];
            if (i3 == 1) {
                translationXPx = (-floatValue) - marginLeftPx;
            } else if (i3 == 2) {
                translationXPx = (-measuredWidth) - marginRightPx;
            } else if (i3 == 3) {
                translationXPx = (-(measuredWidth + floatValue)) / 2;
            }
        }
        int i4 = iArr[animationDirectionType.ordinal()];
        if (i4 == 3) {
            SideType b = g.b(elementLayoutParams);
            int i5 = b != null ? a.$EnumSwitchMapping$2[b.ordinal()] : -1;
            if (i5 == 4) {
                translationYPx = measuredHeight - marginTopPx;
            } else if (i5 == 5) {
                translationYPx = floatValue2 - marginBottomPx;
            } else if (i5 == 6) {
                translationYPx = (measuredHeight + floatValue2) / 2.0f;
            }
        } else if (i4 == 4) {
            SideType b2 = g.b(elementLayoutParams);
            int i6 = b2 != null ? a.$EnumSwitchMapping$2[b2.ordinal()] : -1;
            if (i6 == 4) {
                translationYPx = (-floatValue2) - marginTopPx;
            } else if (i6 == 5) {
                translationYPx = (-measuredHeight) + floatValue2 + marginBottomPx;
            } else if (i6 == 6) {
                translationYPx = (-(measuredHeight + floatValue2)) / 2.0f;
            }
        }
        return new e(view.getAlpha(), translationXPx, translationYPx);
    }

    private final e a(View view) {
        return new e(this.b ? 0.0f : view.getAlpha(), view.getTranslationX(), view.getTranslationY());
    }
}
