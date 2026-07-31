package com.inmobi.media;

import android.view.View;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class So {
    public final ArrayList a;
    public final WeakReference b;

    public So(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a = new ArrayList();
        this.b = new WeakReference(view);
        F5.a.getClass();
        if (F5.w()) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.inmobi.media.So$$ExternalSyntheticLambda0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return So.a(So.this, view2, windowInsets);
                }
            });
        }
    }

    public static final WindowInsets a(So so, View view, WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        if (!so.a.isEmpty()) {
            Iterator it = so.a.iterator();
            while (it.hasNext()) {
                Wo wo = (Wo) ((Ro) it.next());
                wo.getClass();
                Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
                wo.a.a(windowInsets);
                wo.a(windowInsets);
            }
        }
        return windowInsets;
    }

    public final void a() {
        View view;
        this.a.clear();
        F5.a.getClass();
        if (!F5.w() || (view = (View) this.b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
