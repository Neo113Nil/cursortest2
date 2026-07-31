package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class mj2 implements p21 {
    public static final /* synthetic */ KProperty[] c = {ra.a(mj2.class, "preview", "getPreview()Landroid/widget/ImageView;", 0), ra.a(mj2.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};
    public final qm2 a;
    public final qm2 b;

    public mj2(ImageView imageView, ProgressBar progressBar) {
        this.a = new qm2(imageView);
        this.b = new qm2(progressBar);
    }

    @Override // yads.p21
    public final void a(Drawable drawable) {
        if (drawable == null) {
            qm2 qm2Var = this.b;
            KProperty kProperty = c[1];
            ProgressBar progressBar = (ProgressBar) qm2Var.a.get();
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
            return;
        }
        qm2 qm2Var2 = this.a;
        KProperty[] kPropertyArr = c;
        KProperty kProperty2 = kPropertyArr[0];
        ImageView imageView = (ImageView) qm2Var2.a.get();
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            return;
        }
        qm2 qm2Var3 = this.b;
        KProperty kProperty3 = kPropertyArr[1];
        ProgressBar progressBar2 = (ProgressBar) qm2Var3.a.get();
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
    }
}
