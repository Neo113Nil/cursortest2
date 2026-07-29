package o;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ZV extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public ZV(ZV zv) {
        super((ViewGroup.MarginLayoutParams) zv);
        this.a = 0;
        this.a = zv.a;
    }

    public ZV(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
