package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212a implements K.a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2962a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2964c;

    public C0212a(ActionBarContextView actionBarContextView) {
        this.f2964c = actionBarContextView;
    }

    @Override // K.a0
    public final void a() {
        if (this.f2962a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2964c;
        actionBarContextView.f1144f = null;
        super/*android.view.View*/.setVisibility(this.f2963b);
    }

    @Override // K.a0
    public final void d() {
        this.f2962a = true;
    }

    @Override // K.a0
    public final void g() {
        super/*android.view.View*/.setVisibility(0);
        this.f2962a = false;
    }
}
