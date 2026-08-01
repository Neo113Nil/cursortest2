package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        z6 z6Var;
        int i9 = this.a;
        int i10 = 2;
        Object obj = this.b;
        switch (i9) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new p1(i10, carouselLayoutManager));
                    break;
                }
                break;
            default:
                w7 w7Var = (w7) obj;
                View view2 = w7Var.w;
                ImageView imageView = w7Var.y;
                if (imageView.getVisibility() == 0 && (z6Var = w7Var.f0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    z6Var.setBounds(rect);
                    z6Var.i(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w7Var.v.getLayoutParams();
                int i11 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i12 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z2 = true;
                if (w7Var.g0 == 1 && w7Var.a0 == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (w7Var.a0 != -2 || view2.getMeasuredWidth() == i11) {
                        z = false;
                    } else {
                        layoutParams2.width = Math.max(i11, Math.min(w7Var.V, w7Var.getMeasuredWidth() - (w7Var.d0 * 2)));
                        z = true;
                    }
                    if (view2.getMeasuredHeight() < i12) {
                        layoutParams2.height = i12;
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        view2.setLayoutParams(layoutParams2);
                        break;
                    }
                }
                break;
        }
    }
}
