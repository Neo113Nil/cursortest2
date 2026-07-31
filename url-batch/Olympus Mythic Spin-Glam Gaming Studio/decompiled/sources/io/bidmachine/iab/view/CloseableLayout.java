package io.bidmachine.iab.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.IabCloseWrapper;
import io.bidmachine.iab.utils.IabCountDownWrapper;
import io.bidmachine.iab.utils.IabElementStyle;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public class CloseableLayout extends FrameLayout {
    private final c a;
    private IabCloseWrapper b;
    private IabCountDownWrapper c;
    private b d;
    private OnCloseClickListener e;
    private IabElementStyle f;
    private IabElementStyle g;

    public interface OnCloseClickListener {
        void onCloseClick();

        void onCountDownFinish();
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CloseableLayout.this.e != null) {
                CloseableLayout.this.e.onCloseClick();
            }
        }
    }

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CloseableLayout.this.c == null) {
                return;
            }
            long j = CloseableLayout.this.a.d;
            if (CloseableLayout.this.isShown()) {
                j += 50;
                CloseableLayout.this.a.a(j);
                CloseableLayout.this.c.changePercentage((int) ((100 * j) / CloseableLayout.this.a.c), (int) Math.ceil((CloseableLayout.this.a.c - j) / 1000.0d));
            }
            if (j < CloseableLayout.this.a.c) {
                CloseableLayout.this.postDelayed(this, 50L);
                return;
            }
            CloseableLayout.this.c();
            if (CloseableLayout.this.a.b <= 0.0f || CloseableLayout.this.e == null) {
                return;
            }
            CloseableLayout.this.e.onCountDownFinish();
        }

        /* synthetic */ b(CloseableLayout closeableLayout, a aVar) {
            this();
        }
    }

    private static class c {
        private boolean a;
        private float b;
        private long c;
        private long d;
        private long e;
        private long f;

        private c() {
            this.a = false;
            this.b = 0.0f;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
        }

        public long b() {
            return this.e > 0 ? System.currentTimeMillis() - this.e : this.f;
        }

        public boolean c() {
            long j = this.c;
            return j != 0 && this.d < j;
        }

        public boolean d() {
            return this.a;
        }

        public void a(boolean z, float f) {
            this.a = z;
            this.b = f;
            this.c = (long) (f * 1000.0f);
            this.d = 0L;
        }

        public void a(long j) {
            this.d = j;
        }

        public boolean a() {
            long j = this.c;
            return j == 0 || this.d >= j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z) {
            if (this.e > 0) {
                this.f += System.currentTimeMillis() - this.e;
            }
            if (z) {
                this.e = System.currentTimeMillis();
            } else {
                this.e = 0L;
            }
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    public CloseableLayout(@NonNull Context context) {
        super(context);
        this.a = new c(null);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        IabCloseWrapper iabCloseWrapper = this.b;
        if (iabCloseWrapper != null) {
            iabCloseWrapper.bringToFront();
        }
        IabCountDownWrapper iabCountDownWrapper = this.c;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.bringToFront();
        }
    }

    public boolean canBeClosed() {
        return this.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    public long getOnScreenTimeMs() {
        return this.a.b();
    }

    public boolean isVisible() {
        return this.a.d();
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
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            b();
        } else if (this.a.c() && this.a.d()) {
            a();
        }
        this.a.a(i == 0);
    }

    public void setCloseClickListener(@Nullable OnCloseClickListener onCloseClickListener) {
        this.e = onCloseClickListener;
    }

    public void setCloseStyle(@Nullable IabElementStyle iabElementStyle) {
        this.f = iabElementStyle;
        IabCloseWrapper iabCloseWrapper = this.b;
        if (iabCloseWrapper == null || !iabCloseWrapper.isAttached()) {
            return;
        }
        this.b.attach(getContext(), this, iabElementStyle);
    }

    public void setCloseVisibility(boolean z, float f) {
        if (this.a.a == z && this.a.b == f) {
            return;
        }
        this.a.a(z, f);
        if (z) {
            c();
            return;
        }
        IabCloseWrapper iabCloseWrapper = this.b;
        if (iabCloseWrapper != null) {
            iabCloseWrapper.detach();
        }
        IabCountDownWrapper iabCountDownWrapper = this.c;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.detach();
        }
        b();
    }

    public void setCountDownStyle(@Nullable IabElementStyle iabElementStyle) {
        this.g = iabElementStyle;
        IabCountDownWrapper iabCountDownWrapper = this.c;
        if (iabCountDownWrapper == null || !iabCountDownWrapper.isAttached()) {
            return;
        }
        this.c.attach(getContext(), this, iabElementStyle);
    }

    private void a() {
        if (isShown()) {
            b();
            b bVar = new b(this, null);
            this.d = bVar;
            postDelayed(bVar, 50L);
        }
    }

    private void b() {
        b bVar = this.d;
        if (bVar != null) {
            removeCallbacks(bVar);
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.a.c()) {
            IabCloseWrapper iabCloseWrapper = this.b;
            if (iabCloseWrapper != null) {
                iabCloseWrapper.detach();
            }
            if (this.c == null) {
                this.c = new IabCountDownWrapper(null);
            }
            this.c.attach(getContext(), this, this.g);
            a();
            return;
        }
        b();
        if (this.b == null) {
            this.b = new IabCloseWrapper(new a());
        }
        this.b.attach(getContext(), this, this.f);
        IabCountDownWrapper iabCountDownWrapper = this.c;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.detach();
        }
    }
}
