package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes5.dex */
public final class k0 extends ra0 {
    public final mk3 a;
    public final TextView b;

    public k0(View view, mk3 mk3Var) {
        super(view);
        this.a = mk3Var;
        this.b = (TextView) view.findViewById(R$id.item_button);
    }

    @Override // yads.ra0
    public final void a(final ha0 ha0Var) {
        TextView textView = this.b;
        ha0Var.getClass();
        textView.setText("Enable Test mode");
        this.b.setOnClickListener(new View.OnClickListener() { // from class: yads.k0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k0.a(k0.this, ha0Var, view);
            }
        });
    }

    public static final void a(k0 k0Var, ha0 ha0Var, View view) {
        mk3 mk3Var = k0Var.a;
        ha0Var.getClass();
        mk3Var.invoke(ga0.b);
    }
}
