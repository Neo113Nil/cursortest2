package yads;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: classes4.dex */
public abstract class kb {
    public static void a(ViewGroup viewGroup) {
        ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: yads.kb$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return kb.a(view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout()).bottom);
        return WindowInsetsCompat.CONSUMED;
    }
}
