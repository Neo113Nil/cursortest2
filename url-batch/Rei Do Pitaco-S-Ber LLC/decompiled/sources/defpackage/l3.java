package defpackage;

import android.graphics.Typeface;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ l3(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                m3 m3Var = (m3) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    m3Var.a();
                }
            case 1:
                b3 b3Var = (b3) obj2;
                b3Var.f.a(new hb((pv) obj, b3Var));
                return;
            case 2:
                MaterialButton materialButton = (MaterialButton) obj2;
                int[] iArr = MaterialButton.S;
                ((Runnable) obj).run();
                LinearLayout.LayoutParams layoutParams = materialButton.H;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.H = null;
                    materialButton.E = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            default:
                ((oo) obj2).C((Typeface) obj);
                return;
        }
    }
}
