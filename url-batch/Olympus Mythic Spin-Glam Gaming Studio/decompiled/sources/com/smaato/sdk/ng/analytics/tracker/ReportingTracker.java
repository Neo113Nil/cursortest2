package com.smaato.sdk.ng.analytics.tracker;

/* loaded from: classes5.dex */
public class ReportingTracker {
    private final String a;
    private String b;
    private String c;
    private int d;

    public ReportingTracker(String str, String str2, int i) {
        this.c = "";
        this.a = str;
        this.b = str2;
        this.d = i;
    }

    public String getJs() {
        return this.c;
    }

    public int getResponseCode() {
        return this.d;
    }

    public String getType() {
        return this.a;
    }

    public String getUrl() {
        return this.b;
    }

    public ReportingTracker(String str, String str2) {
        this.b = "";
        this.d = 0;
        this.a = str;
        this.c = str2;
    }
}
