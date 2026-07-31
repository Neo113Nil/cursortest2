package yads;

import android.content.Context;
import android.os.Build;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class ub extends vb2 {
    public final wb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(@NotNull Context context) {
        super(context, null, null, 62);
        new tg0();
        new wg1();
        wb wbVar = new wb(new db2(context));
        this.k = wbVar;
        if (StringsKt.equals("Xiaomi", Build.MANUFACTURER, true)) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(wbVar);
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

    public final void setAdtuneWebViewListener(@NotNull xb xbVar) {
        this.k.d = xbVar;
    }
}
