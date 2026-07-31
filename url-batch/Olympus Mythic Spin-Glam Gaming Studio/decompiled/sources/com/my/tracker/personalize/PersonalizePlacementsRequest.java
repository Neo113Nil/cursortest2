package com.my.tracker.personalize;

import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.timer.TimerController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public abstract class PersonalizePlacementsRequest extends PersonalizeRequest<List<PersonalizePlacement>> {
    private final Map a = d();

    @Nullable
    public final Map<String, String> customParams;

    @Nullable
    public final List<String> placements;
    public final boolean reset;

    @NonNull
    public final String userId;

    public static abstract class Builder<T extends PersonalizePlacementsRequest> {
        final String a;
        List b;
        Map c;
        boolean d = true;

        Builder(String str) {
            this.a = str;
        }

        @NonNull
        @AnyThread
        public abstract T build();

        @NonNull
        @AnyThread
        public Builder<T> withCustomParams(@Nullable Map<String, String> map) {
            if (map != null) {
                this.c = new HashMap(map);
                return this;
            }
            this.c = null;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder<T> withPlacements(@Nullable List<String> list) {
            if (list != null) {
                this.b = new ArrayList(list);
                return this;
            }
            this.b = null;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder<T> withReset(boolean z) {
            this.d = z;
            return this;
        }
    }

    PersonalizePlacementsRequest(List list, String str, boolean z, Map map) {
        this.placements = list;
        this.userId = str;
        this.reset = z;
        this.customParams = map;
    }

    private Map d() {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.customParams;
        if (map != null && !map.isEmpty()) {
            this.customParams.remove("custom_user_id");
            this.customParams.remove("placement_ids");
            this.customParams.remove(TimerController.RESET_COMMAND);
            this.customParams.remove("flat");
            for (Map.Entry<String, String> entry : this.customParams.entrySet()) {
                hashMap.put(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
        }
        List<String> list = this.placements;
        if (list != null && !list.isEmpty()) {
            hashMap.put("placement_ids", this.placements);
        }
        if (!TextUtils.isEmpty(this.userId)) {
            hashMap.put("custom_user_id", Collections.singletonList(this.userId));
        }
        hashMap.put(TimerController.RESET_COMMAND, Collections.singletonList(this.reset ? "1" : "0"));
        hashMap.put("flat", Collections.singletonList("1"));
        return hashMap;
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    final Map b() {
        return this.a;
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    final b c() {
        return new d();
    }
}
