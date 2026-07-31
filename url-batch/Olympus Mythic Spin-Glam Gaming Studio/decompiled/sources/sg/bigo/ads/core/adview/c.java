package sg.bigo.ads.core.adview;

import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes3.dex */
public abstract class c {

    @NonNull
    public final sg.bigo.ads.api.a<?> a;

    protected c(@NonNull sg.bigo.ads.api.a<?> aVar) {
        this.a = aVar;
    }

    protected final void a(int i) {
        this.a.setTag(Integer.valueOf(i));
    }

    protected void a(View view) {
        v.a(view, this.a, null, -1);
    }

    public boolean a(int i, int i2) {
        return v.a(this.a, i, i2);
    }
}
