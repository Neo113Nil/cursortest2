package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class ju implements View.OnTouchListener, View.OnClickListener {
    public final View.OnClickListener a;
    public final int b;
    public boolean c;
    public float d;
    public float e;

    public ju(Context context, View.OnClickListener onClickListener) {
        this.a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i = action & 255;
        if (i == 0) {
            this.d = x;
            this.e = y;
            this.c = true;
        } else {
            if (i == 1) {
                if (!this.c) {
                    return true;
                }
                this.a.onClick(view);
                return true;
            }
            if (i != 2) {
                if (i == 3) {
                    this.c = false;
                }
            } else if (this.c) {
                int i2 = (int) (x - this.d);
                int i3 = (int) (y - this.e);
                if ((i3 * i3) + (i2 * i2) > this.b) {
                    this.c = false;
                }
            }
        }
        return false;
    }
}
