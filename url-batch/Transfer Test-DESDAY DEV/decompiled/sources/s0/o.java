package s0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.football.transfertrivia.R;
import g0.AbstractC0109A;
import g0.Z;

/* loaded from: classes.dex */
public final class o extends AbstractC0109A {
    public Object d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // g0.AbstractC0109A
    public final int a() {
        return this.d.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // g0.AbstractC0109A
    public final void c(Z z2, int i) {
        n nVar = (n) z2;
        p pVar = (p) this.d.get(i);
        g1.f.e(pVar, "item");
        int i2 = pVar.f3674a;
        String valueOf = String.valueOf(i2);
        TextView textView = nVar.f3671u;
        textView.setText(valueOf);
        nVar.f3672v.setText(String.valueOf(pVar.f3675b));
        nVar.f3673w.setText(pVar.f3676c);
        View view = nVar.f2392a;
        if (i2 == 1) {
            textView.setTextColor(view.getContext().getColor(R.color.accent_yellow));
            return;
        }
        if (i2 == 2) {
            textView.setTextColor(view.getContext().getColor(android.R.color.darker_gray));
        } else if (i2 != 3) {
            textView.setTextColor(view.getContext().getColor(R.color.white));
        } else {
            textView.setTextColor(view.getContext().getColor(android.R.color.holo_orange_dark));
        }
    }

    @Override // g0.AbstractC0109A
    public final Z d(ViewGroup viewGroup) {
        g1.f.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_score, viewGroup, false);
        g1.f.b(inflate);
        return new n(inflate);
    }
}
