package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0148B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2633a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0144a f2634b;

    public e(Context context, AbstractC0144a abstractC0144a) {
        this.f2633a = context;
        this.f2634b = abstractC0144a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2634b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2634b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0148B(this.f2633a, this.f2634b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2634b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2634b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2634b.f2622a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2634b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2634b.f2623b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2634b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2634b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2634b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2634b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2634b.f2622a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2634b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2634b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2634b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2634b.l(i);
    }
}
