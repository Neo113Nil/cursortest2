package sg.bigo.ads.c;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class g {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        byte[] a2 = a(bArr, SameMD5.TAG);
        if (a2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(a2.length * 2);
        for (byte b : a2) {
            char[] cArr = a;
            sb.append(cArr[(b & 240) >>> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static JSONArray a(Set<String> set) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public static boolean a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static boolean a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static byte[] a(byte[] bArr, String str) {
        if (bArr != null && bArr.length != 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
