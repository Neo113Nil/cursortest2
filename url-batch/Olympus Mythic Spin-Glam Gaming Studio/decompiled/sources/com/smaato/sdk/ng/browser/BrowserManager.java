package com.smaato.sdk.ng.browser;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class BrowserManager {
    private final List<String> a = new ArrayList();

    public void addBrowser(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.add(str);
    }

    public void cleanPriorities() {
        this.a.clear();
    }

    public boolean containsPriorities() {
        return !this.a.isEmpty();
    }

    public List<String> getPackagePriorities() {
        return this.a;
    }
}
