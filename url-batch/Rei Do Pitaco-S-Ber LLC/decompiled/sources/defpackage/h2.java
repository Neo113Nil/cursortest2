package defpackage;

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
import com.ionia.reidopitaco.libya.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class h2 extends rb implements DialogInterface, e3 {
    public c4 j;
    public final d4 k;
    public final f2 l;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [d4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h2(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        int h = h(contextThemeWrapper, i);
        if (h == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = h;
        }
        this.k = new xo() { // from class: d4
            @Override // defpackage.xo
            public final boolean b(KeyEvent keyEvent) {
                return h2.this.j(keyEvent);
            }
        };
        o3 f = f();
        if (h == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            h = typedValue2.resourceId;
        }
        ((c4) f).X = h;
        f.c();
        this.l = new f2(getContext(), this, getWindow());
    }

    public static int h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.rb, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        c4 c4Var = (c4) f();
        c4Var.v();
        ((ViewGroup) c4Var.E.findViewById(android.R.id.content)).addView(view, layoutParams);
        c4Var.r.a(c4Var.q.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return vv.n(this.k, getWindow().getDecorView(), this, keyEvent);
    }

    public final o3 f() {
        if (this.j == null) {
            m3 m3Var = o3.f;
            this.j = new c4(getContext(), getWindow(), this, this);
        }
        return this.j;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        c4 c4Var = (c4) f();
        c4Var.v();
        return c4Var.q.findViewById(i);
    }

    public final void g(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().c();
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().k(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c4 c4Var = (c4) f();
        if (c4Var.s != null) {
            c4Var.z();
            c4Var.s.getClass();
            c4Var.A(0);
        }
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.rb, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        g(bundle);
        f2 f2Var = this.l;
        f2Var.b.setContentView(f2Var.q);
        Context context = f2Var.a;
        Window window = f2Var.c;
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
        ViewGroup a = f2.a(findViewById6, findViewById3);
        ViewGroup a2 = f2.a(findViewById7, findViewById4);
        ViewGroup a3 = f2.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        f2Var.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        f2Var.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a2.findViewById(android.R.id.message);
        f2Var.m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            f2Var.i.removeView(f2Var.m);
            if (f2Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) f2Var.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(f2Var.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(f2Var.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a2.setVisibility(8);
            }
        }
        Button button = (Button) a3.findViewById(android.R.id.button1);
        f2Var.f = button;
        v0 v0Var = f2Var.w;
        button.setOnClickListener(v0Var);
        boolean isEmpty = TextUtils.isEmpty(null);
        Button button2 = f2Var.f;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            f2Var.f.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) a3.findViewById(android.R.id.button2);
        f2Var.g = button3;
        button3.setOnClickListener(v0Var);
        boolean isEmpty2 = TextUtils.isEmpty(null);
        Button button4 = f2Var.g;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            f2Var.g.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) a3.findViewById(android.R.id.button3);
        f2Var.h = button5;
        button5.setOnClickListener(v0Var);
        boolean isEmpty3 = TextUtils.isEmpty(null);
        Button button6 = f2Var.h;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            f2Var.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = f2Var.f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = f2Var.g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = f2Var.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a3.setVisibility(8);
        }
        if (f2Var.n != null) {
            a.addView(f2Var.n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            f2Var.k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(f2Var.d) || !f2Var.u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                f2Var.k.setVisibility(8);
                a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                f2Var.l = textView2;
                textView2.setText(f2Var.d);
                Drawable drawable = f2Var.j;
                if (drawable != null) {
                    f2Var.k.setImageDrawable(drawable);
                } else {
                    f2Var.l.setPadding(f2Var.k.getPaddingLeft(), f2Var.k.getPaddingTop(), f2Var.k.getPaddingRight(), f2Var.k.getPaddingBottom());
                    f2Var.k.setVisibility(8);
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
            NestedScrollView nestedScrollView2 = f2Var.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = f2Var.e != null ? a.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = f2Var.e;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.g);
        }
        if (!z) {
            View view = f2Var.e;
            if (view == null) {
                view = f2Var.i;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = f80.a;
                view.setScrollIndicators(i2 | i3, 3);
                if (findViewById11 != null) {
                    a2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = f2Var.e;
        if (alertController$RecycleListView2 == null || (listAdapter = f2Var.o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = f2Var.p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.l.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.l.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.rb, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c4 c4Var = (c4) f();
        c4Var.z();
        ca0 ca0Var = c4Var.s;
        if (ca0Var != null) {
            ca0Var.t = false;
            w80 w80Var = ca0Var.s;
            if (w80Var != null) {
                w80Var.a();
            }
        }
    }

    @Override // defpackage.rb, android.app.Dialog
    public final void setContentView(int i) {
        d();
        f().h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().k(getContext().getString(i));
    }

    @Override // defpackage.rb, android.app.Dialog
    public final void setContentView(View view) {
        d();
        f().i(view);
    }

    @Override // defpackage.rb, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        f().j(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        f2 f2Var = this.l;
        f2Var.d = charSequence;
        TextView textView = f2Var.l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
