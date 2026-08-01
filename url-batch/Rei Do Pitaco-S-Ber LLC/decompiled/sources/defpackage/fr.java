package defpackage;

import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class fr implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ View g;

    public /* synthetic */ fr(View view, int i) {
        this.f = i;
        this.g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        View view = this.g;
        switch (i) {
            case 0:
                view.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator()).setDuration(150L).start();
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
