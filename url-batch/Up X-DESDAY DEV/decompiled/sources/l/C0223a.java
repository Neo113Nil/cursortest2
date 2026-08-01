package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223a implements K.b0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2937a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2939c;

    public C0223a(ActionBarContextView actionBarContextView) {
        this.f2939c = actionBarContextView;
    }

    @Override // K.b0
    public final void a() {
        if (this.f2937a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2939c;
        actionBarContextView.f1142f = null;
        super/*android.view.View*/.setVisibility(this.f2938b);
    }

    @Override // K.b0
    public final void b() {
        this.f2937a = true;
    }

    @Override // K.b0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2937a = false;
    }
}
