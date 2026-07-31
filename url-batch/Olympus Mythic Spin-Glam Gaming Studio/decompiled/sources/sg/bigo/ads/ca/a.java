package sg.bigo.ads.ca;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes12.dex */
public final class a {
    @NonNull
    public static boolean a(View view, @NonNull Rect rect) {
        if (view == null || !v.d(view)) {
            u.a();
            return false;
        }
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return false;
        }
        return view.getGlobalVisibleRect(rect);
    }
}
