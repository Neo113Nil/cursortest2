package io.flutter.plugin.editing;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class a implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ ImeSyncDeferringInsetsCallback a;

    public a(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        this.a = imeSyncDeferringInsetsCallback;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.a;
        imeSyncDeferringInsetsCallback.view = view;
        if (imeSyncDeferringInsetsCallback.needsSave) {
            imeSyncDeferringInsetsCallback.lastWindowInsets = windowInsets;
            imeSyncDeferringInsetsCallback.needsSave = false;
        }
        if (!imeSyncDeferringInsetsCallback.animating) {
            return view.onApplyWindowInsets(windowInsets);
        }
        windowInsets2 = WindowInsets.CONSUMED;
        return windowInsets2;
    }
}
