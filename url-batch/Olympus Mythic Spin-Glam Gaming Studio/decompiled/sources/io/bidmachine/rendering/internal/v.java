package io.bidmachine.rendering.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.BackgroundSource;
import io.bidmachine.rendering.model.Base64ResourceSource;
import io.bidmachine.rendering.model.Border;
import io.bidmachine.rendering.model.Color;
import io.bidmachine.rendering.model.ColorBackgroundSource;
import io.bidmachine.rendering.model.ColorPlaceholderSource;
import io.bidmachine.rendering.model.ColorSource;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.Gradient;
import io.bidmachine.rendering.model.GradientColorSource;
import io.bidmachine.rendering.model.GradientType;
import io.bidmachine.rendering.model.HtmlResourceSource;
import io.bidmachine.rendering.model.Image;
import io.bidmachine.rendering.model.ImageBackgroundSource;
import io.bidmachine.rendering.model.ImagePlaceholderSource;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.NamePlaceholderSource;
import io.bidmachine.rendering.model.OneColorSource;
import io.bidmachine.rendering.model.Placeholder;
import io.bidmachine.rendering.model.PlaceholderSource;
import io.bidmachine.rendering.model.ResourceSource;
import io.bidmachine.rendering.model.ScaleType;
import io.bidmachine.rendering.model.ScaleTypeKt;
import io.bidmachine.rendering.model.UrlResourceSource;
import io.bidmachine.rendering.model.XmlResourceSource;
import io.bidmachine.util.ColorUtilsKt;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.gradient.GradientDrawable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class v {
    private final Context a;
    private final Repository b;
    private final Background c;
    private final AtomicBoolean d;
    private final AtomicBoolean e;
    private final io.bidmachine.rendering.internal.meanbackground.g f;
    private final AtomicBoolean g;
    private Animator h;

    public static final class a {
        private final long a;
        private final TimeInterpolator b;

        public a(long j, TimeInterpolator interpolator) {
            Intrinsics.checkNotNullParameter(interpolator, "interpolator");
            this.a = j;
            this.b = interpolator;
        }

        public final long a() {
            return this.a;
        }

        public final TimeInterpolator b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            return (Long.hashCode(this.a) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "AnimationConfig(durationMs=" + this.a + ", interpolator=" + this.b + ')';
        }

        public final boolean a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return this.a > 0 && view.isLaidOut();
        }

        public /* synthetic */ a(long j, TimeInterpolator timeInterpolator, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 200L : j, (i & 2) != 0 ? new DecelerateInterpolator() : timeInterpolator);
        }
    }

    public final class b implements Repository.ResultCallback {
        private final boolean a;
        private final ScaleType b;
        private final Integer c;
        private final Border d;
        private final WeakReference e;
        final /* synthetic */ v f;

        public b(v vVar, View view, boolean z, ScaleType scaleType, Integer num, Border border) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f = vVar;
            this.a = z;
            this.b = scaleType;
            this.c = num;
            this.d = border;
            this.e = new WeakReference(view);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.bidmachine.util.ResultCallback
        public void onError(Error error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // io.bidmachine.rendering.Repository.ResultCallback, io.bidmachine.util.ResultCallback
        public void onSuccess(Bitmap successType) {
            Intrinsics.checkNotNullParameter(successType, "successType");
            v vVar = this.f;
            try {
                View view = (View) this.e.get();
                if (view == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(view, "weakView.get() ?: return");
                vVar.a(view, this.a, successType, this.b, this.c, this.d);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable unused) {
            }
        }
    }

    static final class c extends Lambda implements Function1 {
        final /* synthetic */ View a;
        final /* synthetic */ boolean b;
        final /* synthetic */ v c;
        final /* synthetic */ Integer d;
        final /* synthetic */ Border e;
        final /* synthetic */ a f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view, boolean z, v vVar, Integer num, Border border, a aVar) {
            super(1);
            this.a = view;
            this.b = z;
            this.c = vVar;
            this.d = num;
            this.e = border;
            this.f = aVar;
        }

        public final void a(int i) {
            v.b(this.a, this.c, this.d, this.e, this.f, this.b, i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    static final class d extends Lambda implements Function1 {
        final /* synthetic */ View a;
        final /* synthetic */ Gradient b;
        final /* synthetic */ v c;
        final /* synthetic */ Integer d;
        final /* synthetic */ Border e;
        final /* synthetic */ a f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view, Gradient gradient, v vVar, Integer num, Border border, a aVar) {
            super(1);
            this.a = view;
            this.b = gradient;
            this.c = vVar;
            this.d = num;
            this.e = border;
            this.f = aVar;
        }

        public final void a(List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            v.b(this.a, this.c, this.d, this.e, this.f, true, new Gradient(this.b.getType(), this.b.getDirection(), it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Unit.INSTANCE;
        }
    }

    static final class e extends Lambda implements Function0 {
        final /* synthetic */ View a;
        final /* synthetic */ int b;
        final /* synthetic */ v c;
        final /* synthetic */ Integer d;
        final /* synthetic */ Border e;
        final /* synthetic */ a f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(View view, int i, v vVar, Integer num, Border border, a aVar) {
            super(0);
            this.a = view;
            this.b = i;
            this.c = vVar;
            this.d = num;
            this.e = border;
            this.f = aVar;
        }

        public final void a() {
            v.b(this.a, this.c, this.d, this.e, this.f, true, this.b);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class f extends Lambda implements Function0 {
        final /* synthetic */ View a;
        final /* synthetic */ Gradient b;
        final /* synthetic */ v c;
        final /* synthetic */ Integer d;
        final /* synthetic */ Border e;
        final /* synthetic */ a f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(View view, Gradient gradient, v vVar, Integer num, Border border, a aVar) {
            super(0);
            this.a = view;
            this.b = gradient;
            this.c = vVar;
            this.d = num;
            this.e = border;
            this.f = aVar;
        }

        public final void a() {
            v.b(this.a, this.c, this.d, this.e, this.f, true, this.b);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class g extends AnimatorListenerAdapter {
        final /* synthetic */ WeakReference a;
        final /* synthetic */ Drawable b;

        g(WeakReference weakReference, Drawable drawable) {
            this.a = weakReference;
            this.b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            View view = (View) this.a.get();
            if (view == null) {
                return;
            }
            view.setBackground(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(Context context, Repository repository, Background background) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(background, "background");
        this.a = context;
        this.b = repository;
        this.c = background;
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new io.bidmachine.rendering.internal.meanbackground.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.g = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(View view, v vVar, Integer num, Border border, a aVar, boolean z, int i) {
        vVar.a(view, z, i, num, border, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(View view, v vVar, Integer num, Border border, a aVar, boolean z, Gradient gradient) {
        vVar.a(view, z, gradient, num, border, aVar);
    }

    public final void a(Object assetsHolder, View view, Integer num, Border border, boolean z, a aVar) {
        BackgroundSource source;
        Placeholder placeholder;
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.e.compareAndSet(false, true) && (placeholder = this.c.getPlaceholder()) != null) {
            try {
                a(this, assetsHolder, view, placeholder, num, border, (a) null, 32, (Object) null);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable unused) {
            }
        }
        boolean isContextBased = this.c.getIsContextBased();
        if (((!z || isContextBased) && (z || !isContextBased)) || (source = this.c.getSource()) == null) {
            return;
        }
        try {
            a(assetsHolder, view, source, num, border, aVar);
            Unit unit2 = Unit.INSTANCE;
        } catch (Throwable unused2) {
        }
    }

    public static /* synthetic */ void a(v vVar, Object obj, View view, Placeholder placeholder, Integer num, Border border, a aVar, int i, Object obj2) {
        vVar.a(obj, view, placeholder, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : border, (i & 32) != 0 ? null : aVar);
    }

    public final void a(Object assetsHolder, View view, Placeholder placeholder, Integer num, Border border, a aVar) {
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        PlaceholderSource source = placeholder.getSource();
        if (source instanceof NamePlaceholderSource) {
            a(this, view, false, io.bidmachine.rendering.internal.g.a.c(((NamePlaceholderSource) source).getName()), (ScaleType) null, num, border, 8, (Object) null);
        } else if (source instanceof ColorPlaceholderSource) {
            a(view, false, ((ColorPlaceholderSource) source).getColor(), num, border, aVar);
        } else if (source instanceof ImagePlaceholderSource) {
            a(assetsHolder, view, false, ((ImagePlaceholderSource) source).getImage(), num, border);
        }
    }

    public final void a(Object assetsHolder, View view, BackgroundSource backgroundSource, Integer num, Border border, a aVar) {
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(backgroundSource, "backgroundSource");
        if (backgroundSource instanceof ColorBackgroundSource) {
            a(view, true, ((ColorBackgroundSource) backgroundSource).getColor(), num, border, aVar);
        } else if (backgroundSource instanceof ImageBackgroundSource) {
            a(assetsHolder, view, true, ((ImageBackgroundSource) backgroundSource).getImage(), num, border);
        }
    }

    public final void a(View view, boolean z, Color color, Integer num, Border border, a aVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(color, "color");
        boolean isContextBased = color.getIsContextBased();
        ColorSource source = color.getSource();
        if (source instanceof OneColorSource) {
            int color2 = ((OneColorSource) source).getColor();
            e eVar = new e(view, color2, this, num, border, aVar);
            if (!isContextBased) {
                eVar.mo4828invoke();
                return;
            } else {
                this.f.a(view, Integer.valueOf(color2), eVar, new c(view, z, this, num, border, aVar));
                return;
            }
        }
        if (source instanceof GradientColorSource) {
            Gradient gradient = ((GradientColorSource) source).getGradient();
            f fVar = new f(view, gradient, this, num, border, aVar);
            if (!isContextBased) {
                fVar.mo4828invoke();
            } else {
                this.f.b(view, -16777216, fVar, new d(view, gradient, this, num, border, aVar));
            }
        }
    }

    public final void a(View view, boolean z, int i, Integer num, Border border, a aVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        if (num != null) {
            gradientDrawable.setCornerRadius(num.intValue());
        }
        if (border != null) {
            GradientDrawable.setStroke$default(gradientDrawable, border.getStrokeWidthPx(), border.getStrokeColor(), 0.0f, 0.0f, 12, (Object) null);
            view.setPadding(border.getStrokeWidthPx(), border.getStrokeWidthPx() - UtilsKt.dpToPx(this.a, 2.0f), border.getStrokeWidthPx(), border.getStrokeWidthPx() + UtilsKt.dpToPx(this.a, 2.0f));
        }
        a(view, z, gradientDrawable, aVar);
    }

    public final void a(View view, boolean z, Gradient gradient, Integer num, Border border, a aVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        int drawableGradientType = gradient.getType().toDrawableGradientType();
        GradientDrawable gradientDrawable = new GradientDrawable(gradient.getDirection().toDrawableGradientOrientation(), CollectionsKt.toIntArray(gradient.getColors()));
        gradientDrawable.setGradientType(drawableGradientType);
        if (gradient.getType() == GradientType.Radial) {
            GradientDrawable.setGradientRadius$default(gradientDrawable, 0.0f, 2, 1, null);
        }
        if (num != null) {
            gradientDrawable.setCornerRadius(num.intValue());
        }
        if (border != null) {
            GradientDrawable.setStroke$default(gradientDrawable, border.getStrokeWidthPx(), border.getStrokeColor(), 0.0f, 0.0f, 12, (Object) null);
            view.setPadding(border.getStrokeWidthPx(), border.getStrokeWidthPx() - UtilsKt.dpToPx(this.a, 2.0f), border.getStrokeWidthPx(), border.getStrokeWidthPx() + UtilsKt.dpToPx(this.a, 2.0f));
        }
        a(view, z, gradientDrawable, aVar);
    }

    public final void a(Object assetsHolder, View view, boolean z, Image image, Integer num, Border border) {
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(image, "image");
        ResourceSource source = image.getResource().getSource();
        if (source instanceof Base64ResourceSource) {
            a(view, z, io.bidmachine.rendering.internal.g.b(((Base64ResourceSource) source).getBase64()), image.getScaleType(), num, border);
            return;
        }
        if (source instanceof UrlResourceSource) {
            MediaSource fromUrls = MediaSource.INSTANCE.fromUrls(((UrlResourceSource) source).getUrls());
            if (fromUrls != null) {
                this.b.getImage(fromUrls, assetsHolder, new b(this, view, z, image.getScaleType(), num, border));
                return;
            }
            return;
        }
        if (source instanceof HtmlResourceSource) {
            return;
        }
        boolean z2 = source instanceof XmlResourceSource;
    }

    public static /* synthetic */ void a(v vVar, View view, boolean z, Bitmap bitmap, ScaleType scaleType, Integer num, Border border, int i, Object obj) {
        vVar.a(view, z, bitmap, (i & 8) != 0 ? null : scaleType, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : border);
    }

    public final void a(View view, boolean z, Bitmap bitmap, ScaleType scaleType, Integer num, Border border) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (bitmap == null) {
            return;
        }
        ImageView.ScaleType imageViewScaleType = ScaleTypeKt.toImageViewScaleType(scaleType);
        q qVar = new q(bitmap);
        qVar.a(imageViewScaleType);
        if (num != null && num.intValue() > 0) {
            qVar.b(num.intValue());
        }
        if (border != null) {
            qVar.a(border.getStrokeWidthPx());
            qVar.a(border.getStrokeColor());
            view.setPadding(border.getStrokeWidthPx(), border.getStrokeWidthPx() - UtilsKt.dpToPx(this.a, 2.0f), border.getStrokeWidthPx(), border.getStrokeWidthPx() + UtilsKt.dpToPx(this.a, 2.0f));
        }
        a(view, z, qVar, null);
    }

    public final void a(View view, boolean z, Drawable drawable, a aVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (this.d.compareAndSet(false, z)) {
            drawable.setAlpha((int) UtilsKt.fromRatio(Float.valueOf(this.c.getIo.bidmachine.iab.vast.tags.VastAttributes.OPACITY java.lang.String()), 255.0f));
            drawable.setBounds(0, 0, view.getWidth(), view.getHeight());
            if (aVar != null && aVar.a(view)) {
                a(view, drawable, aVar);
            } else {
                view.setBackground(drawable);
            }
        }
    }

    private final void a(View view, final Drawable drawable, a aVar) {
        a();
        if (!this.g.compareAndSet(false, true)) {
            view.setBackground(drawable);
            return;
        }
        WeakReference weakReference = new WeakReference(view);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(aVar.a());
        ofFloat.setInterpolator(aVar.b());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.bidmachine.rendering.internal.v$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                v.a(drawable, valueAnimator);
            }
        });
        ofFloat.addListener(new g(weakReference, drawable));
        this.h = ofFloat;
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Drawable newDrawable, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(newDrawable, "$newDrawable");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        newDrawable.setAlpha(ColorUtilsKt.toColorInt(((Float) animatedValue).floatValue()));
    }

    public final void a() {
        Animator animator = this.h;
        if (animator != null) {
            animator.cancel();
            animator.removeAllListeners();
        }
        this.h = null;
    }
}
