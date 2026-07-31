package sg.bigo.ads.api;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes15.dex */
public class SplashAdRequest extends b {

    @DrawableRes
    public final int h;
    public final String i;

    public static class Builder extends c<Builder, SplashAdRequest> {

        @DrawableRes
        private int mAppLogoResId;
        private String mAppName;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sg.bigo.ads.api.c
        public SplashAdRequest createAdRequest() {
            return new SplashAdRequest(this.mSlotId, this.mAppLogoResId, this.mAppName, this.mServerBidPayload);
        }

        @NonNull
        public Builder withAppLogo(@DrawableRes int i) {
            this.mAppLogoResId = i;
            return this;
        }

        @NonNull
        public Builder withAppName(String str) {
            this.mAppName = str;
            return this;
        }
    }

    public SplashAdRequest(String str, @DrawableRes int i, String str2, String str3) {
        super(str, str3);
        this.h = i;
        this.i = str2;
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return 12;
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final Map<String, Object> e() {
        return null;
    }
}
