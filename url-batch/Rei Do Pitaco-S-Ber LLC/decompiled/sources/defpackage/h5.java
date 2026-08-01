package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class h5 implements Runnable {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ int g;
    public final /* synthetic */ View h;
    public final /* synthetic */ Object i;

    public h5(TextView textView, Typeface typeface, int i) {
        this.h = textView;
        this.i = typeface;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        int i2 = this.g;
        View view = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((TextView) view).setTypeface((Typeface) obj, i2);
                break;
            default:
                ((BottomSheetBehavior) obj).H(view, i2, false);
                break;
        }
    }

    public h5(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.i = bottomSheetBehavior;
        this.h = view;
        this.g = i;
    }
}
