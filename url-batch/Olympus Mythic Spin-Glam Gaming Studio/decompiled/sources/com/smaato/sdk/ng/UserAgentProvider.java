package com.smaato.sdk.ng;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.smaato.sdk.ng.models.request.BrandVersion;
import com.smaato.sdk.ng.models.request.UserAgent;
import com.smaato.sdk.ng.utils.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public class UserAgentProvider {
    private static final String c = "UserAgentProvider";
    private String a;
    private UserAgent b;

    private static final class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public String a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, SharedPreferences sharedPreferences) {
        try {
            String userAgentString = new WebView(context).getSettings().getUserAgentString();
            this.a = userAgentString;
            fetchStructuredUserAgent(userAgentString);
            if (TextUtils.isEmpty(this.a)) {
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("nextgen_user_agent", this.a);
            edit.putInt("nextgen_user_agent_last_version", Build.VERSION.SDK_INT);
            edit.apply();
        } catch (RuntimeException e) {
            fetchStructuredUserAgent(null);
            Logger.e(c, e.getMessage());
            NextGen.reportException((Exception) e);
        }
    }

    String b(String str) {
        return (!TextUtils.isEmpty(str) && str.contains("64")) ? "64" : "32";
    }

    public void fetchStructuredUserAgent(String str) {
        if (this.b == null) {
            BrandVersion brandVersion = new BrandVersion();
            brandVersion.setBrand("Android");
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.valueOf(Build.VERSION.RELEASE));
            brandVersion.setVersion(arrayList);
            UserAgent userAgent = new UserAgent();
            this.b = userAgent;
            userAgent.setSource(0);
            this.b.setMobile(1);
            a a2 = a();
            if (!TextUtils.isEmpty(a2.b())) {
                this.b.setArchitecture(a2.b());
                this.b.setBitness(a2.a());
            }
            this.b.setModel(Build.MODEL);
            this.b.setPlatform(brandVersion);
            this.b.setBrowsers(a(str));
        }
    }

    public void fetchUserAgent(final Context context) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences("com.smaato.sdk.ng.useragent", 0);
        String string = sharedPreferences.getString("nextgen_user_agent", "");
        int i = sharedPreferences.getInt("nextgen_user_agent_last_version", -1);
        if (TextUtils.isEmpty(string) || !a(i)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.smaato.sdk.ng.UserAgentProvider$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UserAgentProvider.this.a(context, sharedPreferences);
                }
            });
        } else {
            this.a = string;
            fetchStructuredUserAgent(string);
        }
    }

    public UserAgent getStructuredUserAgent() {
        return this.b;
    }

    public String getUserAgent() {
        return this.a;
    }

    public void initialise(Context context) {
        fetchUserAgent(context);
    }

    private a a() {
        String str;
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null && strArr.length > 0) {
            str = strArr[0];
        } else {
            str = Build.CPU_ABI;
        }
        String str2 = "x86";
        if (!str.contains("x86")) {
            str2 = "arm";
            if (!str.contains("arm")) {
                str2 = "mips";
                if (!str.contains("mips")) {
                    str2 = str;
                }
            }
        }
        return new a(str2, b(str));
    }

    private List<BrandVersion> a(String str) {
        BrandVersion brandVersion = new BrandVersion();
        brandVersion.setBrand("Unknown");
        brandVersion.setVersion(Collections.singletonList("Unknown"));
        if (TextUtils.isEmpty(str)) {
            return Collections.singletonList(brandVersion);
        }
        ArrayList arrayList = new ArrayList();
        Pattern compile = Pattern.compile("Chrome\\/([\\d.]+)");
        Pattern compile2 = Pattern.compile("Chromium\\/([\\d.]+)");
        Pattern compile3 = Pattern.compile("Firefox\\/([\\d.]+)");
        Pattern compile4 = Pattern.compile("Mobile Safari\\/([\\d.]+)");
        Pattern compile5 = Pattern.compile("AppleWebKit\\/([\\d.]+)");
        Pattern compile6 = Pattern.compile("Edg\\/([\\d.]+)");
        Matcher matcher = compile.matcher(str);
        if (matcher.find()) {
            arrayList.add(a("Chrome", matcher));
        }
        Matcher matcher2 = compile2.matcher(str);
        if (matcher2.find()) {
            arrayList.add(a("Chromium", matcher2));
        }
        Matcher matcher3 = compile3.matcher(str);
        if (matcher3.find()) {
            arrayList.add(a("Firefox", matcher3));
        }
        Matcher matcher4 = compile4.matcher(str);
        if (matcher4.find()) {
            arrayList.add(a("Mobile Safari", matcher4));
        }
        Matcher matcher5 = compile5.matcher(str);
        if (matcher5.find()) {
            arrayList.add(a("AppleWebKit", matcher5));
        }
        Matcher matcher6 = compile6.matcher(str);
        if (matcher6.find()) {
            arrayList.add(a("Edge", matcher6));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(brandVersion);
        }
        return arrayList;
    }

    private BrandVersion a(String str, Matcher matcher) {
        BrandVersion brandVersion = new BrandVersion();
        brandVersion.setBrand(str);
        String group = matcher.group(1);
        if (TextUtils.isEmpty(group)) {
            brandVersion.setVersion(Collections.singletonList("Unknown"));
            return brandVersion;
        }
        String[] split = group.split("\\.");
        if (split.length > 0) {
            brandVersion.setVersion(Arrays.asList(split));
            return brandVersion;
        }
        brandVersion.setVersion(Collections.singletonList("Unknown"));
        return brandVersion;
    }

    private boolean a(int i) {
        return i != -1 && i == Build.VERSION.SDK_INT;
    }
}
