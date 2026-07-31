package com.my.tracker;

import android.content.pm.PackageInfo;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.y2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final class MyTrackerConfig {
    private final y2 a;

    public interface InstalledPackagesProvider {
        @Nullable
        @WorkerThread
        List<PackageInfo> getInstalledPackages();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationTrackingMode {
        public static final int ACTIVE = 2;
        public static final int CACHED = 1;
        public static final int NONE = 0;
    }

    public interface OkHttpClientProvider {
        @NonNull
        @WorkerThread
        OkHttpClient getOkHttpClient();
    }

    private MyTrackerConfig(y2 y2Var) {
        this.a = y2Var;
    }

    static MyTrackerConfig a(y2 y2Var) {
        return new MyTrackerConfig(y2Var);
    }

    @NonNull
    @AnyThread
    public AntiFraudConfig getAntiFraudConfig() {
        return this.a.a();
    }

    @Nullable
    @AnyThread
    public String getApkPreinstallParams() {
        return this.a.b();
    }

    @AnyThread
    public int getBufferingPeriod() {
        return this.a.e();
    }

    @AnyThread
    public int getForcingPeriod() {
        return this.a.f();
    }

    @NonNull
    @AnyThread
    public String getId() {
        return this.a.g();
    }

    @AnyThread
    public int getLaunchTimeout() {
        return this.a.i();
    }

    @AnyThread
    public int getLocationTrackingMode() {
        return this.a.j();
    }

    @Nullable
    @AnyThread
    @Deprecated
    public String getVendorAppPackage() {
        return this.a.r();
    }

    @AnyThread
    public boolean isAutotrackingPurchaseEnabled() {
        return this.a.s();
    }

    @AnyThread
    public boolean isKidMode() {
        return this.a.t();
    }

    @AnyThread
    public boolean isTrackingEnvironmentEnabled() {
        return this.a.u();
    }

    @AnyThread
    public boolean isTrackingLaunchEnabled() {
        return this.a.v();
    }

    @AnyThread
    @Deprecated
    public boolean isTrackingLocationEnabled() {
        int j = this.a.j();
        return j == 1 || j == 2;
    }

    @AnyThread
    public boolean isTrackingPreinstallEnabled() {
        return this.a.w();
    }

    @AnyThread
    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.a.x();
    }

    @AnyThread
    public void setAntiFraudConfig(@NonNull AntiFraudConfig antiFraudConfig) {
        this.a.a(antiFraudConfig);
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setApkPreinstallParams(@Nullable String str) {
        this.a.a(str);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z) {
        this.a.b(z);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setBufferingPeriod(int i) {
        this.a.a(i);
        return this;
    }

    @NonNull
    @AnyThread
    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.a.A();
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setForcingPeriod(int i) {
        this.a.b(i);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setInstalledPackagesProvider(@Nullable InstalledPackagesProvider installedPackagesProvider) {
        this.a.a(installedPackagesProvider);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setKidMode(boolean z) {
        this.a.c(z);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setLaunchTimeout(int i) {
        this.a.c(i);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setLocationTrackingMode(int i) {
        this.a.d(i);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setOkHttpClientProvider(@Nullable OkHttpClientProvider okHttpClientProvider) {
        this.a.a(okHttpClientProvider);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setProxyHost(@Nullable String str) {
        this.a.c(str);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z) {
        this.a.d(z);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setTrackingLaunchEnabled(boolean z) {
        this.a.e(z);
        return this;
    }

    @NonNull
    @AnyThread
    @Deprecated
    public MyTrackerConfig setTrackingLocationEnabled(boolean z) {
        if (z) {
            this.a.d(1);
            return this;
        }
        this.a.d(0);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z) {
        this.a.f(z);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z) {
        this.a.g(z);
        return this;
    }

    @NonNull
    @AnyThread
    @Deprecated
    public MyTrackerConfig setVendorAppPackage(@Nullable String str) {
        this.a.e(str);
        return this;
    }
}
