package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198a implements K.d0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2966a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2968c;

    public C0198a(ActionBarContextView actionBarContextView) {
        this.f2968c = actionBarContextView;
    }

    @Override // K.d0
    public final void a() {
        if (this.f2966a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2968c;
        actionBarContextView.f1289f = null;
        super/*android.view.View*/.setVisibility(this.f2967b);
    }

    @Override // K.d0
    public final void b() {
        this.f2966a = true;
    }

    @Override // K.d0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2966a = false;
    }
}
