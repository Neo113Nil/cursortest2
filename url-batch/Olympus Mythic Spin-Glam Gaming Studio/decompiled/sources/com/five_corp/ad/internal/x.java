package com.five_corp.ad.internal;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public abstract class x {
    public static String a(String str) {
        byte[] bArr;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            bArr = messageDigest.digest();
        } catch (IllegalArgumentException | NoSuchAlgorithmException unused) {
            bArr = null;
        }
        String encodeToString = bArr != null ? Base64.encodeToString(bArr, 11) : null;
        return encodeToString != null ? encodeToString : str.replaceAll("[^a-zA-Z0-9]", "_");
    }
}
