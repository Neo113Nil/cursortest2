package l;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class F0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f3295a;

    public F0(G0 g02) {
        this.f3295a = g02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0222B c0222b;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        G0 g02 = this.f3295a;
        if (action == 0 && (c0222b = g02.f3321z) != null && c0222b.isShowing() && x2 >= 0 && x2 < g02.f3321z.getWidth() && y2 >= 0 && y2 < g02.f3321z.getHeight()) {
            g02.f3317v.postDelayed(g02.f3313r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        g02.f3317v.removeCallbacks(g02.f3313r);
        return false;
    }
}
