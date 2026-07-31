package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class POBUserInfo {
    private int a;
    private Gender b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private final Map h = Collections.synchronizedMap(new HashMap());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");

        private final String a;

        Gender(String str) {
            this.a = str;
        }

        public String getValue() {
            return this.a;
        }
    }

    public void addDataProvider(@NonNull POBDataProvider pOBDataProvider) {
        if (pOBDataProvider == null || POBUtils.isNullOrEmpty(pOBDataProvider.getName()) || pOBDataProvider.getSegments().isEmpty()) {
            POBLog.warn("POBUserInfo", POBCommonConstants.MSG_INVALID_DATA, "Data Provider");
            return;
        }
        String name = pOBDataProvider.getName();
        if (this.h.containsKey(name)) {
            POBLog.warn("POBUserInfo", POBCommonConstants.MSG_DUPLICATE_FIELD, "Data Provider", "provider name");
        } else {
            this.h.put(name, pOBDataProvider);
        }
    }

    public int getBirthYear() {
        return this.a;
    }

    @Nullable
    public String getCity() {
        return this.c;
    }

    @Nullable
    public POBDataProvider getDataProvider(@NonNull String str) {
        return (POBDataProvider) this.h.get(str);
    }

    @NonNull
    public List<POBDataProvider> getDataProviders() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.h.entrySet()) {
            if (entry != null) {
                arrayList.add((POBDataProvider) entry.getValue());
            }
        }
        return arrayList;
    }

    @Nullable
    public Gender getGender() {
        return this.b;
    }

    @Nullable
    public String getKeywords() {
        return this.g;
    }

    @Nullable
    public String getMetro() {
        return this.d;
    }

    @Nullable
    public String getRegion() {
        return this.f;
    }

    @Nullable
    public String getZip() {
        return this.e;
    }

    public void removeAllDataProviders() {
        this.h.clear();
    }

    @Nullable
    public POBDataProvider removeDataProvider(@NonNull String str) {
        return (POBDataProvider) this.h.remove(str);
    }

    public void setBirthYear(int i) {
        if (i > 0) {
            this.a = i;
        }
    }

    public void setCity(@NonNull String str) {
        this.c = str;
    }

    public void setGender(@NonNull Gender gender) {
        this.b = gender;
    }

    public void setKeywords(String str) {
        this.g = str;
    }

    public void setMetro(@NonNull String str) {
        this.d = str;
    }

    public void setRegion(@NonNull String str) {
        this.f = str;
    }

    public void setZip(@NonNull String str) {
        this.e = str;
    }
}
