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
public final class C0160o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0161p f2712A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2713B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2715a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2716b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2717c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2718e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2719f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2720g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2721j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2723l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0158m f2725n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0145E f2726o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2727p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2728q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2729r;

    /* renamed from: y, reason: collision with root package name */
    public int f2736y;

    /* renamed from: z, reason: collision with root package name */
    public View f2737z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2722k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2724m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2730s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2731t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2732u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2733v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2734w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2735x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2714C = false;

    public C0160o(MenuC0158m menuC0158m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2725n = menuC0158m;
        this.f2715a = i2;
        this.f2716b = i;
        this.f2717c = i3;
        this.d = i4;
        this.f2718e = charSequence;
        this.f2736y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0161p a() {
        return this.f2712A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p) {
        this.f2737z = null;
        this.f2712A = actionProviderVisibilityListenerC0161p;
        this.f2725n.p(true);
        ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p2 = this.f2712A;
        if (actionProviderVisibilityListenerC0161p2 != null) {
            actionProviderVisibilityListenerC0161p2.f2738a = new B0.d(28, this);
            actionProviderVisibilityListenerC0161p2.f2739b.setVisibilityListener(actionProviderVisibilityListenerC0161p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2736y & 8) == 0) {
            return false;
        }
        if (this.f2737z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2713B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2725n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2734w && (this.f2732u || this.f2733v)) {
            drawable = drawable.mutate();
            if (this.f2732u) {
                D.a.h(drawable, this.f2730s);
            }
            if (this.f2733v) {
                D.a.i(drawable, this.f2731t);
            }
            this.f2734w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p;
        if ((this.f2736y & 8) == 0) {
            return false;
        }
        if (this.f2737z == null && (actionProviderVisibilityListenerC0161p = this.f2712A) != null) {
            this.f2737z = actionProviderVisibilityListenerC0161p.f2739b.onCreateActionView(this);
        }
        return this.f2737z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2713B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2725n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2735x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2735x |= 32;
        } else {
            this.f2735x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2737z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p = this.f2712A;
        if (actionProviderVisibilityListenerC0161p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0161p.f2739b.onCreateActionView(this);
        this.f2737z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2722k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2721j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2728q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2716b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2723l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2724m;
        if (i == 0) {
            return null;
        }
        Drawable v2 = q1.l.v(this.f2725n.f2688a, i);
        this.f2724m = 0;
        this.f2723l = v2;
        return d(v2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2730s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2731t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2720g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2715a;
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
        return this.f2717c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2726o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2718e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2719f;
        return charSequence != null ? charSequence : this.f2718e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2729r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2726o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2714C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2735x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2735x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2735x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p = this.f2712A;
        return (actionProviderVisibilityListenerC0161p == null || !actionProviderVisibilityListenerC0161p.f2739b.overridesItemVisibility()) ? (this.f2735x & 8) == 0 : (this.f2735x & 8) == 0 && this.f2712A.f2739b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2737z = view;
        this.f2712A = null;
        if (view != null && view.getId() == -1 && (i = this.f2715a) > 0) {
            view.setId(i);
        }
        MenuC0158m menuC0158m = this.f2725n;
        menuC0158m.f2695k = true;
        menuC0158m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2721j == c2) {
            return this;
        }
        this.f2721j = Character.toLowerCase(c2);
        this.f2725n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2735x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2735x = i2;
        if (i != i2) {
            this.f2725n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2735x;
        if ((i & 4) != 0) {
            MenuC0158m menuC0158m = this.f2725n;
            menuC0158m.getClass();
            ArrayList arrayList = menuC0158m.f2692f;
            int size = arrayList.size();
            menuC0158m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0160o c0160o = (C0160o) arrayList.get(i2);
                if (c0160o.f2716b == this.f2716b && (c0160o.f2735x & 4) != 0 && c0160o.isCheckable()) {
                    boolean z3 = c0160o == this;
                    int i3 = c0160o.f2735x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0160o.f2735x = i4;
                    if (i3 != i4) {
                        c0160o.f2725n.p(false);
                    }
                }
            }
            menuC0158m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2735x = i5;
            if (i != i5) {
                this.f2725n.p(false);
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
            this.f2735x |= 16;
        } else {
            this.f2735x &= -17;
        }
        this.f2725n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2724m = 0;
        this.f2723l = drawable;
        this.f2734w = true;
        this.f2725n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2730s = colorStateList;
        this.f2732u = true;
        this.f2734w = true;
        this.f2725n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2731t = mode;
        this.f2733v = true;
        this.f2734w = true;
        this.f2725n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2720g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2725n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2713B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2727p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2721j = Character.toLowerCase(c3);
        this.f2725n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2736y = i;
        MenuC0158m menuC0158m = this.f2725n;
        menuC0158m.f2695k = true;
        menuC0158m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2718e = charSequence;
        this.f2725n.p(false);
        SubMenuC0145E subMenuC0145E = this.f2726o;
        if (subMenuC0145E != null) {
            subMenuC0145E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2719f = charSequence;
        this.f2725n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2735x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2735x = i2;
        if (i != i2) {
            MenuC0158m menuC0158m = this.f2725n;
            menuC0158m.h = true;
            menuC0158m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2718e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f2728q = charSequence;
        this.f2725n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f2729r = charSequence;
        this.f2725n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2721j == c2 && this.f2722k == i) {
            return this;
        }
        this.f2721j = Character.toLowerCase(c2);
        this.f2722k = KeyEvent.normalizeMetaState(i);
        this.f2725n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2725n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2721j = Character.toLowerCase(c3);
        this.f2722k = KeyEvent.normalizeMetaState(i2);
        this.f2725n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2723l = null;
        this.f2724m = i;
        this.f2734w = true;
        this.f2725n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2725n.f2688a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2725n.f2688a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2737z = inflate;
        this.f2712A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2715a) > 0) {
            inflate.setId(i2);
        }
        MenuC0158m menuC0158m = this.f2725n;
        menuC0158m.f2695k = true;
        menuC0158m.p(true);
        return this;
    }
}
