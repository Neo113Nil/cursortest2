package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes6.dex */
public final class yz0 extends ra0 {
    public final TextView a;

    public yz0(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.ra0
    public final void a(oa0 oa0Var) {
        this.a.setText(((ja0) oa0Var).a);
    }
}
