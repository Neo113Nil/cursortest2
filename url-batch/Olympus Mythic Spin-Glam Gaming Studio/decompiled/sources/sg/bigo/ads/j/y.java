package sg.bigo.ads.j;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;

/* loaded from: classes5.dex */
public final class y extends x {
    public y(@NonNull sg.bigo.ads.y.b bVar, sg.bigo.ads.ai.o oVar) {
        super(bVar, oVar);
    }

    @Override // sg.bigo.ads.j.x, sg.bigo.ads.ad.f
    public final void d(ViewGroup viewGroup) {
        View findViewById;
        super.d(viewGroup);
        if (!((x) this).l || viewGroup == null || (findViewById = viewGroup.findViewById(R.id.inter_btn_cta)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }
}
