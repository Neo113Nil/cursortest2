package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class y12 implements View.OnTouchListener, View.OnClickListener {
    public final ju a;
    public final q02 b;

    public y12(Context context, h02 h02Var) {
        ju juVar = new ju(context, h02Var);
        if (q02.d == null) {
            synchronized (q02.c) {
                try {
                    if (q02.d == null) {
                        q02.d = new q02();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        q02 q02Var = q02.d;
        if (q02Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.a = juVar;
        this.b = q02Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        q02 q02Var = this.b;
        q02Var.getClass();
        if ((view instanceof TextView) || (view instanceof wl2)) {
            q02Var.a(view, motionEvent);
        }
        return this.a.onTouch(view, motionEvent);
    }
}
