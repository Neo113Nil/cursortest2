package l;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class D0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f2864a;

    public D0(E0 e02) {
        this.f2864a = e02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0179A c0179a;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        E0 e02 = this.f2864a;
        if (action == 0 && (c0179a = e02.f2889z) != null && c0179a.isShowing() && x2 >= 0 && x2 < e02.f2889z.getWidth() && y2 >= 0 && y2 < e02.f2889z.getHeight()) {
            e02.f2885v.postDelayed(e02.f2881r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        e02.f2885v.removeCallbacks(e02.f2881r);
        return false;
    }
}
