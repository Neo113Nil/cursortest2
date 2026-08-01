package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class v30 extends ss implements SubMenu {
    public final vs A;
    public final ss z;

    public v30(Context context, ss ssVar, vs vsVar) {
        super(context);
        this.z = ssVar;
        this.A = vsVar;
    }

    @Override // defpackage.ss
    public final boolean d(vs vsVar) {
        return this.z.d(vsVar);
    }

    @Override // defpackage.ss
    public final boolean e(ss ssVar, MenuItem menuItem) {
        return super.e(ssVar, menuItem) || this.z.e(ssVar, menuItem);
    }

    @Override // defpackage.ss
    public final boolean f(vs vsVar) {
        return this.z.f(vsVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.ss
    public final String j() {
        vs vsVar = this.A;
        int i = vsVar != null ? vsVar.a : 0;
        if (i == 0) {
            return null;
        }
        return n20.e("android:menu:actionviewstates:", i);
    }

    @Override // defpackage.ss
    public final ss k() {
        return this.z.k();
    }

    @Override // defpackage.ss
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.ss
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.ss
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.ss, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.ss, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
