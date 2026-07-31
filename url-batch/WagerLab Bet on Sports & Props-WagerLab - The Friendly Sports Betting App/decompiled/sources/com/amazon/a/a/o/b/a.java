package com.amazon.a.a.o.b;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* compiled from: CertVerifier.java */
/* loaded from: classes3.dex */
public class a {
    private static final String b = "PKIX";
    private final PKIXParameters c;
    private final CertPathValidator d;
    private final Set<TrustAnchor> e;

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f591a = new com.amazon.a.a.o.c("CertVerifier");
    private static final byte[][] f = {new byte[]{-123, 55, Ascii.FS, -90, -27, 80, Ascii.DC4, Base64.padSymbol, MessagePack.Code.UINT32, 40, 3, 71, Ascii.ESC, MessagePack.Code.MAP16, 58, 9, -24, -8, 119, Ascii.SI}, new byte[]{-95, MessagePack.Code.STR32, 99, -109, -111, 111, Ascii.ETB, -28, Ascii.CAN, 85, 9, SignedBytes.MAX_POWER_OF_TWO, 4, Ascii.NAK, MessagePack.Code.EXT8, 2, SignedBytes.MAX_POWER_OF_TWO, -80, -82, 107}, new byte[]{78, -74, MessagePack.Code.FIXEXT2, 120, 73, -101, Ascii.FS, MessagePack.Code.UINT64, 95, 88, Ascii.RS, -83, 86, -66, Base64.padSymbol, -101, 103, 68, -91, -27}, new byte[]{19, 45, Ascii.CR, 69, 83, 75, 105, -105, MessagePack.Code.UINT16, -78, MessagePack.Code.FIXEXT2, MessagePack.Code.TRUE, 57, -30, 85, 118, 96, -101, 92, MessagePack.Code.BIN32}, new byte[]{34, MessagePack.Code.FIXEXT2, MessagePack.Code.FIXEXT16, MessagePack.Code.MAP32, -113, 2, 49, MessagePack.Code.INT16, -115, -9, -99, -73, MessagePack.Code.UINT64, -118, 45, 100, MessagePack.Code.EXT32, Utf8.REPLACEMENT_BYTE, 108, 58}, new byte[]{97, -17, 67, MessagePack.Code.FIXEXT8, Byte.MAX_VALUE, MessagePack.Code.FLOAT32, MessagePack.Code.FIXEXT1, 97, 81, -68, -104, MessagePack.Code.NEGFIXINT_PREFIX, MessagePack.Code.TRUE, 89, Ascii.DC2, -81, -97, -21, 99, 17}, new byte[]{-77, -22, MessagePack.Code.BIN8, 71, 118, MessagePack.Code.EXT32, MessagePack.Code.EXT16, Ascii.FS, -22, -14, -99, -107, -74, MessagePack.Code.UINT8, MessagePack.Code.FIXSTR_PREFIX, 8, Ascii.ESC, 103, -20, -99}, new byte[]{MessagePack.Code.FIXARRAY_PREFIX, -82, -94, 105, -123, -1, Ascii.DC4, Byte.MIN_VALUE, 76, 67, 73, 82, -20, -23, 96, -124, 119, -81, 85, 111}, new byte[]{32, 66, -123, MessagePack.Code.ARRAY16, -9, -21, 118, 65, -107, 87, -114, 19, 107, MessagePack.Code.FIXEXT1, -73, MessagePack.Code.INT16, -23, -114, 70, -91}, new byte[]{54, 121, MessagePack.Code.FLOAT32, 53, 102, -121, 114, 48, 77, 48, -91, -5, -121, 59, Ascii.SI, -89, 123, -73, Ascii.CR, 84}, new byte[]{MessagePack.Code.EXT16, -20, -116, -121, -110, 105, MessagePack.Code.FLOAT64, 75, -85, 57, -23, -115, 126, 87, 103, -13, Ascii.DC4, -107, 115, -99}, new byte[]{81, Byte.MAX_VALUE, 97, Ascii.RS, 41, -111, 107, 83, -126, -5, 114, -25, 68, MessagePack.Code.STR8, -115, MessagePack.Code.TRUE, MessagePack.Code.UINT8, 83, 109, 100}, new byte[]{SignedBytes.MAX_POWER_OF_TWO, -77, 49, MessagePack.Code.FIXSTR_PREFIX, -23, -65, -24, 85, -68, 57, -109, MessagePack.Code.FLOAT32, 112, 79, 78, MessagePack.Code.FALSE, 81, MessagePack.Code.FIXEXT1, Ascii.GS, -113}};
    private static final byte[][] g = {new byte[]{-111, MessagePack.Code.BIN32, MessagePack.Code.FIXEXT4, -18, 62, -118, MessagePack.Code.EXT16, 99, -124, -27, 72, MessagePack.Code.FALSE, -103, 41, 92, 117, 108, -127, 123, -127}, new byte[]{MessagePack.Code.NEGFIXINT_PREFIX, -85, 5, -108, 32, 114, 84, -109, 5, 96, 98, 2, 54, 112, -9, MessagePack.Code.UINT16, 46, -4, 102, 102}, new byte[]{-97, -83, -111, -90, MessagePack.Code.UINT32, 106, MessagePack.Code.BIN32, MessagePack.Code.BIN16, 0, 71, MessagePack.Code.BIN8, 78, MessagePack.Code.EXT32, MessagePack.Code.FIXEXT1, -91, Ascii.CR, -110, MessagePack.Code.FIXEXT16, 73, 121}, new byte[]{-86, MessagePack.Code.STR32, -68, 34, 35, -113, MessagePack.Code.BIN8, 1, -95, 39, -69, 56, MessagePack.Code.ARRAY32, -12, Ascii.GS, MessagePack.Code.STR32, 8, -98, -16, Ascii.DC2}, new byte[]{-15, -117, 83, -115, Ascii.ESC, -23, 3, -74, -90, -16, 86, 67, 91, Ascii.ETB, Ascii.NAK, -119, MessagePack.Code.FLOAT32, -13, 107, -14}};

    private static boolean a(byte[][] bArr, byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr3, bArr2)) {
                return true;
            }
        }
        return false;
    }

    public a() throws GeneralSecurityException {
        X509Certificate[] acceptedIssuers;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        this.e = new HashSet();
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if ((trustManager instanceof X509TrustManager) && (acceptedIssuers = ((X509TrustManager) trustManager).getAcceptedIssuers()) != null) {
                int i = 0;
                for (X509Certificate x509Certificate : acceptedIssuers) {
                    if (a(x509Certificate)) {
                        if (com.amazon.a.a.o.c.f599a) {
                            f591a.a("Trusted Cert: " + x509Certificate.getSubjectX500Principal().getName());
                        }
                        this.e.add(new TrustAnchor(x509Certificate, null));
                        i++;
                    }
                }
                if (com.amazon.a.a.o.c.f599a) {
                    f591a.a(String.format("loaded %d certs\n", Integer.valueOf(i)));
                }
            }
        }
        if (this.e.isEmpty()) {
            f591a.b("TrustManager did not return valid accepted issuers, likely 3P custom TrustManager implementation issue.");
        }
        PKIXParameters pKIXParameters = new PKIXParameters(this.e);
        this.c = pKIXParameters;
        pKIXParameters.setRevocationEnabled(false);
        this.d = CertPathValidator.getInstance(b);
    }

    static boolean a(X509Certificate x509Certificate) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getEncoded());
            if (a(f, digest)) {
                return true;
            }
            return a(g, digest);
        } catch (NoSuchAlgorithmException e) {
            f591a.b("Signature algorithm unrecognized", e);
            return false;
        } catch (CertificateEncodingException e2) {
            f591a.b("Cant get fingerprint", e2);
            return false;
        }
    }

    public boolean a(CertPath certPath) {
        try {
            Date notBefore = ((X509Certificate) certPath.getCertificates().get(0)).getNotBefore();
            f591a.a("Verifying CertPath with " + notBefore);
            this.c.setDate(notBefore);
            this.d.validate(certPath, this.c);
            return true;
        } catch (Exception e) {
            if (com.amazon.a.a.o.c.f599a) {
                f591a.b("Failed to verify cert path: " + e, e);
            }
            return false;
        }
    }
}
