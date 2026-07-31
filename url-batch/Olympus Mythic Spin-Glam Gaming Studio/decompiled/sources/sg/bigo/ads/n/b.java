package sg.bigo.ads.n;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.o.b;

/* loaded from: classes5.dex */
public final class b extends sg.bigo.ads.cb.b {
    protected final int a;
    protected final boolean b;

    @Nullable
    protected final Drawable c;

    public b(float f, float f2, float f3, float f4, @Nullable Rect rect, float f5, @Nullable boolean[] zArr, @NonNull b.a aVar) {
        super(f, f2, f3, f4, rect, aVar.b, aVar.c, f5, zArr);
        int i = aVar.b;
        this.a = i;
        boolean z = aVar.a;
        this.b = z;
        if (z) {
            this.c = null;
        } else {
            Drawable a = sg.bigo.ads.common.utils.e.a(f, f2, f3, f4, rect, i);
            this.c = this.n != null ? new LayerDrawable(new Drawable[]{a, this.n}) : a;
        }
    }

    public b(float f, float f2, @NonNull b.a aVar) {
        this(f, f, f, f, null, f2, null, aVar);
    }

    @Nullable
    public final Drawable a() {
        return this.c;
    }
}
