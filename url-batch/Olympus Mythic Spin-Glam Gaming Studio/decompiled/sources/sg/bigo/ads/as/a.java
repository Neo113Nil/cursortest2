package sg.bigo.ads.as;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: sg.bigo.ads.as.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1841a {
        private final Object a = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: sg.bigo.ads.as.a.a.1
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                AbstractC1841a.this.a(z);
            }
        };

        @RequiresApi
        final ViewTreeObserver.OnWindowFocusChangeListener a() {
            Object obj = this.a;
            if (obj instanceof ViewTreeObserver.OnWindowFocusChangeListener) {
                return (ViewTreeObserver.OnWindowFocusChangeListener) obj;
            }
            return null;
        }

        public abstract void a(boolean z);
    }

    public static void a(@NonNull View view) {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, float f) {
        if (view == null) {
            return;
        }
        view.setZ(f);
    }

    public static void a(View view, int i) {
        if (view == null) {
            return;
        }
        view.setElevation(i);
    }

    public static void a(@NonNull View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, AbstractC1841a abstractC1841a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener a;
        if (view == null || abstractC1841a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (a = abstractC1841a.a()) == null) {
            return;
        }
        viewTreeObserver.addOnWindowFocusChangeListener(a);
    }

    public static void b(View view, AbstractC1841a abstractC1841a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener a;
        if (view == null || abstractC1841a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (a = abstractC1841a.a()) == null) {
            return;
        }
        viewTreeObserver.removeOnWindowFocusChangeListener(a);
    }
}
