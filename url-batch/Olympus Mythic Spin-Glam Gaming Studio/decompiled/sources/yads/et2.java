package yads;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class et2 {
    /* JADX WARN: Multi-variable type inference failed */
    public final Point a(Context context) {
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        final WindowManager windowManager = (WindowManager) systemService;
        final Display display = (Display) v53.a(new Callable() { // from class: yads.et2$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return et2.a(windowManager);
            }
        }, windowManager, "getting display", "WindowManager");
        final Point point = new Point(0, 0);
        Object a = v53.a(new Callable() { // from class: yads.et2$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return et2.a(display, point, this);
            }
        }, display, "getting display metrics", "Display");
        if (a != 0) {
            point = a;
        }
        return point;
    }

    public static final Display a(WindowManager windowManager) {
        return windowManager.getDefaultDisplay();
    }

    public static final Point a(Display display, Point point, et2 et2Var) {
        if (display == null) {
            return point;
        }
        et2Var.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
