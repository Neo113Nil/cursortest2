package com.amazon.c.a.a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.CodeSigner;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* compiled from: ApkHelpers.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f630a = "com.amazon.content.id.";

    public static String a(JarFile jarFile) {
        String a2;
        if (jarFile == null) {
            throw new IllegalArgumentException("apkSrc must not be null!");
        }
        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            JarEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory() && (a2 = a(nextElement.getName())) != null && a2.length() != 0) {
                return a2;
            }
        }
        return null;
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("name cannot be null or empty!");
        }
        int indexOf = str.indexOf(f630a);
        if (indexOf >= 0 && str.length() > f630a.length()) {
            return str.substring(indexOf + f630a.length());
        }
        return null;
    }

    public static boolean b(JarFile jarFile) throws IOException {
        if (jarFile == null) {
            throw new IllegalArgumentException("apkSrc must not be null!");
        }
        try {
            e(jarFile);
            return d(jarFile) != null;
        } catch (SecurityException unused) {
            return true;
        }
    }

    public static boolean a(File file) throws IOException {
        JarFile jarFile;
        JarFile jarFile2 = null;
        try {
            jarFile = new JarFile(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean b = b(jarFile);
            jarFile.close();
            return b;
        } catch (Throwable th2) {
            th = th2;
            jarFile2 = jarFile;
            jarFile2.close();
            throw th;
        }
    }

    public static byte[] b(String str) throws IOException, b {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("apkFileName cannot be null or empty!");
        }
        JarFile jarFile = new JarFile(str);
        try {
            e(jarFile);
            Certificate c = c(jarFile);
            if (c != null && (c instanceof X509Certificate)) {
                return ((X509Certificate) c).getSignature();
            }
            return null;
        } catch (SecurityException unused) {
            return null;
        }
    }

    private static Certificate c(JarFile jarFile) {
        CodeSigner[] d = d(jarFile);
        if (d == null || d.length <= 0) {
            return null;
        }
        List<? extends Certificate> certificates = d[0].getSignerCertPath().getCertificates();
        if (certificates.isEmpty()) {
            return null;
        }
        return certificates.get(0);
    }

    private static CodeSigner[] d(JarFile jarFile) {
        Enumeration<JarEntry> entries = jarFile.entries();
        CodeSigner[] codeSignerArr = null;
        while (entries.hasMoreElements() && (codeSignerArr = entries.nextElement().getCodeSigners()) == null) {
        }
        return codeSignerArr;
    }

    private static void e(JarFile jarFile) throws IOException {
        Enumeration<JarEntry> entries = jarFile.entries();
        byte[] bArr = new byte[8192];
        while (entries.hasMoreElements()) {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = jarFile.getInputStream(entries.nextElement());
                    do {
                    } while (inputStream.read(bArr, 0, 8192) != -1);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Exception e) {
                    throw new b(e);
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
    }
}
