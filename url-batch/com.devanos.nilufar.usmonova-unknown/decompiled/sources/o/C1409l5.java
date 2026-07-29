package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.l5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1409l5 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static C1409l5 c;
    public VN a;

    public static synchronized C1409l5 a() {
        C1409l5 c1409l5;
        synchronized (C1409l5.class) {
            try {
                if (c == null) {
                    c();
                }
                c1409l5 = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1409l5;
    }

    public static synchronized void c() {
        synchronized (C1409l5.class) {
            if (c == null) {
                C1409l5 c1409l5 = new C1409l5();
                c = c1409l5;
                c1409l5.a = VN.b();
                VN vn = c.a;
                C1343k5 c1343k5 = new C1343k5();
                c1343k5.h = new int[]{2131165260, 2131165258, 2131165184};
                c1343k5.i = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                c1343k5.j = new int[]{2131165257, 2131165259, 2131165201, R.drawable.abc_text_cursor_material, 2131165254, 2131165255, 2131165256};
                c1343k5.k = new int[]{2131165233, R.drawable.abc_cab_background_internal_bg, 2131165232};
                c1343k5.l = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                c1343k5.m = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (vn) {
                    vn.e = c1343k5;
                }
            }
        }
    }

    public static void d(Drawable drawable, C0214Id c0214Id, int[] iArr) {
        PorterDuff.Mode mode = VN.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c0214Id.b;
        if (!z && !c0214Id.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) c0214Id.c : null;
        PorterDuff.Mode mode2 = c0214Id.a ? (PorterDuff.Mode) c0214Id.d : VN.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = VN.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
