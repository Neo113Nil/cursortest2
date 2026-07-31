package com.my.target.common;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.O6;
import com.my.target.m0;
import com.my.target.mi;
import com.my.target.r4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public final class CustomParams {
    private volatile String[] d;
    private volatile String[] e;
    private volatile String[] f;
    private volatile String[] g;
    private volatile String[] h;
    private boolean a = false;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    public r4.a i = r4.f;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface Gender {
        public static final int FEMALE = 2;
        public static final int MALE = 1;
        public static final int UNKNOWN = 0;
        public static final int UNSPECIFIED = -1;
    }

    private synchronized void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, str2);
        }
    }

    private boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this) {
            try {
                if ("exb".equals(str)) {
                    this.i = r4.e.a(str2);
                }
                if (str2 == null) {
                    return b(str);
                }
                this.b.put(str, str2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getAge() {
        String a = a("ea");
        if (a == null) {
            return 0;
        }
        try {
            return Integer.parseInt(a);
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Nullable
    public String getCustomParam(@NonNull String str) {
        return a(str);
    }

    @Nullable
    public String getCustomUserId() {
        String[] strArr = this.h;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Nullable
    public String[] getCustomUserIds() {
        String[] strArr = this.h;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    @Nullable
    public String getEmail() {
        String[] strArr = this.d;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Nullable
    public String[] getEmails() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public int getGender() {
        String a = a("eg");
        if (a == null) {
            return -1;
        }
        try {
            return Integer.parseInt(a);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Nullable
    public String getIcqId() {
        String[] strArr = this.g;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Nullable
    public String[] getIcqIds() {
        String[] strArr = this.g;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    @Nullable
    public String getLang() {
        return a(O6.q);
    }

    @Nullable
    public String getMrgsAppId() {
        return a("mrgs_app_id");
    }

    @Nullable
    public String getMrgsId() {
        return a("mrgs_device_id");
    }

    @Nullable
    public String getMrgsUserId() {
        return a("mrgs_user_id");
    }

    @Nullable
    public String getOkId() {
        String[] strArr = this.e;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Nullable
    public String[] getOkIds() {
        String[] strArr = this.e;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    @Nullable
    public String getVKId() {
        String[] strArr = this.f;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Nullable
    public String[] getVKIds() {
        String[] strArr = this.f;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public void putCustomDataToMap(@NonNull Map<String, String> map) {
        map.putAll(this.c);
    }

    public void putDataTo(@NonNull Map<String, String> map) {
        synchronized (this) {
            map.putAll(this.b);
        }
    }

    public void setAge(int i) {
        if (i < 0) {
            mi.a("CustomParams: Age param removed");
            b("ea");
            return;
        }
        mi.a("CustomParams: Age param set to " + i);
        b("ea", String.valueOf(i));
    }

    public void setCustomParam(@NonNull String str, @Nullable String str2) {
        if ("stories_playhead_v2".equals(str)) {
            if (Objects.equals(str2, "1")) {
                mi.a("CustomParams: STORIES_PLAYHEAD_V2 feature flag enabled");
                this.a = true;
            } else {
                mi.a("CustomParams: STORIES_PLAYHEAD_V2 feature flag disabled");
                this.a = false;
            }
        }
        b(str, str2);
        a(str, str2);
    }

    public void setCustomUserId(@Nullable String str) {
        if (str == null) {
            this.h = null;
        } else {
            this.h = new String[]{str};
        }
        b("custom_user_id", str);
    }

    public void setCustomUserIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.h = null;
            b("custom_user_id");
        } else {
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length);
            b("custom_user_id", m0.a(strArr));
        }
    }

    public void setEmail(@Nullable String str) {
        if (str == null) {
            this.d = null;
        } else {
            this.d = new String[]{str};
        }
        b("email", str);
    }

    public void setEmails(@Nullable String[] strArr) {
        if (strArr == null) {
            this.d = null;
            b("email");
        } else {
            this.d = (String[]) Arrays.copyOf(strArr, strArr.length);
            b("email", m0.a(strArr));
        }
    }

    public void setGender(int i) {
        if (i != 0 && i != 1 && i != 2) {
            b("eg");
            mi.a("CustomParams: Gender param removed");
            return;
        }
        mi.a("CustomParams: Gender param is set to " + i);
        b("eg", String.valueOf(i));
    }

    public void setIcqId(@Nullable String str) {
        if (str == null) {
            this.g = null;
        } else {
            this.g = new String[]{str};
        }
        b("icq_id", str);
    }

    public void setIcqIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.g = null;
            b("icq_id");
        } else {
            this.g = (String[]) Arrays.copyOf(strArr, strArr.length);
            b("icq_id", m0.a(strArr));
        }
    }

    public void setLang(@Nullable String str) {
        b(O6.q, str);
    }

    public void setMrgsAppId(@Nullable String str) {
        b("mrgs_app_id", str);
    }

    public void setMrgsId(@Nullable String str) {
        b("mrgs_device_id", str);
    }

    public void setMrgsUserId(@Nullable String str) {
        b("mrgs_user_id", str);
    }

    public void setOkId(@Nullable String str) {
        if (str == null) {
            this.e = null;
        } else {
            this.e = new String[]{str};
        }
        b("ok_id", str);
    }

    public void setOkIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.e = null;
            b("ok_id");
        } else {
            this.e = (String[]) Arrays.copyOf(strArr, strArr.length);
            b("ok_id", m0.a(strArr));
        }
    }

    public void setVKId(@Nullable String str) {
        if (str == null) {
            this.f = null;
        } else {
            this.f = new String[]{str};
        }
        b("vk_id", str);
    }

    public void setVKIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.f = null;
            b("vk_id");
        } else {
            this.f = (String[]) Arrays.copyOf(strArr, strArr.length);
            b("vk_id", m0.a(strArr));
        }
    }

    public boolean a() {
        return this.a;
    }

    private String a(String str) {
        String str2;
        synchronized (this) {
            str2 = (String) this.b.get(str);
        }
        return str2;
    }

    private boolean b(String str) {
        synchronized (this) {
            try {
                if (!this.b.containsKey(str)) {
                    return false;
                }
                this.b.remove(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
