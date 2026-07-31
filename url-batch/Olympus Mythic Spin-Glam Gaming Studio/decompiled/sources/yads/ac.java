package yads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class ac extends vb2 {
    public final ec k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(Activity activity, hb hbVar) {
        super(activity, null, null, 62);
        new tg0();
        new wg1();
        ec ecVar = new ec(new tb(activity), hbVar);
        this.k = ecVar;
        if (StringsKt.equals("Xiaomi", Build.MANUFACTURER, true)) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(ecVar);
    }

    @Override // yads.vb2, yads.r01
    public final void a(Context context, String str) {
        this.k.a(str);
    }

    @Override // yads.vb2
    public final void d() {
    }

    @Override // yads.vb2, yads.oo, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setAdtuneWebViewListener(@NotNull gc gcVar) {
        this.k.e = gcVar;
    }
}
