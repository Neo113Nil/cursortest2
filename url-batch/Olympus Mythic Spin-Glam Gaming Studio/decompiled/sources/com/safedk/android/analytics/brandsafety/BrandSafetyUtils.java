package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BrandSafetyUtils {
    private static final int A = 26;
    private static final float B = 0.2f;
    private static final float C = 0.2f;
    private static final float D = 0.2f;
    private static final float E = 0.2f;
    private static final String INTERSTITIAL_ACTIVITIES = "Y29tLnVuaXR5M2QuYWRzLmFuZHJvaWQudmlldy5Vbml0eUFkc0Z1bGxzY3JlZW5BY3Rpdml0eXxjb20udW5pdHkzZC5hZHMuYWR1bml0LkFkVW5pdEFjdGl2aXR5fGNvbS51bml0eTNkLmFkcy5hZHVuaXQuQWRVbml0U29mdHdhcmVBY3Rpdml0eXxjb20udW5pdHkzZC5zZXJ2aWNlcy5hZHMuYWR1bml0LkFkVW5pdEFjdGl2aXR5fGNvbS51bml0eTNkLnNlcnZpY2VzLmFkcy5hZHVuaXQuQWRVbml0U29mdHdhcmVBY3Rpdml0eXxjb20udW5pdHkzZC5hZHMuYWRwbGF5ZXIuRnVsbFNjcmVlbldlYlZpZXdEaXNwbGF5fGNvbS5nb29nbGUuYW5kcm9pZC5nbXMuYWRzLkFkQWN0aXZpdHl8Y29tLmdvb2dsZS5hZHMuQWRBY3Rpdml0eXxjb20udnVuZ2xlLnB1Ymxpc2hlci5GdWxsU2NyZWVuQWRBY3Rpdml0eXxjb20udnVuZ2xlLnB1Ymxpc2hlci5NcmFpZEZ1bGxTY3JlZW5BZEFjdGl2aXR5fGNvbS52dW5nbGUucHVibGlzaGVyLlZpZGVvRnVsbFNjcmVlbkFkQWN0aXZpdHl8Y29tLnZ1bmdsZS5wdWJsaXNoZXIuRmxleFZpZXdBZEFjdGl2aXR5fGNvbS52dW5nbGUud2FycmVuLnVpLlZ1bmdsZUFjdGl2aXR5fGNvbS52dW5nbGUud2FycmVuLnVpLlZ1bmdsZUZsZXhWaWV3QWN0aXZpdHl8Y29tLnZ1bmdsZS5hZHMuaW50ZXJuYWwudWkuVnVuZ2xlQWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5hcHBsb3Zpbi5hZHZpZXcuQXBwTG92aW5GdWxsc2NyZWVuQWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkZ1bGxzY3JlZW5UaGVtZWRBY3Rpdml0eXxjb20uYXBwbG92aW4uaW1wbC5hZHZpZXcuQXBwTG92aW5PcmllbnRhdGlvbkF3YXJlSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLnN1cGVyc29uaWNhZHMuc2RrLmNvbnRyb2xsZXIuQ29udHJvbGxlckFjdGl2aXR5fGNvbS5zdXBlcnNvbmljYWRzLnNkay5jb250cm9sbGVyLkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5pcm9uc291cmNlLnNkay5jb250cm9sbGVyLkNvbnRyb2xsZXJBY3Rpdml0eXxjb20uaXJvbnNvdXJjZS5zZGsuY29udHJvbGxlci5JbnRlcnN0aXRpYWxBY3Rpdml0eXxjb20ubWludGVncmFsLm1zZGsuaW50ZXJzdGl0aWFsLnZpZXcuTVRHSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLm1pbnRlZ3JhbC5tc2RrLnJld2FyZC5wbGF5ZXIuTVRHUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20ubWludGVncmFsLm1zZGsubmV3cmV3YXJkLnBsYXllci5NVEdSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5taW50ZWdyYWwubXNkay5pbnRlcmFjdGl2ZWFkcy5hY3Rpdml0eS5JbnRlcmFjdGl2ZVNob3dBY3Rpdml0eXxjb20ubWJyaWRnZS5tc2RrLmludGVyc3RpdGlhbC52aWV3Lk1CSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLm1icmlkZ2UubXNkay5yZXdhcmQucGxheWVyLk1CUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20ubWJyaWRnZS5tc2RrLm5ld3Jld2FyZC5wbGF5ZXIuTUJSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5tYnJpZGdlLm1zZGsuaW50ZXJhY3RpdmVhZHMuYWN0aXZpdHkuSW50ZXJhY3RpdmVTaG93QWN0aXZpdHl8Y29tLm1icmlkZ2UubXNkay5hY3Rpdml0eS5NQkNvbW1vbkFjdGl2aXR5fGNvbS5tYnJpZGdlLm1zZGsuY29uZmlnLmFjdGl2aXR5Lk1CUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20ubWJyaWRnZS5tc2RrLm91dC5Mb2FkaW5nQWN0aXZpdHl8Y29tLmZ5YmVyLmlubmVyYWN0aXZlLnNkay5hY3Rpdml0aWVzLklubmVyYWN0aXZlRnVsbHNjcmVlbkFkQWN0aXZpdHl8Y29tLmZpdmVfY29ycC5hZC5BZEFjdGl2aXR5fGNvbS5pbm1vYmkuYWRzLnJlbmRlcmluZy5Jbk1vYmlBZEFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEZ1bGxTY3JlZW5WaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEZ1bGxTY3JlZW5FeHByZXNzVmlkZW9BY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuVFRSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVFJld2FyZEV4cHJlc3NWaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEFwcE9wZW5BZEFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5BZEFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEFkQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUSW50ZXJzdGl0aWFsRXhwcmVzc0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5zaW5nbGUuVFRGdWxsU2NyZWVuVmlkZW9BY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuc2luZ2xlLlRURnVsbFNjcmVlbkV4cHJlc3NWaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5zaW5nbGUuVFRSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5zaW5nbGUuVFRSZXdhcmRFeHByZXNzVmlkZW9BY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuc2luZ2xlLlRUQXBwT3BlbkFkQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LnNpbmdsZS5UVEFwcE9wZW5BZFRyYW5zQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LnNpbmdsZS5UVEFkQWN0aXZpdHl8Y29tLnNtYWF0by5zZGsuaW50ZXJzdGl0aWFsLkludGVyc3RpdGlhbEFkQWN0aXZpdHl8Y29tLnNtYWF0by5zZGsuaW50ZXJzdGl0aWFsLnZpZXcuSW50ZXJzdGl0aWFsQWRBY3Rpdml0eXxjb20uc21hYXRvLnNkay5yZXdhcmRlZC53aWRnZXQuUmV3YXJkZWRJbnRlcnN0aXRpYWxBZEFjdGl2aXR5fGNvbS5zbWFhdG8uc2RrLnJld2FyZGVkLnZpZXcuUmV3YXJkZWRJbnRlcnN0aXRpYWxBZEFjdGl2aXR5fGNvbS52ZXJ2ZS5uZy5zZGsuaW50ZXJzdGl0aWFsLmFjdGl2aXR5Lk1yYWlkSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLnZlcnZlLm5nLnNkay5pbnRlcnN0aXRpYWwuYWN0aXZpdHkuVmFzdEludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS52ZXJ2ZS5uZy5zZGsucmV3YXJkZWQuYWN0aXZpdHkuTXJhaWRSZXdhcmRlZEFjdGl2aXR5fGNvbS52ZXJ2ZS5uZy5zZGsucmV3YXJkZWQuYWN0aXZpdHkuVmFzdFJld2FyZGVkQWN0aXZpdHl8Y29tLm1vbG9jby5zZGsueGVub3NzLnNka2RldmtpdC5hbmRyb2lkLmFkcmVuZGVyZXIuaW50ZXJuYWwubXJhaWQuTXJhaWRBY3Rpdml0eXxjb20ubW9sb2NvLnNkay54ZW5vc3Muc2RrZGV2a2l0LmFuZHJvaWQuYWRyZW5kZXJlci5pbnRlcm5hbC5zdGF0aWNyZW5kZXJlci5TdGF0aWNBZEFjdGl2aXR5fGNvbS5tb2xvY28uc2RrLnhlbm9zcy5zZGtkZXZraXQuYW5kcm9pZC5hZHJlbmRlcmVyLmludGVybmFsLnZhc3QuVmFzdEFjdGl2aXR5fGNvbS5tb2xvY28uc2RrLnhlbm9zcy5zZGtkZXZraXQuYW5kcm9pZC5hZHJlbmRlcmVyLmludGVybmFsLnRlbXBsYXRlcy5yZW5kZXJlci5mdWxsc2NyZWVuLkZ1bGxzY3JlZW5XZWJ2aWV3QWN0aXZpdHl8Y29tLmV4cGxvcmVzdGFjay5pYWIubXJhaWQuTXJhaWRBY3Rpdml0eXxjb20uZXhwbG9yZXN0YWNrLmlhYi52YXN0LmFjdGl2aXR5LlZhc3RBY3Rpdml0eXxpby5iaWRtYWNoaW5lLnJlbmRlcmluZy5hZC5mdWxsc2NyZWVuLkZ1bGxTY3JlZW5BY3Rpdml0eXxpby5iaWRtYWNoaW5lLmlhYi52YXN0LmFjdGl2aXR5LlZhc3RBY3Rpdml0eXxuZXQucHVibmF0aXZlLmxpdGUuc2RrLmludGVyc3RpdGlhbC5hY3Rpdml0eS5NcmFpZEludGVyc3RpdGlhbEFjdGl2aXR5fG5ldC5wdWJuYXRpdmUubGl0ZS5zZGsuaW50ZXJzdGl0aWFsLmFjdGl2aXR5LlZhc3RJbnRlcnN0aXRpYWxBY3Rpdml0eXxuZXQucHVibmF0aXZlLmxpdGUuc2RrLnJld2FyZGVkLmFjdGl2aXR5Lk1yYWlkUmV3YXJkZWRBY3Rpdml0eXxuZXQucHVibmF0aXZlLmxpdGUuc2RrLnJld2FyZGVkLmFjdGl2aXR5LlZhc3RSZXdhcmRlZEFjdGl2aXR5fGNvbS5tb2JpbGVmdXNlLnNkay5Nb2JpbGVGdXNlRnVsbHNjcmVlbkFjdGl2aXR5fGNvbS5jaGFydGJvb3N0LnNkay52aWV3LkNCSW1wcmVzc2lvbkFjdGl2aXR5fGNvbS5jaGFydGJvb3N0LnNkay52aWV3LkZ1bGxzY3JlZW5BZEFjdGl2aXR5fGNvbS5wdWJtYXRpYy5zZGsud2VicmVuZGVyaW5nLm1yYWlkLlBPQlZpZGVvUGxheWVyQWN0aXZpdHl8Y29tLnB1Ym1hdGljLnNkay53ZWJyZW5kZXJpbmcudWkuUE9CRnVsbFNjcmVlbkFjdGl2aXR5fGNvbS5hbWF6b24uYXBzLmFkcy5hY3Rpdml0eS5BcHNJbnRlcnN0aXRpYWxBY3Rpdml0eXxjb20ueWFuZGV4Lm1vYmlsZS5hZHMuY29tbW9uLkFkQWN0aXZpdHk=";
    private static int L = 0;
    private static int M = 0;
    public static final String a = ".jpg";
    static final String b = ".txt";
    static final String c = "unknown";
    static final String d = "com.appsaholic";
    static final int e = 1000;
    static final int f = 500;
    public static final int g = 86400000;
    public static final int h = 20000;
    public static final int i = 5000;
    public static final String j = "INTER";
    public static final String k = "REWARDED";
    public static final String l = "APPOPEN";
    public static final String m = "BANNER";
    public static final String n = "LEADER";
    public static final String o = "MREC";
    public static final String p = "NATIVE";
    private static final String q = "BrandSafetyUtils";
    private static final Set<String> r;
    private static final Set<String> s;
    private static final Set<String> t;
    private static final int v = 100;
    private static final int w = 0;
    private static final int x = 8947848;
    private static final int y = 4473924;
    private static final int z = 10;
    private static final List<Integer> u = new LinkedList();
    private static n F = null;
    private static RedirectDetails G = null;
    private static final ExecutorService H = Executors.newSingleThreadExecutor();
    private static Map<String, z> I = new ConcurrentHashMap();
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> J = new LimitedConcurrentHashMap<>();
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> K = new LimitedConcurrentHashMap<>();

    public enum AdType {
        INTERSTITIAL,
        MREC,
        BANNER,
        NATIVE
    }

    public enum ScreenShotOrientation {
        NOT_INITIALIZED,
        PORTRAIT,
        LANDSCAPE
    }

    public enum ScreenshotValidity {
        VALID,
        UNIFORMITY_BLACK,
        UNIFORMITY_VERY_HIGH,
        UNIFORMITY_HIGH,
        UNIFORMITY_GRAY,
        NOT_SUITABLE_FOR_DASHBOARD
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String(Base64.decode(INTERSTITIAL_ACTIVITIES, 0)).split("\\|")));
        r = hashSet;
        Logger.d(q, "BrandSafetyUtils initialized with ", hashSet, ",  INTERSTITIAL_ACTIVITIES=", INTERSTITIAL_ACTIVITIES);
        HashSet hashSet2 = new HashSet(Arrays.asList(new String(Base64.decode("Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LnNpbmdsZS5UVExhbmRpbmdQYWdlQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LnNpbmdsZS5UVFBsYXlhYmxlTGFuZGluZ1BhZ2VBY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuc2luZ2xlLlRUVmlkZW9MYW5kaW5nUGFnZUxpbmsyQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LnNpbmdsZS5UVENlaWxpbmdMYW5kaW5nUGFnZUFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5zaW5nbGUuVFREZWxlZ2F0ZUFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5zaW5nbGUuVFRXZWJzaXRlQWN0aXZpdHl8Y29tLmZ5YmVyLmlubmVyYWN0aXZlLnNkay5hY3Rpdml0aWVzLklubmVyYWN0aXZlSW50ZXJuYWxCcm93c2VyQWN0aXZpdHl8Y29tLmlyb25zb3VyY2Uuc2RrLmNvbnRyb2xsZXIuT3BlblVybEFjdGl2aXR5fGNvbS5wdWJtYXRpYy5zZGsuY29tbW9uLmJyb3dzZXIuUE9CSW50ZXJuYWxCcm93c2VyQWN0aXZpdHk=", 0)).split("\\|")));
        s = hashSet2;
        Logger.d(q, "BrandSafetyUtils initialized with ", hashSet2, ",  INTERNAL_BROWSER_ACTIVITIES=", INTERSTITIAL_ACTIVITIES);
        t = new HashSet();
        L = 0;
        M = 0;
    }

    public static void a(String str) {
        s.add(str);
    }

    public static BrandSafetyEvent.AdFormatType a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("ad_format");
            if ("BANNER".equals(string) || n.equals(string)) {
                return BrandSafetyEvent.AdFormatType.BANNER;
            }
            if (o.equals(string)) {
                return BrandSafetyEvent.AdFormatType.MREC;
            }
            if (k.equals(string)) {
                return BrandSafetyEvent.AdFormatType.REWARD;
            }
            if (j.equals(string)) {
                return BrandSafetyEvent.AdFormatType.INTER;
            }
            if (l.equals(string)) {
                return BrandSafetyEvent.AdFormatType.APPOPEN;
            }
            if ("NATIVE".equals(string)) {
                return BrandSafetyEvent.AdFormatType.NATIVE;
            }
            return null;
        }
        return null;
    }

    public static BrandSafetyEvent.AdFormatType a(AdType adType) {
        if (adType != null) {
            int i2 = AnonymousClass4.a[adType.ordinal()];
            if (i2 == 1) {
                return BrandSafetyEvent.AdFormatType.INTER;
            }
            if (i2 == 2) {
                return BrandSafetyEvent.AdFormatType.BANNER;
            }
            if (i2 == 3) {
                return BrandSafetyEvent.AdFormatType.MREC;
            }
            if (i2 == 4) {
                return BrandSafetyEvent.AdFormatType.NATIVE;
            }
            return null;
        }
        return null;
    }

    public static AdType b(String str) {
        if (str != null) {
            return a(BrandSafetyEvent.AdFormatType.valueOf(str));
        }
        return null;
    }

    public static AdType a(BrandSafetyEvent.AdFormatType adFormatType) {
        if (adFormatType != null) {
            switch (AnonymousClass4.b[adFormatType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return AdType.INTERSTITIAL;
                case 4:
                case 5:
                    return AdType.BANNER;
                case 6:
                    return AdType.MREC;
                case 7:
                    return AdType.NATIVE;
                default:
                    return null;
            }
        }
        return null;
    }

    /* renamed from: com.safedk.android.analytics.brandsafety.BrandSafetyUtils$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[BrandSafetyEvent.AdFormatType.values().length];
            b = iArr;
            try {
                iArr[BrandSafetyEvent.AdFormatType.INTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[BrandSafetyEvent.AdFormatType.REWARD.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[BrandSafetyEvent.AdFormatType.APPOPEN.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[BrandSafetyEvent.AdFormatType.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                b[BrandSafetyEvent.AdFormatType.LEADER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                b[BrandSafetyEvent.AdFormatType.MREC.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                b[BrandSafetyEvent.AdFormatType.NATIVE.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            int[] iArr2 = new int[AdType.values().length];
            a = iArr2;
            try {
                iArr2[AdType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            try {
                a[AdType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
            }
            try {
                a[AdType.MREC.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
            }
            try {
                a[AdType.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError e11) {
            }
        }
    }

    static class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String name) {
            return name.endsWith(BrandSafetyUtils.a);
        }
    }

    static class b implements FilenameFilter {
        private String a;

        public b(String str) {
            this.a = null;
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String name) {
            return name.contains(this.a);
        }
    }

    public static void detectAdClick(Intent intent, String sdkPackageName) {
        a(intent, sdkPackageName, false);
    }

    public static void a(final Intent intent, final String str, final boolean z2) {
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p()) {
            return;
        }
        Logger.d(q, "detect ad click invoked, sdk=", str);
        if (com.safedk.android.utils.n.c()) {
            H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    BrandSafetyUtils.c(intent, str, z2);
                }
            });
        } else {
            c(intent, str, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0268, code lost:
    
        r8 = r9.d(r6);
        r10 = new com.safedk.android.analytics.brandsafety.m.a[2];
        r10[0] = new com.safedk.android.analytics.brandsafety.m.a("url", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0279, code lost:
    
        if (r48 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x027b, code lost:
    
        r11 = com.safedk.android.analytics.events.RedirectEvent.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0280, code lost:
    
        r10[1] = new com.safedk.android.analytics.brandsafety.m.a(com.safedk.android.analytics.brandsafety.m.J, r11);
        r8.a(com.safedk.android.analytics.brandsafety.m.n, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x027e, code lost:
    
        r11 = com.facebook.gamingservices.cloudgaming.internal.SDKConstants.PARAM_INTENT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0293, code lost:
    
        r1 = com.safedk.android.analytics.brandsafety.u.a(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x029c, code lost:
    
        if (com.safedk.android.SafeDK.b() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02a4, code lost:
    
        if (r41.a(r5, r1) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02a6, code lost:
    
        r1 = r38;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b8, code lost:
    
        com.safedk.android.utils.Logger.d(r1, "detect ad click - should handle click ", java.lang.Boolean.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ca, code lost:
    
        if (r7 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02cc, code lost:
    
        com.safedk.android.utils.Logger.d(r1, "detect ad click - current elapsed realtime: ", java.lang.Long.valueOf(r27), ", activity last touched: ", java.lang.Long.valueOf(r3), ", diff: ", java.lang.Long.valueOf(r24), ", isClicked: ", java.lang.Boolean.valueOf(r46));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02fe, code lost:
    
        if (r3 == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0305, code lost:
    
        if (r24 <= r12) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0307, code lost:
    
        if (r46 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0309, code lost:
    
        com.safedk.android.utils.Logger.d(r1, "detect ad click - redirect");
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0318, code lost:
    
        if (r(r5) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x031a, code lost:
    
        r10 = com.safedk.android.analytics.events.RedirectEvent.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0320, code lost:
    
        a(r5, r42, r22, r10, r0, r6.getClass().getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x031d, code lost:
    
        r10 = "external";
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b2, code lost:
    
        r1 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b4, code lost:
    
        com.safedk.android.utils.Logger.d(r1, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0332, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0333, code lost:
    
        r2 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0534, code lost:
    
        com.safedk.android.utils.Logger.d(r2, "error in detect ad click", r0);
        new com.safedk.android.analytics.reporters.CrashReporter().caughtException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x054a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x028a, code lost:
    
        r38 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.q;
        r42 = r6;
        r41 = r10;
        r6 = r11;
        r46 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0337, code lost:
    
        r13 = r10;
        r6 = r11;
        r3 = r24;
        r11 = r12;
        r10 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0347, code lost:
    
        com.safedk.android.utils.Logger.d(r10, "detect ad click - no interstitial");
        r24 = r27 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0355, code lost:
    
        if (r24 >= 20000) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0357, code lost:
    
        com.safedk.android.utils.Logger.d(r10, "detect ad click - updating click URL. address : ", r14);
        r18 = java.util.Arrays.asList(com.safedk.android.SafeDK.getInstance().A(), com.safedk.android.SafeDK.getInstance().C()).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x038b, code lost:
    
        if (r18.hasNext() == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x038d, code lost:
    
        r8 = (com.safedk.android.analytics.brandsafety.a) r18.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0393, code lost:
    
        if (r8 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0395, code lost:
    
        r2 = r10;
        r44 = r11;
        r34 = r6;
        r45 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03ac, code lost:
    
        if (r8.a(r0, r5, r14, true, (java.lang.String) null) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03ae, code lost:
    
        if (r14 == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03b0, code lost:
    
        r9 = new com.safedk.android.analytics.brandsafety.m.a[2];
        r9[0] = new com.safedk.android.analytics.brandsafety.m.a("url", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03bd, code lost:
    
        if (r48 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03bf, code lost:
    
        r11 = com.safedk.android.analytics.events.RedirectEvent.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03c4, code lost:
    
        r9[1] = new com.safedk.android.analytics.brandsafety.m.a(com.safedk.android.analytics.brandsafety.m.J, r11);
        com.safedk.android.analytics.brandsafety.b.a(r14, com.safedk.android.analytics.brandsafety.m.n, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03d6, code lost:
    
        r10 = r2;
        r6 = r34;
        r11 = r44;
        r13 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03c2, code lost:
    
        r11 = com.facebook.gamingservices.cloudgaming.internal.SDKConstants.PARAM_INTENT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03ce, code lost:
    
        r34 = r6;
        r2 = r10;
        r44 = r11;
        r45 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03df, code lost:
    
        r34 = r6;
        r2 = r10;
        r44 = r11;
        r45 = r13;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03f0, code lost:
    
        r1 = com.safedk.android.analytics.brandsafety.u.a(r5, r3);
        r7 = new java.lang.Object[r6];
        r7[0] = "detect ad click - last touch event(elapsed): ";
        r7[1] = java.lang.Long.valueOf(r3);
        r7[2] = ", last touch event(current time millis): ";
        r7[3] = java.lang.Long.valueOf(r22);
        r7[4] = ", redirectInfoKey: ";
        r7[5] = r1;
        com.safedk.android.utils.Logger.d(r2, r7);
        r6 = new java.lang.Object[r6];
        r6[0] = "detect ad click - current elapsed realtime: ";
        r6[1] = java.lang.Long.valueOf(r27);
        r6[2] = ", last touch event(elapsed): ";
        r6[3] = java.lang.Long.valueOf(r3);
        r6[4] = ", diff: ";
        r6[5] = java.lang.Long.valueOf(r24);
        com.safedk.android.utils.Logger.d(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x043c, code lost:
    
        if (com.safedk.android.SafeDK.b() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0444, code lost:
    
        if (r45.a(r5, r1) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0448, code lost:
    
        if (r3 == 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x044f, code lost:
    
        if (r24 <= r44) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0455, code lost:
    
        if (r(r5) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0457, code lost:
    
        r10 = com.safedk.android.analytics.events.RedirectEvent.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x045d, code lost:
    
        a(r5, r6, r22, r10, r0, r34.getClass().getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x045a, code lost:
    
        r10 = "external";
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x046e, code lost:
    
        com.safedk.android.utils.Logger.d(r2, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03e8, code lost:
    
        r34 = r6;
        r2 = r10;
        r44 = r11;
        r45 = r13;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x047a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x047b, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01bf, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01a3, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.BrandSafetyUtils.q, "detect ad click - has URL, intentUrl: ", r0);
        r8 = com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.j(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        if (r8 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015f, code lost:
    
        if (r8.k(r0) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0161, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.BrandSafetyUtils.q, "detect ad click - url should be ignored (by discovery class), skipping");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016f, code lost:
    
        if (a(r46) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0171, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0172, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.BrandSafetyUtils.q, "detect ad click - not handled (yet)");
        r11 = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        r10 = com.safedk.android.analytics.StatsCollector.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0187, code lost:
    
        if (r11 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0189, code lost:
    
        if (r10 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018b, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.BrandSafetyUtils.q, "detect ad click - has foreground");
        r9 = com.safedk.android.SafeDK.getInstance().z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
    
        if (r9 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019e, code lost:
    
        r8 = r9.d(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ad, code lost:
    
        if (com.safedk.android.SafeDK.getInstance().A() == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01bb, code lost:
    
        if (com.safedk.android.SafeDK.getInstance().A().m(r14) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bd, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d2, code lost:
    
        if (r9 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d4, code lost:
    
        if (r8 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d6, code lost:
    
        if (r15 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d8, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.BrandSafetyUtils.q, "detect ad click - has interstitial");
        r15 = r8.d();
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.BrandSafetyUtils.q, "detect ad click - clicked ", java.lang.Boolean.valueOf(r15));
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.BrandSafetyUtils.q, "detect ad click - last touch event(elapsed): ", java.lang.Long.valueOf(r24), " last touch event(current time millis): ", java.lang.Long.valueOf(r22), ", activityAddress=", a(r11.getClass().getName(), true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0221, code lost:
    
        r3 = r24;
        r24 = r27 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0227, code lost:
    
        if (r24 >= 20000) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0229, code lost:
    
        r9 = r0;
        r41 = r10;
        r42 = r6;
        r6 = r11;
        r11 = r14;
        r46 = r15;
        r38 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0246, code lost:
    
        if (r9.a(r9, r5, r11, true, r26) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0248, code lost:
    
        if (r14 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x024a, code lost:
    
        r8 = new com.safedk.android.analytics.brandsafety.m.a[2];
        r8[0] = new com.safedk.android.analytics.brandsafety.m.a("url", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0257, code lost:
    
        if (r48 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0259, code lost:
    
        r10 = com.safedk.android.analytics.events.RedirectEvent.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025e, code lost:
    
        r8[1] = new com.safedk.android.analytics.brandsafety.m.a(com.safedk.android.analytics.brandsafety.m.J, r10);
        com.safedk.android.analytics.brandsafety.b.a(r14, com.safedk.android.analytics.brandsafety.m.n, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025c, code lost:
    
        r10 = com.facebook.gamingservices.cloudgaming.internal.SDKConstants.PARAM_INTENT;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x049c A[Catch: all -> 0x052f, TryCatch #4 {all -> 0x052f, blocks: (B:40:0x0487, B:42:0x049c, B:45:0x04a3, B:47:0x04b1, B:49:0x04da, B:52:0x04df, B:55:0x04f6, B:58:0x0507, B:60:0x0523, B:141:0x03a8, B:144:0x03b0, B:147:0x03c4, B:157:0x03f0, B:159:0x043e, B:163:0x044a, B:165:0x0451, B:168:0x045d, B:170:0x046e), top: B:34:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0523 A[Catch: all -> 0x052f, TRY_LEAVE, TryCatch #4 {all -> 0x052f, blocks: (B:40:0x0487, B:42:0x049c, B:45:0x04a3, B:47:0x04b1, B:49:0x04da, B:52:0x04df, B:55:0x04f6, B:58:0x0507, B:60:0x0523, B:141:0x03a8, B:144:0x03b0, B:147:0x03c4, B:157:0x03f0, B:159:0x043e, B:163:0x044a, B:165:0x0451, B:168:0x045d, B:170:0x046e), top: B:34:0x0136 }] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Intent intent, String str, boolean z2) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        long j2;
        int i2;
        long j3;
        int i3;
        Activity foregroundActivity;
        String str5 = 2;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            Logger.printFullVerboseLog(q, "detect ad click started, current timestamp (elapsed)=", Long.valueOf(elapsedRealtime), ", sdk=", mainSdkPackage, ", intent=", com.safedk.android.utils.n.a(intent), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (!SafeDK.getInstance().s()) {
                return;
            }
            Logger.d(q, "detect ad click - should monitor");
            if (intent == null) {
                return;
            }
            Intent intent2 = (Intent) intent.clone();
            Logger.d(q, "detect ad click - intent cloned");
            int f2 = SafeDK.getInstance().f();
            Logger.d(q, "detect ad click - redirect click timeout is ", Integer.valueOf(f2));
            Uri data = intent2.getData();
            String a2 = a(mainSdkPackage, intent2);
            if (a2 != null) {
                Logger.d(q, "detect ad click - uri extracted from intent extras");
                uri = Uri.parse(a2);
            } else {
                uri = data;
            }
            if (uri != null) {
                str3 = uri.toString();
                try {
                    if (com.safedk.android.utils.n.p(uri.toString())) {
                        Logger.d(q, "detect ad click - Uri is a store url: ", uri);
                        str2 = uri.toString();
                    } else {
                        URL url = new URL(uri.toString());
                        Logger.d(q, "detect ad click - Uri is a standard url: ", url);
                        str2 = url.toString();
                    }
                } catch (MalformedURLException e2) {
                    Logger.d(q, "detect ad click - Uri is not a valid url: ", uri);
                    str2 = null;
                }
            } else {
                str2 = null;
                str3 = null;
            }
            String b2 = b(mainSdkPackage, intent2);
            w a3 = DetectTouchUtils.a(mainSdkPackage);
            long longValue = a3 == null ? 0L : a3.a.longValue();
            long longValue2 = a3 == null ? 0L : a3.b.longValue();
            String str6 = a3 == null ? null : a3.c;
            String str7 = a3 == null ? null : a3.d;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            a(mainSdkPackage, str3, b2, z2 ? RedirectEvent.j : null);
            try {
                if (!"android.intent.action.VIEW".equals(intent2.getAction()) && intent2.getAction() != null) {
                    str4 = q;
                    j2 = elapsedRealtime;
                    i2 = f2;
                    j3 = longValue;
                    i3 = 6;
                    Logger.d(str4, "detect ad click - Intent doesn't have url");
                    foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                    if (foregroundActivity != null) {
                        Logger.d(str4, "detect ad click - current foreground activity is null");
                        return;
                    }
                    if (a(intent)) {
                        return;
                    }
                    if (!h(foregroundActivity.getClass().getName())) {
                        Logger.d(str4, "detect ad click - activity ", foregroundActivity.getClass().getName(), " is not in the redirect tracked activities, ignoring");
                        return;
                    }
                    Object[] objArr = new Object[i3];
                    objArr[0] = "detect ad click - current elapsed realtime: ";
                    objArr[1] = Long.valueOf(elapsedRealtime2);
                    objArr[2] = ", webview last touched: ";
                    objArr[3] = Long.valueOf(j3);
                    objArr[4] = ", diff: ";
                    long j4 = elapsedRealtime2 - j3;
                    objArr[5] = Long.valueOf(j4);
                    Logger.d(str4, objArr);
                    if (j3 == 0 || j4 > i2) {
                        Logger.d(str4, "detect ad click - Redirecting through ad");
                        a(mainSdkPackage, j2, longValue2, r(mainSdkPackage) ? RedirectEvent.k : RedirectEvent.i, str2, foregroundActivity.getClass().getName());
                        return;
                    }
                    return;
                }
                str4 = q;
                j2 = elapsedRealtime;
                i2 = f2;
                j3 = longValue;
                i3 = 6;
                Logger.d(str4, "detect ad click - Intent doesn't have url");
                foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                if (foregroundActivity != null) {
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            str5 = q;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.BrandSafetyUtils.q, "found url in intent : ", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(String str, Intent intent) {
        AdNetworkDiscovery j2;
        Logger.d(q, "Attempting to extract url from intent extra, sdkPackageName is ", str, ", intent : ", com.safedk.android.utils.n.a(intent));
        String str2 = null;
        if (intent != null) {
            try {
                if (intent.getExtras() != null && (j2 = CreativeInfoManager.j(str)) != null) {
                    Iterator<String> it = j2.e().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        Logger.d(q, "looking for url in intent extra with name : ", next);
                        str2 = intent.getExtras().getString(next);
                        if (str2 != null) {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.e(q, "Exception when attempting to extract url from intent extra");
            }
        }
        return str2;
    }

    private static String b(String str, Intent intent) {
        AdNetworkDiscovery j2;
        Logger.d(q, "Attempting to extract expanded ad webview address from intent extra, sdkPackageName is ", str, ", intent: ", com.safedk.android.utils.n.a(intent));
        if (intent != null) {
            try {
                if (intent.getExtras() != null && (j2 = CreativeInfoManager.j(str)) != null) {
                    return j2.a(intent.getExtras());
                }
                return null;
            } catch (Throwable th) {
                Logger.e(q, "Exception when attempting to extract expanded ad webview address from intent extra");
                return null;
            }
        }
        return null;
    }

    public static void detectAdClick(final Uri uri, final String sdkPackageName) {
        if (com.safedk.android.utils.n.c()) {
            H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.5
                @Override // java.lang.Runnable
                public void run() {
                    BrandSafetyUtils.b(uri, sdkPackageName);
                }
            });
        } else {
            b(uri, sdkPackageName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Uri uri, String str) {
        boolean z2;
        RedirectDetails h2;
        try {
            Logger.d(q, "detect ad click Uri invoked, sdk=", str, ", url = ", uri.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(uri);
            if (com.safedk.android.utils.h.i.equals(str) && SafeDK.S()) {
                w a2 = DetectTouchUtils.a(str);
                long longValue = a2 == null ? 0L : a2.a.longValue();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int f2 = SafeDK.getInstance().f();
                if (longValue != 0 && elapsedRealtime - longValue <= f2) {
                    z2 = false;
                    if (z2 && ((h2 = h()) == null || h2.g == null || !h2.g.equals(uri.toString()))) {
                        try {
                            throw new Exception("redirect potential source");
                        } catch (Exception e2) {
                            Logger.d(q, "detect ad click, redirect potential source", e2);
                        }
                    }
                }
                z2 = true;
                if (z2) {
                    throw new Exception("redirect potential source");
                }
            }
            a(intent, str, true);
        } catch (Throwable th) {
            Logger.e(q, "detect ad click exception", th);
        }
    }

    private static boolean a(Intent intent) {
        int identityHashCode = System.identityHashCode(intent);
        if (u.contains(Integer.valueOf(identityHashCode))) {
            Logger.d(q, "mark intent as handled found ", Integer.valueOf(identityHashCode));
            return true;
        }
        if (u.size() >= 100) {
            Logger.d(q, "mark intent as handled > MAX events");
            u.remove(0);
        }
        Logger.d(q, "mark intent as handled add ", Integer.valueOf(identityHashCode));
        u.add(Integer.valueOf(identityHashCode));
        return false;
    }

    public static void a(String str, String str2, WebView webView) {
        InterstitialFinder z2;
        try {
            Logger.d(q, "attach loaded url to detected click started, sdk=", str, ", url=", str2, ", webview=", webView.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            SafeDK safeDK = SafeDK.getInstance();
            if (SafeDK.ab() && safeDK != null && str2 != null) {
                if (!str2.equals(AndroidWebViewClient.BLANK_PAGE) && !str2.equals("About:blank")) {
                    AdNetworkDiscovery j2 = CreativeInfoManager.j(str);
                    if (j2 != null && j2.k(str2)) {
                        Logger.d(q, "url should be ignored (by discovery class), skipping");
                        return;
                    }
                    if ((str2.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v) || str2.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u)) && (z2 = SafeDK.getInstance().z()) != null) {
                        z2.a(str2, str, a((Object) webView));
                    }
                    if (!SafeDK.b() || StatsCollector.c() == null) {
                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null, skipping");
                    } else {
                        ConcurrentHashMap<String, StatsEvent> a2 = StatsCollector.c().a(StatsCollector.EventType.redirect);
                        Iterator<String> it = a2.keySet().iterator();
                        while (it.hasNext()) {
                            RedirectEvent redirectEvent = (RedirectEvent) a2.get(it.next());
                            if (redirectEvent.k().equals(str) && redirectEvent.f() == null) {
                                Logger.d(q, "Attaching url to url-less redirect event. event = ", redirectEvent.toString(), ", url = ", str2);
                                redirectEvent.a(str2);
                            }
                        }
                    }
                    return;
                }
                Logger.d(q, "url is blank, skipping");
                return;
            }
            Logger.d(q, "attach loaded url to detected click loaded url is empty or app not initialized yet, skipping.");
        } catch (Throwable th) {
            Logger.e(q, "failed to attach url to detected click (internal browser)", th);
        }
    }

    static String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(byteArray, 0, byteArray.length);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e2) {
            Logger.e(q, "Failed to get hash value for bitmap", e2);
            return "";
        }
    }

    static String a(Bitmap bitmap, AdType adType, String str, String str2, String str3, ScreenShotOrientation screenShotOrientation) {
        return b(bitmap, a(adType, str, str2, str3, screenShotOrientation), 90);
    }

    public static String a(Bitmap bitmap, String str, int i2) {
        return b(bitmap, str, i2);
    }

    static String b(Bitmap bitmap, String str, int i2) {
        if (new File(str).exists()) {
            new File(str).delete();
            Logger.d(q, "found existing file, deleted : ", str);
        }
        Logger.d(q, "Saving image to file: ", str);
        FileOutputStream fileOutputStream = null;
        try {
            Logger.d(q, "Saving screenshot to file ", str);
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i2, fileOutputStream2);
                try {
                    fileOutputStream2.close();
                    return str;
                } catch (IOException e2) {
                    Logger.e(q, "Failed to save screenshot to file (fos close) , error : ", e2.getMessage(), e2);
                    return "";
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    Logger.e(q, "Failed to save screenshot to file, error : ", th.getMessage(), th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            Logger.e(q, "Failed to save screenshot to file (fos close) , error : ", e3.getMessage(), e3);
                            return "";
                        }
                    }
                    return "";
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            Logger.e(q, "Failed to save screenshot to file (fos close) , error : ", e4.getMessage(), e4);
                            return "";
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static void a(String str, AdType adType, String str2, String str3, String str4, ScreenShotOrientation screenShotOrientation) {
        if (str == null) {
            return;
        }
        String replace = a(adType, str2, str3, str4, screenShotOrientation).replace(a, b);
        Logger.d(q, "Saving ad text to file: ", replace);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(replace);
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.close();
                    fileOutputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        Logger.e(q, "Failed to save ad text to file", th);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th2) {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (IOException e3) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(String str, boolean z2) {
        try {
            if (str == null) {
                Logger.d(q, "Parameter name 'activityName' cannot be null");
                return null;
            }
            String[] split = str.split("@");
            return split.length > 1 ? split[z2 ? (char) 1 : (char) 0] : "";
        } catch (Throwable th) {
            Logger.e(q, "Failed to get activity address for ", str, th);
            return "";
        }
    }

    public static long c(String str) {
        try {
            return new File(str).length();
        } catch (Throwable th) {
            Logger.e(q, "Failed to create new file for screenshot", th);
            return 0L;
        }
    }

    static synchronized void d(String str) {
        synchronized (BrandSafetyUtils.class) {
            if (str != null) {
                Logger.d(q, "remove ad files started, filepath ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                if (new File(str).exists()) {
                    if (!new File(str).delete()) {
                        Logger.d(q, "remove ad files failed to delete file ", str);
                    } else {
                        Logger.d(q, "remove ad files deleted file ", str);
                    }
                } else {
                    Logger.d(q, "remove ad files filePath does not exist. file=", str);
                }
                File file = new File(str.replace(a, b));
                if (file.exists()) {
                    Logger.d(q, "remove ad files deleting file ", file.getAbsolutePath());
                    if (!file.delete()) {
                        Logger.d(q, "remove ad files failed to delete file ", file.getAbsolutePath());
                    }
                }
            }
        }
    }

    static synchronized void a(AdType adType, String str) {
        synchronized (BrandSafetyUtils.class) {
            Logger.d(q, "remove all ad files started, adType = ", adType.name(), " , impression = ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (str.contains("_")) {
                String str2 = str.split("_")[1];
                File file = new File(SafeDK.getInstance().ae() + adType);
                Logger.d(q, "remove all ad files impressionId = ", str2);
                File[] listFiles = file.listFiles(new b(str2));
                if (listFiles != null && listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        Logger.d(q, "remove all ad files deleting file for impression ", str2, " : ", file2.getAbsolutePath());
                        d(file2.getAbsolutePath());
                    }
                }
            }
        }
    }

    public static String a(Class cls) {
        return e(cls.getName());
    }

    public static String e(String str) {
        if (str != null) {
            return g(str) ? com.safedk.android.utils.h.h : SdksMapping.getSdkPackageByClass(str);
        }
        return null;
    }

    public static String b(Class cls) {
        String name = cls.getName();
        String e2 = e(name);
        if (e2 == null) {
            e2 = name;
        }
        Logger.v(q, "SDK package for class ", name, " is ", e2);
        return e2 == null ? "unknown" : e2;
    }

    public static boolean f(String str) {
        return g(str) || SdksMapping.getSdkPackageByClass(str) != null;
    }

    public static boolean g(String str) {
        if (str.startsWith("maps.bi.f") || str.startsWith("avu") || str.startsWith(MobileAds.ERROR_DOMAIN)) {
            return true;
        }
        return false;
    }

    public static a a(String str, Bitmap bitmap) {
        return a(str, bitmap, 1000, AdType.INTERSTITIAL);
    }

    public static a b(String str, Bitmap bitmap) {
        return a(str, bitmap, 500, AdType.BANNER);
    }

    private static a a(String str, Bitmap bitmap, int i2, AdType adType) {
        a aVar = new a();
        Random random = new Random();
        HashMap hashMap = new HashMap();
        Logger.d(q, "bitmap scan started, sdkPackage = ", str, ", adType = ", adType.name(), " bitmap scan : margins are : top ", Float.valueOf(CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_TOP_MARGIN_PERCENT, 0.2f)), " , right ", Float.valueOf(CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_RIGHT_MARGIN_PERCENT, 0.2f)), ", left ", Float.valueOf(CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_LEFT_MARGIN_PERCENT, 0.2f)), ", right ", Float.valueOf(CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, 0.2f)), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        float width = bitmap.getWidth();
        int i3 = (int) (r8 * width);
        int i4 = (int) (width - (r7 * width));
        float height = bitmap.getHeight();
        int i5 = (int) (r5 * height);
        int i6 = (int) (height - (r6 * height));
        for (int i7 = 0; i7 < i2; i7++) {
            int pixel = bitmap.getPixel(random.nextInt(i4 - i3) + i3, random.nextInt(i6 - i5) + i5) & 16777215;
            Integer num = (Integer) hashMap.get(Integer.valueOf(pixel));
            if (num == null) {
                hashMap.put(Integer.valueOf(pixel), 1);
            } else {
                hashMap.put(Integer.valueOf(pixel), Integer.valueOf(num.intValue() + 1));
            }
        }
        Iterator it = hashMap.values().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue > i8) {
                aVar.a(intValue);
                i8 = intValue;
            }
        }
        int a2 = a(hashMap, 0, 26);
        int i9 = (a2 * 100) / i2;
        aVar.b(i9);
        int a3 = a(hashMap, x, 10);
        int i10 = (a3 * 100) / i2;
        aVar.c(i10);
        int a4 = a(hashMap, y, 10);
        int i11 = (a4 * 100) / i2;
        aVar.d(i11);
        Logger.d(q, "bitmap scan, pixel percentages: black=", Integer.valueOf(i9), "% (", Integer.valueOf(a2), "/", Integer.valueOf(i2), ")", ", gray-1=", Integer.valueOf(i10), "% (", Integer.valueOf(a3), "/", Integer.valueOf(i2), ")", ", gray-2=", Integer.valueOf(i11), "% (", Integer.valueOf(a4), "/", Integer.valueOf(i2), ")");
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            aVar.a(a((Map<Integer, Integer>) hashMap));
        }
        return aVar;
    }

    private static boolean a(Map<Integer, Integer> map) {
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (Color.red(intValue) != Color.blue(intValue) || Color.blue(intValue) != Color.green(intValue)) {
                Logger.d(q, "Image is not Greyscale");
                return false;
            }
        }
        Logger.d(q, "Image is Greyscale");
        return true;
    }

    private static int d(int i2) {
        return (i2 >> 16) & 255;
    }

    private static int e(int i2) {
        return (i2 >> 8) & 255;
    }

    private static int f(int i2) {
        return i2 & 255;
    }

    private static boolean a(int i2, int i3, int i4) {
        return Math.abs(d(i2) - d(i3)) <= i4 && d(i2) == e(i2) && d(i2) == f(i2);
    }

    private static int a(Map<Integer, Integer> map, int i2, int i3) {
        int i4 = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (a(entry.getKey().intValue(), i2, i3)) {
                i4 += entry.getValue().intValue();
            }
        }
        return i4;
    }

    public static boolean a(int i2) {
        return a(i2, 1000, SafeDK.getInstance().G());
    }

    public static boolean b(int i2) {
        return a(i2, 500, SafeDK.getInstance().W());
    }

    public static boolean c(int i2) {
        return b(i2);
    }

    private static boolean a(int i2, int i3, float f2) {
        Logger.d(q, "isScreenshotEnough Max Uniform Pixel Percentage to Stop Sampling is ", Float.valueOf(f2));
        return ((float) i2) < (f2 / 100.0f) * ((float) i3);
    }

    public static ScreenshotValidity a(String str, a aVar) {
        return a(str, aVar, 1000, CreativeInfoManager.a(str, AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, SafeDK.getInstance().H()));
    }

    public static ScreenshotValidity b(String str, a aVar) {
        return a(str, aVar, 500, SafeDK.getInstance().X());
    }

    public static ScreenshotValidity c(String str, a aVar) {
        return b(str, aVar);
    }

    public static ScreenshotValidity a(String str, a aVar, int i2, float f2) {
        Logger.d(q, "screenshot validity check started, number of samples: ", Integer.valueOf(i2), ", BitmapScanResult: ", aVar);
        if (aVar.b() > 98) {
            Logger.d(q, "screenshot validity check, black pixel percentage is above threshold, image is black (not valid)");
            return ScreenshotValidity.UNIFORMITY_BLACK;
        }
        int a2 = (aVar.a() * 100) / i2;
        if (a2 > 98) {
            Logger.d(q, "screenshot validity check, uniform pixel count is ", Integer.valueOf(a2), "% => above threshold, image is uniform (not valid)");
            return ScreenshotValidity.UNIFORMITY_VERY_HIGH;
        }
        if (a2 > f2) {
            Logger.d(q, "screenshot validity check, uniformity check : Screenshot max color pixel count is above uniformity threshold, image is not valid (result = ", Integer.valueOf(a2), "%)");
            return ScreenshotValidity.UNIFORMITY_HIGH;
        }
        if (aVar.b() > 10 && (aVar.c() > 10 || aVar.d() > 10)) {
            Logger.d(q, "screenshot validity check, black=", Integer.valueOf(aVar.b()), "% , grey-1=", Integer.valueOf(aVar.c()), "% , grey-2=", Integer.valueOf(aVar.d()), "%, => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (aVar.c() > 50 || aVar.d() > 50) {
            Logger.d(q, "screenshot validity check, grey-1=", Integer.valueOf(aVar.c()), "%, grey-2=", Integer.valueOf(aVar.d()), "%  => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            if (aVar.e()) {
                Logger.d(q, "screenshot validity check, Screenshot is NSFD");
                return ScreenshotValidity.NOT_SUITABLE_FOR_DASHBOARD;
            }
            Logger.d(q, "screenshot validity check, Screenshot is NOT NSFD");
        }
        return ScreenshotValidity.VALID;
    }

    public static String a(AdType adType, String str, String str2, String str3, ScreenShotOrientation screenShotOrientation) {
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str2);
        Logger.d(q, "getFileName Sdk UUID is ", sdkUUIDByPackage, " for sdk ", str2);
        return SafeDK.getInstance().ae() + adType + File.separator + str + "_" + sdkUUIDByPackage + "_" + str3 + "_" + screenShotOrientation.name().toLowerCase() + a;
    }

    public static boolean c(Class cls) {
        return h(cls.getName());
    }

    public static boolean h(String str) {
        Logger.d(q, "Internal browser activity check started, Activity name : ", str, ", result : ", Boolean.valueOf(s.contains(str)), ", redirectDetectionInterstitialActivities= ", s);
        return s.contains(str);
    }

    public static boolean d(Class cls) {
        return i(cls.getName());
    }

    public static boolean i(String str) {
        Logger.d(q, "Interstitial activity check started, Activity name : ", str, ", result : ", Boolean.valueOf(r.contains(str)), ", interstitialActivities= ", r);
        return r.contains(str);
    }

    public static String j(String str) {
        for (String str2 : r) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return "";
    }

    public static com.safedk.android.analytics.brandsafety.c k(String str) {
        if (str != null) {
            Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().y().iterator();
            while (it.hasNext()) {
                com.safedk.android.analytics.brandsafety.c l2 = it.next().l(str);
                if (l2 != null) {
                    return l2;
                }
            }
            return null;
        }
        return null;
    }

    public static com.safedk.android.analytics.brandsafety.c l(String str) {
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && str != null) {
            Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().y().iterator();
            while (it.hasNext()) {
                com.safedk.android.analytics.brandsafety.c c2 = it.next().c(str);
                if (c2 != null) {
                    return c2;
                }
            }
        }
        return null;
    }

    public static void m(String str) {
        Logger.d(q, "addInterstitialActivity started name=", str);
        r.add(str);
    }

    public static void n(String str) {
        Logger.d(q, "removeInterstitialActivity started name=", str);
        r.remove(str);
    }

    public static int b(AdType adType) {
        try {
            Logger.d(q, "get image count by ad type started, adType = ", adType.name(), " : ", adType);
            File file = new File(SafeDK.getInstance().ae() + adType);
            File[] listFiles = file.listFiles();
            String str = "";
            for (File file2 : listFiles) {
                str = str + ", " + file2.getName();
            }
            Logger.d(q, "get image count by ad type all files in ", file.getName(), " : ", str);
            Logger.d(q, "get image count by ad type returned ", Integer.valueOf(listFiles.length), " for adType ", adType.name());
            return listFiles.length;
        } catch (Throwable th) {
            Logger.d(q, "get image count by ad type  error :  ", th.getMessage(), th);
            return -1;
        }
    }

    public static List<d> c(AdType adType) {
        String str;
        ScreenShotOrientation screenShotOrientation;
        ArrayList arrayList = new ArrayList();
        try {
            Logger.d(q, "Restoring ", adType, " images for upload", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            File[] listFiles = new File(SafeDK.getInstance().ae() + adType).listFiles(new c());
            if (listFiles != null) {
                Logger.d(q, "Found ", Integer.valueOf(listFiles.length), " candidate images for upload");
                for (File file : listFiles) {
                    String name = file.getName();
                    Logger.d(q, "Checking file ", name);
                    String absolutePath = file.getAbsolutePath();
                    File file2 = new File(absolutePath.replace(a, b));
                    Logger.d(q, "Deleting file ", file.getAbsolutePath());
                    file.delete();
                    if (file2.exists()) {
                        file2.delete();
                    }
                    String[] split = name.replace(a, "").split("_");
                    if (split.length == 4) {
                        String str2 = split[0];
                        String str3 = split[1];
                        Logger.d(q, "sdk = ", split[1]);
                        if (SdksMapping.getSdkPackageByPackageUUID(split[1]) == null) {
                            str = str3;
                        } else {
                            String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(split[1]);
                            Logger.d(q, "sdk value replaced : ", sdkPackageByPackageUUID);
                            str = sdkPackageByPackageUUID;
                        }
                        String str4 = split[2];
                        try {
                            screenShotOrientation = ScreenShotOrientation.valueOf(split[3].toUpperCase());
                        } catch (IllegalArgumentException e2) {
                            screenShotOrientation = ScreenShotOrientation.NOT_INITIALIZED;
                        }
                        Logger.d(q, "Restore image for upload: ", absolutePath);
                        arrayList.add(new d(str2, str, str4, screenShotOrientation, absolutePath, null));
                    }
                }
            }
        } catch (Throwable th) {
            Logger.d(q, "Error while restoring ads for upload", th);
            new CrashReporter().caughtException(th);
        }
        return arrayList;
    }

    private static void j() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().m().getResources().getDisplayMetrics();
        M = displayMetrics.heightPixels;
        L = displayMetrics.widthPixels;
    }

    static int a() {
        if (L == 0) {
            j();
        }
        return L;
    }

    static int b() {
        if (M == 0) {
            j();
        }
        return M;
    }

    static ScreenShotOrientation c() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().m().getResources().getDisplayMetrics();
        return displayMetrics.heightPixels > displayMetrics.widthPixels ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    static ScreenShotOrientation b(Bitmap bitmap) {
        if (bitmap == null) {
            return ScreenShotOrientation.NOT_INITIALIZED;
        }
        return bitmap.getHeight() > bitmap.getWidth() ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    public static String o(String str) {
        if (str != null) {
            String[] split = str.split("@");
            if (split.length > 1) {
                return split[1];
            }
            return "";
        }
        return "";
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Integer.toHexString(obj.hashCode());
    }

    public static class d {
        String a;
        String b;
        String c;
        ScreenShotOrientation d;
        String e;
        String f;

        public d(String str, String str2, String str3, ScreenShotOrientation screenShotOrientation, String str4, String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = screenShotOrientation;
            this.e = str4;
            this.f = str5;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public ScreenShotOrientation d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public String f() {
            return this.f;
        }
    }

    private static void a(String str, long j2, long j3, String str2, String str3, String str4) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "Report click url with no impression to server starting, sdkPackageName=", str, ", url=", str3, ", currentForegroundActivityName=", str4, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                if (!e.a(str)) {
                    Logger.d(q, "Redirect reporting not supported for Sdk ", str, ", report will not be sent");
                    return;
                }
                if (str3 == null) {
                    return;
                }
                Uri parse = Uri.parse(str3);
                if (parse.getScheme() != null && parse.getHost() != null) {
                    if (e.a(str, str3)) {
                        Logger.d(q, "Ignoring this intent as it was already reported , sdkPackageName=", str, " ,intentUrl=", str);
                        return;
                    }
                    RedirectEvent redirectEvent = new RedirectEvent(str, str3, str2, str4, j2, j3);
                    redirectEvent.a(q.a().b());
                    if (SafeDK.b()) {
                        StatsCollector.c().a(redirectEvent);
                    } else {
                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null, skipping");
                    }
                }
            } catch (Throwable th) {
                Logger.e(q, "Exception during attempt to create redirect event", th);
            }
        }
    }

    private static class e {
        private static final String a = "SdkUrlRedirectManager";
        private static Map<String, Long> b = new HashMap();
        private static int c = 1000;

        private e() {
        }

        private static String b(String str, String str2) {
            return str + "_" + str2;
        }

        private static boolean c(String str, String str2) {
            Logger.d(a, "Check : does timestamp exist for Sdk and url ?  sdkPackageName=", str, ", url=", str2, " , result = ", Boolean.valueOf(b.containsKey(b(str, str2))));
            return b.containsKey(b(str, str2));
        }

        private static long d(String str, String str2) {
            Logger.d(a, "getting latest timestamp for Sdk and url started. sdkPackageName=", str, ", url=", str2);
            if (c(str, str2)) {
                return b.get(b(str, str2)).longValue();
            }
            return 0L;
        }

        public static boolean a(String str, String str2) {
            long currentTimeMillis = System.currentTimeMillis();
            a();
            long d = d(str, str2);
            Logger.d(a, "Checking if we should ignore the redirect instance sdkPackageName=", str, ", url=", str2, ", timestamp=", Long.valueOf(currentTimeMillis), ",System.currentTimeMillis()=", Long.valueOf(System.currentTimeMillis()), ", latestTimestamp=", Long.valueOf(d), ", diff=", Long.valueOf(System.currentTimeMillis() - d));
            if (d != 0 && System.currentTimeMillis() - d < c) {
                Logger.d(a, "should ignore this redirect.");
                return true;
            }
            a(str, str2, currentTimeMillis);
            return false;
        }

        private static void a(String str, String str2, long j) {
            Logger.d(a, "Update latest timestamp for Sdk and url started. sdkPackageName=", str, ", url=", str2);
            b.put(b(str, str2), Long.valueOf(j));
            Logger.d(a, "timestamps : ", b.toString());
        }

        private static void a() {
            Logger.d(a, "Clear data started, (", Integer.valueOf(b.size()), ") : ", b.toString());
            ArrayList<String> arrayList = new ArrayList();
            for (String str : b.keySet()) {
                Logger.d(a, "Clear System.currentTimeMillis()-sdkAndUrlToTimestamp.get(key)=", Long.valueOf(System.currentTimeMillis() - b.get(str).longValue()));
                if (System.currentTimeMillis() - b.get(str).longValue() > c) {
                    Logger.d(a, "Added key for removal : ", str);
                    arrayList.add(str);
                }
            }
            if (arrayList.size() > 0) {
                for (String str2 : arrayList) {
                    Logger.d(a, "Removing key ", str2);
                    b.remove(str2);
                }
            }
            Logger.d(a, "Clear data finished, Items (", Integer.valueOf(b.size()), ") : ", b.toString());
        }

        public static boolean a(String str) {
            String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str);
            if (sdkUUIDByPackage != null && sdkUUIDByPackage.length() > 0 && SdksMapping.getRedirectSupportedSdks() != null) {
                Logger.d(a, "sdk=", str, ", sdkUid=", sdkUUIDByPackage, ", supported ? ", Boolean.valueOf(SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage)));
                return SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage);
            }
            Logger.d(a, "Cannot determine if sdk is redirect detection supported, sdk=", str);
            return false;
        }
    }

    public static void p(String str) {
        Logger.d(q, "adding to redirect current open fullscreen ad collection. sdk = ", str, ", redirectDetectionCurrentInterstitialBySdk = ", t.toString());
        t.add(str);
    }

    public static void q(String str) {
        Logger.d(q, "removing from redirect current open fullscreen ad collection. sdk = ", str, ", redirectDetectionCurrentInterstitialBySdk = ", t.toString());
        t.remove(str);
    }

    public static boolean r(String str) {
        Logger.d(q, "checking if there is a redirect current open fullscreen ad in collection. sdk = ", str, ", result is ", Boolean.valueOf(t.contains(str)), ", redirectDetectionCurrentInterstitialBySdk = ", t.toString());
        return t.contains(str);
    }

    public static class a {
        private static final String a = "BitmapScanResult";
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f = false;

        public int a() {
            return this.b;
        }

        public void a(int i) {
            this.b = i;
        }

        public int b() {
            return this.c;
        }

        public void b(int i) {
            this.c = i;
        }

        public int c() {
            return this.d;
        }

        public void c(int i) {
            this.d = i;
        }

        public int d() {
            return this.e;
        }

        public void d(int i) {
            this.e = i;
        }

        public boolean e() {
            return this.c > 50 && this.f;
        }

        public void a(boolean z) {
            this.f = z;
        }

        public String toString() {
            return "{max count: " + this.b + ", black: " + this.c + "%, gray-1: " + this.d + "%, gray-2: " + this.e + "%}";
        }
    }

    public static String s(String str) {
        if (new File(str).exists()) {
            try {
                return new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(a(new File(str)))).toString(16);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
        return "";
    }

    public static String a(byte[] bArr) {
        try {
            return new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(bArr)).toString(16);
        } catch (NoSuchAlgorithmException e2) {
            return "";
        }
    }

    private static byte[] a(File file) {
        byte[] bArr = new byte[100];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception e2) {
            Logger.d(q, "Exception reading file : ", e2.getMessage(), e2);
            return null;
        }
    }

    public static void onMraidOpen(String sdkPackageName, String urlJsonString, Object obj, String originatedMethod) {
        if (SafeDK.ab()) {
            Logger.d(q, "on mraid open, sdk: ", sdkPackageName, ", urlJsonString: ", urlJsonString, ", object: ", obj, ", originated method: ", originatedMethod);
            if (obj != null && urlJsonString != null) {
                try {
                    onMraidOpen(sdkPackageName, new JSONObject(urlJsonString), obj, originatedMethod);
                } catch (JSONException e2) {
                    Logger.d(q, "on mraid open, failed build a JSON object: ", urlJsonString);
                }
            }
        }
    }

    public static void onMraidOpen(String sdkPackageName, JSONObject urlJsonObject, Object obj, String originatedMethod) {
        Object obj2;
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "on mraid open, sdk: ", sdkPackageName, ", urlJsonObject: ", urlJsonObject, ", object: ", obj, ", originated method: ", originatedMethod);
                if (obj != null && urlJsonObject != null) {
                    String optString = urlJsonObject.optString("url");
                    Logger.d(q, "on mraid open, url: ", optString);
                    ArrayList<Field> arrayList = new ArrayList();
                    for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                        arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
                    }
                    for (Field field : arrayList) {
                        try {
                            field.setAccessible(true);
                            obj2 = field.get(obj);
                        } catch (IllegalAccessException e2) {
                            Logger.d(q, "on mraid open, failed to get webview from: ", obj);
                        }
                        if (obj2 instanceof WebView) {
                            onMraidOpen(sdkPackageName, null, optString, (WebView) obj2, originatedMethod);
                            return;
                        }
                        continue;
                    }
                }
            } catch (Throwable th) {
                Logger.d(q, "on mraid open exception: ", th);
            }
        }
    }

    public static void onMraidExpand(String sdkPackageName, String urlJsonString, Object obj, String originatedMethod) {
        String str;
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "on mraid expand, sdk: ", sdkPackageName, ", urlJsonString: ", urlJsonString, ", object: ", obj, ", originated method: ", originatedMethod);
                if (obj != null && urlJsonString != null) {
                    try {
                        str = new JSONObject(urlJsonString).optString("url");
                    } catch (JSONException e2) {
                        Logger.d(q, "on mraid expand, failed to get url from: ", urlJsonString);
                        str = null;
                    }
                    for (Field field : obj.getClass().getFields()) {
                        try {
                            if (field.get(obj) instanceof WebView) {
                                onMraidExpand(sdkPackageName, null, str, (WebView) field.get(obj), originatedMethod);
                            }
                        } catch (IllegalAccessException e3) {
                            Logger.d(q, "on mraid expand, failed to get webview from: ", obj);
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.d(q, "on mraid expand exception: ", th);
            }
        }
    }

    public static void onMraidOpen(final String sdkPackageName, String str, final String url, final WebView view, final String originatedMethod) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, Logger.FeatureTag.REDIRECTS, "on mraid open, sdk: ", sdkPackageName, ", str: ", str, ", url: ", url, ", webview: ", view, ", originated method: ", originatedMethod);
                if (sdkPackageName != null && url != null) {
                    H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.6
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                BrandSafetyUtils.a(sdkPackageName, view, url, RedirectDetails.RedirectType.REDIRECT, originatedMethod);
                            } catch (Throwable th) {
                                Logger.e(BrandSafetyUtils.q, "exception while handling mraid open", th);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                Logger.d(q, "on mraid open exception: ", th);
            }
        }
    }

    public static void onMraidExpand(final String sdkPackageName, String str, final String url, final WebView view, final String originatedMethod) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, Logger.FeatureTag.REDIRECTS, "on mraid expand, sdk: ", sdkPackageName, ", str: ", str, ", url: ", url, ", webview: ", view, ", originated method: ", originatedMethod);
                if (sdkPackageName != null) {
                    H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.7
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                BrandSafetyUtils.a(sdkPackageName, view, url, RedirectDetails.RedirectType.EXPAND, originatedMethod);
                            } catch (Throwable th) {
                                Logger.e(BrandSafetyUtils.q, "exception while handling mraid expand", th);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                Logger.d(q, "on mraid expand exception: ", th);
            }
        }
    }

    public static void onMraidProcessExpand(String sdkPackageName, String url) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "on mraid process expand, sdk: ", sdkPackageName, ", url: ", url);
                a(sdkPackageName, url, (String) null, RedirectEvent.i);
            } catch (Throwable th) {
                Logger.d(q, "on mraid process expand exception: ", th);
            }
        }
    }

    public static void onMraidWasExpanded(String sdkPackageName) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "on mraid was expanded, sdk: ", sdkPackageName);
                t(sdkPackageName);
            } catch (Throwable th) {
                Logger.d(q, "on mraid was expand exception: ", th);
            }
        }
    }

    public static boolean a(String str, WebView webView) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String a2 = a((Object) webView);
        w a3 = DetectTouchUtils.a(str, a2);
        long longValue = a3 == null ? 0L : a3.a.longValue();
        boolean z2 = elapsedRealtime - longValue < 20000;
        Logger.d(q, "is ad clicked recently - for package: ", str, " and view address: ", a2, " returned: ", Boolean.valueOf(z2), " last touch event: ", Long.valueOf(longValue), " vs current: ", Long.valueOf(elapsedRealtime));
        return z2;
    }

    public static void onWebViewPageCommitVisible(String sdkPackage, WebView webView, String url) {
        if (SafeDK.ab()) {
            Logger.d(q, "WebView page commit visible, sdk: ", sdkPackage, ", webView : ", webView, ", url ", url);
        }
    }

    public static void onWebViewPageStarted(final String sdkPackage, WebView webView, final String url) {
        com.safedk.android.analytics.brandsafety.c c2;
        CreativeInfo j2;
        if (SafeDK.ab()) {
            try {
                SafeDKWebAppInterface.a(sdkPackage, webView, url, false);
                final String a2 = a((Object) webView);
                InterstitialFinder z2 = SafeDK.getInstance().z();
                if (z2 == null || (c2 = z2.c(a2)) == null || (j2 = c2.j()) == null || !j2.aq()) {
                    Logger.d(q, "WebView page started, sdk: ", sdkPackage, ", webView : ", webView, ", url ", url);
                    H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.8
                        @Override // java.lang.Runnable
                        public void run() {
                            com.safedk.android.analytics.brandsafety.a aVar;
                            try {
                                z zVar = (z) BrandSafetyUtils.I.get(a2);
                                if (zVar != null && zVar.a().equals(url) && zVar.d().equals(sdkPackage)) {
                                    zVar.a(url);
                                    Iterator it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().z()).iterator();
                                    while (it.hasNext() && ((aVar = (com.safedk.android.analytics.brandsafety.a) it.next()) == null || !aVar.a(sdkPackage, zVar))) {
                                    }
                                    Logger.d(BrandSafetyUtils.q, "handle website opened, started loading: ", BrandSafetyUtils.I);
                                    BrandSafetyUtils.b(zVar, a2, "commit");
                                }
                            } catch (Throwable th) {
                                Logger.e(BrandSafetyUtils.q, "exception while WebView page started", th);
                            }
                        }
                    });
                } else {
                    Logger.d(q, "WebView page started, ignore url from website end card");
                }
            } catch (Throwable th) {
                Logger.d(q, "WebView page started exception: ", th);
            }
        }
    }

    public static void onWebViewReceivedError(final String sdkPackage, WebView webView, int errorCode, String description, final String failingUrl) {
        com.safedk.android.analytics.brandsafety.c c2;
        CreativeInfo j2;
        if (SafeDK.ab()) {
            try {
                final String a2 = a((Object) webView);
                InterstitialFinder z2 = SafeDK.getInstance().z();
                if (z2 == null || (c2 = z2.c(a2)) == null || (j2 = c2.j()) == null || !j2.aq()) {
                    Logger.d(q, "WebView received error, sdk: ", sdkPackage, ", webView: ", webView.toString(), ", errorCode: ", Integer.valueOf(errorCode), ", description: ", description, ", failingUrl: ", failingUrl);
                    H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.9
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                z zVar = (z) BrandSafetyUtils.I.get(a2);
                                if (zVar != null && zVar.a().equals(failingUrl) && zVar.d().equals(sdkPackage)) {
                                    BrandSafetyUtils.I.remove(a2);
                                    Logger.d(BrandSafetyUtils.q, "handle suspicion of website loaded into banner, load failed: ", BrandSafetyUtils.I);
                                    BrandSafetyUtils.b(zVar, a2, X3.g.e);
                                }
                            } catch (Throwable th) {
                                Logger.e(BrandSafetyUtils.q, "exception while WebView received error", th);
                            }
                        }
                    });
                } else {
                    Logger.d(q, "WebView received error, ignore url from website end card");
                }
            } catch (Throwable th) {
                Logger.d(q, "WebView received error exception: ", th);
            }
        }
    }

    public static void onWebViewReceivedError(String sdkPackage, WebView webView, WebResourceRequest request, WebResourceError error) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "WebView received error, sdk: ", sdkPackage, ", webView: ", webView.toString(), ", request: ", request, ", error: ", error);
                if (Build.VERSION.SDK_INT >= 23) {
                    onWebViewReceivedError(sdkPackage, webView, error.getErrorCode(), error.getDescription().toString(), request.getUrl() != null ? request.getUrl().toString() : "");
                } else {
                    onWebViewReceivedError(sdkPackage, webView, -1, "", "");
                }
            } catch (Throwable th) {
                Logger.d(q, "WebView received error exception: ", th);
            }
        }
    }

    public static void onShouldOverrideUrlLoading(String sdkPackageName, WebView view, String url, boolean ret) {
        com.safedk.android.analytics.brandsafety.c c2;
        CreativeInfo j2;
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "on should override url loading, sdk: ", sdkPackageName, ", webview: ", view, ", url: ", url, ", ret: ", Boolean.valueOf(ret));
                CreativeInfoManager.a(sdkPackageName, view, url);
                String a2 = a((Object) view);
                if (sdkPackageName != null && view != null && url != null) {
                    com.safedk.android.analytics.brandsafety.c l2 = l(a2);
                    String str = "cancel";
                    if (l2 != null) {
                        m.a[] aVarArr = new m.a[3];
                        aVarArr[0] = new m.a("api", "so");
                        aVarArr[1] = new m.a("url", url);
                        if (!ret) {
                            str = "allow";
                        }
                        aVarArr[2] = new m.a(m.Q, str);
                        l2.a(m.v, aVarArr);
                    } else {
                        m.a[] aVarArr2 = new m.a[3];
                        aVarArr2[0] = new m.a("api", "so");
                        aVarArr2[1] = new m.a("url", url);
                        if (!ret) {
                            str = "allow";
                        }
                        aVarArr2[2] = new m.a(m.Q, str);
                        com.safedk.android.analytics.brandsafety.b.a(a2, m.v, aVarArr2);
                    }
                    if (ret) {
                        a(sdkPackageName, view, url, a2);
                        return;
                    }
                    InterstitialFinder z2 = SafeDK.getInstance().z();
                    if (z2 != null && (c2 = z2.c(a2)) != null && (j2 = c2.j()) != null && j2.aq()) {
                        Logger.d(q, "on should override url loading, ignore url from website end card");
                    } else {
                        a(sdkPackageName, url, a2);
                    }
                }
            } catch (Throwable th) {
                Logger.d(q, "on should override url loading exception: ", th);
            }
        }
    }

    public static void onShouldOverrideUrlLoading(String sdkPackageName, WebView view, WebResourceRequest webResourceRequest, boolean ret) {
        if (SafeDK.ab() && Build.VERSION.SDK_INT >= 21 && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            onShouldOverrideUrlLoading(sdkPackageName, view, webResourceRequest.getUrl().toString(), ret);
        }
    }

    public static void onWebChromeClientCreateWindow(String sdkPackageName, WebView view, Message msg, boolean ret) {
        if (SafeDK.ab() && sdkPackageName != null && view != null && msg != null && ret) {
            try {
                WebView webView = ((WebView.WebViewTransport) msg.obj).getWebView();
                Logger.d(q, "on web chrome client create window, sdk: ", sdkPackageName, ", view: ", view, ", transport view: ", webView);
                if (webView != null) {
                    J.put(a((Object) webView), new WeakReference<>(view));
                }
            } catch (Throwable th) {
                Logger.d(q, "on web chrome client create window exception: ", th);
            }
        }
    }

    private static void a(final String str, final WebView webView, final String str2, final String str3) {
        H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdNetworkDiscovery j2 = CreativeInfoManager.j(str);
                    if (j2 != null) {
                        RedirectDetails.RedirectType l2 = j2.l(str2);
                        String m2 = j2.m(str2);
                        Logger.d(BrandSafetyUtils.q, Logger.FeatureTag.REDIRECTS, "on should override url loading: target url is: ", m2, " redirect type is: ", l2);
                        if (l2 != null) {
                            BrandSafetyUtils.a(str, webView, m2, l2, "shouldOverrideUrlLoading");
                            if (BrandSafetyUtils.a(str, webView)) {
                                Logger.d(BrandSafetyUtils.q, "on should override url loading, updating click URL. address : ", str3);
                                for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C())) {
                                    if (aVar != null && aVar.a(m2, str, str3, false, (String) null)) {
                                        com.safedk.android.analytics.brandsafety.b.a(str3, m.n, new m.a("url", m2), new m.a(m.J, "shouldOverrideUrlLoading"));
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        Logger.d(BrandSafetyUtils.q, "on should override url loading, ignore redirect, sdk: ", str, ", webview: ", webView, ", url: ", str2);
                    }
                } catch (Throwable th) {
                    Logger.e(BrandSafetyUtils.q, "exception while handling potential redirect", th);
                }
            }
        });
    }

    private static void a(final String str, final String str2, final String str3) {
        H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.11
            @Override // java.lang.Runnable
            public void run() {
                w wVar;
                try {
                    if (str2 == null || !str2.startsWith("http")) {
                        return;
                    }
                    for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().z())) {
                        if (aVar != null) {
                            w wVar2 = null;
                            com.safedk.android.analytics.brandsafety.c c2 = aVar.c(str3);
                            if (c2 != null && c2.c().equals(str)) {
                                l i2 = c2.i();
                                if (i2 != null) {
                                    i2.m();
                                }
                                int size = c2.x().size() - 1;
                                while (true) {
                                    if (size < 0) {
                                        wVar = wVar2;
                                        break;
                                    }
                                    wVar2 = DetectTouchUtils.a(str, c2.x().get(size));
                                    if (wVar2 != null) {
                                        wVar = wVar2;
                                        break;
                                    }
                                    size--;
                                }
                                z zVar = new z(str, str2, str3, wVar, c2);
                                BrandSafetyUtils.I.put(str3, zVar);
                                Logger.d(BrandSafetyUtils.q, "handle suspicion of website loaded into banner: ", zVar);
                                BrandSafetyUtils.b(zVar, str3, "suspect");
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    Logger.e(BrandSafetyUtils.q, "exception while handling suspicion of website loaded into banner", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(z zVar, String str, String str2) {
        int h2 = SafeDK.getInstance().h();
        w f2 = zVar.f();
        boolean z2 = f2 != null && SystemClock.elapsedRealtime() - f2.a.longValue() < ((long) h2);
        if (f2 != null) {
            float elapsedRealtime = ((SystemClock.elapsedRealtime() - f2.a.longValue()) / 100) / 10.0f;
            m.a[] aVarArr = new m.a[4];
            aVarArr[0] = new m.a(m.K, str2);
            aVarArr[1] = new m.a("url", zVar.a());
            aVarArr[2] = new m.a(m.U, z2 ? "true" : "false");
            aVarArr[3] = new m.a(m.V, String.valueOf(elapsedRealtime));
            BannerFinder.a(str, "web", aVarArr);
            return;
        }
        BannerFinder.a(str, "web", new m.a(m.K, str2), new m.a("url", zVar.a()), new m.a(m.U, "false"));
    }

    public static void a(String str, WebView webView, WebChromeClient webChromeClient) {
        Logger.d(q, "handle set web chrome client, sdk: ", str, ", webview: ", webView, ", chrome client: ", webChromeClient);
        K.put(a(webChromeClient), new WeakReference<>(webView));
    }

    public static void handleOnConsoleMessage(String sdkPackageName, WebChromeClient chromeClient, ConsoleMessage consoleMessage) {
        String str;
        try {
            if (Build.VERSION.SDK_INT < 8) {
                str = null;
            } else {
                str = consoleMessage.message();
            }
            Logger.d(q, "handle console message, chromeClient: ", chromeClient, ", message: ", str);
            if (str != null && str.contains("mraid.open")) {
                String[] split = str.split("\\s+");
                if (split.length > 1) {
                    String str2 = split[1];
                    WeakReference<WebView> weakReference = K.get(a(chromeClient));
                    if (weakReference != null && weakReference.get() != null) {
                        Logger.d(q, "handle console message, mraid.open detected, sdk: ", sdkPackageName, ", webview: ", weakReference.get(), ", url: ", str2);
                        a(sdkPackageName, weakReference.get(), str2, RedirectDetails.RedirectType.REDIRECT, "OnConsoleMessage");
                    }
                }
            }
        } catch (Throwable th) {
            Logger.e(q, "handle console message exception", th);
        }
    }

    public static void onJsPrompt(String sdkPackageName, WebView webview, String requestingUrl, final String message, boolean ret) {
        Logger.d(q, "on JS prompt, sdk: ", sdkPackageName, ", webview: ", webview, ", requestingUrl: ", requestingUrl, ", message: ", message, ", ret: ", Boolean.valueOf(ret));
        if (ret && webview != null) {
            try {
                final AdNetworkDiscovery j2 = CreativeInfoManager.j(sdkPackageName);
                if (j2 != null) {
                    final WeakReference weakReference = new WeakReference(webview);
                    H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.12
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                AdNetworkDiscovery.this.a(weakReference, message);
                            } catch (Throwable th) {
                                Logger.e(BrandSafetyUtils.q, "on JS prompt exception", th);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                Logger.e(q, "on JS prompt exception", th);
            }
        }
    }

    public static synchronized void a(String str, WebView webView, String str2, RedirectDetails.RedirectType redirectType, String str3) {
        RedirectDetails redirectDetails;
        synchronized (BrandSafetyUtils.class) {
            SafeDK safeDK = SafeDK.getInstance();
            if (SafeDK.ab() && safeDK != null) {
                WebView a2 = a(webView);
                AdType a3 = com.safedk.android.analytics.brandsafety.b.a(str, a2);
                l();
                if (G == null) {
                    redirectDetails = null;
                } else {
                    redirectDetails = G;
                }
                String a4 = a2 != null ? a((Object) a2) : null;
                G = new RedirectDetails(str, a3, redirectType, a4, str2, str3, redirectDetails);
                Logger.d(q, Logger.FeatureTag.REDIRECTS, "handle redirect: last redirect - ", G);
                e();
                if (com.safedk.android.utils.h.o.equals(str)) {
                    BannerFinder.a(G);
                }
                if (!str3.equals("shouldOverrideUrlLoading")) {
                    com.safedk.android.analytics.brandsafety.c l2 = l(a4);
                    if (l2 != null) {
                        l2.a(m.u, new m.a("api", str3), new m.a(m.K, redirectType.name().toLowerCase()), new m.a("url", str2));
                    } else {
                        com.safedk.android.analytics.brandsafety.b.a(a4, m.u, new m.a("api", str3), new m.a(m.K, redirectType.name().toLowerCase()), new m.a("url", str2));
                    }
                }
            } else {
                Logger.d(q, "handle redirect, Max/SafeDK not initialized, skipping. ");
            }
        }
    }

    private static WebView a(WebView webView) {
        WeakReference<WebView> weakReference = J.get(a((Object) webView));
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            Logger.d(q, "get redirect view, view: ", webView, ", redirect view: ", webView2);
            return webView2;
        }
        return webView;
    }

    public static synchronized void a(String str, String str2, String str3, String str4) {
        n nVar;
        synchronized (BrandSafetyUtils.class) {
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            AdNetworkDiscovery j2 = CreativeInfoManager.j(mainSdkPackage);
            if (j2 != null && j2.l(str2) != null) {
                k();
                if (F == null) {
                    nVar = null;
                } else {
                    nVar = F;
                }
                F = new n(mainSdkPackage, str2, str3, str4, nVar);
                Logger.d(q, Logger.FeatureTag.REDIRECTS, "handle redirect, last intent details: ", F);
                e();
                if (com.safedk.android.utils.h.o.equals(mainSdkPackage)) {
                    BannerFinder.a(F);
                }
                return;
            }
            Logger.d(q, "handle redirect, ignore intent for sdk: ", mainSdkPackage, ", url: ", str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0011, B:10:0x0017, B:12:0x0025, B:15:0x003a, B:18:0x0052, B:20:0x0063, B:25:0x006f, B:31:0x004c), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized String d() {
        boolean z2;
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            if (G != null && F != null && F.c != null && F.c.equals(G.c)) {
                boolean a2 = CreativeInfoManager.a(G.c, AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
                if (G.e == RedirectDetails.RedirectType.REDIRECT && a2) {
                    w a3 = DetectTouchUtils.a(F.c, G.f);
                    long longValue = a3 == null ? 0L : a3.a.longValue();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int f2 = SafeDK.getInstance().f();
                    if (longValue != 0 && elapsedRealtime - longValue <= f2) {
                        z2 = false;
                        if (z2) {
                            Logger.d(q, "check for potential auto redirect, identified for ", F.c, ", view address: ", G.f, ", webviewReqURL: ", G.g, ", landingPageURL: ", F.d);
                            return F.d;
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
            }
            return null;
        }
    }

    public static synchronized void e() {
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            if (G != null && F != null && F.c != null && F.c.equals(G.c)) {
                a(F.c, true, false);
            }
        }
    }

    public static synchronized void f() {
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            if (G != null && F != null && G.e == RedirectDetails.RedirectType.EXPAND && F.c != null && F.c.equals(G.c) && CreativeInfoManager.a(G.c, AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, false)) {
                a(F.c, false, true);
            }
        }
    }

    public static synchronized void g() {
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            if (G != null && F != null && F.c != null && F.c.equals(G.c)) {
                a(F.c, true, true);
            }
        }
    }

    public static synchronized com.safedk.android.analytics.brandsafety.c t(String str) {
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            if (G != null && F != null) {
                Logger.d(q, "handle redirect if needed with sdk: ", str);
                if (str != null && str.equals(F.c) && str.equals(G.c)) {
                    return a(str, false, true);
                }
            }
            return null;
        }
    }

    public static synchronized com.safedk.android.analytics.brandsafety.c a(Activity activity) {
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            if (G != null && F != null) {
                String sdkPackageByClass = SdksMapping.getSdkPackageByClass(activity.toString());
                Logger.d(q, "handle redirect if needed with activity sdk: ", sdkPackageByClass);
                if (sdkPackageByClass != null && sdkPackageByClass.equals(F.c) && sdkPackageByClass.equals(G.c)) {
                    return a(sdkPackageByClass, false, true);
                }
            }
            return null;
        }
    }

    private static synchronized com.safedk.android.analytics.brandsafety.c a(String str, boolean z2, boolean z3) {
        int i2;
        com.safedk.android.analytics.brandsafety.c cVar;
        com.safedk.android.analytics.brandsafety.c cVar2;
        BannerFinder A2;
        synchronized (BrandSafetyUtils.class) {
            Logger.d(q, Logger.FeatureTag.REDIRECTS, "handle redirect report: last redirect name: ", G.e.name().toLowerCase(), ", intent: ", F, ", redirect: ", G);
            boolean a2 = CreativeInfoManager.a(G.c, AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, false);
            boolean a3 = CreativeInfoManager.a(G.c, AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
            if ((G.e == RedirectDetails.RedirectType.REDIRECT && !a3) || (G.e == RedirectDetails.RedirectType.EXPAND && !a2)) {
                Logger.d(q, Logger.FeatureTag.REDIRECTS, "handle ", G.e.name().toLowerCase(), " is not supported for: ", G.c);
                return null;
            }
            if (G.d != null) {
                Logger.d(q, "handle ", G.e.name().toLowerCase(), ", for ", str, " ", G.d, ", view address: ", G.f, ", webviewReqURL: ", G.g, ", landingPageURL: ", F.d);
                com.safedk.android.analytics.brandsafety.a a4 = SafeDK.getInstance().a(G.d);
                if (a4 == null) {
                    cVar2 = null;
                } else {
                    cVar2 = a4.a(str, G, F, z2, z3);
                }
            } else {
                InterstitialFinder z4 = SafeDK.getInstance().z();
                if (z4 == null) {
                    i2 = 12;
                    cVar = null;
                } else {
                    Logger.d(q, "handle ", G.e.name().toLowerCase(), ", for ", str, " ", z4.a(), ", view address: ", G.f, ", webviewReqURL: ", G.g, ", landingPageURL: ", F.d);
                    i2 = 12;
                    cVar = z4.a(str, G, F, z2, z3);
                }
                if (cVar == null && (A2 = SafeDK.getInstance().A()) != null) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = "handle ";
                    objArr[1] = G.e.name().toLowerCase();
                    objArr[2] = ", for ";
                    objArr[3] = str;
                    objArr[4] = " ";
                    objArr[5] = A2.a();
                    objArr[6] = ", view address: ";
                    objArr[7] = G.f;
                    objArr[8] = ", webviewReqURL: ";
                    objArr[9] = G.g;
                    objArr[10] = ", landingPageURL: ";
                    objArr[11] = F.d;
                    Logger.d(q, objArr);
                    cVar2 = A2.a(str, G, F, z2, z3);
                } else {
                    cVar2 = cVar;
                }
            }
            if (z3) {
                G = null;
                F = null;
            }
            return cVar2;
        }
    }

    private static void k() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int g2 = SafeDK.getInstance().g();
        n nVar = F;
        if (nVar != null && elapsedRealtime - nVar.b.longValue() > g2) {
            Logger.d(q, "remove old intent: ", F);
            F = null;
        }
    }

    private static void l() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int g2 = SafeDK.getInstance().g();
        RedirectDetails redirectDetails = G;
        if (redirectDetails != null && elapsedRealtime - redirectDetails.b.longValue() > g2) {
            Logger.d(q, "remove old redirect: ", G);
            G = null;
        }
    }

    public static RedirectDetails h() {
        l();
        return G;
    }

    public static AdType a(long j2, long j3) {
        float f2 = j2;
        float f3 = j3;
        if (com.safedk.android.utils.n.a(f2, f3)) {
            Logger.d(q, "get ad type, banner identified");
            return AdType.BANNER;
        }
        if (com.safedk.android.utils.n.b(f2, f3)) {
            Logger.d(q, "get ad type, mrec identified");
            return AdType.MREC;
        }
        Logger.d(q, "get ad type, inter identified");
        return AdType.INTERSTITIAL;
    }

    public static void b(Activity activity) {
        Logger.d(q, "report landing page loaded. activity: ", activity);
        o r2 = SafeDK.getInstance().z().r(SdksMapping.getSdkPackageByClass(activity.getClass().getName()));
        if (r2 != null && r2.ao) {
            r2.i().a(m.r, new m.a("ads", Integer.toString(SafeDK.getInstance().A().j() + 1 + SafeDK.getInstance().C().f())), new m.a(m.T, activity.getClass().getCanonicalName()));
        }
    }

    public static void c(Activity activity) {
        Logger.d(q, "report landing page removed. activity: ", activity);
        o r2 = SafeDK.getInstance().z().r(SdksMapping.getSdkPackageByClass(activity.getClass().getName()));
        if (r2 != null && r2.ao) {
            r2.i().a(m.s, new m.a[0]);
        }
    }

    public static void onMobileFuseSetState(String state) {
        Logger.d(q, "on mobilefuse set state - state= ", state);
        if (!TextUtils.isEmpty(state) && state.equals("EXPANDED")) {
            try {
                Logger.d(q, "on mobilefuse set state - calling handle redirect (intent)");
                a(com.safedk.android.utils.h.E, (String) null, (String) null, RedirectEvent.i);
            } catch (Throwable th) {
                Logger.e(q, "on mobilefuse set state exception", th);
            }
        }
    }

    public static void onMobileFuseFullscreenChanged(boolean isChanged) {
        Logger.d(q, "on mobilefuse fullscreen changed - is changed= ", Boolean.valueOf(isChanged));
        if (SafeDK.ab() && isChanged) {
            try {
                Logger.d(q, "on mobilefuse fullscreen changed - calling handle redirect");
                t(com.safedk.android.utils.h.E);
            } catch (Throwable th) {
                Logger.e(q, "on mobilefuse fullscreen changed exception", th);
            }
        }
    }

    public static void onBidMachineOnExpandIntention(WebView expandedWebview) {
        try {
            Logger.d(q, "on bidMachine on expand intention - calling handle redirect (intent), expanded webview: ", expandedWebview);
            a("io.bidmachine", (String) null, a((Object) expandedWebview), RedirectEvent.i);
        } catch (Throwable th) {
            Logger.e(q, "on bidMachine on expand intention exception", th);
        }
    }

    public static void onBidMachineOnExpanded() {
        try {
            Logger.d(q, "on bidMachine on expanded - calling handle redirect (intent)");
            a("io.bidmachine", (String) null, (String) null, RedirectEvent.i);
        } catch (Throwable th) {
            Logger.e(q, "on bidMachine on expanded exception", th);
        }
    }

    public static void onBidMachineOnClose() {
        try {
            Logger.d(q, "on bidMachine on close - calling handle redirect");
            if (SafeDK.ab()) {
                t("io.bidmachine");
            }
        } catch (Throwable th) {
            Logger.e(q, "on bidMachine on close exception", th);
        }
    }

    public static void onMintegralNativeController(final Object instance, final JSONObject object) {
        Logger.d(q, "on mintegral native controller - instance= ", instance);
        if (instance != null && object != null) {
            H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.safedk.android.analytics.brandsafety.creatives.discoveries.k.a(instance, object);
                    } catch (Throwable th) {
                        Logger.e(BrandSafetyUtils.q, "on mintegral native controller exception", th);
                    }
                }
            });
        }
    }

    public static void onPubmaticNativeCall(final WebView webview, final String message) {
        Logger.d(q, "on pubmatic native call - webview: ", webview, ", message:", message);
        H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.3
            @Override // java.lang.Runnable
            public void run() {
                RedirectDetails.RedirectType redirectType;
                try {
                    JSONObject jSONObject = new JSONObject(message);
                    String string = jSONObject.getString("name");
                    if (string.equals("open")) {
                        redirectType = RedirectDetails.RedirectType.REDIRECT;
                    } else if (string.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e)) {
                        redirectType = RedirectDetails.RedirectType.EXPAND;
                    } else {
                        return;
                    }
                    BrandSafetyUtils.a(com.safedk.android.utils.h.F, webview, jSONObject.getJSONObject("params").getString("url"), redirectType, "NativeCall");
                } catch (Exception e2) {
                    Logger.d(BrandSafetyUtils.q, "on pubmatic native call - webview: ", webview, ", failed to parse message", e2);
                }
            }
        });
    }

    public static void onWindVaneSignalCommunicationHandleMessage(String sdkPackageName, Object obj, Message msg) {
        String str;
        boolean z2 = true;
        try {
            Logger.d(q, "onWindVaneSignalCommunicationHandleMessage, sdk: ", sdkPackageName, ", calling obj: ", obj, ", msg: ", msg);
            Object obj2 = msg.obj;
            Class<?> cls = obj2.getClass();
            ArrayList arrayList = new ArrayList();
            String str2 = null;
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                try {
                    field.setAccessible(z2);
                    Object obj3 = field.get(obj2);
                    Object obj4 = POBCommonConstants.NULL_VALUE;
                    String obj5 = obj3 != null ? obj3.toString() : POBCommonConstants.NULL_VALUE;
                    if (obj5.length() > 128) {
                        str = obj5.substring(0, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) + "...";
                    } else {
                        str = obj5;
                    }
                    arrayList.add(str);
                    Object[] objArr = new Object[4];
                    objArr[0] = "onWindVaneSignalCommunicationHandleMessage, fieldObj class: ";
                    if (obj3 != null) {
                        obj4 = obj3.getClass();
                    }
                    objArr[1] = obj4;
                    objArr[2] = ", value: ";
                    try {
                        objArr[3] = obj3;
                        Logger.d(q, objArr);
                        if (obj3 instanceof WebView) {
                            str2 = a(obj3);
                            Logger.d(q, "onWindVaneSignalCommunicationHandleMessage, found webview address: ", str2);
                        }
                    } catch (Throwable th) {
                        th = th;
                        Logger.d(q, "onWindVaneSignalCommunicationHandleMessage exception: ", th);
                        i2++;
                        z2 = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                i2++;
                z2 = true;
            }
            BannerFinder.a(str2, arrayList);
        } catch (Throwable th3) {
            Logger.d(q, "onWindVaneSignalCommunicationHandleMessage exception: ", th3);
        }
    }
}
