package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ionia.reidopitaco.libya.R;
import java.util.Locale;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class kb0 extends ey {
    public final as d;

    public kb0(as asVar) {
        this.d = asVar;
    }

    @Override // defpackage.ey
    public final int a() {
        return this.d.a0.k;
    }

    @Override // defpackage.ey
    public final void c(dz dzVar, int i) {
        as asVar = this.d;
        int i2 = asVar.a0.f.h + i;
        TextView textView = ((jb0) dzVar).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(x60.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        y5 y5Var = asVar.d0;
        if (x60.b().get(1) == i2) {
            Object obj = y5Var.c;
        } else {
            Object obj2 = y5Var.b;
        }
        throw null;
    }

    @Override // defpackage.ey
    public final dz d(ViewGroup viewGroup) {
        return new jb0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
