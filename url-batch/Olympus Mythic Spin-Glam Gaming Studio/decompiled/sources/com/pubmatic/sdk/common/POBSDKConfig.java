package com.pubmatic.sdk.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBApplicationInfo;
import com.pubmatic.sdk.common.models.POBDSAComplianceStatus;
import com.pubmatic.sdk.common.models.POBExternalUserId;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.models.POBUserInfo;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class POBSDKConfig {
    private Boolean d;
    private POBLocation e;
    private POBUserInfo g;
    private POBApplicationInfo h;
    private boolean a = true;
    private long b = 600000;
    private boolean c = false;
    private boolean f = true;
    private POBDSAComplianceStatus j = POBDSAComplianceStatus.NOT_REQUIRED;
    private final Map i = Collections.synchronizedMap(new HashMap());

    POBSDKConfig() {
    }

    public void addExternalUserId(@NonNull POBExternalUserId pOBExternalUserId) {
        if (pOBExternalUserId == null || POBUtils.isNullOrEmpty(pOBExternalUserId.getId()) || POBUtils.isNullOrEmpty(pOBExternalUserId.getSource())) {
            POBLog.warn("POBSDKConfig", POBCommonConstants.MSG_INVALID_DATA, "External User Id");
            return;
        }
        String source = pOBExternalUserId.getSource();
        if (!this.i.containsKey(source)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(pOBExternalUserId);
            this.i.put(source, arrayList);
            return;
        }
        List<POBExternalUserId> list = (List) this.i.get(source);
        if (list != null) {
            for (POBExternalUserId pOBExternalUserId2 : list) {
                if (pOBExternalUserId2 != null && pOBExternalUserId2.getId().equals(pOBExternalUserId.getId())) {
                    POBLog.warn("POBSDKConfig", POBCommonConstants.MSG_DUPLICATE_FIELD, "External User Id", "partner Id");
                    return;
                }
            }
            list.add(pOBExternalUserId);
            this.i.put(source, list);
        }
    }

    public void allowAdvertisingId(boolean z) {
        this.f = z;
    }

    public void allowLocationAccess(boolean z) {
        this.a = z;
    }

    @Nullable
    public POBApplicationInfo getApplicationInfo() {
        return this.h;
    }

    @NonNull
    public POBDSAComplianceStatus getDsaComplianceStatus() {
        return this.j;
    }

    @NonNull
    public Map<String, List<POBExternalUserId>> getExternalUserIds() {
        return this.i;
    }

    @Nullable
    public POBLocation getLocation() {
        return this.e;
    }

    public long getLocationDetectionDurationInMillis() {
        return this.b;
    }

    @Nullable
    public <T> T getMeasurementProvider(@NonNull String str) {
        try {
            return (T) Class.forName(str).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            POBLog.error(POBOMSDKUtil.TAG, "%s", e.getMessage());
            return null;
        }
    }

    @Nullable
    public POBUserInfo getUserInfo() {
        return this.g;
    }

    public boolean isAllowAdvertisingId() {
        return this.f;
    }

    @Nullable
    public Boolean isCoppa() {
        return this.d;
    }

    public boolean isLocationAccessAllowed() {
        return this.a;
    }

    public boolean isUseInternalBrowser() {
        return this.c;
    }

    public void removeAllExternalUserIds() {
        this.i.clear();
    }

    public void removeExternalUserIds(@NonNull String str) {
        if (str != null) {
            this.i.remove(str);
        }
    }

    public void setApplicationInfo(@Nullable POBApplicationInfo pOBApplicationInfo) {
        this.h = pOBApplicationInfo;
    }

    public void setCoppa(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public void setDSAComplianceStatus(@NonNull POBDSAComplianceStatus pOBDSAComplianceStatus) {
        if (pOBDSAComplianceStatus != null) {
            this.j = pOBDSAComplianceStatus;
        } else {
            POBLog.warn("POBSDKConfig", POBCommonConstants.MSG_INVALID_DATA, "DSA Transparency Info");
        }
    }

    public void setLocation(@Nullable POBLocation pOBLocation) {
        this.e = pOBLocation;
    }

    public void setLocationDetectionDurationInMillis(long j) {
        this.b = j;
    }

    public void setUseInternalBrowser(boolean z) {
        this.c = z;
    }

    public void setUserInfo(@Nullable POBUserInfo pOBUserInfo) {
        this.g = pOBUserInfo;
    }
}
