package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes15.dex */
public final class sn2 implements Runnable {
    public final wn2 b;
    public final Bitmap c;

    public sn2(wn2 wn2Var, Bitmap bitmap) {
        this.b = wn2Var;
        this.c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.setBackground(new BitmapDrawable(this.b.getResources(), this.c));
        this.b.setVisibility(0);
    }
}
