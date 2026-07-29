package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o.AZ;
import o.AbstractC0642Yq;
import o.AbstractC1099gN;
import o.AbstractC1834rZ;
import o.AbstractC1862s0;
import o.C1142h10;
import o.C1239iV;
import o.InterfaceC1985ts;

@Keep
@SuppressLint({"NewApi", "Override"})
/* loaded from: classes.dex */
class ImeSyncDeferringInsetsCallback {
    private boolean animating;
    private AnimationCallback animationCallback;
    private final int deferredInsetTypes;
    private InterfaceC1985ts imeVisibilityListener;
    private a insetsListener;
    private WindowInsets lastWindowInsets;
    private boolean needsSave;
    private View view;

    @Keep
    public class AnimationCallback extends WindowInsetsAnimation$Callback {
        public AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating) {
                typeMask = windowInsetsAnimation.getTypeMask();
                if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                    ImeSyncDeferringInsetsCallback.this.animating = false;
                    if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets != null && ImeSyncDeferringInsetsCallback.this.view != null) {
                        ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                    }
                }
            }
            View view = ImeSyncDeferringInsetsCallback.this.view;
            WeakHashMap weakHashMap = AZ.a;
            C1142h10 a = AbstractC1834rZ.a(view);
            if (a == null || ImeSyncDeferringInsetsCallback.this.imeVisibilityListener == null) {
                return;
            }
            boolean n = a.a.n(8);
            C1239iV c1239iV = (C1239iV) ImeSyncDeferringInsetsCallback.this.imeVisibilityListener;
            if (n) {
                c1239iV.getClass();
            } else {
                b bVar = c1239iV.a;
                bVar.b.restartInput(bVar.a);
            }
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            ImeSyncDeferringInsetsCallback.this.needsSave = true;
            typeMask = windowInsetsAnimation.getTypeMask();
            if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            int i;
            Insets insets;
            int i2;
            Insets of;
            WindowInsets build;
            int navigationBars;
            Insets insets2;
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                Iterator<WindowInsetsAnimation> it = list.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    typeMask = AbstractC1862s0.h(it.next()).getTypeMask();
                    if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z = true;
                    }
                }
                if (z) {
                    int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                    if (Build.VERSION.SDK_INT < 35 && (windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) {
                        navigationBars = WindowInsets.Type.navigationBars();
                        insets2 = windowInsets.getInsets(navigationBars);
                        i = insets2.bottom;
                    } else {
                        i = 0;
                    }
                    AbstractC0642Yq.f();
                    WindowInsets.Builder d = AbstractC1099gN.d(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                    insets = windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes);
                    i2 = insets.bottom;
                    of = Insets.of(0, 0, 0, Math.max(i2 - i, 0));
                    d.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, of);
                    View view = ImeSyncDeferringInsetsCallback.this.view;
                    build = d.build();
                    view.onApplyWindowInsets(build);
                }
            }
            return windowInsets;
        }
    }

    public ImeSyncDeferringInsetsCallback(View view) {
        int ime;
        ime = WindowInsets.Type.ime();
        this.deferredInsetTypes = ime;
        this.animating = false;
        this.needsSave = false;
        this.view = view;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new a(this);
    }

    public WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public InterfaceC1985ts getImeVisibilityListener() {
        return this.imeVisibilityListener;
    }

    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }

    public void setImeVisibilityListener(InterfaceC1985ts interfaceC1985ts) {
        this.imeVisibilityListener = interfaceC1985ts;
    }
}
