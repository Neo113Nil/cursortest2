package com.my.tracker.personalize;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import com.my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class PersonalizeRankingRequest extends PersonalizePlacementsRequest {

    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeRankingRequest> {
        Builder(String str) {
            super(str);
        }

        @Override // com.my.tracker.personalize.PersonalizePlacementsRequest.Builder
        @NonNull
        public PersonalizeRankingRequest build() {
            return new PersonalizeRankingRequest(this.b, this.a, this.d, this.c);
        }
    }

    PersonalizeRankingRequest(List list, String str, boolean z, Map map) {
        super(list, str, z, map);
    }

    @NonNull
    @AnyThread
    public static PersonalizePlacementsRequest.Builder<PersonalizeRankingRequest> newBuilder(@NonNull String str) {
        return new Builder(str);
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    String a() {
        return "/ranking";
    }
}
