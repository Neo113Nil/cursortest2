package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public abstract class D2 extends WebView {
    public final Lazy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.D2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return D2.a(D2.this);
            }
        });
    }

    public static final C4048hb a(D2 d2) {
        return d2.d();
    }

    public abstract C4048hb d();

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final C4048hb getLandingPageHandler() {
        return (C4048hb) this.a.getValue();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
