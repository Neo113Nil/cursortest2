package yads;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import com.monetization.ads.fullscreen.template.view.ExtendedTextView;

/* loaded from: classes4.dex */
public class xe extends ze {
    @Override // yads.ze
    public void a(StaticLayout.Builder builder, ExtendedTextView extendedTextView) {
        builder.setTextDirection((TextDirectionHeuristic) af.a(extendedTextView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
