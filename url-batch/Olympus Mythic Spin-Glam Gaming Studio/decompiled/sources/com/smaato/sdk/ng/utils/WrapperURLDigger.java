package com.smaato.sdk.ng.utils;

/* loaded from: classes6.dex */
public class WrapperURLDigger {
    public String getURL(String str) {
        try {
            return (!str.contains("\n") || str.split("\n").length <= 0) ? str : str.split("\n")[0];
        } catch (RuntimeException unused) {
            return str;
        }
    }
}
