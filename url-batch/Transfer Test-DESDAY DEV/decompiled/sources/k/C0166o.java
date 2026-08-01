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
public final class C0166o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0167p f2780A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2781B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2784b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2785c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2786e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2787f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2788g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2789j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2791l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0164m f2793n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0151E f2794o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2795p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2796q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2797r;

    /* renamed from: y, reason: collision with root package name */
    public int f2804y;

    /* renamed from: z, reason: collision with root package name */
    public View f2805z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2790k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2792m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2798s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2799t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2800u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2801v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2802w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2803x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2782C = false;

    public C0166o(MenuC0164m menuC0164m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2793n = menuC0164m;
        this.f2783a = i2;
        this.f2784b = i;
        this.f2785c = i3;
        this.d = i4;
        this.f2786e = charSequence;
        this.f2804y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0167p a() {
        return this.f2780A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0167p actionProviderVisibilityListenerC0167p) {
        this.f2805z = null;
        this.f2780A = actionProviderVisibilityListenerC0167p;
        this.f2793n.p(true);
        ActionProviderVisibilityListenerC0167p actionProviderVisibilityListenerC0167p2 = this.f2780A;
        if (actionProviderVisibilityListenerC0167p2 != null) {
            actionProviderVisibilityListenerC0167p2.f2806a = new A0.h(25, this);
            actionProviderVisibilityListenerC0167p2.f2807b.setVisibilityListener(actionProviderVisibilityListenerC0167p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2804y & 8) == 0) {
            return false;
        }
        if (this.f2805z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2781B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2793n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2802w && (this.f2800u || this.f2801v)) {
            drawable = drawable.mutate();
            if (this.f2800u) {
                D.a.h(drawable, this.f2798s);
            }
            if (this.f2801v) {
                D.a.i(drawable, this.f2799t);
            }
            this.f2802w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0167p actionProviderVisibilityListenerC0167p;
        if ((this.f2804y & 8) == 0) {
            return false;
        }
        if (this.f2805z == null && (actionProviderVisibilityListenerC0167p = this.f2780A) != null) {
            this.f2805z = actionProviderVisibilityListenerC0167p.f2807b.onCreateActionView(this);
        }
        return this.f2805z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2781B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2793n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2803x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2803x |= 32;
        } else {
            this.f2803x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2805z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0167p actionProviderVisibilityListenerC0167p = this.f2780A;
        if (actionProviderVisibilityListenerC0167p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0167p.f2807b.onCreateActionView(this);
        this.f2805z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2790k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2789j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2796q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2784b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2791l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2792m;
        if (i == 0) {
            return null;
        }
        Drawable w2 = T.e.w(this.f2793n.f2756a, i);
        this.f2792m = 0;
        this.f2791l = w2;
        return d(w2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2798s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2799t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2788g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2783a;
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
        return this.f2785c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2794o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2786e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2787f;
        return charSequence != null ? charSequence : this.f2786e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2797r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2794o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2782C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2803x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2803x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2803x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0167p actionProviderVisibilityListenerC0167p = this.f2780A;
        return (actionProviderVisibilityListenerC0167p == null || !actionProviderVisibilityListenerC0167p.f2807b.overridesItemVisibility()) ? (this.f2803x & 8) == 0 : (this.f2803x & 8) == 0 && this.f2780A.f2807b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2805z = view;
        this.f2780A = null;
        if (view != null && view.getId() == -1 && (i = this.f2783a) > 0) {
            view.setId(i);
        }
        MenuC0164m menuC0164m = this.f2793n;
        menuC0164m.f2763k = true;
        menuC0164m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2789j == c2) {
            return this;
        }
        this.f2789j = Character.toLowerCase(c2);
        this.f2793n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2803x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2803x = i2;
        if (i != i2) {
            this.f2793n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2803x;
        if ((i & 4) != 0) {
            MenuC0164m menuC0164m = this.f2793n;
            menuC0164m.getClass();
            ArrayList arrayList = menuC0164m.f2760f;
            int size = arrayList.size();
            menuC0164m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0166o c0166o = (C0166o) arrayList.get(i2);
                if (c0166o.f2784b == this.f2784b && (c0166o.f2803x & 4) != 0 && c0166o.isCheckable()) {
                    boolean z3 = c0166o == this;
                    int i3 = c0166o.f2803x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0166o.f2803x = i4;
                    if (i3 != i4) {
                        c0166o.f2793n.p(false);
                    }
                }
            }
            menuC0164m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2803x = i5;
            if (i != i5) {
                this.f2793n.p(false);
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
            this.f2803x |= 16;
        } else {
            this.f2803x &= -17;
        }
        this.f2793n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2792m = 0;
        this.f2791l = drawable;
        this.f2802w = true;
        this.f2793n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2798s = colorStateList;
        this.f2800u = true;
        this.f2802w = true;
        this.f2793n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2799t = mode;
        this.f2801v = true;
        this.f2802w = true;
        this.f2793n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2788g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2793n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2781B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2795p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2789j = Character.toLowerCase(c3);
        this.f2793n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2804y = i;
        MenuC0164m menuC0164m = this.f2793n;
        menuC0164m.f2763k = true;
        menuC0164m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2786e = charSequence;
        this.f2793n.p(false);
        SubMenuC0151E subMenuC0151E = this.f2794o;
        if (subMenuC0151E != null) {
            subMenuC0151E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2787f = charSequence;
        this.f2793n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2803x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2803x = i2;
        if (i != i2) {
            MenuC0164m menuC0164m = this.f2793n;
            menuC0164m.h = true;
            menuC0164m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2786e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f2796q = charSequence;
        this.f2793n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f2797r = charSequence;
        this.f2793n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2789j == c2 && this.f2790k == i) {
            return this;
        }
        this.f2789j = Character.toLowerCase(c2);
        this.f2790k = KeyEvent.normalizeMetaState(i);
        this.f2793n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2793n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2789j = Character.toLowerCase(c3);
        this.f2790k = KeyEvent.normalizeMetaState(i2);
        this.f2793n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2791l = null;
        this.f2792m = i;
        this.f2802w = true;
        this.f2793n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2793n.f2756a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2793n.f2756a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2805z = inflate;
        this.f2780A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2783a) > 0) {
            inflate.setId(i2);
        }
        MenuC0164m menuC0164m = this.f2793n;
        menuC0164m.f2763k = true;
        menuC0164m.p(true);
        return this;
    }
}
