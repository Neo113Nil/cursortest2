package yads;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class pb implements View.OnTouchListener {
    public final ViewGroup a;
    public final Dialog b;
    public final ed1 c;
    public float d;

    public pb(ViewGroup viewGroup, Dialog dialog, ed1 ed1Var) {
        this.a = viewGroup;
        this.b = dialog;
        this.c = ed1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.d = rawY;
            return true;
        }
        if (action == 1) {
            if (rawY <= this.d) {
                return true;
            }
            this.c.getClass();
            ed1.a(view);
            vg0.a(this.b);
            return true;
        }
        if (action != 2) {
            return false;
        }
        float f = this.d;
        if (rawY <= f) {
            this.a.setTranslationY(0.0f);
            return true;
        }
        this.a.setTranslationY(rawY - f);
        return true;
    }
}
