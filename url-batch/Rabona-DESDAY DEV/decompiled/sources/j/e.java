package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0142B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2558a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0138a f2559b;

    public e(Context context, AbstractC0138a abstractC0138a) {
        this.f2558a = context;
        this.f2559b = abstractC0138a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2559b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2559b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0142B(this.f2558a, this.f2559b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2559b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2559b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2559b.f2547a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2559b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2559b.f2548b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2559b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2559b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2559b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2559b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2559b.f2547a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2559b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2559b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2559b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2559b.n(i);
    }
}
