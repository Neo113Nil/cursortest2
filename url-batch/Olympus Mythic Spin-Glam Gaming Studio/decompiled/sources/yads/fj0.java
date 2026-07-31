package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;

/* loaded from: classes14.dex */
public final class fj0 implements DivTypefaceProvider {
    public final pv0 a;

    public fj0(Context context) {
        this.a = new pv0(context.getApplicationContext());
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface a = this.a.b.a(qv0.b);
        return a == null ? DivTypefaceProvider.DEFAULT.getBold() : a;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        Typeface a = this.a.b.a(qv0.c);
        return a == null ? DivTypefaceProvider.DEFAULT.getLight() : a;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        Typeface a = this.a.b.a(qv0.d);
        return a == null ? DivTypefaceProvider.DEFAULT.getMedium() : a;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        Typeface a = this.a.b.a(qv0.e);
        return a == null ? DivTypefaceProvider.DEFAULT.getRegular() : a;
    }
}
