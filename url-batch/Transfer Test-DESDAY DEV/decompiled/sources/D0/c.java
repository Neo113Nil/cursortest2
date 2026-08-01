package D0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class c extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f141a;

    public c(Chip chip) {
        this.f141a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        f fVar = this.f141a.f1854e;
        if (fVar != null) {
            fVar.getOutline(outline);
        } else {
            outline.setAlpha(RecyclerView.f1570A0);
        }
    }
}
