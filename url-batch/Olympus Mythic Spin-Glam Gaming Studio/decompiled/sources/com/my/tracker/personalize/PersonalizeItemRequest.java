package com.my.tracker.personalize;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import com.my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class PersonalizeItemRequest extends PersonalizePlacementsRequest {

    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeItemRequest> {
        Builder(String str) {
            super(str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.my.tracker.personalize.PersonalizePlacementsRequest.Builder
        @NonNull
        public PersonalizeItemRequest build() {
            return new PersonalizeItemRequest(this.b, this.a, this.d, this.c);
        }
    }

    PersonalizeItemRequest(List list, String str, boolean z, Map map) {
        super(list, str, z, map);
    }

    @NonNull
    @AnyThread
    public static PersonalizePlacementsRequest.Builder<PersonalizeItemRequest> newBuilder(@NonNull String str) {
        return new Builder(str);
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    String a() {
        return "/item";
    }
}
