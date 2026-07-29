package o;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: o.qA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1744qA implements View.OnTouchListener {
    public final /* synthetic */ AbstractC1809rA h;

    public ViewOnTouchListenerC1744qA(AbstractC1809rA abstractC1809rA) {
        this.h = abstractC1809rA;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1936t5 c1936t5;
        AbstractC1809rA abstractC1809rA = this.h;
        RunnableC1546nA runnableC1546nA = abstractC1809rA.x;
        Handler handler = abstractC1809rA.B;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && (c1936t5 = abstractC1809rA.F) != null && c1936t5.isShowing() && x >= 0 && x < abstractC1809rA.F.getWidth() && y >= 0 && y < abstractC1809rA.F.getHeight()) {
            handler.postDelayed(runnableC1546nA, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(runnableC1546nA);
        return false;
    }
}
