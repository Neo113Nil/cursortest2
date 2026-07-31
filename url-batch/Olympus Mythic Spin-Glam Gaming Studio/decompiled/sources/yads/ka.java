package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes4.dex */
public final class ka extends ra0 {
    public final sk3 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public ka(View view, sk3 sk3Var) {
        super(view);
        this.a = sk3Var;
        this.b = (TextView) view.findViewById(R$id.item_name);
        this.c = (TextView) view.findViewById(R$id.item_ad_unit_format);
        this.d = (TextView) view.findViewById(R$id.item_ad_unit_id);
    }

    @Override // yads.ra0
    public final void a(final ea0 ea0Var) {
        this.b.setText(ea0Var.a);
        this.c.setText(ea0Var.b);
        this.d.setText(ea0Var.c);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: yads.ka$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ka.a(ka.this, ea0Var, view);
            }
        });
    }

    public static final void a(ka kaVar, ea0 ea0Var, View view) {
        kaVar.a.invoke(ea0Var.c);
    }
}
