package l;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class E0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f2836a;

    public E0(G0 g02) {
        this.f2836a = g02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            G0 g02 = this.f2836a;
            if (g02.f2863z.getInputMethodMode() == 2 || g02.f2863z.getContentView() == null) {
                return;
            }
            Handler handler = g02.f2859v;
            C0 c02 = g02.f2855r;
            handler.removeCallbacks(c02);
            c02.run();
        }
    }
}
