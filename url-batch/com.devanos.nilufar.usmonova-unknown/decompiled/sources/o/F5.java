package o;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class F5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ H5 h;

    public F5(H5 h5) {
        this.h = h5;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        H5 h5 = this.h;
        K5 k5 = h5.M;
        k5.setSelection(i);
        if (k5.getOnItemClickListener() != null) {
            k5.performItemClick(view, i, h5.J.getItemId(i));
        }
        h5.dismiss();
    }
}
