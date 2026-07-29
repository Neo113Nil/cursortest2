package o;

import android.view.View;
import java.util.Arrays;

/* renamed from: o.oI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC1620oI implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ C1333jz b;

    public ViewOnSystemUiVisibilityChangeListenerC1620oI(C1333jz c1333jz, View view) {
        this.b = c1333jz;
        this.a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i) {
        this.a.post(new Runnable() { // from class: o.nI
            @Override // java.lang.Runnable
            public final void run() {
                C0208Hx c0208Hx = (C0208Hx) ViewOnSystemUiVisibilityChangeListenerC1620oI.this.b.j;
                if ((i & 4) == 0) {
                    ((C0950e6) c0208Hx.i).E("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                } else {
                    ((C0950e6) c0208Hx.i).E("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                }
            }
        });
    }
}
