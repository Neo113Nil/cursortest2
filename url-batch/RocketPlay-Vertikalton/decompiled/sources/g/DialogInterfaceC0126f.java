package g;

import K.InterfaceC0018k;
import K.T;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import c1.AbstractC0104b;
import com.luckycounter.drinkwater.R;
import java.util.WeakHashMap;

/* renamed from: g.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0126f extends a.m implements DialogInterface, InterfaceC0130j {
    public z d;

    /* renamed from: e, reason: collision with root package name */
    public final C0113A f2669e;

    /* renamed from: f, reason: collision with root package name */
    public final C0125e f2670f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.A] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC0126f(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        int i3 = i(contextThemeWrapper, i);
        if (i3 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i3;
        }
        this.f2669e = new InterfaceC0018k() { // from class: g.A
            @Override // K.InterfaceC0018k
            public final boolean d(KeyEvent keyEvent) {
                return DialogInterfaceC0126f.this.k(keyEvent);
            }
        };
        n f2 = f();
        if (i3 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i3 = typedValue2.resourceId;
        }
        ((z) f2).f2733T = i3;
        f2.c();
        this.f2670f = new C0125e(getContext(), this, getWindow());
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // a.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z zVar = (z) f();
        zVar.v();
        ((ViewGroup) zVar.f2715A.findViewById(android.R.id.content)).addView(view, layoutParams);
        zVar.f2750m.a(zVar.f2749l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return F1.l.x(this.f2669e, getWindow().getDecorView(), this, keyEvent);
    }

    public final n f() {
        if (this.d == null) {
            androidx.room.A a2 = n.f2680a;
            this.d = new z(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        z zVar = (z) f();
        zVar.v();
        return zVar.f2749l.findViewById(i);
    }

    public final void g() {
        androidx.lifecycle.J.g(getWindow().getDecorView(), this);
        AbstractC0104b.w(getWindow().getDecorView(), this);
        F1.l.g0(getWindow().getDecorView(), this);
    }

    public final void h(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().c();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        z zVar = (z) f();
        if (zVar.f2752o != null) {
            zVar.z();
            zVar.f2752o.getClass();
            zVar.A(0);
        }
    }

    public final void j(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().l(charSequence);
    }

    public final boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // a.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        h(bundle);
        C0125e c0125e = this.f2670f;
        c0125e.f2647b.setContentView(c0125e.f2666x);
        Window window = c0125e.f2648c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a2 = C0125e.a(findViewById6, findViewById3);
        ViewGroup a3 = C0125e.a(findViewById7, findViewById4);
        ViewGroup a4 = C0125e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0125e.f2658p = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0125e.f2658p.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(android.R.id.message);
        c0125e.f2662t = textView;
        if (textView != null) {
            CharSequence charSequence = c0125e.f2649e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c0125e.f2658p.removeView(c0125e.f2662t);
                if (c0125e.f2650f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0125e.f2658p.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(c0125e.f2658p);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(c0125e.f2650f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    a3.setVisibility(8);
                }
            }
        }
        Button button = (Button) a4.findViewById(android.R.id.button1);
        c0125e.f2651g = button;
        com.google.android.material.datepicker.j jVar = c0125e.f2645D;
        button.setOnClickListener(jVar);
        if (TextUtils.isEmpty(c0125e.h)) {
            c0125e.f2651g.setVisibility(8);
            i = 0;
        } else {
            c0125e.f2651g.setText(c0125e.h);
            c0125e.f2651g.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a4.findViewById(android.R.id.button2);
        c0125e.f2652j = button2;
        button2.setOnClickListener(jVar);
        if (TextUtils.isEmpty(c0125e.f2653k)) {
            c0125e.f2652j.setVisibility(8);
        } else {
            c0125e.f2652j.setText(c0125e.f2653k);
            c0125e.f2652j.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a4.findViewById(android.R.id.button3);
        c0125e.f2655m = button3;
        button3.setOnClickListener(jVar);
        if (TextUtils.isEmpty(c0125e.f2656n)) {
            c0125e.f2655m.setVisibility(8);
        } else {
            c0125e.f2655m.setText(c0125e.f2656n);
            c0125e.f2655m.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0125e.f2646a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0125e.f2651g;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0125e.f2652j;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0125e.f2655m;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a4.setVisibility(8);
        }
        if (c0125e.f2663u != null) {
            a2.addView(c0125e.f2663u, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0125e.f2660r = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0125e.d) || !c0125e.f2643B) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0125e.f2660r.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0125e.f2661s = textView2;
                textView2.setText(c0125e.d);
                Drawable drawable = c0125e.f2659q;
                if (drawable != null) {
                    c0125e.f2660r.setImageDrawable(drawable);
                } else {
                    c0125e.f2661s.setPadding(c0125e.f2660r.getPaddingLeft(), c0125e.f2660r.getPaddingTop(), c0125e.f2660r.getPaddingRight(), c0125e.f2660r.getPaddingBottom());
                    c0125e.f2660r.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (a2 == null || a2.getVisibility() == 8) ? 0 : 1;
        boolean z3 = a4.getVisibility() != 8;
        if (!z3 && (findViewById = a3.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c0125e.f2658p;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (c0125e.f2649e == null && c0125e.f2650f == null) ? null : a2.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0125e.f2650f;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1641a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1642b);
            }
        }
        if (!z2) {
            View view = c0125e.f2650f;
            if (view == null) {
                view = c0125e.f2658p;
            }
            if (view != null) {
                int i3 = (z3 ? 2 : 0) | i2;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = T.f633a;
                K.I.d(view, i3, 3);
                if (findViewById11 != null) {
                    a3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a3.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0125e.f2650f;
        if (alertController$RecycleListView2 == null || (listAdapter = c0125e.f2664v) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0125e.f2665w;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2670f.f2658p;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2670f.f2658p;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        z zVar = (z) f();
        zVar.z();
        J j2 = zVar.f2752o;
        if (j2 != null) {
            j2.f2624w = false;
            j.j jVar = j2.f2623v;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // a.m, android.app.Dialog
    public final void setContentView(int i) {
        g();
        f().i(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().l(getContext().getString(i));
    }

    @Override // a.m, android.app.Dialog
    public final void setContentView(View view) {
        g();
        f().j(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        j(charSequence);
        C0125e c0125e = this.f2670f;
        c0125e.d = charSequence;
        TextView textView = c0125e.f2661s;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // a.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        f().k(view, layoutParams);
    }
}
