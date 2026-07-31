package yads;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.div.DivDataTag;
import com.yandex.div.R;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivData;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class ji0 implements hg0 {
    public final DivData a;
    public final zh0 b;
    public final DivConfiguration c;
    public final mt1 d;
    public final String e;
    public final LifecycleOwner f;

    public ji0(DivData divData, zh0 zh0Var, DivConfiguration divConfiguration, mt1 mt1Var, LifecycleOwner lifecycleOwner, int i) {
        String str = (i & 16) != 0 ? "" : "rootDivkitView";
        this.a = divData;
        this.b = zh0Var;
        this.c = divConfiguration;
        this.d = mt1Var;
        this.e = str;
        this.f = lifecycleOwner;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        try {
            Context context = extendedNativeAdView.getContext();
            DivConfiguration divConfiguration = this.c;
            LifecycleOwner lifecycleOwner = this.f;
            String str = this.e;
            Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, R.style.Div), divConfiguration, 0, lifecycleOwner, 4, null), null, 0, 6, null);
            div2View.setTag(str);
            extendedNativeAdView.addView(div2View);
            div2View.setData(this.a, new DivDataTag(UUID.randomUUID().toString()));
            hh0.a(div2View).a(this.b);
        } catch (Throwable th) {
            boolean z = ob1.a;
            this.d.reportError("Failed to bind DivKit", th);
        }
    }

    @Override // yads.hg0
    public final void c() {
    }
}
