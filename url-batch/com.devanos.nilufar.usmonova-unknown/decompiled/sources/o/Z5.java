package o;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class Z5 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0688a6.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
