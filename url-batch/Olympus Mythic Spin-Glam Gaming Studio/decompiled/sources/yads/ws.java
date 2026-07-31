package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes4.dex */
public final class ws implements hg0 {
    public final m12 a;

    public ws(m12 m12Var) {
        this.a = m12Var;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        TextView textView = (TextView) viewGroup.findViewById(R$id.call_to_action);
        dq2 adType = this.a.getAdType();
        if (!(textView instanceof CallToActionView) || adType == dq2.d) {
            return;
        }
        ((CallToActionView) textView).a();
    }

    @Override // yads.hg0
    public final void c() {
    }
}
