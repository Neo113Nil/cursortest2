package com.pgl.ssdk;

import com.pgl.ssdk.c;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class l {
    @DungeonFlag
    private static e a(ByteBuffer byteBuffer) {
        ByteBuffer a = g.a(byteBuffer);
        a.get(new byte[a.remaining()]);
        a.flip();
        a.position(0);
        g.a(a);
        byte[] b = g.b(g.a(a));
        try {
            Certificate generateCertificate = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(b));
            if (generateCertificate instanceof X509Certificate) {
                return new e(String.valueOf(((X509Certificate) generateCertificate).getSubjectDN()), b);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<e> a(q qVar, c.a aVar) {
        return b(g.a(qVar, aVar, 1896449818).a);
    }

    public static List<e> b(ByteBuffer byteBuffer) {
        try {
            ByteBuffer a = g.a(byteBuffer);
            if (!a.hasRemaining()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (a.hasRemaining()) {
                try {
                    arrayList.add(a(g.a(a)));
                } catch (a | BufferUnderflowException unused) {
                    return null;
                } catch (NoSuchAlgorithmException | CertificateException unused2) {
                }
            }
            return arrayList;
        } catch (a unused3) {
            return null;
        }
    }
}
