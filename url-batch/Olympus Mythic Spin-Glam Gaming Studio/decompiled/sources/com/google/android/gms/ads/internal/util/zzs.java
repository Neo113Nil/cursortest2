package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.LocaleList;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.view.ScrollingView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzccf;
import com.google.android.gms.internal.ads.zzcld;
import com.google.android.gms.internal.ads.zzcmt;
import com.google.android.gms.internal.ads.zzcno;
import com.google.android.gms.internal.ads.zzdxj;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzgbp;
import com.google.android.gms.internal.ads.zzgty;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzgvb;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zziom;
import com.google.common.util.concurrent.ListenableFuture;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzs {
    public static final zzgbp zza = new zzf(Looper.getMainLooper());

    @GuardedBy
    private String zzh;
    private volatile String zzi;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private final AtomicReference zzd = new AtomicReference(new Bundle());
    private final AtomicBoolean zze = new AtomicBoolean();
    private boolean zzf = true;
    private final Object zzg = new Object();
    private boolean zzj = false;
    private boolean zzk = false;
    private final Executor zzl = Executors.newSingleThreadExecutor();

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.h);
        p0.startActivity(p1);
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, h.h);
        p0.launchUrl(p1, p2);
    }

    public static final int zzA(@Nullable View view) {
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                return 0;
            }
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof ScrollingView) {
                return 4;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjo)).booleanValue()) {
                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjp);
                if (TextUtils.isEmpty(str)) {
                    continue;
                } else {
                    for (String str2 : str.split(StringUtils.COMMA)) {
                        if (parent.getClass().getName().toLowerCase(Locale.ROOT).contains(str2)) {
                            return 5;
                        }
                    }
                }
            }
            parent = parent.getParent();
        }
    }

    public static final String zzB() {
        Resources zzg = com.google.android.gms.ads.internal.zzt.zzh().zzg();
        return zzg != null ? zzg.getString(R.string.s7) : "Test Ad";
    }

    @Nullable
    public static final zzbo zzC(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(newInstance instanceof IBinder)) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(iBinder);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzD(Context context, String str) {
        Context zza2 = zzccf.zza(context);
        return Wrappers.packageManager(zza2).checkPermission(str, zza2.getPackageName()) == 0;
    }

    public static final boolean zzE(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzF(String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgm)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgo);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgn);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzG(Context context) {
        KeyguardManager zzad;
        return (context == null || (zzad = zzad(context)) == null || !zzad.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzH(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzI() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzJ(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzK(Context context) {
        try {
            Bundle zzag = zzag(context);
            String string = zzag.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(zzaf(zzag))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzL(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzM(View view, int i, MotionEvent motionEvent) {
        String str;
        int i2;
        int i3;
        int i4;
        String str2;
        String str3;
        String str4;
        zzfld zzC;
        zzflg zzaC;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdxj) {
                view2 = ((zzdxj) view2).getChildAt(0);
            }
            if ((view2 instanceof com.google.android.gms.ads.formats.zzh) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i4 = rect.width();
                i3 = rect.height();
            } else {
                i3 = 0;
                i4 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long zzy = zzy(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            if (!(view2 instanceof zzcmt) || (zzaC = ((zzcmt) view2).zzaC()) == null) {
                str2 = "none";
            } else {
                str2 = zzaC.zzb;
                int hashCode = view2.hashCode();
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(hashCode).length());
                sb.append(str2);
                sb.append(":");
                sb.append(hashCode);
                view2.setContentDescription(sb.toString());
            }
            if (!(view2 instanceof zzcld) || (zzC = ((zzcld) view2).zzC()) == null) {
                str3 = str;
                str4 = "none";
            } else {
                str3 = zzfld.zza(zzC.zzb);
                i2 = zzC.zze;
                str4 = zzC.zzE;
            }
            String format = String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str4, str2, str3, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i4), Integer.valueOf(i3), Long.valueOf(zzy), Integer.toString(i, 2));
            int i7 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(format);
        } catch (Exception e) {
            int i8 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder zzN(Context context) {
        com.google.android.gms.ads.internal.zzt.zzf();
        return new AlertDialog.Builder(context, android.R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzO(Context context, String str, String str2) {
        new zzbt(context, str, str2, null, null).zzb();
    }

    public static final void zzP(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) zzblq.zzb.zze()).booleanValue()) {
                CrashUtils.addDynamiteErrorToDropBox(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final void zzQ(Context context, zzfld zzfldVar, zzeaj zzeajVar) {
        zzeai zza2 = zzeajVar.zza();
        zza2.zzc("action", "can_show");
        com.google.android.gms.ads.internal.zzt.zzc();
        zza2.zzc("foreground", true != zzJ(context) ? "1" : "0");
        zza2.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
        if (zzfldVar != null) {
            List list = zzfldVar.zzt;
            if (!list.isEmpty()) {
                zza2.zzc("ancn", (String) list.get(0));
            }
            zza2.zzc("ad_format", zzfld.zza(zzfldVar.zzb));
        }
        zza2.zzd();
    }

    public static final boolean zzR(@Nullable zzfld zzfldVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpp)).booleanValue() && zzfldVar != null && zzfldVar.zze == 4;
    }

    public static final int zzS(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String concat = "Could not parse value:".concat(e.toString());
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            return 0;
        }
    }

    @Nullable
    public static final Map zzT(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzx)).booleanValue()) {
            HashMap hashMap = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (indexOf != -1) {
                    length = indexOf;
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > length || indexOf2 == -1) {
                    indexOf2 = length;
                }
                hashMap2.put(Uri.decode(encodedQuery.substring(i, indexOf2)), indexOf2 == length ? "" : Uri.decode(encodedQuery.substring(indexOf2 + 1, length)));
                if (indexOf == -1) {
                    break;
                }
                i = indexOf + 1;
            }
        }
        return hashMap2;
    }

    public static final int[] zzV(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(android.R.id.content)) == null) ? zzw() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] zzW(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] zzw = (window == null || (findViewById = window.findViewById(android.R.id.content)) == null) ? zzw() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, zzw[0]), com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, zzw[1])};
    }

    public static final boolean zzX(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzt.zzc().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long zzy = zzy(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcc)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmj)).booleanValue()) {
                    return true;
                }
                if (zzy >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzml)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzY(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmG)).booleanValue()) {
            zzaj(context, intent);
            return;
        }
        try {
            zzaj(context, intent);
        } catch (SecurityException e) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzZ(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzq(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            String sb2 = sb.toString();
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        } catch (ActivityNotFoundException e) {
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("No browser is found.", e);
        }
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 86);
        sb.append("HTTP timeout too low: ");
        sb.append(i);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        String sb2 = sb.toString();
        int i2 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
        return 60000;
    }

    public static final int[] zzaa(Activity activity) {
        int[] zzV = zzV(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, zzV[0]), com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, zzV[1])};
    }

    public static final boolean zzab(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzX(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzad(context));
    }

    public static final void zzac(Context context, Intent intent, @Nullable zzeaj zzeajVar, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoU)).booleanValue() || !(context instanceof zzcno)) {
            zzY(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoW))) {
                    ((zzcno) context).zza(intent, 236);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoV)).booleanValue() || zzeajVar == null) {
                        return;
                    }
                    zzeai zza2 = zzeajVar.zza();
                    zza2.zzc("action", "hila");
                    zza2.zzc("gqi", zzgvb.zza(str));
                    zza2.zzf();
                    return;
                }
            }
            zzY(context, intent);
        } catch (ActivityNotFoundException e) {
            e = e;
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdUtil.startActivityForResult");
            zzY(context, intent);
        } catch (SecurityException e2) {
            e = e2;
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdUtil.startActivityForResult");
            zzY(context, intent);
        } catch (Exception e3) {
            int i3 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e3);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e3, "AdUtil.startActivityForResult");
            zzY(context, intent);
        }
    }

    @Nullable
    private static KeyguardManager zzad(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static boolean zzae(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static String zzaf(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    @Nullable
    private static Bundle zzag(Context context) throws RemoteException {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    private static final void zzah(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzai(CustomTabsIntent.Builder builder, Bundle bundle) {
        if (bundle.isEmpty()) {
            return;
        }
        int i = bundle.getInt("h", -1);
        if (i >= 0) {
            builder.setInitialActivityHeightPx(i);
        }
        int i2 = bundle.getInt("cbp", -1);
        if (i2 < 0 || i2 > 2) {
            return;
        }
        builder.setCloseButtonPosition(i2);
    }

    private static final void zzaj(Context context, Intent intent) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }

    private static final String zzak(final Context context, String str) {
        String str2;
        String str3;
        if (str == null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(new Exception("null afmaVersion"), "AdUtil.getUserAgent");
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzh)).booleanValue()) {
                return zzs();
            }
            str = VersionInfoParcel.forPackage().afmaVersion;
        }
        try {
            zzce zza2 = zzce.zza();
            if (TextUtils.isEmpty(zza2.zza)) {
                if (ClientLibraryUtils.isPackageSide()) {
                    str3 = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcc
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                zze.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                    str3 = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = remoteContext;
                            Context context3 = context;
                            boolean z = false;
                            if (context2 != null) {
                                zze.zza("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                zze.zza("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (TextUtils.isEmpty(string)) {
                                zze.zza("Reading user agent from WebSettings");
                                string = WebSettings.getDefaultUserAgent(context3);
                                if (z) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    zze.zza("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                zza2.zza = str3;
            }
            str2 = zza2.zza;
        } catch (Exception unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = zzs();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 10 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(" (Mobile; ");
        sb.append(str);
        String sb2 = sb.toString();
        try {
            if (Wrappers.packageManager(context).isCallerInstantApp()) {
                StringBuilder sb3 = new StringBuilder(sb2.length() + 4);
                sb3.append(sb2);
                sb3.append(";aia");
                sb2 = sb3.toString();
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdUtil.getUserAgent");
        }
        return sb2.concat(")");
    }

    public static List zzj() {
        zzbix zzbixVar = zzbjg.zza;
        List zzf = com.google.android.gms.ads.internal.client.zzba.zzb().zzf();
        ArrayList arrayList = new ArrayList();
        Iterator it = zzf.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzguz.zza(zzgty.zzd(',')).zzf((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static zzq zzk(Context context) {
        LocaleList systemLocales;
        LocaleList systemLocales2;
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new zzq(locale.getLanguage(), locale.getCountry());
        }
        zzq zzqVar = new zzq(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        try {
            LocaleManager m = zzs$$ExternalSyntheticApiModelOutline1.m(context.getSystemService(zzs$$ExternalSyntheticApiModelOutline0.m()));
            if (m == null) {
                return zzqVar;
            }
            systemLocales = m.getSystemLocales();
            if (systemLocales.isEmpty()) {
                return zzqVar;
            }
            systemLocales2 = m.getSystemLocales();
            Locale locale2 = systemLocales2.get(0);
            return new zzq(locale2.getLanguage(), locale2.getCountry());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "AdUtil.getSystemDefaultLocale");
            return zzqVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zzo(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView != null) {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    return false;
                }
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
            }
        }
        activity = null;
        if (activity != null) {
        }
    }

    public static final boolean zzp(final Context context, final WebSettings webSettings) {
        zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgbp zzgbpVar = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings2 = webSettings;
                webSettings2.setDatabasePath(absolutePath);
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbB)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    public static final void zzq(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzr(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzaf(zzag(context));
    }

    static final String zzs() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzt() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    public static final Integer zzu(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzv(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzw() {
        return new int[]{0, 0};
    }

    public static final Map zzx(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzy(View view) {
        float f = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f = Math.min(f, view2.getAlpha());
            view = view2.getParent();
        } while (f > 0.0f);
        return Math.round((f >= 0.0f ? f : 0.0f) * 100.0f);
    }

    @Nullable
    public static final WebResourceResponse zzz(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbl(context).zzb(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public final void zzb(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zza2 = zza(i);
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 28);
        sb.append("HTTP timeout: ");
        sb.append(zza2);
        sb.append(" milliseconds.");
        String sb2 = sb.toString();
        int i2 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zze(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzc(Context context) {
        if (this.zzj) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbjg.zza(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmF)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzd(Context context) {
        if (this.zzk) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbjg.zza(context);
        byte[] bArr = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmF)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, bArr), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, bArr), intentFilter, 4);
        }
        this.zzk = true;
        return true;
    }

    public final String zze(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmS)).booleanValue()) {
            if (this.zzi != null) {
                return this.zzi;
            }
            String zzak = zzak(context, str);
            if (str != null) {
                this.zzi = zzak;
            }
            return zzak;
        }
        synchronized (this.zzg) {
            try {
                String str2 = this.zzh;
                if (str2 != null) {
                    return str2;
                }
                String zzak2 = zzak(context, str);
                if (str != null) {
                    this.zzh = zzak2;
                }
                return zzak2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ListenableFuture zzf(final Uri uri) {
        return zzhcy.zzd(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgbp zzgbpVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                return zzs.zzT(uri);
            }
        }, this.zzl);
    }

    public final void zzg(final Context context, @Nullable final String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzt.zzc();
        bundle.putString("device", zzt());
        zzbix zzbixVar = zzbjg.zza;
        bundle.putString(POBConstants.KEY_EIDS, TextUtils.join(StringUtils.COMMA, com.google.android.gms.ads.internal.client.zzba.zzb().zze()));
        if (bundle.isEmpty()) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmh);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(zzac.zzc(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        zzs.this.zzl(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.zzd.get());
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        com.google.android.gms.ads.internal.util.client.zzf.zzD(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(String str4) {
                zzgbp zzgbpVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                zzs.zzO(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final boolean zzh(String str) {
        return zzae(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaV));
    }

    public final boolean zzi(String str) {
        return zzae(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaW));
    }

    final /* synthetic */ void zzl(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.zzd.set(zzac.zzb(context, str));
    }

    final /* synthetic */ void zzm(boolean z) {
        this.zzf = z;
    }

    public final int zzn(Context context, Uri uri, Bundle bundle) {
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zzah(context, uri);
            return 2;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfI)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfG)).booleanValue()) {
                zzah(context, uri);
                return 9;
            }
            zzbkh zzbkhVar = new zzbkh();
            zzbkhVar.zzd(new zzk(this, zzbkhVar, bundle, context, uri));
            zzbkhVar.zze((Activity) context);
            return 5;
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(com.google.android.gms.ads.internal.zzt.zzn().zzb());
        zzai(builder, bundle);
        CustomTabsIntent build = builder.build();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfW)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zza();
            if (com.google.android.gms.ads.internal.util.client.zzf.zzy()) {
                return 5;
            }
        }
        build.intent.setPackage(zziom.zza(context));
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(build, context, uri);
        return 5;
    }
}
