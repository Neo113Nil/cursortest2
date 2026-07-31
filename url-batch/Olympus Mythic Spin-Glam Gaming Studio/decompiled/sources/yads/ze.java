package yads;

import android.text.StaticLayout;
import com.monetization.ads.fullscreen.template.view.ExtendedTextView;

/* loaded from: classes4.dex */
public abstract class ze {
    public abstract void a(StaticLayout.Builder builder, ExtendedTextView extendedTextView);

    public boolean a(ExtendedTextView extendedTextView) {
        return ((Boolean) af.a(extendedTextView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
