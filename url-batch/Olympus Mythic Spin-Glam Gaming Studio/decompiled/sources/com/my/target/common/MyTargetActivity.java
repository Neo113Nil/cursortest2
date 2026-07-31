package com.my.target.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.MyTargetActivity;
import com.my.target.e1;
import com.my.target.oi;
import com.my.target.pi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class MyTargetActivity extends Activity {

    @Nullable
    public static ActivityEngine activityEngine;
    private ActivityEngine a;
    private FrameLayout b;
    private a c;
    private WindowInsetsController d;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface ActivityEngine {
        void onActivityAttach(@NonNull MyTargetActivity myTargetActivity);

        boolean onActivityBackPressed();

        void onActivityCreate(@NonNull MyTargetActivity myTargetActivity, @NonNull Intent intent, @NonNull FrameLayout frameLayout);

        void onActivityDestroy();

        boolean onActivityOptionsItemSelected(@NonNull MenuItem menuItem);

        void onActivityPause();

        void onActivityResume();

        void onActivityStart();

        void onActivityStop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    final class a extends FrameLayout {
        private final View a;
        private final View b;
        private final View c;
        private final View d;

        public a(MyTargetActivity myTargetActivity, Context context) {
            this(myTargetActivity, context, null);
        }

        private void b(FrameLayout frameLayout) {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = 0;
            frameLayout.setLayoutParams(layoutParams);
            addView(frameLayout);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 48);
            layoutParams2.height = 0;
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            this.a.setLayoutParams(layoutParams2);
            addView(this.a);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1, 5);
            layoutParams3.width = 0;
            this.b.setLayoutParams(layoutParams3);
            addView(this.b);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2, 80);
            layoutParams4.height = 0;
            layoutParams4.leftMargin = 0;
            layoutParams4.rightMargin = 0;
            this.c.setLayoutParams(layoutParams4);
            addView(this.c);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1, 3);
            layoutParams5.width = 0;
            this.d.setLayoutParams(layoutParams5);
            addView(this.d);
        }

        public void a() {
            int argb = Color.argb(204, Color.red(-16777216), Color.green(-16777216), Color.blue(-16777216));
            this.a.setBackground(new ColorDrawable(argb));
            this.d.setBackground(new ColorDrawable(argb));
            this.b.setBackground(new ColorDrawable(argb));
            this.c.setBackground(new ColorDrawable(argb));
            if (MyTargetActivity.this.d != null) {
                float red = Color.red(argb);
                float green = Color.green(argb);
                float blue = Color.blue(argb);
                if (16256.25f < (red * red * 0.299f) + (green * green * 0.587f) + (blue * blue * 0.114f)) {
                    MyTargetActivity.this.d.setSystemBarsAppearance(8, 8);
                    MyTargetActivity.this.d.setSystemBarsAppearance(16, 16);
                } else {
                    MyTargetActivity.this.d.setSystemBarsAppearance(0, 8);
                    MyTargetActivity.this.d.setSystemBarsAppearance(0, 16);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent me) {
            DetectTouchUtils.viewOnTouch(h.r, this, me);
            return super.dispatchTouchEvent(me);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (1 == 0) {
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }

        public a(MyTargetActivity myTargetActivity, Context context, AttributeSet attributeSet) {
            this(myTargetActivity, context, attributeSet, 0);
        }

        public a(MyTargetActivity myTargetActivity, Context context, AttributeSet attributeSet, int i) {
            this(context, attributeSet, i, 0);
        }

        public a(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
            this.a = new View(getContext());
            this.b = new View(getContext());
            this.c = new View(getContext());
            this.d = new View(getContext());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(final FrameLayout frameLayout) {
            b(frameLayout);
            pi.a(this, new e1() { // from class: com.my.target.common.MyTargetActivity$a$$ExternalSyntheticLambda0
                @Override // com.my.target.e1
                public final Object apply(Object obj, Object obj2) {
                    WindowInsets a;
                    a = MyTargetActivity.a.this.a(frameLayout, (View) obj, (WindowInsets) obj2);
                    return a;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ WindowInsets a(FrameLayout frameLayout, View view, WindowInsets windowInsets) {
            WindowInsets windowInsets2;
            oi a = pi.a(windowInsets);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
            layoutParams.width = a.c;
            this.b.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
            layoutParams2.height = a.d;
            layoutParams2.leftMargin = Math.max(a.a, 0);
            layoutParams2.rightMargin = Math.max(a.c, 0);
            this.c.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            layoutParams3.width = a.a;
            this.d.setLayoutParams(layoutParams3);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.a.getLayoutParams();
            layoutParams4.height = a.b;
            layoutParams4.leftMargin = Math.max(a.a, 0);
            layoutParams4.rightMargin = Math.max(a.c, 0);
            this.a.setLayoutParams(layoutParams4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams5.topMargin = a.b;
            layoutParams5.leftMargin = a.a;
            layoutParams5.rightMargin = a.c;
            layoutParams5.bottomMargin = a.d;
            frameLayout.setLayoutParams(layoutParams5);
            FrameLayout frameLayout2 = MyTargetActivity.this.b;
            if (frameLayout2 != null) {
                frameLayout2.dispatchApplyWindowInsets(windowInsets);
            }
            view.invalidate();
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.r, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowInsetsController insetsController;
        super.onAttachedToWindow();
        if (this.a != null) {
            if (pi.a(getApplicationInfo())) {
                getWindow().setNavigationBarContrastEnforced(false);
                insetsController = getWindow().getInsetsController();
                this.d = insetsController;
                a aVar = this.c;
                if (aVar != null) {
                    aVar.a();
                }
            }
            this.a.onActivityAttach(this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ActivityEngine activityEngine2 = this.a;
        if (activityEngine2 == null || activityEngine2.onActivityBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        ActivityEngine activityEngine2 = activityEngine;
        this.a = activityEngine2;
        activityEngine = null;
        if (activityEngine2 == null || intent == null) {
            finish();
            return;
        }
        this.b = new FrameLayout(this);
        if (pi.a(getApplicationInfo())) {
            a aVar = new a(this, this);
            this.c = aVar;
            aVar.a(this.b);
        }
        this.a.onActivityCreate(this, intent, this.b);
        View view = this.c;
        if (view == null) {
            view = this.b;
        }
        setContentView(view);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ActivityEngine activityEngine2 = this.a;
        if (activityEngine2 != null) {
            activityEngine2.onActivityDestroy();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.d = null;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        ActivityEngine activityEngine2 = this.a;
        if (activityEngine2 == null || !activityEngine2.onActivityOptionsItemSelected(menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        ActivityEngine activityEngine2 = this.a;
        if (activityEngine2 != null) {
            activityEngine2.onActivityPause();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        ActivityEngine activityEngine2 = this.a;
        if (activityEngine2 != null) {
            activityEngine2.onActivityResume();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        ActivityEngine activityEngine2 = this.a;
        if (activityEngine2 != null) {
            activityEngine2.onActivityStart();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        ActivityEngine activityEngine2 = this.a;
        if (activityEngine2 != null) {
            activityEngine2.onActivityStop();
        }
    }
}
