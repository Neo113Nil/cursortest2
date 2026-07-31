package sg.bigo.ads.q;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;

/* loaded from: classes15.dex */
public class a extends f {
    private ViewOnTouchListenerC1916a I;
    private ViewOnTouchListenerC1916a J;
    private int K;
    private ViewGroup.MarginLayoutParams L;

    /* renamed from: sg.bigo.ads.q.a$a, reason: collision with other inner class name */
    class ViewOnTouchListenerC1916a implements View.OnTouchListener {
        private final boolean b;
        private final int c;
        private float d;
        private float e;
        private int f;

        ViewOnTouchListenerC1916a(boolean z) {
            this.c = ViewConfiguration.get(a.this.N).getScaledTouchSlop();
            this.b = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        
            if ((r5 * 3) >= r4.a.K) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
        
            if ((r5 * 3) >= r4.a.K) goto L18;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            a aVar;
            int i;
            int action = motionEvent.getAction();
            if (action == 0) {
                this.d = motionEvent.getRawX();
                this.e = motionEvent.getRawY();
                this.f = (int) motionEvent.getRawY();
                a aVar2 = a.this;
                aVar2.K = aVar2.L.topMargin;
            } else if (action == 1) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (Math.abs(this.d - rawX) >= this.c || Math.abs(this.e - rawY) >= this.c) {
                    int abs = Math.abs((int) (rawY - this.e));
                    if (!this.b) {
                        if (this.e < rawY) {
                            if (a.this.B == null || a.this.B.isEnabled()) {
                                int i2 = a.this.K;
                                a aVar3 = a.this;
                                if (i2 == ((f) aVar3).e) {
                                    int i3 = aVar3.L.topMargin * 3;
                                    a aVar4 = a.this;
                                    if (i3 >= ((f) aVar4).c) {
                                        aVar4.f(4);
                                    }
                                }
                                int i4 = a.this.L.topMargin * 3;
                                a aVar5 = a.this;
                                if (i4 >= ((f) aVar5).c * 2) {
                                    aVar5.f(4);
                                } else {
                                    aVar5.e(aVar5.K);
                                }
                            }
                        }
                        aVar = a.this;
                        i = aVar.K;
                    } else if (this.e > rawY) {
                    }
                    aVar.e(i);
                }
                aVar = a.this;
                i = ((f) aVar).e;
                aVar.e(i);
            } else if (action == 2) {
                int rawY2 = (int) motionEvent.getRawY();
                int i5 = rawY2 - this.f;
                this.f = rawY2;
                if (!this.b || i5 <= 0) {
                    a.this.a(i5);
                }
            } else if (action == 3) {
                a.this.h();
            }
            return true;
        }
    }

    public a(@NonNull Activity activity) {
        super(activity);
        this.I = new ViewOnTouchListenerC1916a(true);
        this.J = new ViewOnTouchListenerC1916a(false);
    }

    @Override // sg.bigo.ads.q.f
    protected final void a(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((f) this).h.getLayoutParams();
        marginLayoutParams.topMargin = Math.max(0, marginLayoutParams.topMargin + i);
        ((f) this).h.requestLayout();
        ((f) this).h.getMeasuredWidth();
        b(((f) this).c - (marginLayoutParams.topMargin + i));
    }

    @Override // sg.bigo.ads.q.f, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean a(MotionEvent motionEvent) {
        return this.I.onTouch(this.D, motionEvent);
    }

    @Override // sg.bigo.ads.q.f, sg.bigo.ads.q.e, sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b() {
        super.b();
        ((f) this).i.setOnTouchListener(this.J);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((f) this).h.getLayoutParams();
            this.L = marginLayoutParams;
            this.K = marginLayoutParams.topMargin;
        } catch (Exception unused) {
        }
    }

    @Override // sg.bigo.ads.q.f
    protected final void b(int i) {
        int i2 = ((f) this).c;
        c.a(i, i2 - ((f) this).f, i2, ((f) this).d);
    }

    @Override // sg.bigo.ads.q.f
    protected final void c_() {
        Window window = this.N.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
    }
}
