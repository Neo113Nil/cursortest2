package io.github.mytargetsdk;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;

/* loaded from: classes15.dex */
final class CertLoader {
    private final CertificateFactory certificateFactory;
    private final Context context;

    public CertLoader(Context context, CertificateFactory certificateFactory) {
        this.context = context;
        this.certificateFactory = certificateFactory;
    }

    final Certificate getRawCert(int i) {
        try {
            InputStream readPemCert = readPemCert(i);
            if (readPemCert != null) {
                return this.certificateFactory.generateCertificate(readPemCert);
            }
            return null;
        } catch (CertificateException e) {
            Log.e("CertLoader", "", e);
            return null;
        }
    }

    final ArrayList getSystemCerts() {
        ArrayList arrayList = new ArrayList();
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            if (keyStore != null) {
                keyStore.load(null, null);
                Enumeration<String> aliases = keyStore.aliases();
                while (aliases.hasMoreElements()) {
                    try {
                        X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
                        if (x509Certificate != null) {
                            arrayList.add(x509Certificate);
                        }
                    } catch (Throwable th) {
                        Log.e("CertLoader", "", th);
                    }
                }
            }
        } catch (Throwable th2) {
            Log.e("CertLoader", "", th2);
        }
        return arrayList;
    }

    private final InputStream readPemCert(int i) {
        try {
            String pemAsString = getPemAsString(i);
            if (TextUtils.isEmpty(pemAsString)) {
                return null;
            }
            return fromPem(pemAsString);
        } catch (Exception e) {
            Log.e("CertLoader", "unexpected error, certResId=" + i, e);
            return null;
        }
    }

    private final String getPemAsString(int i) {
        try {
            InputStream openRawResource = this.context.getResources().openRawResource(i);
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        int read = bufferedReader.read();
                        if (read == -1) {
                            break;
                        }
                        sb.append((char) read);
                    } finally {
                    }
                }
                bufferedReader.close();
            } catch (IOException e) {
                Log.e("CertLoader", "", e);
            }
            return sb.toString();
        } catch (Resources.NotFoundException e2) {
            Log.e("CertLoader", "resource not found, certResId=" + i, e2);
            return null;
        }
    }

    private InputStream fromPem(String str) {
        return fromBase64String(pemKeyContent(str));
    }

    private final InputStream fromBase64String(String str) {
        return new ByteArrayInputStream(Base64.decode(str, 2));
    }

    private final String pemKeyContent(String str) {
        return str.replace("\\s+", "").replace("\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replace("-----BEGIN CERTIFICATE-----", "").replace("-----END CERTIFICATE-----", "");
    }
}
