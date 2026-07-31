package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.transition.TransitionValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VerticalTranslation.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0003\u0014\u0015\u0016B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J.\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0016J.\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation;", "Lcom/yandex/div/core/view2/animations/OutlineAwareVisibility;", "translatedValue", "", "stableValue", "(FF)V", "captureEndValues", "", "transitionValues", "Landroidx/transition/TransitionValues;", "captureStartValues", "onAppear", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "startValues", "endValues", "onDisappear", "AnimationEndListener", "Companion", "TranslationYClipBounds", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerticalTranslation extends OutlineAwareVisibility {
    public static final float DEFAULT_STABLE_VALUE = 0.0f;
    public static final float DEFAULT_TRANSLATED_VALUE = -1.0f;

    @NotNull
    private static final String PROPNAME_SCREEN_POSITION = "yandex:verticalTranslation:screenPosition";
    private final float stableValue;
    private final float translatedValue;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VerticalTranslation() {
        this(r2, r2, 3, null);
        float f = 0.0f;
    }

    public /* synthetic */ VerticalTranslation(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public VerticalTranslation(float f, float f2) {
        this.translatedValue = f;
        this.stableValue = f2;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NotNull final TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Function1() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation$captureStartValues$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((int[]) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull int[] iArr) {
                TransitionValues.this.values.put("yandex:verticalTranslation:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NotNull final TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new Function1() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation$captureEndValues$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((int[]) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull int[] iArr) {
                TransitionValues.this.values.put("yandex:verticalTranslation:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        if (endValues == null) {
            return null;
        }
        float height = view.getHeight();
        float f = this.translatedValue * height;
        float f2 = this.stableValue * height;
        Object obj = endValues.values.get(PROPNAME_SCREEN_POSITION);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        View createOrGetVisualCopy = ViewCopiesKt.createOrGetVisualCopy(view, sceneRoot, this, (int[]) obj);
        createOrGetVisualCopy.setTranslationY(f);
        TranslationYClipBounds translationYClipBounds = new TranslationYClipBounds(createOrGetVisualCopy);
        translationYClipBounds.set(createOrGetVisualCopy, this.translatedValue);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(createOrGetVisualCopy, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f, f2), PropertyValuesHolder.ofFloat(translationYClipBounds, this.translatedValue, this.stableValue));
        ofPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return ofPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        if (startValues == null) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(UtilsKt.getViewForAnimate(this, view, sceneRoot, startValues, PROPNAME_SCREEN_POSITION), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.stableValue, this.translatedValue * view.getHeight()), PropertyValuesHolder.ofFloat(new TranslationYClipBounds(view), this.stableValue, this.translatedValue));
        ofPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return ofPropertyValuesHolder;
    }

    /* compiled from: VerticalTranslation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation$TranslationYClipBounds;", "Landroid/util/Property;", "Landroid/view/View;", "", "view", "(Landroid/view/View;)V", "clipBounds", "Landroid/graphics/Rect;", "clipFactor", "get", "(Landroid/view/View;)Ljava/lang/Float;", "set", "", "value", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @VisibleForTesting
    public static final class TranslationYClipBounds extends Property<View, Float> {

        @NotNull
        private final Rect clipBounds;
        private float clipFactor;

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f) {
            set(view, f.floatValue());
        }

        public TranslationYClipBounds(@NotNull View view) {
            super(Float.TYPE, "ClipBoundsTop");
            this.clipBounds = new Rect(0, 0, view.getWidth(), view.getHeight());
        }

        @Override // android.util.Property
        @NotNull
        public Float get(@NotNull View view) {
            return Float.valueOf(this.clipFactor);
        }

        public void set(@NotNull View view, float value) {
            this.clipFactor = value;
            if (value < 0.0f) {
                this.clipBounds.set(0, (int) ((-value) * (view.getHeight() - 1)), view.getWidth(), view.getHeight());
            } else if (value > 0.0f) {
                float f = 1;
                this.clipBounds.set(0, 0, view.getWidth(), (int) (((f - this.clipFactor) * view.getHeight()) + f));
            } else {
                this.clipBounds.set(0, 0, view.getWidth(), view.getHeight());
            }
            ViewCompat.setClipBounds(view, this.clipBounds);
        }
    }

    /* compiled from: VerticalTranslation.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation$AnimationEndListener;", "Landroid/animation/AnimatorListenerAdapter;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AnimationEndListener extends AnimatorListenerAdapter {

        @NotNull
        private final View view;

        public AnimationEndListener(@NotNull View view) {
            this.view = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            this.view.setTranslationY(0.0f);
            ViewCompat.setClipBounds(this.view, null);
        }
    }
}
