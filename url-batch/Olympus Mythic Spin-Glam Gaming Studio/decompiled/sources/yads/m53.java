package yads;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes4.dex */
public final class m53 extends ra0 {
    public final ok3 a;
    public final Switch b;

    public m53(View view, ok3 ok3Var) {
        super(view);
        this.a = ok3Var;
        this.b = (Switch) view.findViewById(R$id.item_switch);
    }

    @Override // yads.ra0
    public final void a(final na0 na0Var) {
        this.b.setOnCheckedChangeListener(null);
        Switch r0 = this.b;
        na0Var.getClass();
        r0.setText("Debug Error Indicator");
        this.b.setChecked(na0Var.a);
        this.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yads.m53$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                m53.a(m53.this, na0Var, compoundButton, z);
            }
        });
    }

    public static final void a(m53 m53Var, na0 na0Var, CompoundButton compoundButton, boolean z) {
        ok3 ok3Var = m53Var.a;
        na0Var.getClass();
        ok3Var.invoke(ma0.b, Boolean.valueOf(z));
    }
}
