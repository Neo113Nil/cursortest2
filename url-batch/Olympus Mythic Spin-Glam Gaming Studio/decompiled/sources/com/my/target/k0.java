package com.my.target;

import android.content.Context;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class k0 {
    private static final String[] a = {"com.vkontakte.android", "ru.mail.mailapp", "ru.ok.messages", "ru.ok.android", "ru.ok.android.debug", "ru.vk.store", "ru.vk.store.qa", "com.vk.tv", "com.vk.vkvideo", "com.vk.clips", "com.my.targetdemo5.initauto", "com.my.targetdemo5.initmanual", "com.my.targetdemo5.logoff"};

    public static boolean a(Context context) {
        String packageName = context.getPackageName();
        for (String str : a) {
            if (str.equals(packageName)) {
                return true;
            }
        }
        return false;
    }
}
