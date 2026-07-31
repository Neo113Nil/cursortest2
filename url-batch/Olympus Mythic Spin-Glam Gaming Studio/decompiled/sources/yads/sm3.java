package yads;

import androidx.core.content.ContextCompat;
import com.monetization.ads.instream.view.InstreamMuteView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes15.dex */
public final class sm3 {
    public final ky1 a;

    public sm3(ky1 ky1Var) {
        this.a = ky1Var;
    }

    public final void a(InstreamMuteView instreamMuteView, boolean z) {
        int i;
        int i2 = z ? this.a.a : this.a.b;
        if (z) {
            i = this.a.c;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = this.a.d;
        }
        instreamMuteView.setBackground(ContextCompat.getDrawable(instreamMuteView.getContext(), i2));
        instreamMuteView.setContentDescription(ContextCompat.getString(instreamMuteView.getContext(), i));
    }
}
