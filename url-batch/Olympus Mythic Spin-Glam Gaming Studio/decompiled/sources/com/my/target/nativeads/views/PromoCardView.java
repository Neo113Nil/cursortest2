package com.my.target.nativeads.views;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public interface PromoCardView {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static abstract class Card {
        @Nullable
        public String getCtaButtonText() {
            return null;
        }

        @Nullable
        public String getCurrency() {
            return null;
        }

        @Nullable
        public String getDescription() {
            return null;
        }

        @Nullable
        public String getDiscountText() {
            return null;
        }

        @Nullable
        public String getOldPriceText() {
            return null;
        }

        @Nullable
        public String getPriceText() {
            return null;
        }

        @Nullable
        public String getTitle() {
            return null;
        }
    }

    @NonNull
    MediaAdView getMediaAdView();

    @NonNull
    View getView();

    void setCard(@NonNull Card card);

    void setCtaOnClickListener(@Nullable View.OnClickListener onClickListener);
}
