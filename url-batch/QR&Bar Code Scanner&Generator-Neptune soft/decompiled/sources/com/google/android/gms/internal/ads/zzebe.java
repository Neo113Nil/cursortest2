package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzebe {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzeas zzc;
    private final zzfzq zzd;
    private zzeak zze;

    zzebe(Context context, zzeas zzeasVar, zzfzq zzfzqVar) {
        this.zzb = context;
        this.zzc = zzeasVar;
        this.zzd = zzfzqVar;
    }

    private static AdRequest zzh() {
        return new AdRequest.Builder().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzi(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdh zzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else {
            if (!(obj instanceof AdView)) {
                if (obj instanceof NativeAd) {
                    responseInfo = ((NativeAd) obj).getResponseInfo();
                }
                return "";
            }
            responseInfo = ((AdView) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzc.zzh();
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzj(String str, String str2) {
        try {
            zzfzg.zzr(this.zze.zzb(str), new zzebc(this, str2), this.zzd);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzc.zzk(str2);
        }
    }

    private final synchronized void zzk(String str, String str2) {
        try {
            zzfzg.zzr(this.zze.zzb(str), new zzebd(this, str2), this.zzd);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "OutOfContextTester.setAdAsShown");
            this.zzc.zzk(str2);
        }
    }

    public final void zzd(zzeak zzeakVar) {
        this.zze = zzeakVar;
    }

    protected final synchronized void zze(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzj(zzi(obj), str2);
    }

    public final synchronized void zzf(final String str, String str2, final String str3) {
        char c;
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            AppOpenAd.load(this.zzb, str, zzh(), 1, new zzeaw(this, str, str3));
            return;
        }
        if (c == 1) {
            AdView adView = new AdView(this.zzb);
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId(str);
            adView.setAdListener(new zzeax(this, str, adView, str3));
            adView.loadAd(zzh());
            return;
        }
        if (c == 2) {
            InterstitialAd.load(this.zzb, str, zzh(), new zzeay(this, str, str3));
            return;
        }
        if (c == 3) {
            AdLoader.Builder builder = new AdLoader.Builder(this.zzb, str);
            builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzeav
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(NativeAd nativeAd) {
                    zzebe.this.zze(str, nativeAd, str3);
                }
            });
            builder.withAdListener(new zzebb(this, str3));
            builder.build().loadAd(zzh());
            return;
        }
        if (c == 4) {
            RewardedAd.load(this.zzb, str, zzh(), new zzeaz(this, str, str3));
        } else {
            if (c != 5) {
                return;
            }
            RewardedInterstitialAd.load(this.zzb, str, zzh(), new zzeba(this, str, str3));
        }
    }

    public final synchronized void zzg(String str, String str2) {
        Activity zzg = this.zzc.zzg();
        if (zzg == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj == null) {
            return;
        }
        this.zza.remove(str);
        zzk(zzi(obj), str2);
        if (obj instanceof AppOpenAd) {
            ((AppOpenAd) obj).show(zzg);
            return;
        }
        if (obj instanceof InterstitialAd) {
            ((InterstitialAd) obj).show(zzg);
        } else if (obj instanceof RewardedAd) {
            ((RewardedAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzeat
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        } else if (obj instanceof RewardedInterstitialAd) {
            ((RewardedInterstitialAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzeau
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        }
    }
}
