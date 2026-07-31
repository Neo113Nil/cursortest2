package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.internal.g;
import io.bidmachine.rendering.internal.j;
import io.bidmachine.rendering.model.AppearanceParams;
import io.bidmachine.rendering.model.FontStyleType;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.Utils;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
public class b extends View implements io.bidmachine.rendering.internal.d {
    final Paint a;
    final Paint b;
    final Paint c;
    private final RectF d;
    private final RectF e;
    private final c f;
    private final AtomicBoolean g;
    private d h;
    private Runnable i;
    private float j;
    private float k;
    private float l;
    private float m;
    private int n;
    private byte o;
    private boolean p;

    /* renamed from: io.bidmachine.rendering.internal.view.b$b, reason: collision with other inner class name */
    private class C1813b implements j {
        private C1813b() {
        }

        @Override // io.bidmachine.util.SafeRunnable
        public void onRun() {
            boolean z = !b.this.c() || b.this.isShown();
            if (z) {
                b.this.f.j();
            } else {
                b.this.f.i();
            }
            long b = b.this.f.b();
            long c = b.this.f.c();
            if (z) {
                b.this.a((c * 100.0f) / b, (int) Math.ceil((b - c) / 1000.0d));
            }
            if (b.this.f.e()) {
                b.this.d();
            } else {
                UiUtils.onUiThread(this, 16L);
            }
        }
    }

    public interface d {
        void a();
    }

    public b(Context context) {
        super(context);
        this.d = new RectF();
        this.e = new RectF();
        this.f = new c();
        this.g = new AtomicBoolean(false);
        this.m = 100.0f;
        this.o = (byte) -1;
        this.p = false;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(g.d);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        int i = g.c;
        paint2.setColor(i);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(1);
        this.c = paint3;
        paint3.setColor(i);
        paint3.setStyle(style);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        d dVar;
        if (this.g.compareAndSet(false, true) && (dVar = this.h) != null) {
            dVar.a();
        }
    }

    public boolean c() {
        return this.p;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    public void e() {
        g();
        if (this.g.get()) {
            return;
        }
        this.f.h();
        C1813b c1813b = new C1813b();
        this.i = c1813b;
        UiUtils.onUiThread(c1813b, 16L);
    }

    public void f() {
        this.g.set(false);
        this.f.g();
        e();
    }

    public void g() {
        this.f.f();
        Runnable runnable = this.i;
        if (runnable == null) {
            return;
        }
        UiUtils.cancelOnUiThread(runnable);
        this.i = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0 || this.n == 0) {
            return;
        }
        a(canvas);
        b(canvas);
    }

    @Override // android.view.View
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
        a();
    }

    public void setClockwise(boolean z) {
        if (z) {
            this.o = (byte) -1;
        } else {
            this.o = (byte) 1;
        }
    }

    public void setDuration(long j) {
        this.f.a(j);
    }

    public void setListener(@Nullable d dVar) {
        this.h = dVar;
    }

    public void setOnlyVisibleWork(boolean z) {
        this.p = z;
    }

    static class c {
        private boolean a = false;
        private long b = 0;
        private long c = 0;
        private long d = 0;

        c() {
        }

        public void a(long j) {
            this.b = j;
            g();
        }

        public long b() {
            return this.b;
        }

        public long c() {
            return this.c;
        }

        public boolean d() {
            return this.a;
        }

        public boolean e() {
            return this.c >= this.b;
        }

        public void f() {
            this.a = false;
        }

        public void g() {
            this.c = 0L;
            this.d = a();
        }

        public void h() {
            this.a = true;
            this.d = a();
        }

        public void i() {
            this.d = a();
        }

        public void j() {
            if (d()) {
                long a = a();
                this.c = Math.min(this.b, this.c + (a - this.d));
                this.d = a;
            }
        }

        long a() {
            return SystemClock.elapsedRealtime();
        }
    }

    private void a(Context context) {
        setLayerType(1, null);
        this.j = Utils.dpToPx(context, 54.0f);
        this.k = Utils.dpToPx(context, 54.0f);
        float dpToPx = Utils.dpToPx(context, 3.0f);
        this.l = dpToPx;
        this.b.setStrokeWidth(dpToPx);
        a();
    }

    public void b() {
        g();
        this.h = null;
    }

    private void b(Canvas canvas) {
        canvas.drawText(String.valueOf(this.n), this.j, this.k - ((this.c.descent() + this.c.ascent()) / 2.0f), this.c);
    }

    @Override // io.bidmachine.rendering.internal.d
    public void a(AppearanceParams appearanceParams) {
        FontStyleType fontStyleType = appearanceParams.getFontStyleType();
        if (fontStyleType != null) {
            this.c.setTypeface(Typeface.create(Typeface.DEFAULT, fontStyleType.getTypeface()));
        }
        Integer fillColor = appearanceParams.getFillColor();
        if (fillColor != null) {
            this.a.setColor(fillColor.intValue());
        }
        Integer strokeWidthPx = appearanceParams.getStrokeWidthPx(getContext());
        if (strokeWidthPx != null) {
            float intValue = strokeWidthPx.intValue();
            this.l = intValue;
            this.b.setStrokeWidth(intValue);
        }
        Integer strokeColor = appearanceParams.getStrokeColor();
        if (strokeColor != null) {
            this.b.setColor(strokeColor.intValue());
        }
        a();
    }

    public void a(float f, int i) {
        if (f >= 0.0f || f <= 100.0f) {
            this.m = f;
        }
        this.n = i;
        postInvalidate();
    }

    void a() {
        float width = (getWidth() - r0) / 2.0f;
        float height = (getHeight() - r0) / 2.0f;
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        this.d.set(width, height, width + min, min + height);
        this.j = this.d.centerX();
        this.k = this.d.centerY();
        float f = this.l / 2.0f;
        RectF rectF = this.e;
        RectF rectF2 = this.d;
        rectF.set(rectF2.left + f, rectF2.top + f, rectF2.right - f, rectF2.bottom - f);
        this.c.setTextSize(a(this.d, true));
    }

    float a(RectF rectF, boolean z) {
        float width = rectF.width();
        if (z) {
            width -= this.l * 2.0f;
        }
        return width * 0.70710677f * 0.9f;
    }

    private void a(Canvas canvas) {
        float f = this.o * (360.0f - ((this.m * 360.0f) * 0.01f));
        canvas.drawArc(this.d, 0.0f, 360.0f, false, this.a);
        canvas.drawArc(this.e, 270.0f, f, false, this.b);
    }
}
