package k;

import a1.AbstractC0067d;
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
public final class C0204o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0205p f3211A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3212B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3214a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3215b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3216c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3217e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3218f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f3219g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f3220j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3222l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0202m f3224n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0189E f3225o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3226p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3227q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3228r;

    /* renamed from: y, reason: collision with root package name */
    public int f3235y;

    /* renamed from: z, reason: collision with root package name */
    public View f3236z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f3221k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f3223m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f3229s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f3230t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3231u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3232v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3233w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3234x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3213C = false;

    public C0204o(MenuC0202m menuC0202m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3224n = menuC0202m;
        this.f3214a = i2;
        this.f3215b = i;
        this.f3216c = i3;
        this.d = i4;
        this.f3217e = charSequence;
        this.f3235y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0205p a() {
        return this.f3211A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p) {
        this.f3236z = null;
        this.f3211A = actionProviderVisibilityListenerC0205p;
        this.f3224n.p(true);
        ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p2 = this.f3211A;
        if (actionProviderVisibilityListenerC0205p2 != null) {
            actionProviderVisibilityListenerC0205p2.f3237a = new A1.d(28, this);
            actionProviderVisibilityListenerC0205p2.f3238b.setVisibilityListener(actionProviderVisibilityListenerC0205p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3235y & 8) == 0) {
            return false;
        }
        if (this.f3236z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3212B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3224n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f3233w && (this.f3231u || this.f3232v)) {
            drawable = drawable.mutate();
            if (this.f3231u) {
                D.a.h(drawable, this.f3229s);
            }
            if (this.f3232v) {
                D.a.i(drawable, this.f3230t);
            }
            this.f3233w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p;
        if ((this.f3235y & 8) == 0) {
            return false;
        }
        if (this.f3236z == null && (actionProviderVisibilityListenerC0205p = this.f3211A) != null) {
            this.f3236z = actionProviderVisibilityListenerC0205p.f3238b.onCreateActionView(this);
        }
        return this.f3236z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3212B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3224n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f3234x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f3234x |= 32;
        } else {
            this.f3234x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3236z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p = this.f3211A;
        if (actionProviderVisibilityListenerC0205p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0205p.f3238b.onCreateActionView(this);
        this.f3236z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3221k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3220j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3227q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3215b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3222l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f3223m;
        if (i == 0) {
            return null;
        }
        Drawable k2 = AbstractC0067d.k(this.f3224n.f3187a, i);
        this.f3223m = 0;
        this.f3222l = k2;
        return d(k2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3229s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3230t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3219g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3214a;
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
        return this.f3216c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3225o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3217e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3218f;
        return charSequence != null ? charSequence : this.f3217e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3228r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3225o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3213C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3234x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3234x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3234x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p = this.f3211A;
        return (actionProviderVisibilityListenerC0205p == null || !actionProviderVisibilityListenerC0205p.f3238b.overridesItemVisibility()) ? (this.f3234x & 8) == 0 : (this.f3234x & 8) == 0 && this.f3211A.f3238b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f3236z = view;
        this.f3211A = null;
        if (view != null && view.getId() == -1 && (i = this.f3214a) > 0) {
            view.setId(i);
        }
        MenuC0202m menuC0202m = this.f3224n;
        menuC0202m.f3194k = true;
        menuC0202m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f3220j == c2) {
            return this;
        }
        this.f3220j = Character.toLowerCase(c2);
        this.f3224n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f3234x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f3234x = i2;
        if (i != i2) {
            this.f3224n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f3234x;
        if ((i & 4) != 0) {
            MenuC0202m menuC0202m = this.f3224n;
            menuC0202m.getClass();
            ArrayList arrayList = menuC0202m.f3191f;
            int size = arrayList.size();
            menuC0202m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0204o c0204o = (C0204o) arrayList.get(i2);
                if (c0204o.f3215b == this.f3215b && (c0204o.f3234x & 4) != 0 && c0204o.isCheckable()) {
                    boolean z3 = c0204o == this;
                    int i3 = c0204o.f3234x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0204o.f3234x = i4;
                    if (i3 != i4) {
                        c0204o.f3224n.p(false);
                    }
                }
            }
            menuC0202m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f3234x = i5;
            if (i != i5) {
                this.f3224n.p(false);
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
            this.f3234x |= 16;
        } else {
            this.f3234x &= -17;
        }
        this.f3224n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3223m = 0;
        this.f3222l = drawable;
        this.f3233w = true;
        this.f3224n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3229s = colorStateList;
        this.f3231u = true;
        this.f3233w = true;
        this.f3224n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3230t = mode;
        this.f3232v = true;
        this.f3233w = true;
        this.f3224n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3219g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f3224n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3212B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3226p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f3220j = Character.toLowerCase(c3);
        this.f3224n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3235y = i;
        MenuC0202m menuC0202m = this.f3224n;
        menuC0202m.f3194k = true;
        menuC0202m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3217e = charSequence;
        this.f3224n.p(false);
        SubMenuC0189E subMenuC0189E = this.f3225o;
        if (subMenuC0189E != null) {
            subMenuC0189E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3218f = charSequence;
        this.f3224n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f3234x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f3234x = i2;
        if (i != i2) {
            MenuC0202m menuC0202m = this.f3224n;
            menuC0202m.h = true;
            menuC0202m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3217e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f3227q = charSequence;
        this.f3224n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f3228r = charSequence;
        this.f3224n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f3220j == c2 && this.f3221k == i) {
            return this;
        }
        this.f3220j = Character.toLowerCase(c2);
        this.f3221k = KeyEvent.normalizeMetaState(i);
        this.f3224n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f3224n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f3220j = Character.toLowerCase(c3);
        this.f3221k = KeyEvent.normalizeMetaState(i2);
        this.f3224n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3222l = null;
        this.f3223m = i;
        this.f3233w = true;
        this.f3224n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f3224n.f3187a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f3224n.f3187a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f3236z = inflate;
        this.f3211A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f3214a) > 0) {
            inflate.setId(i2);
        }
        MenuC0202m menuC0202m = this.f3224n;
        menuC0202m.f3194k = true;
        menuC0202m.p(true);
        return this;
    }
}
