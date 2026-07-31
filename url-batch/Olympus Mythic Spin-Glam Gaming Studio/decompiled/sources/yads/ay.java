package yads;

import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class ay implements yd {
    public final List a;

    public ay(List list) {
        this.a = list;
    }

    @Override // yads.yd
    public final void a(TextView textView) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yd) it.next()).a(textView);
        }
    }

    @Override // yads.yd
    public final void cancel() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yd) it.next()).cancel();
        }
    }
}
