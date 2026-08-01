package com.google.android.material.datepicker;

import K.A0;
import K.B0;
import K.H;
import K.T;
import K.e0;
import R0.ViewOnClickListenerC0027a;
import Y.DialogInterfaceOnCancelListenerC0045m;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.football.transfertrivia.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import u0.AbstractC0338a;

/* loaded from: classes.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0045m {

    /* renamed from: A0, reason: collision with root package name */
    public O0.g f1909A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1910B0;

    /* renamed from: C0, reason: collision with root package name */
    public CharSequence f1911C0;

    /* renamed from: D0, reason: collision with root package name */
    public CharSequence f1912D0;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f1913g0;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f1914h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1915i0;

    /* renamed from: j0, reason: collision with root package name */
    public t f1916j0;

    /* renamed from: k0, reason: collision with root package name */
    public b f1917k0;

    /* renamed from: l0, reason: collision with root package name */
    public k f1918l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1919m0;
    public CharSequence n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1920o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f1921p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1922q0;
    public CharSequence r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1923s0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f1924t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1925u0;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f1926v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f1927w0;

    /* renamed from: x0, reason: collision with root package name */
    public CharSequence f1928x0;

    /* renamed from: y0, reason: collision with root package name */
    public TextView f1929y0;

    /* renamed from: z0, reason: collision with root package name */
    public CheckableImageButton f1930z0;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1913g0 = new LinkedHashSet();
        this.f1914h0 = new LinkedHashSet();
    }

    public static int I(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b2 = w.b();
        b2.set(5, 1);
        Calendar a2 = w.a(b2);
        a2.get(2);
        a2.get(1);
        int maximum = a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean J(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A.c.r0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0045m
    public final Dialog G() {
        Context C2 = C();
        C();
        int i = this.f1915i0;
        if (i == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(C2, i);
        Context context = dialog.getContext();
        this.f1920o0 = J(context, android.R.attr.windowFullscreen);
        this.f1909A0 = new O0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0338a.f3792l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f1909A0.h(context);
        this.f1909A0.j(ColorStateList.valueOf(color));
        O0.g gVar = this.f1909A0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = T.f372a;
        gVar.i(H.i(decorView));
        return dialog;
    }

    public final void H() {
        if (this.f1122f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0045m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1913g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0045m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1914h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1105E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0045m, Y.AbstractComponentCallbacksC0049q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1122f;
        }
        this.f1915i0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1917k0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1919m0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.n0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1921p0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1922q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.r0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1923s0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1924t0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1925u0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1926v0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f1927w0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1928x0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.n0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.f1919m0);
        }
        this.f1911C0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f1912D0 = charSequence;
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f1920o0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f1920o0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = T.f372a;
        textView.setAccessibilityLiveRegion(1);
        this.f1930z0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f1929y0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f1930z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1930z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, T.e.w(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], T.e.w(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f1930z0.setChecked(this.f1921p0 != 0);
        T.l(this.f1930z0, null);
        CheckableImageButton checkableImageButton2 = this.f1930z0;
        this.f1930z0.setContentDescription(this.f1921p0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f1930z0.setOnClickListener(new ViewOnClickListenerC0027a(3, this));
        H();
        throw null;
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0045m, Y.AbstractComponentCallbacksC0049q
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1915i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f1917k0;
        a aVar = new a();
        int i = a.f1871b;
        int i2 = a.f1871b;
        long j2 = bVar.f1873a.f1937f;
        long j3 = bVar.f1874b.f1937f;
        aVar.f1872a = Long.valueOf(bVar.d.f1937f);
        k kVar = this.f1918l0;
        o oVar = kVar == null ? null : kVar.f1897W;
        if (oVar != null) {
            aVar.f1872a = Long.valueOf(oVar.f1937f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f1875c);
        o b2 = o.b(j2);
        o b3 = o.b(j3);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f1872a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, l2 == null ? null : o.b(l2.longValue()), bVar.f1876e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1919m0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.n0);
        bundle.putInt("INPUT_MODE_KEY", this.f1921p0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1922q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.r0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1923s0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1924t0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1925u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1926v0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1927w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1928x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y.DialogInterfaceOnCancelListenerC0045m, Y.AbstractComponentCallbacksC0049q
    public final void y() {
        A0 a02;
        A0 a03;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.y();
        Dialog dialog = this.f1086c0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f1920o0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f1909A0);
            if (!this.f1910B0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList H2 = A.c.H(findViewById.getBackground());
                Integer valueOf = H2 != null ? Integer.valueOf(H2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int C2 = A.c.C(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(C2);
                }
                if (i >= 30) {
                    e0.a(window, false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                window.getContext();
                int d = i < 27 ? C.a.d(A.c.C(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d);
                boolean z4 = A.c.X(0) || A.c.X(valueOf.intValue());
                O0.e eVar = new O0.e(window.getDecorView(), 3);
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    B0 b02 = new B0(insetsController2, eVar);
                    b02.f359f = window;
                    a02 = b02;
                } else {
                    a02 = new A0(window, eVar);
                }
                a02.t0(z4);
                boolean X2 = A.c.X(C2);
                if (A.c.X(d) || (d == 0 && X2)) {
                    z2 = true;
                }
                O0.e eVar2 = new O0.e(window.getDecorView(), 3);
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    B0 b03 = new B0(insetsController, eVar2);
                    b03.f359f = window;
                    a03 = b03;
                } else {
                    a03 = new A0(window, eVar2);
                }
                a03.s0(z2);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = T.f372a;
                H.u(findViewById, lVar);
                this.f1910B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1909A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView2 = window.getDecorView();
            Dialog dialog2 = this.f1086c0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView2.setOnTouchListener(new F0.a(dialog2, rect));
        }
        C();
        int i2 = this.f1915i0;
        if (i2 == 0) {
            H();
            throw null;
        }
        H();
        b bVar = this.f1917k0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.d);
        kVar.F(bundle);
        this.f1918l0 = kVar;
        t tVar = kVar;
        if (this.f1921p0 == 1) {
            H();
            b bVar2 = this.f1917k0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.F(bundle2);
            tVar = nVar;
        }
        this.f1916j0 = tVar;
        this.f1929y0.setText((this.f1921p0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.f1912D0 : this.f1911C0);
        H();
        throw null;
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0045m, Y.AbstractComponentCallbacksC0049q
    public final void z() {
        this.f1916j0.f1949T.clear();
        super.z();
    }
}
