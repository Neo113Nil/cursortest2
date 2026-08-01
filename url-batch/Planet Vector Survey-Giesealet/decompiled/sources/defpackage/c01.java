package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class c01 {
    public static final /* synthetic */ int a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(View view, c11 c11Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(c11Var != null ? new i11(c11Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = h11.e;
        View.OnApplyWindowInsetsListener g11Var = c11Var != null ? new g11(view, c11Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, g11Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(g11Var);
        }
    }
}
