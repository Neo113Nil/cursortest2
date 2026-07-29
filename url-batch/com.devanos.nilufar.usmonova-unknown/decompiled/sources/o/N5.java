package o;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class N5 implements Runnable {
    public final /* synthetic */ TextView h;
    public final /* synthetic */ Typeface i;
    public final /* synthetic */ int j;

    public N5(TextView textView, Typeface typeface, int i) {
        this.h = textView;
        this.i = typeface;
        this.j = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.setTypeface(this.i, this.j);
    }
}
