package com.my.target;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.my.target.fc;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public class fc extends b1 {
    private a d;
    private boolean e;
    private boolean f;
    private int g;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();

        void a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class b extends GestureDetector {
        private final View a;
        private a b;

        /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
        public interface a {
            void a();
        }

        public b(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        public void a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                onTouchEvent(motionEvent);
                return;
            }
            if (action != 1) {
                if (action == 2 && a(motionEvent, this.a)) {
                    onTouchEvent(motionEvent);
                    return;
                }
                return;
            }
            if (this.b == null) {
                mi.a("MraidWebView$ViewGestureDetector: View's onUserClick() is not registered");
            } else {
                mi.a("MraidWebView$ViewGestureDetector: Gestures - user clicked");
                this.b.a();
            }
        }

        private b(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.a = view;
            setIsLongpressEnabled(false);
        }

        public void a(a aVar) {
            this.b = aVar;
        }

        private boolean a(MotionEvent motionEvent, View view) {
            if (motionEvent != null && view != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (x >= 0.0f && x <= view.getWidth() && y >= 0.0f && y <= view.getHeight()) {
                    return true;
                }
            }
            return false;
        }
    }

    public fc(Context context) {
        super(context);
        this.e = getVisibility() == 0;
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        final b bVar = new b(getContext(), this);
        bVar.a(new b.a() { // from class: com.my.target.fc$$ExternalSyntheticLambda0
            @Override // com.my.target.fc.b.a
            public final void a() {
                fc.this.i();
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.fc$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean a2;
                a2 = fc.a(fc.b.this, view, motionEvent);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(b bVar, View view, MotionEvent motionEvent) {
        bVar.a(motionEvent);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.f = true;
    }

    @Override // com.my.target.b1, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.e;
    }

    @Override // com.my.target.b1, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (z != this.e) {
            this.e = z;
            a aVar = this.d;
            if (aVar != null) {
                aVar.a(z);
            }
        }
    }

    @VisibleForTesting
    public void setClicked(boolean z) {
        this.f = z;
    }

    public void setVisibilityChangedListener(@Nullable a aVar) {
        this.d = aVar;
    }

    public void a(boolean z) {
        mi.a("MraidWebView: Pause, finishing " + z);
        if (z) {
            f();
            a("");
        }
        d();
    }

    private void a(int i, int i2) {
        int i3 = ((float) i) / ((float) i2) > 1.0f ? 2 : 1;
        if (i3 != this.g) {
            this.g = i3;
            a aVar = this.d;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
