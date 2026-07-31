package yads;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class dd1 extends ra0 {
    public final TextView a;
    public final TextView b;
    public final TextView c;

    public dd1(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R$id.item_title);
        this.b = (TextView) view.findViewById(R$id.item_subtitle);
        this.c = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.ra0
    public final void a(oa0 oa0Var) {
        ka0 ka0Var = (ka0) oa0Var;
        String str = ka0Var.a;
        k90 k90Var = ka0Var.b;
        v50 v50Var = ka0Var.c;
        Context context = this.itemView.getContext();
        if (str != null) {
            this.a.setVisibility(0);
            this.a.setText(str);
        } else {
            this.a.setVisibility(8);
        }
        if (k90Var == null || StringsKt.isBlank(k90Var.a)) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.setText(k90Var.a);
            this.b.setTextColor(jj.a(context, k90Var.b));
            Integer num = k90Var.c;
            this.b.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        }
        if (v50Var == null || StringsKt.isBlank(v50Var.a)) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        this.c.setText(v50Var.a);
        this.c.setTextColor(jj.a(context, v50Var.b));
    }
}
