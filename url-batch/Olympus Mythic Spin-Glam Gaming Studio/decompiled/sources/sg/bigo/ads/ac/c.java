package sg.bigo.ads.ac;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.vungle.ads.internal.protos.Sdk;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MaxWidthMediaView;
import sg.bigo.ads.common.utils.f;

/* loaded from: classes14.dex */
public final class c extends a {
    public c(@NonNull sg.bigo.ads.y.b bVar, @NonNull Context context) {
        super(bVar, context);
        sg.bigo.ads.ak.b.a(20);
    }

    @Override // sg.bigo.ads.ac.a
    public final int a() {
        return R.layout.bigo_ad_native_banner_small;
    }

    @Override // sg.bigo.ads.ac.a
    public final int b() {
        return f.a(this.c, 6);
    }

    @Override // sg.bigo.ads.ac.a
    public final int[] c() {
        return new int[]{f.a(this.c, -24), f.a(this.c, 236)};
    }

    @Override // sg.bigo.ads.ac.a
    public final void d() {
        this.b = new FrameLayout(this.c);
        int a = f.a(this.c, 38);
        int a2 = f.a(this.c, 60);
        MaxWidthMediaView maxWidthMediaView = new MaxWidthMediaView(this.c);
        this.d = maxWidthMediaView;
        maxWidthMediaView.setLayoutParams(new ViewGroup.LayoutParams(-2, a));
        this.d.setMinimumWidth(a);
        ((MaxWidthMediaView) this.d).setMaxWidth(a2);
        this.d.setImageBlurBorder(true);
        this.d.setVisibility(8);
    }

    @Override // sg.bigo.ads.ac.a
    public final int i() {
        return Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
    }

    @Override // sg.bigo.ads.ac.a
    public final int j() {
        return 50;
    }
}
