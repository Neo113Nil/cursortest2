package io.bidmachine.rendering.internal.view.privacy;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.internal.view.privacy.b;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.util.ImageUtilsKt;
import io.bidmachine.util.UtilsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b extends FrameLayout {
    private final Lazy a;
    private Function0 b;

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        public final void a() {
            b.this.getOnCloseClickListener().mo4828invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.view.privacy.b$b, reason: collision with other inner class name */
    static final class C1814b extends Lambda implements Function0 {
        public static final C1814b a = new C1814b();

        C1814b() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class c extends Lambda implements Function0 {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View view) {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.rendering.internal.view.privacy.c mo4828invoke() {
            io.bidmachine.rendering.internal.view.privacy.c cVar = new io.bidmachine.rendering.internal.view.privacy.c(this.a);
            cVar.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.rendering.internal.view.privacy.b$c$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.c.a(view);
                }
            });
            return cVar;
        }
    }

    static final class d extends Lambda implements Function0 {
        final /* synthetic */ Function1 a;
        final /* synthetic */ PrivacySheetParams.Action b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function1 function1, PrivacySheetParams.Action action) {
            super(0);
            this.a = function1;
            this.b = action;
        }

        public final void a() {
            this.a.invoke(this.b);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = LazyKt.lazy(new c(context));
        this.b = C1814b.a;
        setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.rendering.internal.view.privacy.b$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.a(b.this, view);
            }
        });
        io.bidmachine.rendering.internal.view.privacy.c privacySheetView = getPrivacySheetView();
        privacySheetView.setOnCloseButtonClickListener(new a());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        Unit unit = Unit.INSTANCE;
        addView(privacySheetView, layoutParams);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b.mo4828invoke();
    }

    private final void b() {
        final int paddingBottom = getPrivacySheetView().getPaddingBottom();
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: io.bidmachine.rendering.internal.view.privacy.b$$ExternalSyntheticLambda1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets a2;
                a2 = b.a(b.this, paddingBottom, view, windowInsets);
                return a2;
            }
        });
    }

    private final io.bidmachine.rendering.internal.view.privacy.c getPrivacySheetView() {
        return (io.bidmachine.rendering.internal.view.privacy.c) this.a.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final Function0 getOnCloseClickListener() {
        return this.b;
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View child, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(child, "child");
        int size = View.MeasureSpec.getSize(i);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int dpToPx = UtilsKt.dpToPx(context, 600.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        if (size >= UtilsKt.dpToPx(context2, 32.0f) + dpToPx) {
            i = View.MeasureSpec.makeMeasureSpec(dpToPx, 1073741824);
        }
        super.measureChildWithMargins(child, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setOnCloseClickListener(@NotNull Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.b = function0;
    }

    public final void setSubtitle(@NotNull String subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        getPrivacySheetView().setSubtitle(subtitle);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getPrivacySheetView().setTitle(title);
    }

    public final void a(List actions, Function1 clickListener) {
        BitmapDrawable bitmapDrawable;
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        a();
        Iterator it = actions.iterator();
        while (it.hasNext()) {
            PrivacySheetParams.Action action = (PrivacySheetParams.Action) it.next();
            String title = action.getTitle();
            Bitmap icon = action.getIcon();
            if (icon != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                bitmapDrawable = ImageUtilsKt.toBitmapDrawable(icon, resources);
            } else {
                bitmapDrawable = null;
            }
            a(title, bitmapDrawable, new d(clickListener, action));
        }
    }

    public final void a(String title, Drawable drawable, Function0 clickListener) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        getPrivacySheetView().a(title, drawable, clickListener);
    }

    public final void a() {
        getPrivacySheetView().a();
    }

    public final void a(String str, String str2) {
        getPrivacySheetView().a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets a(b this$0, int i, View view, WindowInsets insets) {
        Rect rect;
        int systemBars;
        Insets insets2;
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (Build.VERSION.SDK_INT >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets2 = insets.getInsets(systemBars);
            i2 = insets2.left;
            i3 = insets2.top;
            i4 = insets2.right;
            i5 = insets2.bottom;
            rect = new Rect(i2, i3, i4, i5);
        } else {
            rect = new Rect(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(), insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
        }
        this$0.getPrivacySheetView().setPadding(this$0.getPrivacySheetView().getPaddingLeft(), this$0.getPrivacySheetView().getPaddingTop(), this$0.getPrivacySheetView().getPaddingRight(), i + rect.bottom);
        this$0.setPadding(0, rect.top, 0, 0);
        return insets;
    }
}
