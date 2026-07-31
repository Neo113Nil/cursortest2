package yads;

import android.R;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class o8 {
    public static ImageView a(Activity activity, String str, int i) {
        ImageView imageView = new ImageView(activity);
        imageView.setImageBitmap(oa.a(str));
        imageView.setAdjustViewBounds(true);
        imageView.setPadding(i, i, i, i);
        ColorDrawable colorDrawable = n8.a;
        ColorDrawable colorDrawable2 = new ColorDrawable(m8.a);
        ColorDrawable colorDrawable3 = new ColorDrawable(0);
        int[] iArr = {R.attr.state_pressed};
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(iArr, colorDrawable2);
        stateListDrawable.addState(new int[0], colorDrawable3);
        imageView.setBackgroundDrawable(stateListDrawable);
        return imageView;
    }
}
