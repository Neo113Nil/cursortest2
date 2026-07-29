package o;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class VV implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Toolbar i;

    public /* synthetic */ VV(Toolbar toolbar, int i) {
        this.h = i;
        this.i = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                YV yv = this.i.T;
                C1284jC c1284jC = yv == null ? null : yv.i;
                if (c1284jC != null) {
                    c1284jC.collapseActionView();
                    break;
                }
                break;
            default:
                this.i.m();
                break;
        }
    }
}
