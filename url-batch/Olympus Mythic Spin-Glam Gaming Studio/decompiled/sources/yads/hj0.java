package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes6.dex */
public final class hj0 implements DivTypefaceProvider {
    public final Context a;
    public final Lazy b;

    public hj0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = LazyKt.lazy(new gj0(this));
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface typeface;
        wv0 wv0Var = (wv0) this.b.getValue();
        return (wv0Var == null || (typeface = wv0Var.d) == null) ? Typeface.DEFAULT_BOLD : typeface;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        wv0 wv0Var = (wv0) this.b.getValue();
        if (wv0Var != null) {
            return wv0Var.a;
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        wv0 wv0Var = (wv0) this.b.getValue();
        if (wv0Var != null) {
            return wv0Var.c;
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        wv0 wv0Var = (wv0) this.b.getValue();
        if (wv0Var != null) {
            return wv0Var.b;
        }
        return null;
    }
}
