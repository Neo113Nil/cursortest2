package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* loaded from: classes13.dex */
public final class zx1 extends ek3 {
    public final ri2 c;
    public final mt1 d;
    public final t8 e;

    public zx1(ViewPager2 viewPager2, ri2 ri2Var, mt1 mt1Var, t8 t8Var) {
        super(viewPager2);
        this.c = ri2Var;
        this.d = mt1Var;
        this.e = t8Var;
    }

    @Override // yads.ek3
    public final boolean a(View view, Object obj) {
        return ((ViewPager2) view).getAdapter() instanceof wx1;
    }

    @Override // yads.ek3
    public final void b(View view, Object obj) {
        try {
            ((ViewPager2) view).setAdapter(new wx1(this.c, (List) obj, this.e));
        } catch (IllegalArgumentException e) {
            mt1 mt1Var = this.d;
            String message = e.getMessage();
            if (message == null) {
                message = "IllegalArgumentException: set adapter exception";
            }
            mt1Var.reportError(message, e);
        }
    }
}
