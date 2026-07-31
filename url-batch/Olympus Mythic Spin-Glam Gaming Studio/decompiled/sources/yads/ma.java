package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$string;

/* loaded from: classes3.dex */
public final class ma extends ra0 {
    public final rk3 a;
    public final TextView b;

    public ma(View view, rk3 rk3Var) {
        super(view);
        this.a = rk3Var;
        this.b = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.ra0
    public final /* bridge */ /* synthetic */ void a(oa0 oa0Var) {
        a();
    }

    public final void a() {
        this.b.setText(this.itemView.getContext().getString(R$string.debug_panel_ad_units));
        this.b.setOnClickListener(new View.OnClickListener() { // from class: yads.ma$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ma.a(ma.this, view);
            }
        });
    }

    public static final void a(ma maVar, View view) {
        maVar.a.mo4828invoke();
    }
}
