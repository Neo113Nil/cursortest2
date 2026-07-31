package com.fyber.inneractive.sdk.gpp;

import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class a {
    public String b;
    public String d;
    public Boolean e;
    public final AtomicReference a = new AtomicReference();
    public final com.fyber.inneractive.sdk.tcf.a c = new com.fyber.inneractive.sdk.tcf.a();

    public final void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            IAlog.a("%s defaultSharedPreferences is null, not initializing GppManager", "GppManager");
            return;
        }
        if (this.a.get() == null) {
            this.a.set(sharedPreferences);
            String str = null;
            if (this.a.get() != null) {
                try {
                    this.d = ((SharedPreferences) this.a.get()).getString("IABGPP_HDR_GppString", null);
                } catch (Throwable th) {
                    IAlog.a("%s Error on getGppString", th, "GppManager");
                }
            }
            if (this.a.get() != null) {
                try {
                    this.b = ((SharedPreferences) this.a.get()).getString("IABGPP_GppSID", null);
                } catch (Throwable th2) {
                    IAlog.a("%s Error on computeAvailableSections", th2, "GppManager");
                }
            }
            if (this.a.get() != null) {
                try {
                    str = ((SharedPreferences) this.a.get()).getString("IABGPP_2_String", null);
                } catch (Throwable th3) {
                    IAlog.a("%s Error on getSectionGppString", th3, "GppManager");
                }
            }
            if (str == null) {
                IAlog.a("%s decodeTcf - gppTcfString is null, not decoding TCF", "GppManager");
                return;
            }
            com.fyber.inneractive.sdk.tcf.a aVar = this.c;
            aVar.b = str;
            String[] split = str.split("\\.");
            if (split.length == 0 || !v.a(split[0])) {
                IAlog.a("%s empty string", "GppTcf");
                return;
            }
            try {
                aVar.a.a(split[0]);
                aVar.a();
                aVar.c = true;
                IAlog.a(" %s parsed object: %s", "GppTcf", aVar.toString());
            } catch (Exception e) {
                IAlog.a("%s invalid string: %s", e, "GppTcf", aVar.b);
            }
        }
    }

    public final boolean a() {
        Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = this.b;
        if (str != null && !str.isEmpty()) {
            for (String str2 : this.b.split("_")) {
                try {
                } catch (NumberFormatException e) {
                    IAlog.a("%s Error parsing section ID: %s", e, "GppManager", str2);
                }
                if (Integer.parseInt(str2.trim()) == 2) {
                    this.e = Boolean.TRUE;
                    return true;
                }
                continue;
            }
            this.e = Boolean.FALSE;
            return false;
        }
        this.e = Boolean.FALSE;
        return false;
    }
}
