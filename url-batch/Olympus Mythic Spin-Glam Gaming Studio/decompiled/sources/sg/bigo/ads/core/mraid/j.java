package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
final class j {

    @NonNull
    final Rect a = new Rect();

    @NonNull
    final Rect b = new Rect();

    @NonNull
    final Rect c = new Rect();

    @NonNull
    final Rect d = new Rect();

    @NonNull
    final Rect e = new Rect();

    @NonNull
    final Rect f = new Rect();

    @NonNull
    final Rect g = new Rect();

    @NonNull
    final Rect h = new Rect();

    @NonNull
    private final Context i;
    private final float j;

    j(Context context, float f) {
        this.i = context.getApplicationContext();
        this.j = f;
    }

    final void a(Rect rect, Rect rect2) {
        rect2.set(sg.bigo.ads.common.utils.f.a(this.i, rect.left), sg.bigo.ads.common.utils.f.a(this.i, rect.top), sg.bigo.ads.common.utils.f.a(this.i, rect.right), sg.bigo.ads.common.utils.f.a(this.i, rect.bottom));
    }
}
