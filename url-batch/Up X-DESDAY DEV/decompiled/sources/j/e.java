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
    public final Context f2536a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0138a f2537b;

    public e(Context context, AbstractC0138a abstractC0138a) {
        this.f2536a = context;
        this.f2537b = abstractC0138a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2537b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2537b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0142B(this.f2536a, this.f2537b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2537b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2537b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2537b.f2525a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2537b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2537b.f2526b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2537b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2537b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2537b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2537b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2537b.f2525a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2537b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2537b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2537b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2537b.n(i);
    }
}
