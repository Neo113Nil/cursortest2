package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239a implements K.d0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3395a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f3397c;

    public C0239a(ActionBarContextView actionBarContextView) {
        this.f3397c = actionBarContextView;
    }

    @Override // K.d0
    public final void a() {
        if (this.f3395a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3397c;
        actionBarContextView.f1678f = null;
        super/*android.view.View*/.setVisibility(this.f3396b);
    }

    @Override // K.d0
    public final void d() {
        this.f3395a = true;
    }

    @Override // K.d0
    public final void g() {
        super/*android.view.View*/.setVisibility(0);
        this.f3395a = false;
    }
}
