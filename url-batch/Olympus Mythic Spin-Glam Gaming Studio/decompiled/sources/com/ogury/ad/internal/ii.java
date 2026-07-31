package com.ogury.ad.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class ii {
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x001a -> B:6:0x001b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Activity a(View view) {
        Context context;
        View findViewById;
        Intrinsics.checkNotNullParameter(view, "<this>");
        View rootView = view.getRootView();
        if (rootView != null && (findViewById = rootView.findViewById(R.id.content)) != null) {
            context = findViewById.getContext();
            while (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext instanceof ContextWrapper) {
                    context = (ContextWrapper) baseContext;
                }
            }
            return null;
        }
        context = null;
        while (context instanceof ContextWrapper) {
        }
        return null;
    }
}
