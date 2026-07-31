package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class kk3 {
    public static final void a(final View view) {
        ViewParent parent = view.getParent();
        final ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            viewGroup.removeView(view);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yads.kk3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    kk3.a(viewGroup, view);
                }
            });
        }
    }

    public static final void a(ViewGroup viewGroup, View view) {
        viewGroup.removeView(view);
    }
}
