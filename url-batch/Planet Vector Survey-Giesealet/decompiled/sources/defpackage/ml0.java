package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ml0 extends View {
    public static final int[] i = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] j = new int[0];
    public py0 d;
    public Boolean e;
    public Long f;
    public w2 g;
    public bu h;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? i : j;
            py0 py0Var = this.d;
            if (py0Var != null) {
                py0Var.setState(iArr);
            }
        } else {
            w2 w2Var = new w2(7, this);
            this.g = w2Var;
            postDelayed(w2Var, 50L);
        }
        this.f = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(ml0 ml0Var) {
        py0 py0Var = ml0Var.d;
        if (py0Var != null) {
            py0Var.setState(j);
        }
        ml0Var.g = null;
    }

    public final void b(qh0 qh0Var, boolean z, long j2, int i2, long j3, float f, bu buVar) {
        if (this.d == null || !Boolean.valueOf(z).equals(this.e)) {
            py0 py0Var = new py0(z);
            setBackground(py0Var);
            this.d = py0Var;
            this.e = Boolean.valueOf(z);
        }
        py0 py0Var2 = this.d;
        py0Var2.getClass();
        this.h = buVar;
        Integer num = py0Var2.f;
        if (num == null || num.intValue() != i2) {
            py0Var2.f = Integer.valueOf(i2);
            oy0.a.a(py0Var2, i2);
        }
        e(f, j2, j3);
        if (z) {
            py0Var2.setHotspot(ra0.d(qh0Var.a), ra0.e(qh0Var.a));
        } else {
            py0Var2.setHotspot(py0Var2.getBounds().centerX(), py0Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.h = null;
        w2 w2Var = this.g;
        if (w2Var != null) {
            removeCallbacks(w2Var);
            w2 w2Var2 = this.g;
            w2Var2.getClass();
            w2Var2.run();
        } else {
            py0 py0Var = this.d;
            if (py0Var != null) {
                py0Var.setState(j);
            }
        }
        py0 py0Var2 = this.d;
        if (py0Var2 == null) {
            return;
        }
        py0Var2.setVisible(false, false);
        unscheduleDrawable(py0Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(float f, long j2, long j3) {
        py0 py0Var = this.d;
        if (py0Var == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long b = ge.b(j3, f);
        ge geVar = py0Var.e;
        if (!(geVar == null ? false : ge.c(geVar.a, b))) {
            py0Var.e = new ge(b);
            py0Var.setColor(ColorStateList.valueOf(d31.I(b)));
        }
        Rect rect = new Rect(0, 0, a50.H(fr0.e(j2)), a50.H(fr0.c(j2)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        py0Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        bu buVar = this.h;
        if (buVar != null) {
            buVar.a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
