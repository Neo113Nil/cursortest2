package defpackage;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class lr implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ lr(int i, int i2, Object obj) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        int i2 = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                int[] iArr = MaterialButton.S;
                ((MaterialButton) obj).setIconSize(i2);
                break;
            case 1:
                ((oo) obj).B(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.p;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.t(view, i2, false);
                    break;
                }
                break;
        }
    }
}
