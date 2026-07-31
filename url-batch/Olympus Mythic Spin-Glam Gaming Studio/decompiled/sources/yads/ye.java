package yads;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import com.monetization.ads.fullscreen.template.view.ExtendedTextView;

/* loaded from: classes4.dex */
public final class ye extends xe {
    @Override // yads.ze
    public final boolean a(ExtendedTextView extendedTextView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = extendedTextView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }

    @Override // yads.xe, yads.ze
    public final void a(StaticLayout.Builder builder, ExtendedTextView extendedTextView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = extendedTextView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }
}
