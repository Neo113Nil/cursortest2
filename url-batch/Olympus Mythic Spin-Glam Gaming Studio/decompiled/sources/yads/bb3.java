package yads;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes15.dex */
public final class bb3 {
    public final j92 a;

    public bb3(j92 j92Var, l21 l21Var) {
        this.a = j92Var;
    }

    public final Bitmap a(String str) {
        return (Bitmap) this.a.get(l21.a(str, ImageView.ScaleType.CENTER_INSIDE));
    }

    public final void a(String str, Bitmap bitmap) {
        this.a.put(l21.a(str, ImageView.ScaleType.CENTER_INSIDE), bitmap);
    }
}
