package o;

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
import com.devanos.nilufar.usmonova.R;
import java.util.WeakHashMap;

/* renamed from: o.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC1209i2 extends DialogC0498Tc implements DialogInterface, N4 {
    public LayoutInflaterFactory2C1213i5 k;
    public final C1277j5 l;
    public final C1077g2 m;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.j5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC1209i2(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        int f = f(contextThemeWrapper, i);
        if (f == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = f;
        }
        this.l = new InterfaceC0130Ex() { // from class: o.j5
            @Override // o.InterfaceC0130Ex
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogInterfaceC1209i2.this.h(keyEvent);
            }
        };
        V4 c = c();
        if (f == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            f = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C1213i5) c).a0 = f;
        c.d();
        this.m = new C1077g2(getContext(), this, getWindow());
    }

    public static int f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // o.DialogC0498Tc, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) c();
        layoutInflaterFactory2C1213i5.v();
        ((ViewGroup) layoutInflaterFactory2C1213i5.H.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1213i5.t.a(layoutInflaterFactory2C1213i5.s.getCallback());
    }

    public final V4 c() {
        if (this.k == null) {
            U4 u4 = V4.h;
            this.k = new LayoutInflaterFactory2C1213i5(getContext(), getWindow(), this, this);
        }
        return this.k;
    }

    public final void d() {
        ON.q(getWindow().getDecorView(), this);
        AbstractC1494mO.k(getWindow().getDecorView(), this);
        AbstractC0772bO.y(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC1305jX.q(this.l, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) c();
        layoutInflaterFactory2C1213i5.v();
        return layoutInflaterFactory2C1213i5.s.findViewById(i);
    }

    public final void g(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().k(charSequence);
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().b();
    }

    @Override // o.DialogC0498Tc, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        e(bundle);
        C1077g2 c1077g2 = this.m;
        c1077g2.b.setContentView(c1077g2.q);
        Context context = c1077g2.a;
        Window window = c1077g2.c;
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
        ViewGroup a = C1077g2.a(findViewById6, findViewById3);
        ViewGroup a2 = C1077g2.a(findViewById7, findViewById4);
        ViewGroup a3 = C1077g2.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c1077g2.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c1077g2.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a2.findViewById(android.R.id.message);
        c1077g2.m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c1077g2.i.removeView(c1077g2.m);
            if (c1077g2.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c1077g2.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c1077g2.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c1077g2.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a2.setVisibility(8);
            }
        }
        Button button = (Button) a3.findViewById(android.R.id.button1);
        c1077g2.f = button;
        ViewOnClickListenerC1207i1 viewOnClickListenerC1207i1 = c1077g2.w;
        button.setOnClickListener(viewOnClickListenerC1207i1);
        if (TextUtils.isEmpty(null)) {
            c1077g2.f.setVisibility(8);
            i = 0;
        } else {
            c1077g2.f.setText((CharSequence) null);
            c1077g2.f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a3.findViewById(android.R.id.button2);
        c1077g2.g = button2;
        button2.setOnClickListener(viewOnClickListenerC1207i1);
        if (TextUtils.isEmpty(null)) {
            c1077g2.g.setVisibility(8);
        } else {
            c1077g2.g.setText((CharSequence) null);
            c1077g2.g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a3.findViewById(android.R.id.button3);
        c1077g2.h = button3;
        button3.setOnClickListener(viewOnClickListenerC1207i1);
        if (TextUtils.isEmpty(null)) {
            c1077g2.h.setVisibility(8);
        } else {
            c1077g2.h.setText((CharSequence) null);
            c1077g2.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c1077g2.f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c1077g2.g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c1077g2.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a3.setVisibility(8);
        }
        if (c1077g2.n != null) {
            a.addView(c1077g2.n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c1077g2.k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c1077g2.d) || !c1077g2.u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c1077g2.k.setVisibility(8);
                a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c1077g2.l = textView2;
                textView2.setText(c1077g2.d);
                Drawable drawable = c1077g2.j;
                if (drawable != null) {
                    c1077g2.k.setImageDrawable(drawable);
                } else {
                    c1077g2.l.setPadding(c1077g2.k.getPaddingLeft(), c1077g2.k.getPaddingTop(), c1077g2.k.getPaddingRight(), c1077g2.k.getPaddingBottom());
                    c1077g2.k.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (a == null || a.getVisibility() == 8) ? 0 : 1;
        boolean z2 = a3.getVisibility() != 8;
        if (!z2 && (findViewById = a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c1077g2.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c1077g2.e != null ? a.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c1077g2.e;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.h, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.i);
        }
        if (!z) {
            View view = c1077g2.e;
            if (view == null) {
                view = c1077g2.i;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AZ.a;
                AbstractC1834rZ.d(view, i2 | i3, 3);
                if (findViewById11 != null) {
                    a2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c1077g2.e;
        if (alertController$RecycleListView2 == null || (listAdapter = c1077g2.f166o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c1077g2.p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.m.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.m.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // o.DialogC0498Tc, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) c();
        layoutInflaterFactory2C1213i5.z();
        AbstractC1075g1 abstractC1075g1 = layoutInflaterFactory2C1213i5.v;
        if (abstractC1075g1 != null) {
            abstractC1075g1.m(false);
        }
    }

    @Override // o.N4
    public final B1 onWindowStartingSupportActionMode(A1 a1) {
        return null;
    }

    @Override // o.DialogC0498Tc, android.app.Dialog
    public final void setContentView(int i) {
        d();
        c().h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().k(getContext().getString(i));
    }

    @Override // o.DialogC0498Tc, android.app.Dialog
    public final void setContentView(View view) {
        d();
        c().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        g(charSequence);
        C1077g2 c1077g2 = this.m;
        c1077g2.d = charSequence;
        TextView textView = c1077g2.l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // o.DialogC0498Tc, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        c().j(view, layoutParams);
    }

    @Override // o.N4
    public final void onSupportActionModeFinished(B1 b1) {
    }

    @Override // o.N4
    public final void onSupportActionModeStarted(B1 b1) {
    }
}
