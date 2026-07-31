package io.intercom.android.sdk.api;

import java.util.Map;

/* loaded from: classes8.dex */
final class AutoValue_UserUpdateRequest extends UserUpdateRequest {
    private final Map<String, Object> attributes;
    private final boolean internalUpdate;
    private final boolean newSession;
    private final boolean sentFromBackground;

    AutoValue_UserUpdateRequest(boolean z, boolean z2, boolean z3, Map<String, Object> map) {
        this.newSession = z;
        this.sentFromBackground = z2;
        this.internalUpdate = z3;
        if (map == null) {
            throw new NullPointerException("Null attributes");
        }
        this.attributes = map;
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public boolean isNewSession() {
        return this.newSession;
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public boolean isSentFromBackground() {
        return this.sentFromBackground;
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public boolean isInternalUpdate() {
        return this.internalUpdate;
    }

    @Override // io.intercom.android.sdk.api.UserUpdateRequest
    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public String toString() {
        return "UserUpdateRequest{newSession=" + this.newSession + ", sentFromBackground=" + this.sentFromBackground + ", internalUpdate=" + this.internalUpdate + ", attributes=" + this.attributes + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserUpdateRequest) {
            UserUpdateRequest userUpdateRequest = (UserUpdateRequest) obj;
            if (this.newSession == userUpdateRequest.isNewSession() && this.sentFromBackground == userUpdateRequest.isSentFromBackground() && this.internalUpdate == userUpdateRequest.isInternalUpdate() && this.attributes.equals(userUpdateRequest.getAttributes())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.newSession ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.sentFromBackground ? 1231 : 1237)) * 1000003) ^ (this.internalUpdate ? 1231 : 1237)) * 1000003) ^ this.attributes.hashCode();
    }
}
