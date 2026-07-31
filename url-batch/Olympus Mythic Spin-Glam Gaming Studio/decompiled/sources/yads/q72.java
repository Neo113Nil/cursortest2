package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class q72 extends FrameLayout {
    public final mi3 a;
    public final TextureView b;
    public final p52 c;
    public o62 d;
    public cj1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q72(Context context, mi3 mi3Var, TextureView textureView, p52 p52Var) {
        super(context);
        rz2 rz2Var = new rz2();
        this.a = mi3Var;
        this.b = textureView;
        this.c = p52Var;
        this.e = rz2Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o62 o62Var = this.d;
        if (o62Var != null) {
            z52 z52Var = (z52) o62Var;
            z52Var.a.a(z52Var.b.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o62 o62Var = this.d;
        if (o62Var != null) {
            z52 z52Var = (z52) o62Var;
            z52Var.b.a.a.clearAnimation();
            z52Var.a.a((TextureView) null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        bj1 a = this.e.a(i, i2);
        super.onMeasure(a.a, a.b);
    }

    public final void setAspectRatio(float f) {
        this.e = new sk2(f);
    }

    public final void setOnAttachStateChangeListener(@Nullable o62 o62Var) {
        this.d = o62Var;
    }
}
