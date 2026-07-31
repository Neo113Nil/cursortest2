package org.chromium.net;

import internal.org.jni_zero.CalledByNative;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.chromium.base.Log;

/* loaded from: classes6.dex */
public class AndroidKeyStore {
    private static final String TAG = "AndroidKeyStore";

    @CalledByNative
    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    @CalledByNative
    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking support for " + str + ": " + String.valueOf(e));
            return false;
        }
    }

    @CalledByNative
    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking support for " + str + ": " + String.valueOf(e));
            return false;
        }
    }

    @CalledByNative
    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature signature = Signature.getInstance(str);
            try {
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (Exception e) {
                Log.e(TAG, "Exception while signing message with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + String.valueOf(e));
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            Log.e(TAG, "Signature algorithm " + str + " not supported: " + String.valueOf(e2));
            return null;
        }
    }

    @CalledByNative
    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance(str);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(bArr);
            } catch (Exception e) {
                Log.e(TAG, "Exception while encrypting input with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + String.valueOf(e));
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            Log.e(TAG, "Cipher " + str + " not supported: " + String.valueOf(e2));
            return null;
        }
    }
}
