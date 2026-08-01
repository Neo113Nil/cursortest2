package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0152B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2561a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0148a f2562b;

    public e(Context context, AbstractC0148a abstractC0148a) {
        this.f2561a = context;
        this.f2562b = abstractC0148a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2562b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2562b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0152B(this.f2561a, this.f2562b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2562b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2562b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2562b.f2550a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2562b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2562b.f2551b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2562b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2562b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2562b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2562b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2562b.f2550a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2562b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2562b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2562b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2562b.n(i);
    }
}
