package com.mobilefuse.sdk.ad.rendering.omniad.modifier;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimatedPositionModifier.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0002J&\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/AnimatedPositionModifier;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "omniAdContainer", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "durationMillis", "", "interpolator", "Landroid/animation/TimeInterpolator;", "(Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;JLandroid/animation/TimeInterpolator;)V", "animator", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "setAnimator", "(Landroid/animation/ValueAnimator;)V", "getOmniAdContainer", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "cancel", "", "cancelAnimators", "changePosition", VastAttributes.HORIZONTAL_POSITION, "", VastAttributes.VERTICAL_POSITION, "completeAction", "Lkotlin/Function0;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public final class AnimatedPositionModifier implements PositionModifier {

    @Nullable
    private ValueAnimator animator;
    private final long durationMillis;
    private final TimeInterpolator interpolator;

    @NotNull
    private final OmniAdContainer omniAdContainer;

    public AnimatedPositionModifier(@NotNull OmniAdContainer omniAdContainer, long j, @NotNull TimeInterpolator interpolator) {
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.omniAdContainer = omniAdContainer;
        this.durationMillis = j;
        this.interpolator = interpolator;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier
    @NotNull
    public OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }

    public /* synthetic */ AnimatedPositionModifier(OmniAdContainer omniAdContainer, long j, TimeInterpolator timeInterpolator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(omniAdContainer, (i & 2) != 0 ? 500L : j, (i & 4) != 0 ? new FastOutSlowInInterpolator() : timeInterpolator);
    }

    @Nullable
    public final ValueAnimator getAnimator() {
        return this.animator;
    }

    public final void setAnimator(@Nullable ValueAnimator valueAnimator) {
        this.animator = valueAnimator;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier
    public void changePosition(int x, int y, @NotNull final Function0 completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        cancelAnimators();
        Point currentPosition = getOmniAdContainer().getCurrentPosition();
        final float f = currentPosition.x;
        final float f2 = currentPosition.y;
        final float f3 = x - f;
        final float f4 = y - f2;
        ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.durationMillis);
        this.animator = animator;
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        animator.setInterpolator(this.interpolator);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedPositionModifier$changePosition$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@NotNull ValueAnimator anim) {
                Intrinsics.checkNotNullParameter(anim, "anim");
                if (anim != AnimatedPositionModifier.this.getAnimator()) {
                    return;
                }
                OmniAdContainer omniAdContainer = AnimatedPositionModifier.this.getOmniAdContainer();
                float f5 = f;
                Object animatedValue = anim.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                int floatValue = (int) (f5 + (((Float) animatedValue).floatValue() * f3));
                float f6 = f2;
                Object animatedValue2 = anim.getAnimatedValue();
                if (animatedValue2 != null) {
                    omniAdContainer.changePosition(floatValue, (int) (f6 + (((Float) animatedValue2).floatValue() * f4)));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
        });
        animator.addListener(new Animator.AnimatorListener() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedPositionModifier$changePosition$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                AnimatedPositionModifier.this.setAnimator(null);
                completeAction.mo4828invoke();
            }
        });
        animator.start();
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier
    public void cancel() {
        cancelAnimators();
    }

    private final void cancelAnimators() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
    }
}
