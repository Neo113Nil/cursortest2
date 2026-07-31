package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.Model.CBError;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｚ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1310 extends ChartboostDelegate implements InterfaceC1111 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1308 f3631;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1189 f3632;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ChartboostDelegate f3633;

    public C1310(C1308 c1308, ChartboostDelegate chartboostDelegate, C1189 c1189) {
        this.f3631 = c1308;
        this.f3633 = chartboostDelegate;
        this.f3632 = c1189;
    }

    public final void didCacheInPlay(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("l3uVmxMbd3qnZ7CMCxx/dKB22o0OHVt0t3uRoAkpdHSt\n", "1BP06Wd5GBU=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheInPlay(str);
        }
    }

    public final void didCacheInterstitial(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("8pt1YXrQWNfCh1B2YtdQ2cWWOndn1nTZ0ptxWmDGUsrCh31nZ9Nb\n", "sfMUEw6yN7g=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheInterstitial(str);
        }
    }

    public final void didCacheMoreApps(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("jcMKBe/aE9e93y8S990b2brORRPy3D/ZrcMOOvTKGfm+2xg=\n", "zqtrd5u4fLg=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheMoreApps(str);
        }
    }

    public final void didCacheRewardedVideo(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("L6SyBthc9t8fuJcRwFv+0Rip/RDFWtrRD6S2JslJ+MIIqbcixVr83w==\n", "bMzTdKw+mbA=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheRewardedVideo(str);
        }
    }

    public final void didClickInterstitial(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("FPcaiZFumIgk6z+eiWmQhiP6VZ+MaLSLPvwQsot4kpUk6xKPjG2b\n", "V597++UM9+c=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didClickInterstitial(str);
        }
    }

    public final void didClickMoreApps(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("tDCIEtUDhRaELK0FzQSNGIM9xwTIBakVnjuCLc4TjziHKJo=\n", "91jpYKFh6nk=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didClickMoreApps(str);
        }
    }

    public final void didClickRewardedVideo(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("x8gXi0y9GND31DKcVLoQ3vDFWJ1RuzTT7cMdq12oFs3gxRKvUbsS0A==\n", "hKB2+Tjfd78=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didClickRewardedVideo(str);
        }
    }

    public final void didCloseInterstitial(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("An5+rXHfATUyYlu6adgJOzVzMbts2S02LmV6lmvJCygyYnarbNwC\n", "QRYf3wW9blo=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCloseInterstitial(str);
        }
    }

    public final void didCloseMoreApps(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("dJO7DrVG9YVEj54ZrUH9i0Oe9BioQNmGWIi/Ma5W/6tHi6k=\n", "N/vafMEkmuo=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCloseMoreApps(str);
        }
    }

    public final void didCloseRewardedVideo(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("/vXpalvbeZzO6cx9Q9xxksn4pnxG3VWf0u7tSkrOd4HZ+OxORt1znA==\n", "vZ2IGC+5FvM=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCloseRewardedVideo(str);
        }
    }

    public final void didCompleteInterstitial(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("10e6JVZDWKDnW58yTkRQruBK9TNLRXSg+V+3MlZEfqHgSqkkVkhDpvVD\n", "lC/bVyIhN88=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCompleteInterstitial(str);
        }
    }

    public final void didCompleteRewardedVideo(String str, int i) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("fvamGhWNjJpO6oMNDYqElEn76QwIi6CaUO6rDRWKsZBK/7UMBIu1nFn7qA==\n", "PZ7HaGHv4/U=\n"), str, Integer.valueOf(i));
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCompleteRewardedVideo(str, i);
        }
    }

    public final void didDismissInterstitial(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("o8yZ/T2B1qmT0LzqJYbep5TB1usgh/2vk8mR/Dqq17KF1ov7IJfQp4w=\n", "4KT4j0njucY=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDismissInterstitial(str);
        }
    }

    public final void didDismissMoreApps(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("+7uj/HHvpbLLp4braeitvMy27Ops6Y60y76r/XbApa/dkrL+dg==\n", "uNPCjgWNyt0=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDismissMoreApps(str);
        }
    }

    public final void didDismissRewardedVideo(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("Eu314B2WiY8i8dD3BZGBgSXguvYAkKKJIuj94Rqmg5cw9/D3DaKPhDTq\n", "UYWUkmn05uA=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDismissRewardedVideo(str);
        }
    }

    public final void didDisplayInterstitial(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("GQuVITgc1n0pF7A2IBvecy4G2jclGv17KROYMjU312Y/EYcnJQrQczY=\n", "WmP0U0x+uRI=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDisplayInterstitial(str);
        }
    }

    public final void didDisplayMoreApps(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("1JAfJkTkQ3jkjDoxXONLduOdUDBZ4mh+5IgSNUnLQ2XyuQ4kQw==\n", "l/h+VDCGLBc=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDisplayMoreApps(str);
        }
    }

    public final void didDisplayRewardedVideo(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("7UQ/svxSWNvdWBql5FVQ1dpJcKThVHPd3VwyofFiUsPPXjql7GZe0MtD\n", "rixewIgwN7Q=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDisplayRewardedVideo(str);
        }
    }

    public final void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("4Xfe9iWnV73Ra/vhPaBfs9Z6keA4oX6zy3Pr6x2qWbbrce/oMLw=\n", "oh+/hFHFONI=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
        }
    }

    public final void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("vcHsV8V6y1mN3clA3X3DV4rMo0HYfOJXl8XZSv13xVK3x/lAw2vQX4rA7Ek=\n", "/qmNJbEYpDY=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
        }
    }

    public final void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("4FCoZSYONq7QTI1yPgk+oNdd53M7CB+gylSdeB4DOKXuV7tyExwpsg==\n", "ozjJF1JsWcE=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
        }
    }

    public final void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("gj0b8B3CLv2yIT7nBcUm87UwVOYAxAfzqDku7SXPIPaTMA3jG8Qk9pc8HucG\n", "wVV6gmmgQZI=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
        }
    }

    public final void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("TpNaG8BYbGd+j38M2F9kaXmeFQ3dXkVpZJdvBuZfYGd/n3gF3Vlo\n", "Dfs7abQ6Awg=\n"), str, cBClickError);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToRecordClick(str, cBClickError);
        }
    }

    public final void didInitialize() {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("S3kmKBIOp2F7ZQM/Cgmvb3x0aT4PCIFgYWUuOwoFsms=\n", "CBFHWmZsyA4=\n"), new Object[0]);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.didInitialize();
        }
    }

    public final void didPauseClickForConfirmation(Activity activity) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("v9U7fOGCrG2PyR5r+YWkY4jYdGr8hJNjic4/TfmJoGm60ihN+o6la47QO3r8j60=\n", "/L1aDpXgwwI=\n"), activity);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            try {
                chartboostDelegate.getClass().getDeclaredMethod(StringFog.decrypt("T2YDhy2KdEFoYw60J7loVmhgCbEljWpFX2YIuQ==\n", "Kw9n10z/ByQ=\n"), Activity.class).invoke(this.f3633, activity);
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean shouldDisplayInterstitial(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("5JNyWw5L/5TUj1dMFkz3mtOePVoSRuWXw796WgpF8YLulWdMCFrkktOSckU=\n", "p/sTKXopkPs=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldDisplayInterstitial(str);
        }
        return false;
    }

    public final boolean shouldDisplayMoreApps(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("ejgjCRnIZ/xKJAYeAc9v8k01bAgFxX3/XRQrCB3Gaep0PzAeLNp44A==\n", "OVBCe22qCJM=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldDisplayMoreApps(str);
        }
        return false;
    }

    public final boolean shouldDisplayRewardedVideo(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("Xu6nT1R/RZdu8oJYTHhNmWnj6E5Icl+UecKvTlBxS4FP47FcUnlPnEvvolhP\n", "HYbGPSAdKvg=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldDisplayRewardedVideo(str);
        }
        return false;
    }

    public final boolean shouldRequestInterstitial(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("hovNBfSzLBu2l+gS7LQkFbGGggTovjYYobHJBvW0MACMjdgS8qI3HbGKzRs=\n", "xeOsd4DRQ3Q=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldRequestInterstitial(str);
        }
        return false;
    }

    public final boolean shouldRequestMoreApps(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("uOnqMdk6Hf2I9c8mwT0V84/kpTDFNwf+n9PuMtg9Aea27vkm7CgC4Q==\n", "+4GLQ61YcpI=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldRequestMoreApps(str);
        }
        return false;
    }

    public final void willDisplayVideo(String str) {
        this.f3631.m4103(this, this.f3632, StringFog.decrypt("LJnNqLcz0rkchei/rzTatxuUgq2qPdGSBoLctqIo678LlMM=\n", "b/Gs2sNRvdY=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3633;
        if (chartboostDelegate != null) {
            chartboostDelegate.willDisplayVideo(str);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1111
    /* renamed from: ﾒ */
    public final Object mo3996() {
        return this.f3633;
    }
}
