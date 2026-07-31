package org.chromium.net.impl;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes10.dex */
public abstract class CronetEngineBuilderImpl extends ICronetEngineBuilder {

    @VisibleForTesting
    public static final int NETWORK_THREAD_PRIORITY = 0;
    private final Context mApplicationContext;
    private boolean mBrotiEnabled;
    private String mExperimentalOptions;
    private boolean mHttp2Enabled;
    private long mHttpCacheMaxSize;
    private HttpCacheMode mHttpCacheMode;
    protected final CronetLogger mLogger;
    protected long mMockCertVerifier;
    private boolean mNetworkQualityEstimatorEnabled;
    private final List<Pkp> mPkps;

    @Nullable
    private VersionSafeProxyOptions mProxyOptions;
    private boolean mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    private boolean mQuicEnabled;
    private final List<QuicHint> mQuicHints;
    private String mStoragePath;
    private String mUserAgent;
    private static final Pattern INVALID_PKP_HOST_NAME = Pattern.compile("^[0-9\\.]*$");

    @VisibleForTesting
    static int sApiLevel = VersionSafeCallbacks.ApiVersion.getMaximumAvailableApiLevel();

    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpCacheSetting {
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        return 0L;
    }

    VersionSafeCallbacks.LibraryLoader libraryLoader() {
        return null;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setThreadPriority(int i) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        return addPublicKeyPins(str, (Set<byte[]>) set, z, date);
    }

    public static class QuicHint {
        final int mAlternatePort;
        final String mHost;
        final int mPort;

        QuicHint(String str, int i, int i2) {
            this.mHost = str;
            this.mPort = i;
            this.mAlternatePort = i2;
        }
    }

    public static class Pkp {
        final Date mExpirationDate;
        final byte[][] mHashes;
        final String mHost;
        final boolean mIncludeSubdomains;

        Pkp(String str, byte[][] bArr, boolean z, Date date) {
            this.mHost = str;
            this.mHashes = bArr;
            this.mIncludeSubdomains = z;
            this.mExpirationDate = date;
        }
    }

    @VisibleForTesting
    enum HttpCacheMode {
        DISABLED(0, false),
        DISK(1, true),
        DISK_NO_HTTP(1, false),
        MEMORY(2, true);

        private final boolean mContentCacheEnabled;
        private final int mType;

        HttpCacheMode(int i, boolean z) {
            this.mContentCacheEnabled = z;
            this.mType = i;
        }

        int getType() {
            return this.mType;
        }

        boolean isContentCacheEnabled() {
            return this.mContentCacheEnabled;
        }

        int toPublicBuilderCacheMode() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return 0;
            }
            if (ordinal == 1) {
                return 3;
            }
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal == 3) {
                return 1;
            }
            throw new IllegalArgumentException("Unknown internal builder cache mode");
        }

        @VisibleForTesting
        static HttpCacheMode fromPublicBuilderCacheMode(int i) {
            if (i == 0) {
                return DISABLED;
            }
            if (i == 1) {
                return MEMORY;
            }
            if (i == 2) {
                return DISK_NO_HTTP;
            }
            if (i == 3) {
                return DISK;
            }
            throw new IllegalArgumentException("Unknown public builder cache mode");
        }
    }

    public CronetEngineBuilderImpl(Context context, CronetLogger.CronetSource cronetSource) {
        this.mQuicHints = new ArrayList();
        this.mPkps = new ArrayList();
        long uptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.mApplicationContext = applicationContext;
        this.mLogger = CronetLoggerFactory.createLogger(applicationContext, cronetSource);
        try {
            enableQuic(true);
            enableHttp2(true);
            enableBrotli(false);
            enableHttpCache(0, 0L);
            enableNetworkQualityEstimator(false);
            enablePublicKeyPinningBypassForLocalTrustAnchors(true);
            maybeLogCronetEngineBuilderInitializedInfo(uptimeMillis, true, cronetSource);
        } catch (Throwable th) {
            maybeLogCronetEngineBuilderInitializedInfo(uptimeMillis, false, cronetSource);
            throw th;
        }
    }

    public CronetEngineBuilderImpl(Context context) {
        this(context, CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED);
    }

    private void maybeLogCronetEngineBuilderInitializedInfo(long j, boolean z, CronetLogger.CronetSource cronetSource) {
        if (sApiLevel >= 30) {
            return;
        }
        CronetLogger.CronetEngineBuilderInitializedInfo cronetEngineBuilderInitializedInfo = new CronetLogger.CronetEngineBuilderInitializedInfo();
        cronetEngineBuilderInitializedInfo.creationSuccessful = Boolean.FALSE;
        try {
            cronetEngineBuilderInitializedInfo.author = CronetLogger.CronetEngineBuilderInitializedInfo.Author.IMPL;
            cronetEngineBuilderInitializedInfo.uid = Process.myUid();
            cronetEngineBuilderInitializedInfo.implVersion = new CronetLogger.CronetVersion(ImplVersion.getCronetVersion());
            cronetEngineBuilderInitializedInfo.source = cronetSource;
            cronetEngineBuilderInitializedInfo.apiVersion = new CronetLogger.CronetVersion(VersionSafeCallbacks.ApiVersion.getCronetVersion());
            cronetEngineBuilderInitializedInfo.cronetInitializationRef = getLogCronetInitializationRef();
            cronetEngineBuilderInitializedInfo.creationSuccessful = Boolean.valueOf(z);
        } finally {
            cronetEngineBuilderInitializedInfo.engineBuilderCreatedLatencyMillis = (int) (SystemClock.uptimeMillis() - j);
            this.mLogger.logCronetEngineBuilderInitializedInfo(cronetEngineBuilderInitializedInfo);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public String getDefaultUserAgent() {
        return UserAgent.from(this.mApplicationContext);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setUserAgent(String str) {
        this.mUserAgent = str;
        return this;
    }

    @VisibleForTesting
    String getUserAgent() {
        return this.mUserAgent;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setStoragePath(String str) {
        if (!new File(str).isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.mStoragePath = str;
        return this;
    }

    @VisibleForTesting
    String storagePath() {
        return this.mStoragePath;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableQuic(boolean z) {
        this.mQuicEnabled = z;
        return this;
    }

    @VisibleForTesting
    boolean quicEnabled() {
        return this.mQuicEnabled;
    }

    String getDefaultQuicUserAgentId() {
        return this.mQuicEnabled ? UserAgent.getQuicUserAgentIdFrom(this.mApplicationContext) : "";
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableHttp2(boolean z) {
        this.mHttp2Enabled = z;
        return this;
    }

    @VisibleForTesting
    boolean http2Enabled() {
        return this.mHttp2Enabled;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableBrotli(boolean z) {
        this.mBrotiEnabled = z;
        return this;
    }

    @VisibleForTesting
    boolean brotliEnabled() {
        return this.mBrotiEnabled;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableHttpCache(int i, long j) {
        HttpCacheMode fromPublicBuilderCacheMode = HttpCacheMode.fromPublicBuilderCacheMode(i);
        if (fromPublicBuilderCacheMode.getType() == 1 && storagePath() == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.mHttpCacheMode = fromPublicBuilderCacheMode;
        this.mHttpCacheMaxSize = j;
        return this;
    }

    boolean cacheDisabled() {
        return !this.mHttpCacheMode.isContentCacheEnabled();
    }

    long httpCacheMaxSize() {
        return this.mHttpCacheMaxSize;
    }

    @VisibleForTesting
    int httpCacheMode() {
        return this.mHttpCacheMode.getType();
    }

    int publicBuilderHttpCacheMode() {
        return this.mHttpCacheMode.toPublicBuilderCacheMode();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl addQuicHint(String str, int i, int i2) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: " + str);
        }
        this.mQuicHints.add(new QuicHint(str, i, i2));
        return this;
    }

    List<QuicHint> quicHints() {
        return this.mQuicHints;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
        Objects.requireNonNull(str, "The hostname cannot be null.");
        Objects.requireNonNull(set, "The set of SHA256 pins cannot be null.");
        Objects.requireNonNull(date, "The pin expiration date cannot be null.");
        String validateHostNameForPinningAndConvert = validateHostNameForPinningAndConvert(str);
        HashMap hashMap = new HashMap();
        for (byte[] bArr : set) {
            if (bArr == null || bArr.length != 32) {
                throw new IllegalArgumentException("Public key pin is invalid");
            }
            hashMap.put(Base64.encodeToString(bArr, 0), bArr);
        }
        this.mPkps.add(new Pkp(validateHostNameForPinningAndConvert, (byte[][]) hashMap.values().toArray(new byte[hashMap.size()][]), z, date));
        return this;
    }

    List<Pkp> publicKeyPins() {
        return this.mPkps;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled = z;
        return this;
    }

    @VisibleForTesting
    boolean publicKeyPinningBypassForLocalTrustAnchorsEnabled() {
        return this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    }

    private static String validateHostNameForPinningAndConvert(String str) throws IllegalArgumentException {
        if (INVALID_PKP_HOST_NAME.matcher(str).matches()) {
            throw new IllegalArgumentException("Hostname " + str + " is illegal. A hostname should not consist of digits and/or dots only.");
        }
        if (str.length() > 255) {
            throw new IllegalArgumentException("Hostname " + str + " is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
        try {
            return IDN.toASCII(str, 2);
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Hostname " + str + " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setExperimentalOptions(String str) {
        this.mExperimentalOptions = str;
        return this;
    }

    public String experimentalOptions() {
        return this.mExperimentalOptions;
    }

    public CronetEngineBuilderImpl setMockCertVerifierForTesting(long j) {
        this.mMockCertVerifier = j;
        return this;
    }

    long mockCertVerifier() {
        return this.mMockCertVerifier;
    }

    @VisibleForTesting
    boolean networkQualityEstimatorEnabled() {
        return this.mNetworkQualityEstimatorEnabled;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableNetworkQualityEstimator(boolean z) {
        this.mNetworkQualityEstimatorEnabled = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setProxyOptions(@Nullable ProxyOptions proxyOptions) {
        if (proxyOptions != null) {
            this.mProxyOptions = new VersionSafeProxyOptions(proxyOptions);
        }
        return this;
    }

    @Nullable
    VersionSafeProxyOptions getProxyOptions() {
        return this.mProxyOptions;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public Set<Integer> getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return Collections.unmodifiableSet(hashSet);
    }

    Context getContext() {
        return this.mApplicationContext;
    }

    CronetLogger.CronetEngineBuilderInfo toLoggerInfo() {
        return new CronetLogger.CronetEngineBuilderInfo(publicKeyPinningBypassForLocalTrustAnchorsEnabled(), getUserAgent(), storagePath(), quicEnabled(), http2Enabled(), brotliEnabled(), publicBuilderHttpCacheMode(), experimentalOptions(), networkQualityEstimatorEnabled(), 0, getLogCronetInitializationRef());
    }
}
