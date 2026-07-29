package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class VR extends ContextWrapper {
    public final InputMethodManager a;

    public VR(Context context, InputMethodManager inputMethodManager) {
        super(context);
        this.a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDisplayContext(Display display) {
        return new VR(super.createDisplayContext(display), this.a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return "input_method".equals(str) ? this.a : super.getSystemService(str);
    }
}
