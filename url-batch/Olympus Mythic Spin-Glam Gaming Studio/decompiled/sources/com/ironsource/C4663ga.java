package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.ironsource.InterfaceC4859ra;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4663ga extends WebView implements InterfaceC4877sa {
    private InterfaceC4859ra a;

    @Nullable
    private Rc b;

    public /* synthetic */ C4663ga(Context context, InterfaceC4859ra interfaceC4859ra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new InterfaceC4859ra.a(0, 1, null) : interfaceC4859ra);
    }

    @Override // com.ironsource.InterfaceC4877sa
    public void a(@NotNull String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        InterfaceC4859ra interfaceC4859ra = this.a;
        InterfaceC4859ra interfaceC4859ra2 = null;
        if (interfaceC4859ra == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
            interfaceC4859ra = null;
        }
        if (!interfaceC4859ra.a()) {
            InterfaceC4859ra interfaceC4859ra3 = this.a;
            if (interfaceC4859ra3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
                interfaceC4859ra3 = null;
            }
            interfaceC4859ra3.a(this);
        }
        InterfaceC4859ra interfaceC4859ra4 = this.a;
        if (interfaceC4859ra4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
        } else {
            interfaceC4859ra2 = interfaceC4859ra4;
        }
        interfaceC4859ra2.a(script);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NotNull KeyEvent event) {
        Rc rc;
        Intrinsics.checkNotNullParameter(event, "event");
        if (i == 4 && (rc = this.b) != null && rc.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i, event);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4663ga(@NotNull Context context, @NotNull InterfaceC4859ra javascriptEngine) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.a = javascriptEngine;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4663ga(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(@Nullable Rc rc) {
        this.b = rc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4663ga(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a() {
        this.b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4663ga(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
