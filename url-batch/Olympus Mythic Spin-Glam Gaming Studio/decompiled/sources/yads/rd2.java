package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes11.dex */
public final class rd2 implements hg0 {
    public final w00 a;

    public rd2(w00 w00Var) {
        this.a = w00Var;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        ImageView imageView = (ImageView) viewGroup.findViewById(R$id.icon_placeholder);
        w00 w00Var = this.a;
        y00 y00Var = w00Var.c;
        y00 y00Var2 = w00Var.b;
        if (imageView != null && y00Var == null && y00Var2 == null) {
            vk3 vk3Var = new vk3((TextView) viewGroup.findViewById(R$id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(vk3Var);
        }
    }

    @Override // yads.hg0
    public final void c() {
    }
}
