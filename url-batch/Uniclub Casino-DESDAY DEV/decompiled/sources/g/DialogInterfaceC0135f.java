package g;

import K.InterfaceC0010k;
import K.S;
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
import com.fortuneodd.shadegrid.R;
import java.util.WeakHashMap;

/* renamed from: g.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0135f extends a.m implements DialogInterface, InterfaceC0139j {
    public LayoutInflaterFactory2C0122A d;

    /* renamed from: e, reason: collision with root package name */
    public final C0123B f2322e;

    /* renamed from: f, reason: collision with root package name */
    public final C0134e f2323f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC0135f(ContextThemeWrapper contextThemeWrapper, int i) {
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
        this.f2322e = new InterfaceC0010k() { // from class: g.B
            @Override // K.InterfaceC0010k
            public final boolean d(KeyEvent keyEvent) {
                return DialogInterfaceC0135f.this.k(keyEvent);
            }
        };
        o f2 = f();
        if (i3 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i3 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0122A) f2).f2215U = i3;
        f2.c();
        this.f2323f = new C0134e(getContext(), this, getWindow());
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
        LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = (LayoutInflaterFactory2C0122A) f();
        layoutInflaterFactory2C0122A.v();
        ((ViewGroup) layoutInflaterFactory2C0122A.f2197B.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0122A.f2232m.a(layoutInflaterFactory2C0122A.f2231l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return q1.d.n(this.f2322e, getWindow().getDecorView(), this, keyEvent);
    }

    public final o f() {
        if (this.d == null) {
            m mVar = o.f2336a;
            this.d = new LayoutInflaterFactory2C0122A(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = (LayoutInflaterFactory2C0122A) f();
        layoutInflaterFactory2C0122A.v();
        return layoutInflaterFactory2C0122A.f2231l.findViewById(i);
    }

    public final void g() {
        androidx.lifecycle.H.f(getWindow().getDecorView(), this);
        q1.l.p0(getWindow().getDecorView(), this);
        q1.d.M(getWindow().getDecorView(), this);
    }

    public final void h(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().c();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = (LayoutInflaterFactory2C0122A) f();
        if (layoutInflaterFactory2C0122A.f2234o != null) {
            layoutInflaterFactory2C0122A.z();
            layoutInflaterFactory2C0122A.f2234o.getClass();
            layoutInflaterFactory2C0122A.A(0);
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
        C0134e c0134e = this.f2323f;
        c0134e.f2303b.setContentView(c0134e.f2315q);
        Window window = c0134e.f2304c;
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
        ViewGroup a2 = C0134e.a(findViewById6, findViewById3);
        ViewGroup a3 = C0134e.a(findViewById7, findViewById4);
        ViewGroup a4 = C0134e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0134e.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0134e.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(android.R.id.message);
        c0134e.f2311m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0134e.i.removeView(c0134e.f2311m);
            if (c0134e.f2305e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0134e.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0134e.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0134e.f2305e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a3.setVisibility(8);
            }
        }
        Button button = (Button) a4.findViewById(android.R.id.button1);
        c0134e.f2306f = button;
        com.google.android.material.datepicker.j jVar = c0134e.f2321w;
        button.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0134e.f2306f.setVisibility(8);
            i = 0;
        } else {
            c0134e.f2306f.setText((CharSequence) null);
            c0134e.f2306f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a4.findViewById(android.R.id.button2);
        c0134e.f2307g = button2;
        button2.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0134e.f2307g.setVisibility(8);
        } else {
            c0134e.f2307g.setText((CharSequence) null);
            c0134e.f2307g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a4.findViewById(android.R.id.button3);
        c0134e.h = button3;
        button3.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0134e.h.setVisibility(8);
        } else {
            c0134e.h.setText((CharSequence) null);
            c0134e.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0134e.f2302a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0134e.f2306f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0134e.f2307g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0134e.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a4.setVisibility(8);
        }
        if (c0134e.f2312n != null) {
            a2.addView(c0134e.f2312n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0134e.f2309k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0134e.d) || !c0134e.f2319u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0134e.f2309k.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0134e.f2310l = textView2;
                textView2.setText(c0134e.d);
                Drawable drawable = c0134e.f2308j;
                if (drawable != null) {
                    c0134e.f2309k.setImageDrawable(drawable);
                } else {
                    c0134e.f2310l.setPadding(c0134e.f2309k.getPaddingLeft(), c0134e.f2309k.getPaddingTop(), c0134e.f2309k.getPaddingRight(), c0134e.f2309k.getPaddingBottom());
                    c0134e.f2309k.setVisibility(8);
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
            NestedScrollView nestedScrollView2 = c0134e.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0134e.f2305e != null ? a2.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0134e.f2305e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1107a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1108b);
            }
        }
        if (!z2) {
            View view = c0134e.f2305e;
            if (view == null) {
                view = c0134e.i;
            }
            if (view != null) {
                int i3 = (z3 ? 2 : 0) | i2;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = S.f360a;
                K.H.d(view, i3, 3);
                if (findViewById11 != null) {
                    a3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a3.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0134e.f2305e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0134e.f2313o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0134e.f2314p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2323f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2323f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = (LayoutInflaterFactory2C0122A) f();
        layoutInflaterFactory2C0122A.z();
        K k2 = layoutInflaterFactory2C0122A.f2234o;
        if (k2 != null) {
            k2.f2289x = false;
            j.j jVar = k2.f2288w;
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
        C0134e c0134e = this.f2323f;
        c0134e.d = charSequence;
        TextView textView = c0134e.f2310l;
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
