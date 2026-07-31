package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.ironsource.environment.StringUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.BuildConfig;
import io.bidmachine.BidMachine;

/* renamed from: com.ironsource.r9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
class C4858r9 {
    private static final String a = "IntegrationHelper";
    private static final String b = "getNetworkSDKVersion";
    private static final String c = "getAdapterSDKVersion";
    private static final String d = "getAdapterVersion";
    private static final String e = "getVersion";

    /* renamed from: com.ironsource.r9$a */
    class a extends Thread {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(C4858r9.a, "--------------- Google Play Services --------------");
                if (this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.i(C4858r9.a, "Google Play Services - VERIFIED");
                    String b = com.ironsource.mediationsdk.p.h().b(this.a);
                    if (!TextUtils.isEmpty(b)) {
                        Log.i(C4858r9.a, "GAID is: " + b + " (use this for test devices)");
                    }
                } else {
                    Log.e(C4858r9.a, "Google Play Services - MISSING");
                }
            } catch (Exception e) {
                C4782n4.d().a(e);
                Log.e(C4858r9.a, "Google Play Services - MISSING");
            }
        }
    }

    C4858r9() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(9:38|(1:(1:(1:14)(1:33))(1:34))(1:35)|15|16|17|18|19|20|21)|16|17|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        r1 = r1.getConstructor(null).newInstance(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c A[Catch: Exception -> 0x0027, TryCatch #2 {Exception -> 0x0027, blocks: (B:3:0x0003, B:14:0x0046, B:15:0x0071, B:20:0x00b7, B:31:0x00be, B:28:0x00cb, B:33:0x0060, B:34:0x0066, B:35:0x006c, B:36:0x001d, B:39:0x002a, B:42:0x0034, B:17:0x0093, B:19:0x0097, B:25:0x00af), top: B:2:0x0003, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(Context context, String str) {
        char c2;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            int hashCode = lowerCase.hashCode();
            if (hashCode == -805296079) {
                if (lowerCase.equals("vungle")) {
                    c2 = 2;
                    if (c2 != 0) {
                    }
                    Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                    Object newInstance = cls.getDeclaredConstructor(String.class).newInstance(str);
                    b(newInstance);
                    a(newInstance);
                    return true;
                }
                c2 = 65535;
                if (c2 != 0) {
                }
                Class<?> cls2 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                Object newInstance2 = cls2.getDeclaredConstructor(String.class).newInstance(str);
                b(newInstance2);
                a(newInstance2);
                return true;
            }
            if (hashCode == 92668925) {
                if (lowerCase.equals("admob")) {
                    c2 = 1;
                    if (c2 != 0) {
                    }
                    Class<?> cls22 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                    Object newInstance22 = cls22.getDeclaredConstructor(String.class).newInstance(str);
                    b(newInstance22);
                    a(newInstance22);
                    return true;
                }
                c2 = 65535;
                if (c2 != 0) {
                }
                Class<?> cls222 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                Object newInstance222 = cls222.getDeclaredConstructor(String.class).newInstance(str);
                b(newInstance222);
                a(newInstance222);
                return true;
            }
            try {
                if (hashCode == 497130182 && lowerCase.equals(AccessToken.DEFAULT_GRAPH_DOMAIN)) {
                    c2 = 0;
                    if (c2 != 0) {
                        Log.i(a, "--------------- Meta --------------");
                    } else if (c2 == 1) {
                        Log.i(a, "--------------- Google (AdMob and Ad Manager) --------------");
                    } else if (c2 != 2) {
                        Log.i(a, "--------------- " + str + " --------------");
                    } else {
                        Log.i(a, "--------------- Liftoff Monetization --------------");
                    }
                    Class<?> cls2222 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                    Object newInstance2222 = cls2222.getDeclaredConstructor(String.class).newInstance(str);
                    b(newInstance2222);
                    a(newInstance2222);
                    return true;
                }
                Class<?> cls22222 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                Object newInstance22222 = cls22222.getDeclaredConstructor(String.class).newInstance(str);
                b(newInstance22222);
                a(newInstance22222);
                return true;
            } catch (ClassNotFoundException e2) {
                C4782n4.d().a(e2);
                Log.e(a, "Adapter - MISSING");
                return false;
            } catch (Exception e3) {
                C4782n4.d().a(e3);
                Log.e(a, "Failed to instantiate adapter");
                return false;
            }
            c2 = 65535;
            if (c2 != 0) {
            }
        } catch (Exception e4) {
            C4782n4.d().a(e4);
            Log.e(a, "isAdapterValid " + str, e4);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static void b(Context context) {
        boolean z;
        boolean z2;
        Log.i(a, "Verifying Integration:");
        c(context);
        String[] strArr = {"AppLovin", "APS", BidMachine.NAME, "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", BuildConfig.OMSDK_PARTNER_NAME, "Line", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "PubMatic", "Smaato", "SuperAwesome", O6.H1, "Verve", "Yandex", "YSO"};
        for (int i = 0; i < 26; i++) {
            String str = strArr[i];
            if (a(context, str)) {
                String lowerCase = StringUtils.toLowerCase(str);
                lowerCase.hashCode();
                switch (lowerCase.hashCode()) {
                    case -805296079:
                        if (lowerCase.equals("vungle")) {
                            z2 = false;
                            break;
                        }
                        z2 = -1;
                        break;
                    case 92668925:
                        if (lowerCase.equals("admob")) {
                            z2 = true;
                            break;
                        }
                        z2 = -1;
                        break;
                    case 497130182:
                        if (lowerCase.equals(AccessToken.DEFAULT_GRAPH_DOMAIN)) {
                            z2 = 2;
                            break;
                        }
                        z2 = -1;
                        break;
                    default:
                        z2 = -1;
                        break;
                }
                switch (z2) {
                    case false:
                        Log.i(a, ">>>> Liftoff Monetization - VERIFIED");
                        break;
                    case true:
                        Log.i(a, ">>>> Google (AdMob and Ad Manager) - VERIFIED");
                        break;
                    case true:
                        Log.i(a, ">>>> Meta - VERIFIED");
                        break;
                    default:
                        Log.i(a, ">>>> " + str + " - VERIFIED");
                        break;
                }
            } else {
                String lowerCase2 = StringUtils.toLowerCase(str);
                lowerCase2.hashCode();
                switch (lowerCase2.hashCode()) {
                    case -805296079:
                        if (lowerCase2.equals("vungle")) {
                            z = false;
                            break;
                        }
                        z = -1;
                        break;
                    case 92668925:
                        if (lowerCase2.equals("admob")) {
                            z = true;
                            break;
                        }
                        z = -1;
                        break;
                    case 497130182:
                        if (lowerCase2.equals(AccessToken.DEFAULT_GRAPH_DOMAIN)) {
                            z = 2;
                            break;
                        }
                        z = -1;
                        break;
                    default:
                        z = -1;
                        break;
                }
                switch (z) {
                    case false:
                        Log.i(a, ">>>> Liftoff Monetization - NOT VERIFIED");
                        break;
                    case true:
                        Log.i(a, ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED");
                        break;
                    case true:
                        Log.i(a, ">>>> Meta - NOT VERIFIED");
                        break;
                    default:
                        Log.e(a, ">>>> " + str + " - NOT VERIFIED");
                        break;
                }
            }
        }
        a(context);
    }

    private static void c(Context context) {
        Log.i(a, "*** Permissions ***");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
            Log.i(a, "android.permission.INTERNET - VERIFIED");
        } else {
            Log.e(a, "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            Log.i(a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            Log.e(a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
    }

    private static void a(Context context) {
        new a(context).start();
    }

    private static void b(Object obj) {
        String str;
        try {
            Class<?> cls = obj.getClass();
            if (obj instanceof LevelPlayBaseAdapter) {
                str = b;
            } else {
                str = c;
            }
            Log.i(a, "SDK Version - " + ((String) cls.getMethod(str, null).invoke(obj, null)));
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            Log.w(a, "Unable to get SDK version");
        }
    }

    private static void a(Object obj) {
        try {
            Log.i(a, "Adapter Version - " + ((String) obj.getClass().getMethod(obj instanceof LevelPlayBaseAdapter ? d : "getVersion", null).invoke(obj, null)));
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            Log.w(a, "Unable to get adapter version");
        }
    }
}
