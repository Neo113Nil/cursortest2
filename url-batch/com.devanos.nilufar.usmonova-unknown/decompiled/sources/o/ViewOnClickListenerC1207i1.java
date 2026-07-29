package o;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* renamed from: o.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1207i1 implements View.OnClickListener {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ViewOnClickListenerC1207i1(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.h) {
            case 0:
                ((B1) this.i).a();
                break;
            case 1:
                C1077g2 c1077g2 = (C1077g2) this.i;
                c1077g2.v.obtainMessage(1, c1077g2.b).sendToTarget();
                break;
            default:
                YV yv = ((Toolbar) this.i).T;
                C1284jC c1284jC = yv == null ? null : yv.i;
                if (c1284jC != null) {
                    c1284jC.collapseActionView();
                    break;
                }
                break;
        }
    }
}
