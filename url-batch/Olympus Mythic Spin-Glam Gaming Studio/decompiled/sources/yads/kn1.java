package yads;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes5.dex */
public final class kn1 {
    public final t8 a;

    public kn1(t8 t8Var) {
        this.a = t8Var;
    }

    public final uv2 a(CustomizableMediaView customizableMediaView, ri2 ri2Var, rn1 rn1Var) {
        ImageView imageView = new ImageView(customizableMediaView.getContext());
        if (!tq0.a(customizableMediaView.getContext(), sq0.e)) {
            customizableMediaView.removeAllViews();
        }
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        customizableMediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return new uv2(customizableMediaView, new y31(imageView, ri2Var, this.a), rn1Var);
    }
}
