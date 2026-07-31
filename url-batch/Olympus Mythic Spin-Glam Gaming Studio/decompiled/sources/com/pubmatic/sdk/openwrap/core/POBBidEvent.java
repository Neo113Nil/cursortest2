package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@MainThread
/* loaded from: classes11.dex */
public interface POBBidEvent {

    public enum BidEventError {
        CLIENT_SIDE_AUCTION_LOSS("BidEventErrorClientSideAuctionLoss"),
        BID_EXPIRED("BidEventErrorBidExpired"),
        OTHER("BidEventErrorOther");

        private final String a;

        BidEventError(String str) {
            this.a = str;
        }

        @NonNull
        public String getErrorMessage() {
            return this.a;
        }
    }

    @Nullable
    POBBid getBid();

    void proceedOnError(@NonNull BidEventError bidEventError, @NonNull String str);

    boolean proceedToLoadAd();

    void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener);
}
