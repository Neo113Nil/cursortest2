package yads;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class ed1 {
    public static void a(View view) {
        Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
