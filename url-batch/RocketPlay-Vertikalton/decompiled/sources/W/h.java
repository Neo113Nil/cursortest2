package W;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends U.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1266a;

    public h(EditText editText) {
        this.f1266a = new WeakReference(editText);
    }

    @Override // U.h
    public final void a() {
        i.a((EditText) this.f1266a.get(), 1);
    }
}
