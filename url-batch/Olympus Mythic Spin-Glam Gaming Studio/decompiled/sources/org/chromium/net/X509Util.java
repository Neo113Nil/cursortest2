package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Pair;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;

/* loaded from: classes8.dex */
public class X509Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String OID_ANY_EKU = "2.5.29.37.0";
    private static final String OID_SERVER_GATED_MICROSOFT = "1.3.6.1.4.1.311.10.3.3";
    private static final String OID_SERVER_GATED_NETSCAPE = "2.16.840.1.113730.4.1";
    private static final String OID_TLS_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
    private static final String TAG = "X509Util";
    private static CertificateFactory sCertificateFactory;
    private static X509TrustManagerExtensions sDefaultTrustManager;
    private static boolean sLoadedSystemKeyStore;
    private static File sSystemCertificateDirectory;
    private static KeyStore sSystemKeyStore;
    private static Set<Pair<X500Principal, PublicKey>> sSystemTrustAnchorCache;
    private static KeyStore sTestKeyStore;
    private static X509Certificate sTestRoot;
    private static X509TrustManagerExtensions sTestTrustManager;
    private static TrustStorageListener sTrustStorageListener;
    private static final Object sLock = new Object();
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    interface Natives {
        void notifyClientCertStoreChanged();

        void notifyTrustStoreChanged();
    }

    private static final class TrustStorageListener extends BroadcastReceiver {
        private TrustStorageListener() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (!"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction())) {
                    if ("android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction())) {
                        X509UtilJni.get().notifyClientCertStoreChanged();
                        return;
                    } else {
                        if (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
                            return;
                        }
                        X509UtilJni.get().notifyClientCertStoreChanged();
                        return;
                    }
                }
            } else if (!"android.security.STORAGE_CHANGED".equals(intent.getAction())) {
                return;
            } else {
                X509UtilJni.get().notifyClientCertStoreChanged();
            }
            try {
                X509Util.reloadDefaultTrustManager();
            } catch (KeyStoreException e) {
                Log.e(X509Util.TAG, "Unable to reload the default TrustManager", (Throwable) e);
            } catch (NoSuchAlgorithmException e2) {
                Log.e(X509Util.TAG, "Unable to reload the default TrustManager", (Throwable) e2);
            } catch (CertificateException e3) {
                Log.e(X509Util.TAG, "Unable to reload the default TrustManager", (Throwable) e3);
            }
        }
    }

    private static List<X509Certificate> checkServerTrustedIgnoringRuntimeException(X509TrustManagerExtensions x509TrustManagerExtensions, X509Certificate[] x509CertificateArr, String str, String str2, byte[] bArr, byte[] bArr2) throws CertificateException {
        try {
            if (Build.VERSION.SDK_INT >= 36 && (bArr != null || bArr2 != null)) {
                return x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, bArr, bArr2, str, str2);
            }
            return x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        } catch (RuntimeException e) {
            Log.e(TAG, "checkServerTrusted() unexpectedly threw: %s", (Throwable) e);
            throw new CertificateException(e);
        }
    }

    private static void ensureInitialized() throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        synchronized (sLock) {
            ensureInitializedLocked();
        }
    }

    private static void ensureInitializedLocked() throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        if (sCertificateFactory == null) {
            sCertificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        }
        if (sDefaultTrustManager == null) {
            sDefaultTrustManager = createTrustManager(null);
        }
        if (!sLoadedSystemKeyStore) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                sSystemKeyStore = keyStore;
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
                sSystemCertificateDirectory = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException unused2) {
            }
            sLoadedSystemKeyStore = true;
        }
        if (sSystemTrustAnchorCache == null) {
            sSystemTrustAnchorCache = new HashSet();
        }
        if (sTrustStorageListener == null) {
            sTrustStorageListener = new TrustStorageListener();
            IntentFilter intentFilter = new IntentFilter();
            if (Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            ContextUtils.registerProtectedBroadcastReceiver(ContextUtils.getApplicationContext(), sTrustStorageListener, intentFilter);
        }
    }

    private static void ensureTestInitializedLocked() throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        if (sTestKeyStore == null) {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            sTestKeyStore = keyStore;
            try {
                keyStore.load(null);
            } catch (IOException unused) {
            }
        }
        if (sTestTrustManager == null) {
            sTestTrustManager = createTrustManager(sTestKeyStore);
        }
    }

    private static X509TrustManagerExtensions createTrustManager(KeyStore keyStore) throws KeyStoreException, NoSuchAlgorithmException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return new X509TrustManagerExtensions((X509TrustManager) trustManager);
                    } catch (IllegalArgumentException e) {
                        Log.e(TAG, "Error creating trust manager (" + trustManager.getClass().getName() + "): " + String.valueOf(e));
                    }
                }
            }
            Log.e(TAG, "Could not find suitable trust manager");
            return null;
        } catch (RuntimeException e2) {
            Log.e(TAG, "TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", (Throwable) e2);
            throw new KeyStoreException(e2);
        }
    }

    private static void reloadTestTrustManager() throws KeyStoreException, NoSuchAlgorithmException, CertificateException {
        ensureTestInitializedLocked();
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reloadDefaultTrustManager() throws KeyStoreException, NoSuchAlgorithmException, CertificateException {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
        X509UtilJni.get().notifyTrustStoreChanged();
    }

    public static X509Certificate createCertificateFromBytes(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        ensureInitialized();
        return (X509Certificate) sCertificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
    }

    public static void addTestRootCertificate(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            ensureTestInitializedLocked();
            KeyStore keyStore = sTestKeyStore;
            keyStore.setCertificateEntry("root_cert_" + Integer.toString(keyStore.size()), createCertificateFromBytes);
            reloadTestTrustManager();
        }
    }

    public static void clearTestRootCertificates() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        synchronized (sLock) {
            ensureTestInitializedLocked();
            try {
                sTestKeyStore.load(null);
                reloadTestTrustManager();
            } catch (IOException unused) {
            }
        }
    }

    public static void setTestRootCertificateForBuiltin(byte[] bArr) throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            sTestRoot = createCertificateFromBytes;
        }
    }

    private static String hashPrincipal(X500Principal x500Principal) throws NoSuchAlgorithmException {
        byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i = 0; i < 4; i++) {
            int i2 = i * 2;
            char[] cArr2 = HEX_DIGITS;
            byte b = digest[3 - i];
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    private static boolean isKnownRoot(X509Certificate x509Certificate) throws NoSuchAlgorithmException, KeyStoreException {
        if (sSystemKeyStore == null) {
            return false;
        }
        Pair<X500Principal, PublicKey> pair = new Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            String str = hashPrincipal + "." + i;
            if (!new File(sSystemCertificateDirectory, str).exists()) {
                return false;
            }
            Certificate certificate = sSystemKeyStore.getCertificate("system:" + str);
            if (certificate != null) {
                if (!(certificate instanceof X509Certificate)) {
                    Log.e(TAG, "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
                } else {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                }
            }
            i++;
        }
    }

    static boolean verifyKeyUsage(X509Certificate x509Certificate) throws CertificateException {
        List<String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (NullPointerException unused) {
        }
        if (extendedKeyUsage == null) {
            return true;
        }
        for (String str : extendedKeyUsage) {
            if (str.equals(OID_TLS_SERVER_AUTH) || str.equals(OID_ANY_EKU) || str.equals(OID_SERVER_GATED_NETSCAPE) || str.equals(OID_SERVER_GATED_MICROSOFT)) {
                return true;
            }
        }
        return false;
    }

    public static byte[][] getUserAddedRoots() {
        ArrayList arrayList = new ArrayList();
        synchronized (sLock) {
            try {
                ensureInitialized();
                KeyStore keyStore = sSystemKeyStore;
                if (keyStore == null) {
                    return new byte[0][];
                }
                try {
                    Enumeration<String> aliases = keyStore.aliases();
                    while (aliases.hasMoreElements()) {
                        String nextElement = aliases.nextElement();
                        if (nextElement.startsWith("user:")) {
                            try {
                                Certificate certificate = sSystemKeyStore.getCertificate(nextElement);
                                if (!(certificate instanceof X509Certificate)) {
                                    Log.w(TAG, "alias: " + nextElement + " is not a X509 Cert, skipping");
                                } else {
                                    arrayList.add(((X509Certificate) certificate).getEncoded());
                                }
                            } catch (KeyStoreException e) {
                                Log.e(TAG, "Error reading cert with alias %s, error: %s", nextElement, e);
                            } catch (CertificateEncodingException e2) {
                                Log.e(TAG, "Error encoding cert with alias %s, error: %s", nextElement, e2);
                            }
                        }
                    }
                    X509Certificate x509Certificate = sTestRoot;
                    if (x509Certificate != null) {
                        try {
                            arrayList.add(x509Certificate.getEncoded());
                        } catch (CertificateEncodingException e3) {
                            Log.e(TAG, "Error encoding test root cert, error %s", (Throwable) e3);
                        }
                    }
                    return (byte[][]) arrayList.toArray(new byte[0][]);
                } catch (KeyStoreException e4) {
                    Log.e(TAG, "Error reading cert aliases: %s", (Throwable) e4);
                    return new byte[0][];
                }
            } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                return new byte[0][];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd A[Catch: all -> 0x0077, TryCatch #5 {, blocks: (B:34:0x006c, B:36:0x0070, B:37:0x0075, B:41:0x007f, B:42:0x00d7, B:44:0x00dd, B:45:0x00ee, B:46:0x00f3, B:51:0x0085, B:56:0x0093, B:58:0x00b9, B:59:0x00d5, B:63:0x0099), top: B:33:0x006c, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9 A[Catch: all -> 0x0077, TryCatch #5 {, blocks: (B:34:0x006c, B:36:0x0070, B:37:0x0075, B:41:0x007f, B:42:0x00d7, B:44:0x00dd, B:45:0x00ee, B:46:0x00f3, B:51:0x0085, B:56:0x0093, B:58:0x00b9, B:59:0x00d5, B:63:0x0099), top: B:33:0x006c, inners: #1, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2, byte[] bArr2, byte[] bArr3) throws KeyStoreException, NoSuchAlgorithmException {
        List<X509Certificate> list;
        if (bArr == null || bArr.length == 0 || bArr[0] == null) {
            throw new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=" + Arrays.deepToString(bArr));
        }
        try {
            ensureInitialized();
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(createCertificateFromBytes(bArr[0]));
                for (int i = 1; i < bArr.length; i++) {
                    try {
                        arrayList.add(createCertificateFromBytes(bArr[i]));
                    } catch (CertificateException unused) {
                        Log.w(TAG, "intermediate " + i + " failed parsing");
                    }
                }
                X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                try {
                    x509CertificateArr[0].checkValidity();
                    if (!verifyKeyUsage(x509CertificateArr[0])) {
                        return new AndroidCertVerifyResult(-6);
                    }
                    synchronized (sLock) {
                        X509TrustManagerExtensions x509TrustManagerExtensions = sDefaultTrustManager;
                        if (x509TrustManagerExtensions == null) {
                            return new AndroidCertVerifyResult(-1);
                        }
                        try {
                            list = checkServerTrustedIgnoringRuntimeException(x509TrustManagerExtensions, x509CertificateArr, str, str2, bArr2, bArr3);
                        } catch (CertificateException e) {
                            String message = e.getMessage();
                            X509TrustManagerExtensions x509TrustManagerExtensions2 = sTestTrustManager;
                            if (x509TrustManagerExtensions2 != null) {
                                try {
                                    list = checkServerTrustedIgnoringRuntimeException(x509TrustManagerExtensions2, x509CertificateArr, str, str2, bArr2, bArr3);
                                } catch (CertificateException e2) {
                                    message = "[default trust manager] " + message + "; [test trust manager] " + e2.getMessage();
                                    list = null;
                                    if (list == null) {
                                        Log.i(TAG, "Failed to validate the certificate chain, error: " + message);
                                        return new AndroidCertVerifyResult(-2);
                                    }
                                    return new AndroidCertVerifyResult(0, list.size() <= 0 ? isKnownRoot(list.get(list.size() - 1)) : false, list);
                                }
                                if (list == null) {
                                }
                            }
                            list = null;
                            if (list == null) {
                            }
                        }
                        return new AndroidCertVerifyResult(0, list.size() <= 0 ? isKnownRoot(list.get(list.size() - 1)) : false, list);
                    }
                } catch (CertificateExpiredException unused2) {
                    return new AndroidCertVerifyResult(-3);
                } catch (CertificateNotYetValidException unused3) {
                    return new AndroidCertVerifyResult(-4);
                } catch (CertificateException unused4) {
                    return new AndroidCertVerifyResult(-1);
                }
            } catch (CertificateException unused5) {
                return new AndroidCertVerifyResult(-5);
            }
        } catch (CertificateException unused6) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
