package io.bidmachine.iab.utils;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.view.CircleCountdownView;

/* loaded from: classes5.dex */
public class IabCloseWrapper extends IabElementWrapper<CircleCountdownView> {
    public IabCloseWrapper(@Nullable View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    protected IabElementStyle c(Context context, IabElementStyle iabElementStyle) {
        return Assets.resolveDefCloseStyle(context, iabElementStyle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.bidmachine.iab.utils.IabElementWrapper
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public CircleCountdownView b(Context context, IabElementStyle iabElementStyle) {
        return new CircleCountdownView(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.iab.utils.IabElementWrapper
    public void a(Context context, CircleCountdownView circleCountdownView, IabElementStyle iabElementStyle) {
        super.a(context, (View) circleCountdownView, iabElementStyle);
        if ("skip".equals(iabElementStyle.getStyle()) || "skipfill".equals(iabElementStyle.getStyle())) {
            circleCountdownView.setImage(Assets.getBitmapFromBase64(Assets.SKIP));
        } else {
            circleCountdownView.setImage(Assets.getBitmapFromBase64(Assets.CLOSE));
        }
    }
}
