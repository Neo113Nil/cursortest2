package yads;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public final class d80 implements f31 {
    public final /* synthetic */ ImageView a;

    public d80(ImageView imageView) {
        this.a = imageView;
    }

    @Override // yads.vp2
    public final void a(hm3 hm3Var) {
    }

    @Override // yads.f31
    public final void a(e31 e31Var, boolean z) {
        Bitmap bitmap = e31Var.a;
        if (bitmap != null) {
            this.a.setImageBitmap(bitmap);
        }
    }
}
