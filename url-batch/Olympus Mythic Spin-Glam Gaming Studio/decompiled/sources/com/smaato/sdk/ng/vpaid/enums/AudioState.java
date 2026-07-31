package com.smaato.sdk.ng.vpaid.enums;

import java.util.Locale;

/* loaded from: classes14.dex */
public enum AudioState {
    MUTED("muted"),
    ON("on"),
    DEFAULT("default");

    final String a;

    AudioState(String str) {
        this.a = str;
    }

    public static AudioState fromString(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AudioState audioState = MUTED;
        if (lowerCase.equals(audioState.a)) {
            return audioState;
        }
        AudioState audioState2 = ON;
        if (lowerCase.equals(audioState2.a)) {
            return audioState2;
        }
        AudioState audioState3 = DEFAULT;
        if (lowerCase.equals(audioState3.a)) {
            return audioState3;
        }
        return null;
    }

    public String getStateName() {
        return this.a;
    }
}
