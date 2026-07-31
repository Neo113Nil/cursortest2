package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes4.dex */
public final class gn3 implements hg0 {
    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        TextView textView = (TextView) viewGroup.findViewById(R$id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    @Override // yads.hg0
    public final void c() {
    }
}
