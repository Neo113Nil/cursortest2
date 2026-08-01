package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import k.InterfaceC0143C;

/* renamed from: l.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0268w0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f3059a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3060b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3061c;
    public final View d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0266v0 f3062e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0266v0 f3063f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3064g;
    public int h;
    public final int[] i = new int[2];

    public AbstractViewOnTouchListenerC0268w0(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3059a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3060b = tapTimeout;
        this.f3061c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0266v0 runnableC0266v0 = this.f3063f;
        View view = this.d;
        if (runnableC0266v0 != null) {
            view.removeCallbacks(runnableC0266v0);
        }
        RunnableC0266v0 runnableC0266v02 = this.f3062e;
        if (runnableC0266v02 != null) {
            view.removeCallbacks(runnableC0266v02);
        }
    }

    public abstract InterfaceC0143C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0143C b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        C0262t0 f2;
        boolean z3 = this.f3064g;
        View view2 = this.d;
        if (z3) {
            InterfaceC0143C b2 = b();
            if (b2 != null && b2.a() && (f2 = b2.f()) != null && f2.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                f2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = f2.b(obtainNoHistory, this.h);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b3) {
                }
            }
            if (d()) {
                z2 = false;
            }
            z2 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.h);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f3 = this.f3059a;
                                float f4 = -f3;
                                if (x2 < f4 || y2 < f4 || x2 >= (view2.getRight() - view2.getLeft()) + f3 || y2 >= (view2.getBottom() - view2.getTop()) + f3) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z2 = true;
                                        if (z2) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.h = motionEvent.getPointerId(0);
                    if (this.f3062e == null) {
                        this.f3062e = new RunnableC0266v0(this, 0);
                    }
                    view2.postDelayed(this.f3062e, this.f3060b);
                    if (this.f3063f == null) {
                        this.f3063f = new RunnableC0266v0(this, 1);
                    }
                    view2.postDelayed(this.f3063f, this.f3061c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f3064g = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3064g = false;
        this.h = -1;
        RunnableC0266v0 runnableC0266v0 = this.f3062e;
        if (runnableC0266v0 != null) {
            this.d.removeCallbacks(runnableC0266v0);
        }
    }
}
