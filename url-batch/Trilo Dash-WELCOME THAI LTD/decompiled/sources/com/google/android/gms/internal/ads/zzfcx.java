package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfcx {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzefc) {
            zzefc zzefcVar = (zzefc) th;
            return zzc(zzefcVar.zza(), zzefcVar.zzb());
        }
        if (th instanceof zzdzk) {
            return th.getMessage() == null ? zzd(((zzdzk) th).zza(), null, null) : zzd(((zzdzk) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof com.google.android.gms.ads.internal.util.zzay)) {
            return zzd(1, null, null);
        }
        com.google.android.gms.ads.internal.util.zzay zzayVar = (com.google.android.gms.ads.internal.util.zzay) th;
        return new com.google.android.gms.ads.internal.client.zze(zzayVar.zza(), zzfpg.zzc(zzayVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, zzefd zzefdVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zza = zza(th);
        int i = zza.zza;
        if ((i == 3 || i == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (zzefdVar != null) {
            zza.zze = zzefdVar.zzb();
        }
        return zza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgR)).intValue() > 0) {
                return zzeVar;
            }
            i = 8;
        }
        return zzd(i, null, zzeVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.ads.internal.client.zze zzd(int i, String str, com.google.android.gms.ads.internal.client.zze zzeVar) {
        String str2;
        String str3;
        if (str == null) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    str2 = "No fill.";
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgU)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    str2 = "No fill.";
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
            int i3 = i - 1;
            if (i != 0) {
                throw null;
            }
            int i4 = 0;
            switch (i3) {
                case 0:
                case 11:
                case 15:
                    return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 1:
                case 5:
                case 6:
                case 9:
                case 16:
                    i4 = 1;
                    return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 2:
                case 10:
                case 18:
                    i4 = 3;
                    return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 3:
                    i4 = 8;
                    return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 4:
                case 8:
                case 17:
                    i4 = 2;
                    return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 7:
                    i4 = 4;
                    return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 12:
                    if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgU)).intValue() <= 0) {
                        i4 = 9;
                        return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                    }
                    i4 = 3;
                    return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 13:
                    i4 = 10;
                    return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 14:
                    i4 = 11;
                    return new com.google.android.gms.ads.internal.client.zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                default:
                    switch (i) {
                        case 1:
                            str3 = "INTERNAL_ERROR";
                            break;
                        case 2:
                            str3 = "INVALID_REQUEST";
                            break;
                        case 3:
                            str3 = "NO_FILL";
                            break;
                        case 4:
                            str3 = "APP_ID_MISSING";
                            break;
                        case 5:
                            str3 = "NETWORK_ERROR";
                            break;
                        case 6:
                            str3 = "INVALID_AD_UNIT_ID";
                            break;
                        case 7:
                            str3 = "INVALID_AD_SIZE";
                            break;
                        case 8:
                            str3 = "MEDIATION_SHOW_ERROR";
                            break;
                        case 9:
                            str3 = "NOT_READY";
                            break;
                        case 10:
                            str3 = "AD_REUSED";
                            break;
                        case 11:
                            str3 = "APP_NOT_FOREGROUND";
                            break;
                        case 12:
                            str3 = "INTERNAL_SHOW_ERROR";
                            break;
                        case 13:
                            str3 = "MEDIATION_NO_FILL";
                            break;
                        case 14:
                            str3 = "REQUEST_ID_MISMATCH";
                            break;
                        case 15:
                            str3 = "INVALID_AD_STRING";
                            break;
                        case 16:
                            str3 = "AD_INSPECTOR_INTERNAL_ERROR";
                            break;
                        case 17:
                            str3 = "AD_INSPECTOR_FAILED_TO_LOAD";
                            break;
                        case 18:
                            str3 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                            break;
                        default:
                            str3 = "AD_INSPECTOR_ALREADY_OPEN";
                            break;
                    }
                    throw new AssertionError("Unknown SdkError: ".concat(str3));
            }
        }
        str2 = str;
        int i32 = i - 1;
        if (i != 0) {
        }
    }
}
