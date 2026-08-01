package w0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f4091a;

    public C0332b(Chip chip) {
        this.f4091a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C0335e c0335e = this.f4091a.f1619e;
        if (c0335e != null) {
            c0335e.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
