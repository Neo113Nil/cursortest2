package com.yandex.div.core.font;

import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;

@PublicApi
/* loaded from: classes12.dex */
public interface DivTypefaceProvider {
    public static final DivTypefaceProvider DEFAULT = new DivTypefaceProvider() { // from class: com.yandex.div.core.font.DivTypefaceProvider.1
        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getBold() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getLight() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getMedium() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getRegular() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getTypefaceFor(int i) {
            Typeface create;
            if (Build.VERSION.SDK_INT >= 28) {
                create = Typeface.create(Typeface.DEFAULT, i, false);
                return create;
            }
            return super.getTypefaceFor(i);
        }
    };

    public interface Weight {
        public static final int BOLD = 700;
        public static final int LIGHT = 300;
        public static final int MEDIUM = 500;
        public static final int REGULAR = 400;
    }

    @Nullable
    Typeface getBold();

    @Nullable
    Typeface getLight();

    @Nullable
    Typeface getMedium();

    @Nullable
    Typeface getRegular();

    default boolean isVariable() {
        return false;
    }

    @Nullable
    default Typeface getTypefaceFor(int i) {
        if (i >= 0 && i < 350) {
            return getLight();
        }
        if (i >= 350 && i < 450) {
            return getRegular();
        }
        if (i >= 450 && i < 600) {
            return getMedium();
        }
        return getBold();
    }
}
