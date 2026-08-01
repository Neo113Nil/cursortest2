package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0186B;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3064a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0175a f3065b;

    public e(Context context, AbstractC0175a abstractC0175a) {
        this.f3064a = context;
        this.f3065b = abstractC0175a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f3065b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f3065b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0186B(this.f3064a, this.f3065b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f3065b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f3065b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f3065b.f3053a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f3065b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f3065b.f3054b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f3065b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f3065b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f3065b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f3065b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f3065b.f3053a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f3065b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f3065b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f3065b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f3065b.n(i);
    }
}
