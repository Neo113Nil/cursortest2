package yads;

import android.widget.TextView;

/* loaded from: classes6.dex */
public final class w33 implements Runnable {
    public final TextView b;
    public final ay c;

    public w33(TextView textView, ay ayVar) {
        this.b = textView;
        this.c = ayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.b);
    }
}
