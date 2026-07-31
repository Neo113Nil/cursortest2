package io.bidmachine.rendering.internal.view.privacy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.R;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.ViewUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c extends LinearLayout {
    private final Lazy a;
    private final Lazy b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayout mo4828invoke() {
            return (LinearLayout) c.this.findViewById(R.id.bmPrivacySheetActionButtonsContainer);
        }
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo4828invoke() {
            return c.this.findViewById(R.id.bmPrivacySheetClose);
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.view.privacy.c$c, reason: collision with other inner class name */
    static final class C1815c extends Lambda implements Function0 {
        C1815c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayout mo4828invoke() {
            return (LinearLayout) c.this.findViewById(R.id.bmPrivacySheetFooterContainer);
        }
    }

    static final class d extends Lambda implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView mo4828invoke() {
            return (TextView) c.this.findViewById(R.id.bmPrivacySheetFooterText);
        }
    }

    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView mo4828invoke() {
            return (TextView) c.this.findViewById(R.id.bmPrivacySheetFooterTitle);
        }
    }

    static final class f extends Lambda implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView mo4828invoke() {
            return (TextView) c.this.findViewById(R.id.bmPrivacySheetSubtitle);
        }
    }

    static final class g extends Lambda implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView mo4828invoke() {
            return (TextView) c.this.findViewById(R.id.bmPrivacySheetTitle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = LazyKt.lazy(new g());
        this.b = LazyKt.lazy(new f());
        this.c = LazyKt.lazy(new b());
        this.d = LazyKt.lazy(new a());
        this.e = LazyKt.lazy(new C1815c());
        this.f = LazyKt.lazy(new e());
        this.g = LazyKt.lazy(new d());
        View.inflate(context, R.layout.bm_privacy_sheet, this);
        setOrientation(1);
        setBackgroundResource(R.drawable.bm_bg_privacy_sheet);
        int dpToPx = UtilsKt.dpToPx(context, 16.0f);
        setPadding(dpToPx, dpToPx, dpToPx, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 clickListener, View view) {
        Intrinsics.checkNotNullParameter(clickListener, "$clickListener");
        clickListener.mo4828invoke();
    }

    private final LinearLayout getActionButtonsContainer() {
        Object value = this.d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-actionButtonsContainer>(...)");
        return (LinearLayout) value;
    }

    private final View getCloseButton() {
        Object value = this.c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-closeButton>(...)");
        return (View) value;
    }

    private final LinearLayout getFooterContainer() {
        Object value = this.e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-footerContainer>(...)");
        return (LinearLayout) value;
    }

    private final TextView getFooterTextTextView() {
        Object value = this.g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-footerTextTextView>(...)");
        return (TextView) value;
    }

    private final TextView getFooterTitleTextView() {
        Object value = this.f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-footerTitleTextView>(...)");
        return (TextView) value;
    }

    private final TextView getSubtitleTextView() {
        Object value = this.b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-subtitleTextView>(...)");
        return (TextView) value;
    }

    private final TextView getTitleTextView() {
        Object value = this.a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-titleTextView>(...)");
        return (TextView) value;
    }

    public final void a(String title, Drawable drawable, final Function0 clickListener) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        LinearLayout actionButtonsContainer = getActionButtonsContainer();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        io.bidmachine.rendering.internal.view.privacy.a aVar = new io.bidmachine.rendering.internal.view.privacy.a(context);
        aVar.setText(title);
        aVar.setActionIcon(drawable);
        aVar.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.rendering.internal.view.privacy.c$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.a(Function0.this, view);
            }
        });
        actionButtonsContainer.addView(aVar, -1, -2);
        ViewUtilsKt.showViewSafely(getActionButtonsContainer());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setOnCloseButtonClickListener(@NotNull final Function0 clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.rendering.internal.view.privacy.c$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.b(Function0.this, view);
            }
        });
    }

    public final void setSubtitle(@NotNull String subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        getSubtitleTextView().setText(subtitle);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getTitleTextView().setText(title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 clickListener, View view) {
        Intrinsics.checkNotNullParameter(clickListener, "$clickListener");
        clickListener.mo4828invoke();
    }

    public final void a() {
        getActionButtonsContainer().removeAllViews();
        ViewUtilsKt.hideViewSafely(getActionButtonsContainer());
    }

    public final void a(String str, String str2) {
        boolean z = true;
        boolean z2 = str == null || str.length() == 0;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z2 && z) {
            ViewUtilsKt.hideViewSafely(getFooterContainer());
            return;
        }
        if (z2) {
            ViewUtilsKt.hideViewSafely(getFooterTitleTextView());
        } else {
            getFooterTitleTextView().setText(str);
            ViewUtilsKt.showViewSafely(getFooterTitleTextView());
        }
        if (z) {
            ViewUtilsKt.hideViewSafely(getFooterTextTextView());
        } else {
            getFooterTextTextView().setText(str2);
            ViewUtilsKt.showViewSafely(getFooterTextTextView());
        }
        ViewUtilsKt.showViewSafely(getFooterContainer());
    }
}
