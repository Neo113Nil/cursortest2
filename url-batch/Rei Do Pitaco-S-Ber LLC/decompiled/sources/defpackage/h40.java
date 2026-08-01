package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class h40 {
    public final f40 a;
    public final ArrayList b = new ArrayList();
    public io c;
    public io d;
    public int e;

    public h40(ViewGroup viewGroup) {
        View view;
        io ioVar = io.e;
        this.c = ioVar;
        this.d = ioVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        f40 f40Var = new f40(this, viewGroup.getContext(), viewGroup);
        this.a = f40Var;
        f40Var.setVisibility(8);
        f40Var.setWillNotDraw(true);
        h hVar = new h(8, this);
        WeakHashMap weakHashMap = f80.a;
        x70.c(f40Var, hVar);
        f80.o(f40Var, new g40(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                view = null;
                break;
            }
            view = viewGroup.getChildAt(childCount);
            if (view.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (view == null) {
            viewGroup.addView(f40Var, 0);
        } else {
            view.addOnAttachStateChangeListener(new hk(viewGroup, f40Var));
        }
    }
}
