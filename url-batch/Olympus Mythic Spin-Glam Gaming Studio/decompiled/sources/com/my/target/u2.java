package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class u2 extends FrameLayout {
    private final int a;
    private final BitmapDrawable b;
    private final int c;
    private final int d;
    private final int e;
    private final Rect f;
    private final Rect g;
    private final Rect h;
    private final Rect i;
    private a j;
    private boolean k;
    private boolean l;
    private int m;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void b();
    }

    public u2(Context context) {
        super(context);
        this.f = new Rect();
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
        this.m = 8388661;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(a1.a(qi.g(context).b(30)));
        this.b = bitmapDrawable;
        bitmapDrawable.setState(FrameLayout.EMPTY_STATE_SET);
        bitmapDrawable.setCallback(this);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = qi.a(50, context);
        this.d = qi.a(30, context);
        this.e = qi.a(8, context);
        setWillNotDraw(false);
    }

    boolean a(int i, int i2, int i3) {
        Rect rect = this.g;
        return i >= rect.left - i3 && i2 >= rect.top - i3 && i < rect.right + i3 && i2 < rect.bottom + i3;
    }

    public void b(int i, Rect rect, Rect rect2) {
        int i2 = this.d;
        Gravity.apply(i, i2, i2, rect, rect2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.k) {
            this.k = false;
            this.f.set(0, 0, getWidth(), getHeight());
            a(this.c, this.f, this.g);
            this.i.set(this.g);
            Rect rect = this.i;
            int i = this.e;
            rect.inset(i, i);
            a(this.d, this.i, this.h);
            this.b.setBounds(this.h);
        }
        if (this.b.isVisible()) {
            this.b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.k = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.b.isVisible() || !a(x, y, this.a)) {
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.l = true;
        } else if (action != 1) {
            if (action == 3) {
                this.l = false;
            }
        } else if (this.l) {
            a();
            this.l = false;
        }
        return true;
    }

    @VisibleForTesting
    void setCloseBounds(@NonNull Rect rect) {
        this.g.set(rect);
    }

    public void setCloseGravity(int i) {
        this.m = i;
    }

    public void setCloseVisible(boolean z) {
        qi.a(this, z ? "close_button" : "closeable_layout");
        if (this.b.setVisible(z, false)) {
            invalidate(this.g);
        }
    }

    public void setOnCloseListener(@Nullable a aVar) {
        this.j = aVar;
    }

    private void a(int i, Rect rect, Rect rect2) {
        Gravity.apply(this.m, i, i, rect, rect2);
    }

    private void a() {
        playSoundEffect(0);
        a aVar = this.j;
        if (aVar != null) {
            aVar.b();
        }
    }
}
