package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class oh extends yg {
    public final WeakReference a;

    public oh(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.yg
    public final void a() {
        ph.a((EditText) this.a.get(), 1);
    }
}
