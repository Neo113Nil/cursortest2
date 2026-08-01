package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222a implements K.b0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2953a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2955c;

    public C0222a(ActionBarContextView actionBarContextView) {
        this.f2955c = actionBarContextView;
    }

    @Override // K.b0
    public final void a() {
        if (this.f2953a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2955c;
        actionBarContextView.f1139f = null;
        super/*android.view.View*/.setVisibility(this.f2954b);
    }

    @Override // K.b0
    public final void b() {
        this.f2953a = true;
    }

    @Override // K.b0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2953a = false;
    }
}
