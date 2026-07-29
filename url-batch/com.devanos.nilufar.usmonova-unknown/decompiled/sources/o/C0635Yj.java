package o;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* renamed from: o.Yj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635Yj extends AbstractC0220Ij {
    public final WeakReference a;

    public C0635Yj(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // o.AbstractC0220Ij
    public final void a() {
        C0661Zj.a((EditText) this.a.get(), 1);
    }
}
