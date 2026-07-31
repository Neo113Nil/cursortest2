package com.pubmatic.sdk.common.view.cta;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.common.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/pubmatic/sdk/common/view/cta/POBCTAOverlayView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "", "layout", "<init>", "(Landroid/content/Context;I)V", "", "a", "()V", "Landroid/view/View$OnTouchListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "icon", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "getCtaButton", "()Landroid/widget/Button;", "ctaButton", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title", "d", "Landroid/view/View$OnTouchListener;", "onTouchListener", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class POBCTAOverlayView extends RelativeLayout {

    /* renamed from: a, reason: from kotlin metadata */
    private final ImageView icon;

    /* renamed from: b, reason: from kotlin metadata */
    private final Button ctaButton;

    /* renamed from: c, reason: from kotlin metadata */
    private final TextView title;

    /* renamed from: d, reason: from kotlin metadata */
    private View.OnTouchListener onTouchListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBCTAOverlayView(@NotNull Context context, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context, i);
        setId(R.id.pob_cta_overlay);
        View findViewById = findViewById(R.id.pob_cta_app_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.pob_cta_app_icon)");
        this.icon = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.pob_cta_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.pob_cta_title)");
        this.title = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.pob_cta_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.pob_cta_button)");
        this.ctaButton = (Button) findViewById3;
        a();
        setClickable(true);
    }

    private final void a(Context context, int layout) {
        View.inflate(context, layout, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final Button getCtaButton() {
        return this.ctaButton;
    }

    @NotNull
    public final ImageView getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextView getTitle() {
        return this.title;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(@Nullable View.OnTouchListener listener) {
        this.onTouchListener = listener;
        super.setOnTouchListener(listener);
    }

    private final void a() {
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        final float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.ctaButton.setOnTouchListener(new View.OnTouchListener() { // from class: com.pubmatic.sdk.common.view.cta.POBCTAOverlayView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean a;
                a = POBCTAOverlayView.a(POBCTAOverlayView.this, ref$FloatRef, scaledTouchSlop, view, motionEvent);
                return a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(POBCTAOverlayView this$0, Ref$FloatRef startY, float f, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(startY, "$startY");
        View.OnTouchListener onTouchListener = this$0.onTouchListener;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this$0, motionEvent);
            int action = motionEvent.getAction();
            if (action != 0) {
                return action == 1 && Math.abs(motionEvent.getRawY() - startY.element) > f;
            }
            startY.element = motionEvent.getRawY();
        }
        return false;
    }
}
