package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: o.to, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1981to implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float h;
    public final int i;
    public final int j;
    public final View k;
    public RunnableC1915so l;
    public RunnableC1915so m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public int f227o;
    public final int[] p = new int[2];

    public AbstractViewOnTouchListenerC1981to(View view) {
        this.k = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.h = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.i = tapTimeout;
        this.j = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC1915so runnableC1915so = this.m;
        View view = this.k;
        if (runnableC1915so != null) {
            view.removeCallbacks(runnableC1915so);
        }
        RunnableC1915so runnableC1915so2 = this.l;
        if (runnableC1915so2 != null) {
            view.removeCallbacks(runnableC1915so2);
        }
    }

    public abstract InterfaceC1629oR b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC1629oR b = b();
        if (b == null || !b.a()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C1713pj f;
        boolean z2 = this.n;
        View view2 = this.k;
        if (z2) {
            InterfaceC1629oR b = b();
            if (b != null && b.a() && (f = b.f()) != null && f.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.p;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                f.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b2 = f.b(obtainNoHistory, this.f227o);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b2) {
                }
            }
            if (d()) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f227o);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f2 = this.h;
                                float f3 = -f2;
                                if (x < f3 || y < f3 || x >= (view2.getRight() - view2.getLeft()) + f2 || y >= (view2.getBottom() - view2.getTop()) + f2) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z = true;
                                        if (z) {
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
                    this.f227o = motionEvent.getPointerId(0);
                    if (this.l == null) {
                        this.l = new RunnableC1915so(this, 0);
                    }
                    view2.postDelayed(this.l, this.i);
                    if (this.m == null) {
                        this.m = new RunnableC1915so(this, 1);
                    }
                    view2.postDelayed(this.m, this.j);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.n = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.n = false;
        this.f227o = -1;
        RunnableC1915so runnableC1915so = this.l;
        if (runnableC1915so != null) {
            this.k.removeCallbacks(runnableC1915so);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
