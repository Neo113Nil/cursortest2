package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdwp extends com.google.android.gms.ads.internal.client.zzdv {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdwd zzd;
    private final zzgpd zze;
    private zzdvs zzf;

    zzdwp(Context context, WeakReference weakReference, zzdwd zzdwdVar, zzdwr zzdwrVar, zzgpd zzgpdVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdwdVar;
        this.zze = zzgpdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzgot.zzq(this.zzf.zzn(str), new zzdwk(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzgot.zzq(this.zzf.zzn(str), new zzdwl(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzea zzd;
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
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zzb(zzdvs zzdvsVar) {
        this.zzf = zzdvsVar;
    }

    public final synchronized void zzc(zzdwq zzdwqVar) {
        char c;
        String zzb = zzdwqVar.zzb();
        switch (zzb.hashCode()) {
            case -1999289321:
                if (zzb.equals("NATIVE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (zzb.equals("INTERSTITIAL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -428325382:
                if (zzb.equals("APP_OPEN_AD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (zzb.equals("REWARDED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1854800829:
                if (zzb.equals("REWARDED_INTERSTITIAL")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (zzb.equals("BANNER")) {
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
            String zza = zzdwqVar.zza();
            AppOpenAd.load(zzl(), zza, zzdwqVar.zzc(), new zzdwe(this, zza));
            return;
        }
        if (c == 1) {
            String zza2 = zzdwqVar.zza();
            zzbbz zzbbzVar = zzbci.zzki;
            BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() && zzdwqVar.zzg()) ? new AdManagerAdView(zzl()) : new AdView(zzl());
            adManagerAdView.setAdSize(zzdwqVar.zzd());
            adManagerAdView.setAdUnitId(zza2);
            adManagerAdView.setAdListener(new zzdwf(this, zza2, adManagerAdView));
            VideoOptions zzf = zzdwqVar.zzf();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() && zzdwqVar.zzg() && zzf != null) {
                ((AdManagerAdView) adManagerAdView).setVideoOptions(zzf);
            }
            adManagerAdView.loadAd(zzdwqVar.zzc());
            return;
        }
        if (c == 2) {
            String zza3 = zzdwqVar.zza();
            InterstitialAd.load(zzl(), zza3, zzdwqVar.zzc(), new zzdwg(this, zza3));
            return;
        }
        if (c != 3) {
            if (c == 4) {
                String zza4 = zzdwqVar.zza();
                RewardedAd.load(zzl(), zza4, zzdwqVar.zzc(), new zzdwh(this, zza4));
                return;
            } else {
                if (c != 5) {
                    return;
                }
                String zza5 = zzdwqVar.zza();
                RewardedInterstitialAd.load(zzl(), zza5, zzdwqVar.zzc(), new zzdwi(this, zza5));
                return;
            }
        }
        final String zza6 = zzdwqVar.zza();
        AdLoader.Builder builder = new AdLoader.Builder(zzl(), zza6);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdwn
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                zzdwp.this.zzf(zza6, nativeAd);
            }
        });
        builder.withAdListener(new zzdwj(this));
        NativeAdOptions zze = zzdwqVar.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzki)).booleanValue() && zze != null) {
            builder.withNativeAdOptions(zze);
        }
        builder.build().loadAd(zzdwqVar.zzc());
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        Activity zzo = this.zzd.zzo();
        if (zzo != null && (obj = (map = this.zza).get(str)) != null) {
            zzbbz zzbbzVar = zzbci.zzkh;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                map.remove(str);
            }
            zzk(zzm(obj));
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(zzo);
                return;
            }
            if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(zzo);
                return;
            }
            if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(zzo, zzdwo.zza);
                return;
            }
            if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(zzo, zzdwm.zza);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context zzl = zzl();
                intent.setClassName(zzl, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzY(zzl, intent);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdw
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            zzdwr.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzdwr.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    protected final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    final /* synthetic */ zzdwd zzi() {
        return this.zzd;
    }
}
