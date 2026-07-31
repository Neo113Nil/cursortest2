package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes15.dex */
public abstract class a extends ViewGroup {
    private int a;
    private boolean b;
    private AbstractRunnableC1871a c;

    /* renamed from: sg.bigo.ads.common.view.a$a, reason: collision with other inner class name */
    static abstract class AbstractRunnableC1871a implements Runnable {
        boolean b;

        private AbstractRunnableC1871a() {
        }

        /* synthetic */ AbstractRunnableC1871a(byte b) {
            this();
        }

        protected abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            if (this.b) {
                return;
            }
            a();
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 3000;
        this.b = false;
    }

    private synchronized void a(boolean z) {
        try {
            AbstractRunnableC1871a abstractRunnableC1871a = this.c;
            if (abstractRunnableC1871a != null) {
                abstractRunnableC1871a.b = true;
                this.c = null;
            }
            if (z) {
                AbstractRunnableC1871a abstractRunnableC1871a2 = new AbstractRunnableC1871a() { // from class: sg.bigo.ads.common.view.a.1
                    @Override // sg.bigo.ads.common.view.a.AbstractRunnableC1871a
                    protected final void a() {
                        if (a.this.b && a.this.b() && v.c(a.this) && sg.bigo.ads.ca.a.a(a.this, new Rect())) {
                            a.this.a();
                        }
                        a.this.postDelayed(this, r0.a);
                    }
                };
                this.c = abstractRunnableC1871a2;
                postDelayed(abstractRunnableC1871a2, this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    protected abstract void a();

    protected abstract boolean b();

    public final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        a(true);
    }

    public final void d() {
        this.b = false;
        a(false);
    }

    public int getFlipInterval() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void setFlipInterval(@IntRange int i) {
        this.a = i;
    }
}
