package yads;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes3.dex */
public final class p73 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ q73 a;

    public p73(q73 q73Var) {
        this.a = q73Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.a.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        return true;
    }
}
