package io.bidmachine.rendering.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* loaded from: classes15.dex */
public class Utils {
    @NonNull
    public static Date getDate(int i) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, -i);
        return calendar.getTime();
    }

    @Nullable
    public static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void set(@NonNull Collection<T> collection, @Nullable Collection<T> collection2) {
        collection.clear();
        if (collection2 != 0) {
            collection.addAll(collection2);
        }
    }

    @Nullable
    public static Boolean toBoolean(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
        }
        return null;
    }

    @Nullable
    public static Integer toIntOrNull(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static Integer toInteger(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof Float) {
            return Integer.valueOf(((Float) obj).intValue());
        }
        if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Nullable
    public static Long toLong(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Float) {
            return Long.valueOf(((Float) obj).longValue());
        }
        if (obj instanceof Double) {
            return Long.valueOf(((Double) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Nullable
    public static String toString(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : String.valueOf(obj);
    }

    public static long write(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, V> void set(@NonNull Map<T, V> map, @Nullable Map<T, V> map2) {
        map.clear();
        if (map2 != 0) {
            map.putAll(map2);
        }
    }
}
