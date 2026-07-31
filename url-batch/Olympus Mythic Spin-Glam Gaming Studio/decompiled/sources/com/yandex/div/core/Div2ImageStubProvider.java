package com.yandex.div.core;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;

@PublicApi
/* loaded from: classes11.dex */
public interface Div2ImageStubProvider {
    public static final Div2ImageStubProvider STUB = new Div2ImageStubProvider() { // from class: com.yandex.div.core.Div2ImageStubProvider$$ExternalSyntheticLambda0
        @Override // com.yandex.div.core.Div2ImageStubProvider
        public final Drawable getImageStubDrawable(int i) {
            return new ColorDrawable(i);
        }
    };

    @Nullable
    Drawable getImageStubDrawable(@ColorInt int i);
}
