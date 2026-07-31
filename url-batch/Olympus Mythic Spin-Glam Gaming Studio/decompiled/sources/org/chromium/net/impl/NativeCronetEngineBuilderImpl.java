package org.chromium.net.impl;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import internal.org.chromium.build.BuildConfig;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes4.dex */
public class NativeCronetEngineBuilderImpl extends CronetEngineBuilderImpl {
    private static final AtomicLong sLogCronetInitializationRef = new AtomicLong(0);
    private static final CronetLogger.CronetSource sCronetSource = computeCronetSource();

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        return super.addPublicKeyPins(str, (Set<byte[]>) set, z, date);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        return super.addQuicHint(str, i, i2);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        return super.enableBrotli(z);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        return super.enableHttp2(z);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        return super.enableHttpCache(i, j);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        return super.enableNetworkQualityEstimator(z);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        return super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        return super.enableQuic(z);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return super.enableSdch(z);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        return super.setExperimentalOptions(str);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return super.setLibraryLoader(libraryLoader);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setProxyOptions(@Nullable ProxyOptions proxyOptions) {
        return super.setProxyOptions(proxyOptions);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        return super.setStoragePath(str);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        return super.setThreadPriority(i);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        return super.setUserAgent(str);
    }

    public NativeCronetEngineBuilderImpl(Context context) {
        super(context, sCronetSource);
    }

    private static CronetLogger.CronetSource computeCronetSource() {
        ClassLoader classLoader = CronetEngineBuilderImpl.class.getClassLoader();
        if (BuildConfig.CRONET_FOR_AOSP_BUILD) {
            return CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM;
        }
        if (!ExperimentalCronetEngine.class.getClassLoader().equals(classLoader)) {
            return CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES;
        }
        return CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED;
    }

    static CronetLogger.CronetSource getCronetSource() {
        return sCronetSource;
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        AtomicLong atomicLong = sLogCronetInitializationRef;
        atomicLong.compareAndSet(0L, this.mLogger.generateId());
        return atomicLong.get();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ExperimentalCronetEngine build() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (getUserAgent() == null) {
            setUserAgent(getDefaultUserAgent());
        }
        CronetUrlRequestContext cronetUrlRequestContext = new CronetUrlRequestContext(this, uptimeMillis);
        this.mMockCertVerifier = 0L;
        return cronetUrlRequestContext;
    }
}
