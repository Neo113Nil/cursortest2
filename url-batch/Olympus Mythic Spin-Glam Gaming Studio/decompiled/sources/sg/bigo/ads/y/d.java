package sg.bigo.ads.y;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.g;

/* loaded from: classes15.dex */
public abstract class d<T extends Ad, U extends sg.bigo.ads.api.core.b> extends sg.bigo.ads.d.d<T, U> {
    private Integer A;
    boolean M;
    public Integer N;
    private boolean z;

    public d(@NonNull g gVar) {
        super(gVar);
        this.z = false;
        this.M = false;
    }

    @Nullable
    public final Integer K() {
        if (L()) {
            return null;
        }
        return this.A;
    }

    public final boolean L() {
        return !this.z;
    }

    public final void a(final Bitmap bitmap, final int i) {
        if (L() || this.M || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.M = true;
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.y.d.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (i == 1) {
                        d.this.N = sg.bigo.ads.bv.b.a(bitmap);
                    } else {
                        d.this.A = sg.bigo.ads.bv.b.a(bitmap);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void b(boolean z) {
        this.z = z;
    }
}
