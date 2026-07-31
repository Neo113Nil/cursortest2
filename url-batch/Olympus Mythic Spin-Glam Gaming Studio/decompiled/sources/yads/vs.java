package yads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes4.dex */
public final class vs implements hg0 {
    public final vy1 a;
    public final us b;

    public vs(Activity activity) {
        vy1 vy1Var = new vy1();
        us usVar = new us(activity);
        this.a = vy1Var;
        this.b = usVar;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        this.a.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.call_to_action);
        if (textView != null) {
            us usVar = this.b;
            usVar.a.postDelayed(new w33(textView, usVar.b), 2000L);
        }
    }

    @Override // yads.hg0
    public final void c() {
        us usVar = this.b;
        usVar.a.removeCallbacksAndMessages(null);
        usVar.b.cancel();
    }
}
