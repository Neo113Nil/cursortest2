package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* loaded from: classes14.dex */
public final class xl2 implements hg0 {
    public final w00 a;

    public xl2(w00 w00Var) {
        this.a = w00Var;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        String valueOf;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.rating_container);
        Float f = this.a.k;
        if (f == null) {
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R$id.rating_text);
        if (textView != null) {
            float floatValue = f.floatValue();
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(',');
                valueOf = new DecimalFormat("0.0", decimalFormatSymbols).format(floatValue);
            } catch (RuntimeException unused) {
                valueOf = String.valueOf(floatValue);
            }
            textView.setText(valueOf);
        }
    }

    @Override // yads.hg0
    public final void c() {
    }
}
