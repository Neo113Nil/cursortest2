package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class iq implements View.OnTouchListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ iq(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                jq jqVar = (jq) obj;
                fq fqVar = jqVar.w;
                Handler handler = jqVar.A;
                n4 n4Var = jqVar.E;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && n4Var != null && n4Var.isShowing() && x >= 0 && x < n4Var.getWidth() && y >= 0 && y < n4Var.getHeight()) {
                    handler.postDelayed(fqVar, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(fqVar);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
