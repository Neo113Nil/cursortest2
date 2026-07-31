package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class bs1 extends ra0 {
    public final e80 a;
    public final pk3 b;
    public final qk3 c;
    public dt d;
    public final LinearLayout e;
    public final ImageView f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;
    public final TextView j;
    public final ImageView k;

    public bs1(View view, e80 e80Var, pk3 pk3Var, qk3 qk3Var) {
        super(view);
        this.a = e80Var;
        this.b = pk3Var;
        this.c = qk3Var;
        this.e = (LinearLayout) view.findViewById(R$id.item_mediation_adapter);
        this.f = (ImageView) view.findViewById(R$id.item_logo);
        this.g = (TextView) view.findViewById(R$id.item_name);
        this.h = (ImageView) view.findViewById(R$id.navigation_icon);
        this.i = (TextView) view.findViewById(R$id.item_info_first);
        this.j = (TextView) view.findViewById(R$id.item_info_second);
        this.k = (ImageView) view.findViewById(R$id.item_warning_button);
    }

    public static final void b(bs1 bs1Var, la0 la0Var, View view) {
        bs1Var.b.invoke(la0Var);
    }

    @Override // yads.ra0
    public final void a(final la0 la0Var) {
        Context context = this.itemView.getContext();
        this.g.setText(la0Var.a);
        k90 k90Var = la0Var.c;
        if (k90Var != null) {
            this.i.setVisibility(0);
            this.i.setText(k90Var.a);
            this.i.setTextAppearance(context, k90Var.d);
            this.i.setTextColor(jj.a(this.itemView.getContext(), k90Var.b));
            TextView textView = this.i;
            Integer num = k90Var.c;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        } else {
            this.i.setVisibility(8);
        }
        v50 v50Var = la0Var.d;
        this.j.setText(v50Var.a);
        this.j.setTextAppearance(context, v50Var.c);
        this.j.setTextColor(jj.a(this.itemView.getContext(), v50Var.b));
        LinearLayout linearLayout = this.e;
        String str = la0Var.e;
        linearLayout.setClickable(((str == null || StringsKt.isBlank(str)) && la0Var.g == null) ? false : true);
        String str2 = la0Var.e;
        if (str2 == null || StringsKt.isBlank(str2)) {
            this.k.setVisibility(8);
        } else {
            this.k.setVisibility(0);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: yads.bs1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bs1.a(bs1.this, la0Var, view);
                }
            });
        }
        this.f.setImageResource(0);
        dt dtVar = this.d;
        if (dtVar != null) {
            dtVar.cancel();
        }
        e80 e80Var = this.a;
        String str3 = la0Var.b;
        if (str3 == null) {
            str3 = "";
        }
        this.d = e80Var.a(str3, this.f);
        if (la0Var.g == null) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: yads.bs1$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bs1.b(bs1.this, la0Var, view);
                }
            });
        }
    }

    public static final void a(bs1 bs1Var, la0 la0Var, View view) {
        bs1Var.c.invoke(la0Var.e);
    }
}
