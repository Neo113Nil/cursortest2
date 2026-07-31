package com.smaato.sdk.core;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* loaded from: classes5.dex */
public enum Gender {
    FEMALE(InneractiveMediationDefs.GENDER_FEMALE),
    MALE("m"),
    OTHER("o");

    private final String gender;

    Gender(String str) {
        this.gender = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.gender;
    }

    public static Gender fromString(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }
}
