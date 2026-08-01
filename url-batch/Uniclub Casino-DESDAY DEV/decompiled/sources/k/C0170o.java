package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: k.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0171p f2715A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2716B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2718a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2719b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2720c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2721e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2722f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2723g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2724j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2726l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0168m f2728n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0155E f2729o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2730p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2731q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2732r;

    /* renamed from: y, reason: collision with root package name */
    public int f2739y;

    /* renamed from: z, reason: collision with root package name */
    public View f2740z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2725k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2727m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2733s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2734t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2735u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2736v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2737w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2738x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2717C = false;

    public C0170o(MenuC0168m menuC0168m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2728n = menuC0168m;
        this.f2718a = i2;
        this.f2719b = i;
        this.f2720c = i3;
        this.d = i4;
        this.f2721e = charSequence;
        this.f2739y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0171p a() {
        return this.f2715A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0171p actionProviderVisibilityListenerC0171p) {
        this.f2740z = null;
        this.f2715A = actionProviderVisibilityListenerC0171p;
        this.f2728n.p(true);
        ActionProviderVisibilityListenerC0171p actionProviderVisibilityListenerC0171p2 = this.f2715A;
        if (actionProviderVisibilityListenerC0171p2 != null) {
            actionProviderVisibilityListenerC0171p2.f2741a = new C.g(28, this);
            actionProviderVisibilityListenerC0171p2.f2742b.setVisibilityListener(actionProviderVisibilityListenerC0171p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2739y & 8) == 0) {
            return false;
        }
        if (this.f2740z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2716B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2728n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2737w && (this.f2735u || this.f2736v)) {
            drawable = drawable.mutate();
            if (this.f2735u) {
                D.a.h(drawable, this.f2733s);
            }
            if (this.f2736v) {
                D.a.i(drawable, this.f2734t);
            }
            this.f2737w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0171p actionProviderVisibilityListenerC0171p;
        if ((this.f2739y & 8) == 0) {
            return false;
        }
        if (this.f2740z == null && (actionProviderVisibilityListenerC0171p = this.f2715A) != null) {
            this.f2740z = actionProviderVisibilityListenerC0171p.f2742b.onCreateActionView(this);
        }
        return this.f2740z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2716B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2728n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2738x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2738x |= 32;
        } else {
            this.f2738x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2740z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0171p actionProviderVisibilityListenerC0171p = this.f2715A;
        if (actionProviderVisibilityListenerC0171p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0171p.f2742b.onCreateActionView(this);
        this.f2740z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2725k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2724j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2731q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2719b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2726l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2727m;
        if (i == 0) {
            return null;
        }
        Drawable u2 = q1.d.u(this.f2728n.f2691a, i);
        this.f2727m = 0;
        this.f2726l = u2;
        return d(u2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2733s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2734t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2723g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2718a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2720c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2729o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2721e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2722f;
        return charSequence != null ? charSequence : this.f2721e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2732r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2729o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2717C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2738x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2738x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2738x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0171p actionProviderVisibilityListenerC0171p = this.f2715A;
        return (actionProviderVisibilityListenerC0171p == null || !actionProviderVisibilityListenerC0171p.f2742b.overridesItemVisibility()) ? (this.f2738x & 8) == 0 : (this.f2738x & 8) == 0 && this.f2715A.f2742b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2740z = view;
        this.f2715A = null;
        if (view != null && view.getId() == -1 && (i = this.f2718a) > 0) {
            view.setId(i);
        }
        MenuC0168m menuC0168m = this.f2728n;
        menuC0168m.f2698k = true;
        menuC0168m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2724j == c2) {
            return this;
        }
        this.f2724j = Character.toLowerCase(c2);
        this.f2728n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2738x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2738x = i2;
        if (i != i2) {
            this.f2728n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2738x;
        if ((i & 4) != 0) {
            MenuC0168m menuC0168m = this.f2728n;
            menuC0168m.getClass();
            ArrayList arrayList = menuC0168m.f2695f;
            int size = arrayList.size();
            menuC0168m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0170o c0170o = (C0170o) arrayList.get(i2);
                if (c0170o.f2719b == this.f2719b && (c0170o.f2738x & 4) != 0 && c0170o.isCheckable()) {
                    boolean z3 = c0170o == this;
                    int i3 = c0170o.f2738x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0170o.f2738x = i4;
                    if (i3 != i4) {
                        c0170o.f2728n.p(false);
                    }
                }
            }
            menuC0168m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2738x = i5;
            if (i != i5) {
                this.f2728n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f2738x |= 16;
        } else {
            this.f2738x &= -17;
        }
        this.f2728n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2727m = 0;
        this.f2726l = drawable;
        this.f2737w = true;
        this.f2728n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2733s = colorStateList;
        this.f2735u = true;
        this.f2737w = true;
        this.f2728n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2734t = mode;
        this.f2736v = true;
        this.f2737w = true;
        this.f2728n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2723g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2728n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2716B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2730p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2724j = Character.toLowerCase(c3);
        this.f2728n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2739y = i;
        MenuC0168m menuC0168m = this.f2728n;
        menuC0168m.f2698k = true;
        menuC0168m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2721e = charSequence;
        this.f2728n.p(false);
        SubMenuC0155E subMenuC0155E = this.f2729o;
        if (subMenuC0155E != null) {
            subMenuC0155E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2722f = charSequence;
        this.f2728n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2738x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2738x = i2;
        if (i != i2) {
            MenuC0168m menuC0168m = this.f2728n;
            menuC0168m.h = true;
            menuC0168m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2721e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f2731q = charSequence;
        this.f2728n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f2732r = charSequence;
        this.f2728n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2724j == c2 && this.f2725k == i) {
            return this;
        }
        this.f2724j = Character.toLowerCase(c2);
        this.f2725k = KeyEvent.normalizeMetaState(i);
        this.f2728n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2728n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2724j = Character.toLowerCase(c3);
        this.f2725k = KeyEvent.normalizeMetaState(i2);
        this.f2728n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2726l = null;
        this.f2727m = i;
        this.f2737w = true;
        this.f2728n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2728n.f2691a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2728n.f2691a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2740z = inflate;
        this.f2715A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2718a) > 0) {
            inflate.setId(i2);
        }
        MenuC0168m menuC0168m = this.f2728n;
        menuC0168m.f2698k = true;
        menuC0168m.p(true);
        return this;
    }
}
