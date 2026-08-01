package defpackage;

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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.ionia.reidopitaco.libya.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class gs<S> extends jf {
    public CharSequence A0;
    public int B0;
    public CharSequence C0;
    public TextView D0;
    public CheckableImageButton E0;
    public ls F0;
    public boolean G0;
    public CharSequence H0;
    public CharSequence I0;
    public final LinkedHashSet l0;
    public final LinkedHashSet m0;
    public int n0;
    public fw o0;
    public v8 p0;
    public as q0;
    public int r0;
    public CharSequence s0;
    public boolean t0;
    public int u0;
    public int v0;
    public CharSequence w0;
    public int x0;
    public CharSequence y0;
    public int z0;

    public gs() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.l0 = new LinkedHashSet();
        this.m0 = new LinkedHashSet();
    }

    public static int I(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b = x60.b();
        b.set(5, 1);
        Calendar a = x60.a(b);
        a.get(2);
        a.get(1);
        int maximum = a.getMaximum(7);
        a.getActualMaximum(5);
        a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean J(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(m60.V(context, R.attr.materialCalendarStyle, as.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // defpackage.jf
    public final Dialog G() {
        Context C = C();
        C();
        int i = this.n0;
        if (i == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(C, i);
        Context context = dialog.getContext();
        this.t0 = J(context, android.R.attr.windowFullscreen);
        this.F0 = new ls(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, jx.r, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.F0.n(context);
        this.F0.r(ColorStateList.valueOf(color));
        this.F0.q(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void H() {
        if (this.k.getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        l8.c();
    }

    @Override // defpackage.jf, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.l0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.jf, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.m0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.jf, defpackage.dk
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.k;
        }
        this.n0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            l8.c();
            return;
        }
        this.p0 = (v8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            l8.c();
            return;
        }
        this.r0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.s0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.u0 = bundle.getInt("INPUT_MODE_KEY");
        this.v0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.w0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.x0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.y0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.z0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.A0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.B0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.C0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.s0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.r0);
        }
        this.H0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.I0 = charSequence;
    }

    @Override // defpackage.dk
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.t0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.t0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.E0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.D0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.E0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.E0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, vv.t(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], vv.t(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.E0.setChecked(this.u0 != 0);
        f80.m(this.E0, null);
        CheckableImageButton checkableImageButton2 = this.E0;
        this.E0.setContentDescription(this.u0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.E0;
        s50.a(this.E0, this.u0 == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.E0.setOnClickListener(new ja(4, this));
        H();
        throw null;
    }

    @Override // defpackage.jf, defpackage.dk
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.n0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        v8 v8Var = this.p0;
        u8 u8Var = new u8();
        long j = v8Var.f.k;
        long j2 = v8Var.g.k;
        u8Var.a = Long.valueOf(v8Var.i.k);
        int i = v8Var.j;
        vd vdVar = v8Var.h;
        as asVar = this.q0;
        qt qtVar = asVar == null ? null : asVar.b0;
        if (qtVar != null) {
            u8Var.a = Long.valueOf(qtVar.k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", vdVar);
        qt b = qt.b(j);
        qt b2 = qt.b(j2);
        vd vdVar2 = (vd) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = u8Var.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new v8(b, b2, vdVar2, l == null ? null : qt.b(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.r0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.s0);
        bundle.putInt("INPUT_MODE_KEY", this.u0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.v0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.w0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.x0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.y0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.A0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.B0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.C0);
    }

    @Override // defpackage.jf, defpackage.dk
    public final void y() {
        fw fwVar;
        super.y();
        Dialog dialog = this.h0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.t0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.F0);
            if (!this.G0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList s = vv.s(findViewById.getBackground());
                Integer valueOf = s != null ? Integer.valueOf(s.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int A = g8.A(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(A);
                }
                k80.a(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                int d = i < 27 ? eb.d(g8.A(context, android.R.attr.navigationBarColor, -16777216), 128) : 0;
                if (i < 35) {
                    window.setStatusBarColor(0);
                }
                if (i < 35) {
                    window.setNavigationBarColor(d);
                }
                boolean z3 = g8.P(0) || g8.P(valueOf.intValue());
                iw iwVar = new iw(window.getDecorView(), 13);
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new hb0(window, iwVar) : i2 >= 30 ? new gb0(window, iwVar) : new eb0(window, iwVar)).d(z3);
                boolean P = g8.P(A);
                if (g8.P(d) || (d == 0 && P)) {
                    z = true;
                }
                iw iwVar2 = new iw(window.getDecorView(), 13);
                int i3 = Build.VERSION.SDK_INT;
                (i3 >= 35 ? new hb0(window, iwVar2) : i3 >= 30 ? new gb0(window, iwVar2) : new eb0(window, iwVar2)).c(z);
                fs fsVar = new fs(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = f80.a;
                x70.c(findViewById, fsVar);
                this.G0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.F0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.h0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ho(dialog2, rect));
        }
        C();
        int i4 = this.n0;
        if (i4 == 0) {
            H();
            throw null;
        }
        dk B = g().B(this.u0 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG");
        fw fwVar2 = B instanceof fw ? (fw) B : null;
        if (fwVar2 == null) {
            if (this.u0 == 1) {
                H();
                v8 v8Var = this.p0;
                ms msVar = new ms();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i4);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", v8Var);
                msVar.F(bundle);
                fwVar = msVar;
            } else {
                H();
                v8 v8Var2 = this.p0;
                as asVar = new as();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i4);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", v8Var2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", v8Var2.i);
                asVar.F(bundle2);
                this.q0 = asVar;
                fwVar = asVar;
            }
            fwVar2 = fwVar;
        }
        this.o0 = fwVar2;
        fwVar2.G(new tg(28));
        this.D0.setText((this.u0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.I0 : this.H0);
        H();
        throw null;
    }

    @Override // defpackage.jf, defpackage.dk
    public final void z() {
        this.o0.Y.clear();
        super.z();
    }
}
