package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.devanos.nilufar.usmonova.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: o.jW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC1304jW implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static ViewOnLongClickListenerC1304jW r;
    public static ViewOnLongClickListenerC1304jW s;
    public final View h;
    public final CharSequence i;
    public final int j;
    public final RunnableC1240iW k;
    public final RunnableC1240iW l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public C1370kW f184o;
    public boolean p;
    public boolean q;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.iW] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.iW] */
    public ViewOnLongClickListenerC1304jW(View view, CharSequence charSequence) {
        final int i = 0;
        this.k = new Runnable(this) { // from class: o.iW
            public final /* synthetic */ ViewOnLongClickListenerC1304jW i;

            {
                this.i = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.i.c(false);
                        break;
                    default:
                        this.i.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.l = new Runnable(this) { // from class: o.iW
            public final /* synthetic */ ViewOnLongClickListenerC1304jW i;

            {
                this.i = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.i.c(false);
                        break;
                    default:
                        this.i.a();
                        break;
                }
            }
        };
        this.h = view;
        this.i = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = JZ.a;
        this.j = Build.VERSION.SDK_INT >= 28 ? HZ.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.q = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(ViewOnLongClickListenerC1304jW viewOnLongClickListenerC1304jW) {
        ViewOnLongClickListenerC1304jW viewOnLongClickListenerC1304jW2 = r;
        if (viewOnLongClickListenerC1304jW2 != null) {
            viewOnLongClickListenerC1304jW2.h.removeCallbacks(viewOnLongClickListenerC1304jW2.k);
        }
        r = viewOnLongClickListenerC1304jW;
        if (viewOnLongClickListenerC1304jW != null) {
            viewOnLongClickListenerC1304jW.h.postDelayed(viewOnLongClickListenerC1304jW.k, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        ViewOnLongClickListenerC1304jW viewOnLongClickListenerC1304jW = s;
        View view = this.h;
        if (viewOnLongClickListenerC1304jW == this) {
            s = null;
            C1370kW c1370kW = this.f184o;
            if (c1370kW != null) {
                View view2 = (View) c1370kW.i;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c1370kW.h).getSystemService("window")).removeView(view2);
                }
                this.f184o = null;
                this.q = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (r == this) {
            b(null);
        }
        view.removeCallbacks(this.l);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.h;
        if (view.isAttachedToWindow()) {
            b(null);
            ViewOnLongClickListenerC1304jW viewOnLongClickListenerC1304jW = s;
            if (viewOnLongClickListenerC1304jW != null) {
                viewOnLongClickListenerC1304jW.a();
            }
            s = this;
            this.p = z;
            Context context = view.getContext();
            C1370kW c1370kW = new C1370kW();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            c1370kW.k = layoutParams;
            c1370kW.l = new Rect();
            c1370kW.m = new int[2];
            c1370kW.n = new int[2];
            c1370kW.h = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            c1370kW.i = inflate;
            c1370kW.j = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(C1370kW.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) c1370kW.i;
            Context context2 = (Context) c1370kW.h;
            this.f184o = c1370kW;
            int i5 = this.m;
            int i6 = this.n;
            boolean z3 = this.p;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) c1370kW.k;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) c1370kW.j).setText(this.i);
            int[] iArr = (int[]) c1370kW.n;
            int[] iArr2 = (int[]) c1370kW.m;
            Rect rect = (Rect) c1370kW.l;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i5 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i6 + dimensionPixelOffset2;
                i = i6 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i7 = i5;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i4 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = i;
                    z2 = z3;
                    i3 = 0;
                    i4 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i4 = 1;
                    i2 = i;
                    z2 = z3;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i8;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams2.x = (i8 + i7) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[i4];
                int i10 = ((i9 + i2) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i10 >= 0) {
                        layoutParams2.y = i10;
                    } else {
                        layoutParams2.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams2.y = i11;
                } else {
                    layoutParams2.y = i10;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.p) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = AZ.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC1240iW runnableC1240iW = this.l;
            view.removeCallbacks(runnableC1240iW);
            view.postDelayed(runnableC1240iW, j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.n) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f184o == null || !this.p) {
            View view2 = this.h;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.q = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f184o == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (!this.q) {
                        int abs = Math.abs(x - this.m);
                        int i = this.j;
                        if (abs <= i) {
                        }
                    }
                    this.m = x;
                    this.n = y;
                    this.q = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.m = view.getWidth() / 2;
        this.n = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
