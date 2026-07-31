package com.smaato.sdk.ng;

/* loaded from: classes3.dex */
public enum CountdownStyle {
    PIE_CHART("com.smaato.sdk.ng.countdown.pie_chart"),
    TIMER("com.smaato.sdk.ng.countdown.timer"),
    PROGRESS("com.smaato.sdk.ng.countdown.progress");

    private final String a;

    CountdownStyle(String str) {
        this.a = str;
    }

    public static CountdownStyle from(String str) {
        CountdownStyle countdownStyle = PIE_CHART;
        if (!countdownStyle.getId().equals(str)) {
            CountdownStyle countdownStyle2 = TIMER;
            if (countdownStyle2.getId().equals(str)) {
                return countdownStyle2;
            }
            CountdownStyle countdownStyle3 = PROGRESS;
            if (countdownStyle3.getId().equals(str)) {
                return countdownStyle3;
            }
        }
        return countdownStyle;
    }

    public String getId() {
        return this.a;
    }
}
